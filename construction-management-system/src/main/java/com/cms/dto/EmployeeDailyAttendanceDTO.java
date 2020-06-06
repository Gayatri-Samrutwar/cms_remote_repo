package com.cms.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

@Data
public class EmployeeDailyAttendanceDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int attendanceId;
	
	private String employeId;
		
	private String projectId;
	
	private LocalDate date;
	
	private double totalHoursWorked;
	
	private double standardHours;
	
	private double perWeekSalary;
	
	private String description;

}
