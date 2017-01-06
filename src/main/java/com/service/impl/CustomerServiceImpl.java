package com.service.impl;

import static org.springframework.util.Assert.notNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.CustomerMapper;
import com.model.Customer;
import com.service.ICustomerService;

@Component("customerService")
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private CustomerMapper customerMapper;
	@Override
	public Customer selectSingleByWhere(Customer entity) {
		notNull(entity, "user can not be null");
		return customerMapper.getByEntity(entity);
	}
	public void setCustomerMapper(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}

}
