package com.ishang.doki.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishang.doki.dao.DloginDao;
import com.ishang.doki.model.SysUser;
import com.ishang.doki.service.DloginService;

@Service
public class DloginServiceImpl implements DloginService {
	@Autowired
	DloginDao dlogindao;

	@Override
	public SysUser login(String username, String password) {
		return dlogindao.login(username, password);

	}

	@Override
	public void register(SysUser user) {
		// TODO 自动生成的方法存根
		dlogindao.register(user);
	}

}
