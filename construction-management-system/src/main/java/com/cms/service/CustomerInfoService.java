package com.cms.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.CustomerInfoRepository;
import com.cms.dao.EmployeeInfoRepository;
import com.cms.model.CustomerInfo;
import com.cms.model.EmployeeInfo;




@Service
public class CustomerInfoService {
	
	@Autowired
	private CustomerInfoRepository customerRepository;
	
	public Collection<CustomerInfo> findAllCustomerInformation()
	{
		List<CustomerInfo> customerRegistration = new ArrayList<CustomerInfo>();
		
		for(CustomerInfo customerInfo : customerRepository.findAll())
		{
			
			customerRegistration.add(customerInfo);
		}
		return customerRegistration;
	}
	
	public void delete(int id)
	{
		customerRepository.deleteById(id);;
	}

}
