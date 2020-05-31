package com.cms.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Entity(name ="Bill")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Bill implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String billId;
	
	
	//map project with project Id
	@OneToOne(targetEntity=EmployeeRate.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "projectId", referencedColumnName = "projectId")
	Project project;
	
	@Column(name="billDescription")
	private int rowDescription;
	
	@OneToMany(mappedBy="BillRows")
	private Set<BillRows> billRows;
	
	@Column(name ="totalBill")
	private BigDecimal totalBill;
	
	@Column(name="discount")
	private BigDecimal discount;
	
	@Column(name="Final Bill")
	private BigDecimal finalBill;
}
