package com.cms.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class EmployeeRateDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String rateId;
	
	private String projectTypeId;
	
	private String employeeSubType;
	
	private BigDecimal halfDayTimeRate;
	
	private BigDecimal fullDayTimeRate;
	
	private BigDecimal overTimeRate;

}
