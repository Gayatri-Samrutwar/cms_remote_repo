package com.cms.vo;

import java.io.Serializable;

import lombok.Data;



@Data
public class EmployeeInfoVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int employeeId;
	
	private String employeeName;
	
	private String employeeMobileNo;
	
	private String employeeAddress;
	
	private String employeeRateId;

}