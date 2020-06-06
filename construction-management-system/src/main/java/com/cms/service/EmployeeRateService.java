package com.cms.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.EmployeeRateRepository;
import com.cms.model.EmployeeRate;




@Service
public class EmployeeRateService {
	
	
	
	
	
	@Autowired
	private EmployeeRateRepository employeeRateRepository;
	
	public Collection<EmployeeRate> findAllEmployeeRateInformation()
	{
		List<EmployeeRate> employeeRate = new ArrayList<EmployeeRate>();
		
		for(EmployeeRate employeeRateInfo : employeeRateRepository.findAll())
		{
			
			employeeRate.add(employeeRateInfo);
		}
		return employeeRate;
	}
	
	public void saveEmployeeRate(EmployeeRate empRate) {
		employeeRateRepository.save(empRate);
	}
	
	public void delete(String id)
	{
		employeeRateRepository.deleteById(id);;
	}

}
