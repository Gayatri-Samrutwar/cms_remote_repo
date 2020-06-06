package com.cms.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name ="BillRows")
@Data
public class BillRows implements Serializable {
	
	@Id
	private String rowId;
	
	@Column(name="rowDescription")
	private int rowDescription;
	
	@Column(name ="rowQty")
	private BigDecimal qty;
	
	@Column(name="rowRate")
	private BigDecimal rate;
	
	@Column(name="rowTotal")
	private BigDecimal total;
}
