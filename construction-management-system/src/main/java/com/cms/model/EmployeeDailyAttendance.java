package com.cms.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity(name = "EmployeeDailyAttendance")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class EmployeeDailyAttendance implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int attendanceId;
	
	@OneToOne(targetEntity = EmployeeInfo.class, cascade = CascadeType.ALL)
	@JoinColumn(name ="employeeId", referencedColumnName = "employeeId")
	private EmployeeInfo employeeInfo;
	
	
	@OneToOne(targetEntity = Project.class, cascade = CascadeType.ALL)
	@JoinColumn(name ="projectId", referencedColumnName = "projectId")
	private Project project;
	
	@Column(name ="date")
	private LocalDate date;
	
	@Column(name = "totalHoursWorked")
	private double totalHoursWorked;
	
	@Column(name ="standardHours")
	private double standardHours;
	
	@Column(name="perWeekSalary")
	private double perWeekSalary;
	
	@Column(name ="description")
	private String description;

}
