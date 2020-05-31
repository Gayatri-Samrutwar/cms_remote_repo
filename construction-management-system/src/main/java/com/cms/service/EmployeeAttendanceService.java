package com.cms.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.EmployeeAttendanceRepository;
import com.cms.dao.EmployeeInfoRepository;
import com.cms.model.EmployeeDailyAttendance;
import com.cms.model.EmployeeInfo;




@Service
public class EmployeeAttendanceService {
	
	@Autowired
	private EmployeeAttendanceRepository employeeAttendanceRepository;
	
	
	
	public Collection<EmployeeDailyAttendance> findAllEmployeeInformation()
	{
		List<EmployeeDailyAttendance> employeeAttendanceInfo = new ArrayList<EmployeeDailyAttendance>();
		
		for(EmployeeDailyAttendance employeeAttendance : employeeAttendanceRepository.findAll())
		{
			
			employeeAttendanceInfo.add(employeeAttendance);
		}
		return employeeAttendanceInfo;
	}
	
	public void delete(int id)
	{
		employeeAttendanceRepository.deleteById(id);;
	}

}