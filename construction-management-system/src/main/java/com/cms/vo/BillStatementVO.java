package com.cms.vo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class BillStatementVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String billId;
	
	private String projectId;
	
	private int rowDescription;
	
	private BigDecimal totalBill;
	
	private BigDecimal discount;
	
	private BigDecimal finalBill;
}
