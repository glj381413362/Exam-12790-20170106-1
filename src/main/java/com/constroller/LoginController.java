package com.constroller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Customer;
import com.model.Film;
import com.service.ICustomerService;
import com.service.IFilmService;

@Controller
public class LoginController {
	
	@Autowired
	private ICustomerService customerService;
	@Autowired
	private IFilmService filmService;
	/*
	@RequestMapping("/loginJsp")
	public String loginJsp(){
		return "login";
	}*/
	@RequestMapping("/login")
	public @ResponseBody String login(@Param("userName")String userName,HttpSession session){
		Customer customer = new Customer();
		customer.setFirstName(userName);
		Customer selectSingleByWhere = customerService.selectSingleByWhere(customer);
		if(selectSingleByWhere!=null){
			session.setAttribute("user", customer);
			return "succeed";
		}
		session.setAttribute("loginError", "账户或密码错误！");
		return "账户或密码错误！";
	}
	/*@RequestMapping("/loginOut")
	public String loginOut(HttpSession session){
		if(session!=null)
		session.invalidate();
		return "redirect:loginJsp.action";
	}*/
	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}
	public void setFilmService(IFilmService filmService) {
		this.filmService = filmService;
	}

}
