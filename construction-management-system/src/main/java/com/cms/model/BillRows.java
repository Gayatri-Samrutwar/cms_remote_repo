package com.cms.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name ="BillRows")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class BillRows implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rowId;
	
	@ManyToOne
    @JoinColumn(name="billId", nullable=false)
	private Bill bill;
	
	@Column(name="rowDescription")
	private int rowDescription;
	
	@Column(name ="rowQty")
	private BigDecimal qty;
	
	@Column(name="rowRate")
	private BigDecimal rate;
	
	@Column(name="rowTotal")
	private BigDecimal total;
}
