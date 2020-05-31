package com.cms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cms.model.ProjectType;


@Repository
public interface ProjectTypeRepository extends CrudRepository<ProjectType, Integer>{

}
