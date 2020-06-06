package com.cms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cms.model.Project;


@Repository
public interface ProjectRepository extends CrudRepository<Project, String>{

}
