package com.cms.vo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class BillRowsVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String rowId;
	
	private int rowDescription;
	
	private BigDecimal qty;
	
	private BigDecimal rate;
	
	private BigDecimal total;
}
