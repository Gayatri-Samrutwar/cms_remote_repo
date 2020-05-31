package com.cms.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.EmployeeInfoRepository;
import com.cms.model.EmployeeInfo;




@Service
public class EmployeeInfoService {
	
	@Autowired
	private EmployeeInfoRepository employeeRepository;
	
	public Collection<EmployeeInfo> findAllEmployeeInformation()
	{
		List<EmployeeInfo> employeeRegistration = new ArrayList<EmployeeInfo>();
		
		for(EmployeeInfo employeeInfo : employeeRepository.findAll())
		{
			
			employeeRegistration.add(employeeInfo);
		}
		return employeeRegistration;
	}
	
	public void delete(int id)
	{
		employeeRepository.deleteById(id);;
	}

}
