package com.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cms.model.EmployeeRate;
import com.cms.model.Project;
import com.cms.model.EmployeeInfo;


@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer>{

}
