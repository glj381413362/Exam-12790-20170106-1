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
	@RequestMapping("/login")
	public @ResponseBody String login(@Param("userName")String userName){
		Customer customer = new Customer();
		customer.setFirstName(userName);
		Customer selectSingleByWhere = customerService.selectSingleByWhere(customer);
		if(selectSingleByWhere!=null){
			return "succeed";
		}
		return "账户或密码错误！";
	}
	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}
}
