package com.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cms.model.EmployeeDailyAttendance;
import com.cms.model.EmployeeInfo;





@Repository
public interface EmployeeAttendanceRepository extends CrudRepository<EmployeeDailyAttendance, Integer>{

}
