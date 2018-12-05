package com.hero.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.Module;
import com.hero.entity.ModuleQer;
import com.hero.service.impl.ModulesServletImpl;

@RestController
@RequestMapping("modul")
/**
 * 
 * @author 薛开庭
 *
 */
public class ModulesController {

	@Autowired
	private ModulesServletImpl mservlet;

	/**
	 * localhost:8080/invoicing/modul/selall?indexpage=1&rows=10 &modulename=员工
	 * 
	 * @return
	 */
	// private List<Module> list = new ArrayList<Module>();ConcurrentHashMap
	@RequestMapping("selall")
	public Object selall(ModuleQer moduleQer) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Module> list = new ArrayList<Module>();
		List<Module> list1 = new ArrayList<Module>();
		// ModuleListAdd mdao = new ModuleListAdd();
		// ConcurrentHashMap list2 = new ConcurrentHashMap<>();
		list = mservlet.selModulByPage(moduleQer);
		System.out.println(list.size()+"查到的模块"+list);
		// 遍历查询父节点
		for (Module module : list) {
			if (module.getmParentid() != 0) {
				list1 = this.selparent(module); // this.selparent(module);
			}
		}
		System.out.println(list1.size()+"所有父模块"+list1);
		for (Module module : list1) {
			if (!list.contains(module)) {
				list.add(module);
			}
		}
		map.put("total", list.size());
		map.put("rows", list);
		return map;
	}

	/**
	 * localhost:8080/invoicing/modul/selparent?mParentid=2 遍历查询父节点
	 * 
	 * @param module
	 */
	private List<Module> list = new ArrayList<Module>();
	public List<Module> selparent(Module module) {
//		List<Module> list = new ArrayList<Module>();
		int mid = module.getmParentid();
		if (mid != 0) {
			Module modules = mservlet.selectByPrimaryKey(mid);
			if(!list.contains(modules)) {
				list.add(modules);
			}
			this.selparent(modules);
		}
		return list;
	}

	/**
	 * localhost:8080/invoicing/modul/delModulById?mid=1
	 * 
	 * @param mid
	 * @return
	 */
	@RequestMapping("delModulById")
	public Object delModulById(int mid) {
		Map<String, Object> map = new HashMap<String, Object>();
		int i = mservlet.selmodul(mid);
		if (i > 0) {
			map.put("success", false);
			map.put("massage", "该模块已被占用，无法删除");
		} else {
			if (this.sel(mid)) {
				int y = mservlet.deleteByPrimaryKey(mid);
				if (y > 0) {
					map.put("success", true);
					map.put("massage", "删除成功");
				} else {
					map.put("success", false);
					map.put("massage", "删除时出错");
				}
			} else {
				map.put("success", false);
				map.put("massage", "删除子模块时出错");
			}

		}
		return map;
	}

	/**
	 * 遍历查询子模块
	 * 
	 * @param module
	 */
	public boolean sel(int mid) {
		// List<Module> list = null;
		List<Module> list = mservlet.selmodulByParentid(mid);
		System.out.println("该模块下的子模块" + list);
		if (list != null) {
			for (Module module : list) {
				int i = module.getmId();
				int y = mservlet.deleteByPrimaryKey(i);
				if (y < 0) {
					return false;
				}
				this.sel(i);
			}
		}
		return true;

	}

	/**
	 * localhost:8080/invoicing/modul/insertModul?mName=123&mParentid=0
	 * 
	 * @param mid
	 * @return
	 */
	@RequestMapping("insertModul")
	public Object insertModul(Module module) {
		Map<String, Object> map = new HashMap<String, Object>();
		// SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		// System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		module.setmCreatetime(new Date());
		int i = mservlet.selModuleByParentAndName(module);
		if (i > 0) {
			map.put("success", false);
			map.put("massage", "父模块下已有同名称模块，无法添加");
		} else {
			int y = mservlet.insertSelective(module);
			if (y > 0) {
				map.put("success", true);
				map.put("massage", "添加成功");
			} else {
				map.put("success", false);
				map.put("massage", "添加时出错");
			}
		}
		return map;
	}

	/**
	 * localhost:8080/invoicing/modul/updateModul?mId=4&mName=123&mParentid=0
	 * 
	 * @param mid
	 * @return
	 */
	@RequestMapping("updateModul")
	public Object updateModul(Module module) {
		Map<String, Object> map = new HashMap<String, Object>();
		// SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		// System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		module.setmUpdatetime(new Date());
		int i = mservlet.selModuleByParentAndName(module);
		if (i > 0) {
			map.put("success", false);
			map.put("massage", "父模块下已有同名称模块，无法修改");
		} else {
			int y = mservlet.updateByPrimaryKeySelective(module);
			if (y > 0) {
				map.put("success", true);
				map.put("massage", "修改成功");
			} else {
				map.put("success", false);
				map.put("massage", "修改时出错");
			}
		}
		return map;
	}

}
