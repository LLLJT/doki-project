package com.ishang.doki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishang.doki.service.SysUserService;
@RestController
@RequestMapping("user")
public class SysUserController {
@Autowired
private SysUserService sysuserservice;
@GetMapping(value="/findAll")
public Object findAll() {
	return sysuserservice.findAll();
	
}
}
