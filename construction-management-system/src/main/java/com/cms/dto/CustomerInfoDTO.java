package com.cms.dto;

import java.io.Serializable;

import lombok.Data;


@Data
public class CustomerInfoDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int customerId;
	
	private String customerName;
	
	private String customerMobileNo;
	
	private String customerAddress;
	
	private String occupation;
}
