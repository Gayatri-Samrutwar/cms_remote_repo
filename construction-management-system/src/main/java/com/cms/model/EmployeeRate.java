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

@Entity(name ="EmployeeRate")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class EmployeeRate implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rateId;
	
	@OneToOne(targetEntity = ProjectType.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "projectTypeId", referencedColumnName="projectTypeId")
	private ProjectType projectType;
	
	@Column(name ="employeeSubType")
	private String employeeSubType;
	
	@Column(name ="halfDayTimeRate")
	private BigDecimal halfDayTimeRate;
	
	@Column(name ="fullDayTimeRate")
	private BigDecimal fullDayTimeRate;
	
	@Column(name ="overTimeRate")
	private BigDecimal overTimeRate;

}
