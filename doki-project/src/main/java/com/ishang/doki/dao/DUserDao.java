package com.ishang.doki.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ishang.doki.model.SysUser;

public interface DUserDao {

	int insertUser(SysUser u);

	int updateUser(SysUser u);

	int deleteUser(SysUser u);

	List<SysUser> findbyname(@Param("username")String username);

	
	
}
