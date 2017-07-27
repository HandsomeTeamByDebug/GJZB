package com.lnsf.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lnsf.entity.User;
import com.lnsf.service.UserService;

@Controller
@RequestMapping("/Users")
public class UserController {
	
		  @Resource  
		  private UserService userService; 
		  
		  
		  @RequestMapping("/showUserById")  
		  public String showUserById(HttpServletRequest request,Model model){  
		        //int userid = Integer.parseInt(request.getParameter("userId"));  
		        User user = this.userService.getUserById(2); 
		        model.addAttribute("user", user);  
		        return "showUserById";  
		  } 
	    
	    
		  @RequestMapping("/showAllUsers")  
		  public String showAllUsers(HttpServletRequest request,Model model){    
		        List<User> users = this.userService.getAllUsers(); 
		        model.addAttribute("users", users);  
		        return "showAllUsers";  
		  } 
	   
	
	

}
