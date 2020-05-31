package com.cms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cms.model.EmployeeDailyAttendance;





@Repository
public interface EmployeeAttendanceRepository extends CrudRepository<EmployeeDailyAttendance, Integer>{

}
