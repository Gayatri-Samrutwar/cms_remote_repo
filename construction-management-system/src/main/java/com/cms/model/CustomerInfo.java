package com.cms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;



@Entity(name ="CustomerInfo")
@Getter
public class CustomerInfo implements Serializable {
	
	@Id
	private String customerId;
	
	@Column(name="CustomerName")
	private String customerName;
	
	@Column(name ="CustomerMobileNo")
	private String customerMobileNo;
	
	@Column(name="customerAddress")
	private String customerAddress;
	
	@Column(name ="occupation")
	private String occupation;
}
