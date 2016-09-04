package com.bestpay.skynet.mockerplatform.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bestpay.skynet.mockerplatform.entity.User;
import com.bestpay.skynet.mockerplatform.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("showUser")
	public String toIndex(HttpServletRequest request, Model model) {
		Long userId = Long.parseLong(request.getParameter("id"));
		User user = userService.searchUserModelInfo(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
}
