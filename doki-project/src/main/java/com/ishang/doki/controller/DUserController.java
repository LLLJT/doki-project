package com.ishang.doki.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ishang.doki.constant.DConstants;
import com.ishang.doki.http.Result;
import com.ishang.doki.model.SysUser;
import com.ishang.doki.service.DUserService;

@RestController
@RequestMapping("/user")
public class DUserController {
	@Autowired
	private DUserService duserservice;

	@PostMapping("/insert")
	public Result insert(@RequestBody SysUser u) {
		if (StringUtils.isEmpty(u.getUsername()) || StringUtils.isEmpty(u.getPassword())) {
			return Result.error("缺少参数");
		}
		if (DConstants.admin.equalsIgnoreCase(u.getUsername().trim())) {
			return Result.error("辣个男人太强了，你换一个吧");
		}
		duserservice.insertUser(u);
		return Result.ok();
	}

	@PostMapping("/delete")
	public Result delete(@RequestBody SysUser u) {

		// 可加额外套餐
		duserservice.deleteUser(u);
		return Result.ok();

	}

	@PostMapping("/update")
	public Result update(@RequestBody SysUser u) {

		// 可加额外套餐
		duserservice.updateUser(u);
		return Result.ok();

	}

	@GetMapping("/findbyname")
	public Result findbyname(@RequestParam String username, HttpServletRequest request, HttpServletResponse response) {
		System.out.println(username);
		
		System.out.println(duserservice.findbyname(username));
		return Result.ok(duserservice.findbyname(username));

	}

}
