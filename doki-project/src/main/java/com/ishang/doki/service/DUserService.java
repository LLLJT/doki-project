package com.ishang.doki.service;

import java.util.List;

import com.ishang.doki.model.SysUser;

public interface DUserService {

	public int insertUser(SysUser u);

	public int updateUser(SysUser u);

	public int deleteUser(SysUser u);

	public List<SysUser> findbyname(String username);
}
