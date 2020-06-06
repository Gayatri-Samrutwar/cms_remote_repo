package com.cms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cms.model.EmployeeRate;


@Repository
public interface EmployeeRateRepository extends CrudRepository<EmployeeRate, String>{

}
