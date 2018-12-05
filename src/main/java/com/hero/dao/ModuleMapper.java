package com.hero.dao;

import java.util.List;

import com.hero.entity.Module;
import com.hero.entity.ModuleQer;

public interface ModuleMapper {
	//删除
    int deleteByPrimaryKey(Integer mId);
    //查询该模块能否删除
    int selmodul(Integer mId);
    //根据parentid查询模块
    List<Module> selmodulByParentid(Integer mId);
    //添加
    int insertSelective(Module record);
    //根据id查询
    Module selectByPrimaryKey(Integer mId);
    //修改
    int updateByPrimaryKeySelective(Module record);
    
    Module selParentById(Integer mid);
    //多条件分页
    List<Module> selModulByPage(ModuleQer moduleQer);
    //查询相同父id下名称是否重复
    int selModuleByParentAndName(Module module);
    
}