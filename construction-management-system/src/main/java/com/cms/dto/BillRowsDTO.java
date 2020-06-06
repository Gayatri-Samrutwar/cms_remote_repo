package com.cms.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class BillRowsDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int String;
	
	private int rowDescription;
	
	private BigDecimal qty;
	
	private BigDecimal rate;
	
	private BigDecimal total;
}
