package com.cms.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;



@Entity(name ="EmployeeInfo")
@Data
public class EmployeeInfo implements Serializable {
	
	@Id
	private String employeeId;
	
	@Column(name="EmployeeName")
	private String employeeName;
	
	@Column(name ="EmployeeMobileNo")
	private String employeeMobileNo;
	
	@Column(name="EmployeeAddress")
	private String employeeAddress;
	
	@OneToOne(targetEntity=EmployeeRate.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "rateId", referencedColumnName = "rateId")
	private EmployeeRate employeeRate;

}
