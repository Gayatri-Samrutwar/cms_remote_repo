package com.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cms.model.CustomerInfo;
import com.cms.service.CustomerInfoService;
import com.cms.service.ProjectTypeService;
import com.cms.util.URI;
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
	
	@GetMapping(URI.CUSTOMER_INFORMATION_PAGE)
	public ModelAndView getCustomerInformation()
	{
		ModelAndView mv = new ModelAndView("customerInformation");
		mv.addObject("customerInformation", customerInfoService.findAllCustomerInformation());
		mv.addObject("mode", "CUSTOMER_VIEW");
		return mv;
	}
	
	/*
	 * @PostMapping("/customerRegistrationurl") public String
	 * customerInformation(CustomerInfo customerInfo) {
	 * 
	 * customerInfoService.saveCustomerInfo(customerInfo); return "index"; }
	 */
	
	@PostMapping("/save")
	public ModelAndView updateTicket(CustomerInfo customerInfo) {
		
		ModelAndView mv = new ModelAndView("redirect: URI.CUSTOMER_INFORMATION_PAGE");
		//customerInfoService.updateTicket(customerInfo);
		mv.addObject("tickets", customerInfoService.findAllCustomerInformation());
		mv.addObject("mode", "TICKET_VIEW");
		return mv;
	}
	
	@GetMapping("/edit")
	public ModelAndView editCustomerInformation(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("customerInformation");
		//mv.addObject("customerInfo", Utils.copy(customerInfoService.findTicket(id)));
		mv.addObject("mode", "CUSTOMER-INFORMATION_EDIT");
		return mv;
	}
	
	@GetMapping("employeeTypeRegistrationPage")
	public String getEmployeeTypeRegistrationPage() {
		return "employeeRateRegistration";
	}
}
