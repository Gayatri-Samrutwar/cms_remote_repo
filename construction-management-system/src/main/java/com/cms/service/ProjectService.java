package com.cms.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.ProjectRepository;
import com.cms.model.Project;




@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	
	public Collection<Project> findAllProjectInformation()
	{
		
		
		List<Project> project = new ArrayList<Project>();
		
		for(Project projectInfo : projectRepository.findAll())
		{
			
			project.add(projectInfo);
		}
		return project;
	}
	
	public void delete(String id)
	{
		projectRepository.deleteById(id);;
	}

}
