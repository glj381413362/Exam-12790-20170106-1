package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.Customer;

public interface ICustomerService {
	public Customer selectSingleByWhere(Customer Entity);

}
