package com.ishang.doki.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ishang.doki.http.Result;
import com.ishang.doki.model.SysUser;
import com.ishang.doki.service.DloginService;

@RestController
@RequestMapping("/dguest")
public class DloginController {

	@Autowired
	DloginService dloginservice;

//***********************************	
//  “/guest/login”
//登录
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView Login(Model model, HttpServletRequest request, HttpServletResponse response,
			@RequestParam String username, @RequestParam String password) throws IOException {
		ModelAndView mv = new ModelAndView();
		username = String.valueOf(request.getParameter("username"));
		password = String.valueOf(request.getParameter("password"));
		System.out.println(dloginservice.login(username, password));
		SysUser user = dloginservice.login(username, password);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		if (user == null) {
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			out.println("<script language='javascript'>");
			out.println("alert('该用户不存在！')");
			out.println("</script>");
			out.flush();
			mv.setViewName("login");
		} else if ((user.getPassword().equals(password)) && (user.getUsername().equals(username))) {
			// 成功登录
			mv.setViewName("success");

		} else {
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			out.println("<script language='javascript'>");
			out.println("alert('用户名或密码不正确！')");
			out.println("</script>");
			out.flush();
			mv.setViewName("login");
		}
		return mv;
	}
	/*
	 * public String login(@RequestParam String username,@RequestParam String
	 * password,Model model) {
	 * 
	 * System.out.println("用户名:"+username+"密码:"+password); SysUser
	 * user=dloginservice.login(username, password);
	 * 
	 * if(user!=null) { model.addAttribute("msg","登录成功"); }
	 * model.addAttribute("msg","登录失败"); return "index";
	 */

	// 注册
	@RequestMapping("/register")
	/*
	 * public ModelAndView Register(@RequestBody(required = false) SysUser u) {
	 * 
	 * ModelAndView mv = new ModelAndView(); mv.addObject("user", u);
	 * mv.setViewName("register"); return mv;
	 */
	public Result Register(@RequestBody(required = false) SysUser u) {
//此处可加限制条件
		dloginservice.register(u);
		return Result.ok();

	}

}
