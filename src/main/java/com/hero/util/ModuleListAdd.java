package com.hero.util;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hero.entity.Module;
import com.hero.service.impl.ModulesServletImpl;

@Component
public class ModuleListAdd {

	private List<Module> list = new ArrayList<Module>();
	@Autowired
	private ModulesServletImpl mservlet;

	private static ModuleListAdd moduleListAdd;

	@PostConstruct
	public void init() {
		moduleListAdd = this;
		moduleListAdd.mservlet = this.mservlet;
	}

	public List<Module> selparent(Module module) {
		int mid = module.getmParentid();
		Module modules = moduleListAdd.mservlet.selectByPrimaryKey(mid); // mservlet.selectByPrimaryKey(mid);
		if (list.contains(modules)) {
			list.add(modules);
		}
		this.selparent(modules);

		return list;
	}
}
