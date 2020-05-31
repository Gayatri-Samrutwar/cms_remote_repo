package com.cms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name ="EmployeeRateList")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class EmployeeRate implements Serializable {
	
	
	
	
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rateId;
	
	@Column(name="employeeType")
	private String employeeType;
	
	@Column(name ="employeeSubType")
	private String employeeSubType;
	
	@Column(name ="halfDayTimmeRate")
	private float halfDayTimmeRate;
	
	@Column(name ="fullDayTimeRate")
	private float fullDayTimeRate;
	
	@Column(name ="overTimeRate")
	private float overTimeRate;

}
