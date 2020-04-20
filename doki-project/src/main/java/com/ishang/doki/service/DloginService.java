package com.ishang.doki.service;

import com.ishang.doki.model.SysUser;

public interface DloginService {
	public SysUser login(String username,String password);


	void register(SysUser user);
}
