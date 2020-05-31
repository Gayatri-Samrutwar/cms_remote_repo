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

@Entity(name="ProjectType")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProjectType implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int projectTypeId;
	
	@Column(name ="projectTypeName")
	private String projectTypeName;
	

}
