package com.ishang.doki.dao;

import org.apache.ibatis.annotations.Param;

import com.ishang.doki.model.SysUser;

public interface DloginDao {
	//用户登录&注册
SysUser login(@Param("username")String username,@Param("password")String password);


public void register(SysUser user);
}
