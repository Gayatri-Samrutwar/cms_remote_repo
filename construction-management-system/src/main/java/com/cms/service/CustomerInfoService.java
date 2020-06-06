package com.cms.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.CustomerInfoRepository;
import com.cms.dto.CustomerInfoDTO;
import com.cms.model.CustomerInfo;
import com.cms.util.ObjectMapper;




@Service
public class CustomerInfoService {
	
	@Autowired
	private CustomerInfoRepository customerRepository;
	
	
	
	public Collection<CustomerInfoDTO> findAllCustomerInformation()
	{
		List<CustomerInfoDTO> customerRegistration = new ArrayList<CustomerInfoDTO>();
		
		for(CustomerInfo customerInfo : customerRepository.findAll())
		{
			customerRegistration.add(ObjectMapper.modelToDto(customerInfo));
		}
		return customerRegistration;
	}
	
	public void saveCustomerInfo(CustomerInfoDTO customerInfo)
	{
		customerRepository.save(ObjectMapper.dtoToModel(customerInfo));
	}
	
	public CustomerInfoDTO findCustomerInformationById(String customerId) {
		return ObjectMapper.modelToDto(customerRepository.findById(customerId).orElse(null));
	}
	
	public void delete(String id)
	{
		customerRepository.deleteById(id);;
	}

}
