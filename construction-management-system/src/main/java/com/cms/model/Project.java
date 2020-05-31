package com.cms.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name= "Project")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Project implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int projectId;
	
	@Column(name ="projectName")
	private String projectName;
	
	@Enumerated(EnumType.ORDINAL)
    @Column(length = 255)
	private ContractType contractType = ContractType.LabourPayment ;
	
	@Column(name = "estimateCost")
	private float estimateCost;
	
	@Column(name ="paymentRecived")
	private float paymentRecived;
	
	@Column(name ="contractCost")
	private float contractCost;
	
	@Column(name ="projectLocation")
	private String projectLocation;
	
	@OneToOne(targetEntity = ProjectType.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "projectTypeId", referencedColumnName="projectTypeId")
	private ProjectType projectType;
	
	

}
