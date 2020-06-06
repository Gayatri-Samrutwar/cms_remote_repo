package com.cms.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.ProjectTypeRepository;
import com.cms.model.ProjectType;




@Service
public class ProjectTypeService {
	
	@Autowired
	private ProjectTypeRepository projectTypeRepository;
	
	public Collection<ProjectType> findAllProjectTypeInformation()
	{
		List<ProjectType> projectType = new ArrayList<ProjectType>();
		
		for(ProjectType projectTypeInfo : projectTypeRepository.findAll())
		{
			
			projectType.add(projectTypeInfo);
		}
		return projectType;
	}
	public void saveProjectType(ProjectType projectType)
	{
		projectTypeRepository.save(projectType);
		
	}
	
	public void delete(String id)
	{
		projectTypeRepository.deleteById(id);;
	}

}
