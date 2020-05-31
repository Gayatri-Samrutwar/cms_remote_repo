package com.cms.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.EmployeeAttendanceRepository;
import com.cms.model.EmployeeDailyAttendance;
import com.cms.model.EmployeeRate;




@Service
public class EmployeeAttendanceService {
	
	@Autowired
	private EmployeeAttendanceRepository employeeAttendanceRepository;
	
	public double calculateSalary()
	{
		EmployeeDailyAttendance daily = new EmployeeDailyAttendance();
		EmployeeRate rate = new EmployeeRate();
		double totalSalary = daily.getPerWeekSalary();
	   
	    
	    if (daily.getTotalHoursWorked() > 40)
	    	totalSalary = (rate.getFullDayTimeRate() * daily.getTotalHoursWorked())
	                    + (daily.getTotalHoursWorked() - daily.getStandardHours()) * rate.getOverTimeRate();
	    else if (daily.getTotalHoursWorked() < 40)
	    	totalSalary = rate.getFullDayTimeRate() *  daily.getTotalHoursWorked();
	    else
	    	totalSalary= rate.getFullDayTimeRate() * daily.getStandardHours();
	    return totalSalary;
	}

	
	public Collection<EmployeeDailyAttendance> findAllEmployeeAttendanceInformation()
	
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
