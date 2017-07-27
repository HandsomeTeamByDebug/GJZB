package com.lnsf.controller;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lnsf.util.VerifyCodeUtil;


/**
 * @author肖梦雅 
 * @version 创建时间：2017年7月26日 晚21:29
 * @introduction 创建用户登录的controller,实现用户的登录
 *
 */
@Controller
public class UserLoginController {

	/**
	 * 验证码的获取
	 */
	
	@RequestMapping("getVerifyCode")
	public String getVerifyCode(HttpServletRequest request,HttpServletResponse response){
		try {
			VerifyCodeUtil.getVerifyCodeDbutil(request, response);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	/*
	@RequestMapping("hello")
	public void getVerifyCode1(){
		System.out.println("hello");
	}*/
}
