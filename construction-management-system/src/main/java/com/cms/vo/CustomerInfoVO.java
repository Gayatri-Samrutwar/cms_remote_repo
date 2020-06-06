package com.cms.vo;

import java.io.Serializable;

import lombok.Data;


@Data
public class CustomerInfoVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String customerId;
	
	private String customerName;
	
	private String customerMobileNo;
	
	private String customerAddress;
	
	private String occupation;
}
