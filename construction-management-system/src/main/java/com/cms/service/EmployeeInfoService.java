package com.cms.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.EmployeeInfoRepository;
import com.cms.dto.EmployeeInfoDTO;
import com.cms.model.EmployeeInfo;
import com.cms.util.ObjectMapper;




@Service
public class EmployeeInfoService {
	
	@Autowired
	private EmployeeInfoRepository employeeRepository;
	
	public Collection<EmployeeInfoDTO> findAllEmployeeInformation()
	{
		List<EmployeeInfoDTO> employeeRegistration = new ArrayList<EmployeeInfoDTO>();
		
		for(EmployeeInfo employeeInfo : employeeRepository.findAll())
		{
			
			employeeRegistration.add(ObjectMapper.modelToDto(employeeInfo));
		}
		return employeeRegistration;
	}
	
	public EmployeeInfoDTO findAllEmployeeInformationById(String id) {
		return ObjectMapper.modelToDto(employeeRepository.findById(id).orElse(null));
	}
	
	public void save(EmployeeInfoDTO employeInfo) {
		
	}
	
	public void delete(String id)
	{
		employeeRepository.deleteById(id);;
	}

}
