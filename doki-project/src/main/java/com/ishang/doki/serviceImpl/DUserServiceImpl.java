package com.ishang.doki.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ishang.doki.dao.DUserDao;
import com.ishang.doki.model.SysUser;
import com.ishang.doki.service.DUserService;

@Service
public class DUserServiceImpl implements DUserService {
	DUserDao duserdao;

	@Override
	public int insertUser(SysUser u) {
		// TODO 自动生成的方法存根
		return duserdao.insertUser(u);
	}

	@Override
	public int updateUser(SysUser u) {
		// TODO 自动生成的方法存根
		
		return duserdao.deleteUser(u);
	}

	@Override
	public int deleteUser(SysUser u) {
		// TODO 自动生成的方法存根
		
		return duserdao.deleteUser(u);
	}

	@Override
	public List<SysUser> findbyname(String username) {
		// TODO 自动生成的方法存根
		return duserdao.findbyname(username);
	}

}
