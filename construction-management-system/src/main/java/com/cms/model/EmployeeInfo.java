package com.cms.model;

import java.io.Serializable;

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



@Entity(name ="EmployeeInformation")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class EmployeeInfo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	
	@Column(name="EmployeeName")
	private String employeeName;
	
	@Column(name ="EmployeeMobileNo")
	private String employeeMobileNo;
	
	@Column(name="EmployeeAddress")
	private String employeeAddress;
	
	@OneToOne(targetEntity=EmployeeRate.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_Rate", referencedColumnName = "rateId")
	private EmployeeRate employeeRate;

}
