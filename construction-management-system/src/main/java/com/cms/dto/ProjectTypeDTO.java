package com.cms.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProjectTypeDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int projectTypeId;
	
	private String projectTypeName;
	

}
