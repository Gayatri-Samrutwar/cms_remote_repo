package com.cms.model;

import java.io.Serializable;

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



@Entity(name ="CustomerInformation")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CustomerInfo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	@Column(name="CustomerName")
	private String customerName;
	
	@Column(name ="CustomerMobileNo")
	private String customerMobileNo;
	
	@Column(name="customerAddress")
	private String customerAddress;
	
	@Column(name ="occupation")
	private String occupation;
}
