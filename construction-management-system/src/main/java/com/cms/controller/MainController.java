package com.cms.controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cms.service.CustomerInfoService;
import com.cms.service.EmployeeInfoService;
import com.cms.service.ProjectTypeService;
import com.cms.util.ObjectMapper;
import com.cms.util.URI;
import com.cms.vo.CustomerInfoVO;
import com.cms.vo.EmployeeInfoVO;
import com.cms.vo.ProjectTypeVO;

@Controller
public class MainController {

	@Autowired
	private ProjectTypeService projectTypeService;

	@Autowired
	private CustomerInfoService customerInfoService;

	@Autowired
	private EmployeeInfoService employeeInfoService;
	
	@GetMapping("/")
	public String init() {
		return "index";
	}

	@GetMapping("/projectTypeRegurl")
	public String getCustomerRegistrationPage() {
		return "projectType";
	}

	@PostMapping("/projectTypeRegistrationurl")
	public String projectType(ProjectTypeVO projectType) {
		System.out.println(projectType);
		// projectTypeService.saveProjectType(projectType);
		return "index";
	}

	@GetMapping(URI.CUSTOMER_INFORMATION_VIEW)
	public ModelAndView getCustomerInformation() {
		ModelAndView mv = new ModelAndView(URI.CUSTOMER_INFORMATION_JSP);
		mv.addObject("customerInformation", customerInfoService.findAllCustomerInformation().stream()
				.map(x -> ObjectMapper.dtoToVo(x)).collect(Collectors.toList()));
		mv.addObject("mode", "CUSTOMER_VIEW");
		return mv;
	}

	/*
	 * @PostMapping("/customerRegistrationurl") public String
	 * customerInformation(CustomerInfo customerInfo) {
	 * 
	 * customerInfoService.saveCustomerInfo(customerInfo); return "index"; }
	 */

	@PostMapping(URI.CUSTOMER_INFORMATION_SAVE)
	public ModelAndView saveCustomerInformation(CustomerInfoVO customerInfo) {
		customerInfo.setCustomerId(""+(customerInfo.getCustomerName()+customerInfo.getCustomerMobileNo()).hashCode());
		ModelAndView mv = new ModelAndView(URI.CUSTOMER_INFORMATION_JSP);
		customerInfoService.saveCustomerInfo(ObjectMapper.voToDto(customerInfo));
		mv.addObject("customerInformation", customerInfoService.findAllCustomerInformation());
		mv.addObject("mode", "CUSTOMER_VIEW");
		return mv;
	}
	
	@PostMapping(URI.CUSTOMER_INFORMATION_UPDATE)
	public ModelAndView updateCustomerInformation(CustomerInfoVO customerInfo) {
		ModelAndView mv = new ModelAndView(URI.CUSTOMER_INFORMATION_JSP);
		customerInfoService.saveCustomerInfo(ObjectMapper.voToDto(customerInfo));
		mv.addObject("customerInformation", customerInfoService.findAllCustomerInformation());
		mv.addObject("mode", "CUSTOMER_VIEW");
		return mv;
	}
	
	@GetMapping(URI.CUSTOMER_INFORMATION_ADD_PAGE)
	public ModelAndView addTicket() {
		ModelAndView mv = new ModelAndView(URI.CUSTOMER_INFORMATION_JSP);
		mv.addObject("mode", "CUSTOMER_INFORMATION_ADD");
		return mv;
	}
	

	@GetMapping(URI.CUSTOMER_INFORMATION_EDIT_PAGE)
	public ModelAndView editCustomerInformation(@RequestParam String customerId) {
		ModelAndView mv = new ModelAndView(URI.CUSTOMER_INFORMATION_JSP);
		mv.addObject("customerInfo", customerInfoService.findCustomerInformationById(customerId));
		mv.addObject("mode", "CUSTOMER_INFORMATION_EDIT");
		return mv;
	}
	
	
	@GetMapping(URI.CUSTOMER_INFORMATION_DELETE)
	public ModelAndView deleteCustomerInformation(@RequestParam String customerId) {
		ModelAndView mv = new ModelAndView(URI.CUSTOMER_INFORMATION_JSP);
		customerInfoService.delete(customerId);
		mv.addObject("customerInfo", customerInfoService.findAllCustomerInformation());
		mv.addObject("mode", "CUSTOMER_VIEW");
		return mv;
	}
	
	
	@GetMapping("/getEmployeeInformation")
	public ModelAndView getEmployeeInformation() {
		ModelAndView mv = new ModelAndView("employeeInformation");
		mv.addObject("employeeInformation", employeeInfoService.findAllEmployeeInformation());
		mv.addObject("mode", "EMPLOYEE_VIEW");
		return mv;
	}
	
	@PostMapping("/saveEmployeeInformation")
	public ModelAndView updateEmployeeInformation(EmployeeInfoVO employeeInfoVO) {
		
		ModelAndView mv = new ModelAndView("redirect: URI.CUSTOMER_INFORMATION_PAGE");
		//customerInfoService.updateTicket(customerInfoVO);
		mv.addObject("employeeInformation", employeeInfoService.findAllEmployeeInformation());
		mv.addObject("mode", "EMPLOYEE_INFORMATION_VIEW");
		return mv;
	}
	
	@GetMapping("/addEmployeeInformation")
	public ModelAndView addEmployeeInformation() {
		ModelAndView mv = new ModelAndView("employeeInformation");
		mv.addObject("mode", "EMPLOYEE_INFORMATION_ADD");
		return mv;
	}
	
	@GetMapping("/editEmployeeInformation")
	public ModelAndView editEmployeeInformation(@RequestParam String customerId) {
		ModelAndView mv = new ModelAndView("employeeInformation");
		//mv.addObject("employeeInformation", employeeInfoService(customerId));
		mv.addObject("mode", "EMPLOYEE_INFORMATION_EDIT");
		return mv;
	}
	
}
