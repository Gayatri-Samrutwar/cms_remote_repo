package com.cms.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name ="BillStatement")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class BillStatement implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String billId;
	
	@OneToOne(targetEntity=Project.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "projectId", referencedColumnName = "projectId")
	private Project project;
	
	@Column(name="billDescription")
	private int rowDescription;
	
	@Column(name ="totalBill")
	private BigDecimal totalBill;
	
	@Column(name="discount")
	private BigDecimal discount;
	
	@Column(name="finalbill")
	private BigDecimal finalBill;
}
