package com.hero.service;

import java.util.List;

import com.hero.entity.Module;
import com.hero.entity.ModuleQer;

public interface ModuleServlet {

	int deleteByPrimaryKey(Integer mId);
	
	int selmodul(Integer mId);
	
	List<Module> selmodulByParentid(Integer mId);

    int insertSelective(Module record);

    Module selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Module record);

    Module selParentById(Integer mid);
    
    List<Module> selModulByPage(ModuleQer moduleQer);
    
    int selModuleByParentAndName(Module module);
}
