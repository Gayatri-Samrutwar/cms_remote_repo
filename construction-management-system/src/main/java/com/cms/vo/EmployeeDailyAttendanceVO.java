package com.cms.vo;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

@Data
public class EmployeeDailyAttendanceVO implements Serializable {
	
	private int attendanceId;
	
	private String employeId;
		
	private String projectId;
	
	private LocalDate date;
	
	private double totalHoursWorked;
	
	private double standardHours;
	
	private double perWeekSalary;
	
	private String description;

}
