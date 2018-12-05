package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.dao.ModuleMapper;
import com.hero.entity.Module;
import com.hero.entity.ModuleQer;
import com.hero.service.ModuleServlet;

@Service
public class ModulesServletImpl implements ModuleServlet {

	@Autowired
	private ModuleMapper mdao;
	
	@Override
	public int deleteByPrimaryKey(Integer mId) {
		// TODO Auto-generated method stub
		return mdao.deleteByPrimaryKey(mId);
	}

	@Override
	public int insertSelective(Module record) {
		// TODO Auto-generated method stub
		return mdao.insertSelective(record);
	}

	@Override
	public Module selectByPrimaryKey(Integer mId) {
		// TODO Auto-generated method stub
		return mdao.selectByPrimaryKey(mId);
	}

	@Override
	public int updateByPrimaryKeySelective(Module record) {
		// TODO Auto-generated method stub
		return mdao.updateByPrimaryKeySelective(record);
	}

	@Override
	public Module selParentById(Integer mid) {
		// TODO Auto-generated method stub
		return mdao.selParentById(mid);
	}

	@Override
	public List<Module> selModulByPage(ModuleQer moduleQer) {
		// TODO Auto-generated method stub
		return mdao.selModulByPage(moduleQer);
	}

	@Override
	public int selmodul(Integer mId) {
		// TODO Auto-generated method stub
		return mdao.selmodul(mId);
	}

	@Override
	public List<Module> selmodulByParentid(Integer mId) {
		// TODO Auto-generated method stub
		return mdao.selmodulByParentid(mId);
	}

	@Override
	public int selModuleByParentAndName(Module module) {
		// TODO Auto-generated method stub
		return mdao.selModuleByParentAndName(module);
	}

}
