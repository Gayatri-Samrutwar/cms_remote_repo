package com.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cms.dao.ProjectTypeRepository;
import com.cms.model.ProjectType;
import com.cms.service.ProjectTypeService;

@Controller
public class MainController {
	
	@Autowired
	ProjectTypeService projectTypeService;
	@GetMapping("/")
	public String init() {
		return "index";
	}
	
	@GetMapping("/projectTypeRegurl")
	public String getProjectRegistrationPage()
	{
		return "projectType";
	}
	
	@PostMapping("/projectTypeRegistrationurl")
	public String projectType(ProjectType projectType) {
	
		projectTypeService.saveProjectType(projectType);
		return "index";
	}

}
