package com.cms.dto;

import java.io.Serializable;

import lombok.Data;



@Data
public class EmployeeInfoDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String employeeId;
	
	private String employeeName;
	
	private String employeeMobileNo;
	
	private String employeeAddress;
	
	private String employeeRateId;

}
