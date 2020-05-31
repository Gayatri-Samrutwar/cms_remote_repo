package com.cms.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.model.CustomerInfo;
import com.cms.model.EmployeeInfo;
import com.cms.model.Project;
import com.cms.model.ProjectType;
import com.cms.service.CustomerInfoService;
import com.cms.service.EmployeeInfoService;
import com.cms.service.EmployeeRateService;
import com.cms.service.ProjectService;
import com.cms.service.ProjectTypeService;

@RestController
public class MainRestController {
	
	@Autowired
	private EmployeeInfoService employeeService;
	
	@Autowired
	private EmployeeRateService employeeRateService;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private ProjectTypeService projectTypeService;
	
	@Autowired
	private CustomerInfoService customerService;
	
	@GetMapping("/findAllEmployeeInfo")
	public Collection<EmployeeInfo> getAllEmployeeInformation()
	{
		
		return employeeService.findAllEmployeeInformation();
	}
	
	@GetMapping("/findProjectInfo")
	public Collection<Project> getAllProjectInformation()
	{
		
		return projectService.findAllProjectInformation();
	}
	
	@GetMapping("/findProjectTypeInfo")
	public Collection<ProjectType> getAllProjectTypeInformation()
	{
		
		return projectTypeService.findAllProjectTypeInformation();
	}
	
	@GetMapping("/findCustomerInfo")
	public Collection<CustomerInfo> getAllCustomerInformation()
	{
		
		return customerService.findAllCustomerInformation();
	}
	
	/*
	@GetMapping("/deleteEmployeeInfo")
	public void deleteEmployeEInformation(@RequestParam int id) {
		
		employeeService.delete(id);
		
	}
	*/
	

}
