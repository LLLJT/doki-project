package com.ishang.doki.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishang.doki.dao.SysUserDao;
import com.ishang.doki.model.SysUser;
import com.ishang.doki.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService{
@Autowired
private SysUserDao sysuserdao;
	@Override
	public List<SysUser> findAll() {
		// TODO 自动生成的方法存根
		return sysuserdao.findAll();
		
	}

}
