package com.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cms.model.CustomerInfo;
import com.cms.service.CustomerInfoService;
import com.cms.service.ProjectTypeService;
import com.cms.vo.ProjectTypeVO;

@Controller
public class MainController {
	
	@Autowired
	ProjectTypeService projectTypeService;
	
	@Autowired
	CustomerInfoService customerInfoService;
	
	@GetMapping("/")
	public String init() {
		return "index";
	}
	
	@GetMapping("/projectTypeRegurl")
	public String getCustomerRegistrationPage()
	{
		return "projectType";
	}
	
	@PostMapping("/projectTypeRegistrationurl")
	public String projectType(ProjectTypeVO projectType) {
		System.out.println(projectType);
		//projectTypeService.saveProjectType(projectType);
		return "index";
	}
	
	@GetMapping("/customerRegurl")
	public String getProjectRegistrationPage()
	{
		return "customerInformation";
	}
	
	@PostMapping("/customerRegistrationurl")
	public String customerInformation(CustomerInfo customerInfo) {
	
		customerInfoService.saveCustomerInfo(customerInfo);
		return "index";
	}
	
	@GetMapping("employeeTypeRegistrationPage")
	public String getEmployeeTypeRegistrationPage() {
		return "employeeRateRegistration";
	}
}
