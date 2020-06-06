package com.cms.util;

import com.cms.dto.CustomerInfoDTO;
import com.cms.dto.EmployeeInfoDTO;
import com.cms.model.CustomerInfo;
import com.cms.model.EmployeeInfo;
import com.cms.vo.CustomerInfoVO;
import com.cms.vo.EmployeeInfoVO;

public class ObjectMapper {
	
	public static CustomerInfoDTO voToDto(CustomerInfoVO vo) {
		
		CustomerInfoDTO dto = new CustomerInfoDTO();
		dto.setCustomerId(vo.getCustomerId());
		dto.setCustomerName(vo.getCustomerName());
		dto.setOccupation(vo.getOccupation());
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setCustomerMobileNo(vo.getCustomerMobileNo());
		
		return dto;
	}
	
	public static CustomerInfoVO dtoToVo(CustomerInfoDTO dto) {
		
		CustomerInfoVO vo = new CustomerInfoVO();
		vo.setCustomerId(dto.getCustomerId());
		vo.setCustomerName(dto.getCustomerName());
		vo.setOccupation(dto.getOccupation());
		vo.setCustomerAddress(dto.getCustomerAddress());
		vo.setCustomerMobileNo(dto.getCustomerMobileNo());
		
		return vo;
	}
	
	public static CustomerInfoDTO modelToDto(CustomerInfo model) {
		
		CustomerInfoDTO dto = new CustomerInfoDTO();
		dto.setCustomerId(model.getCustomerId());
		dto.setCustomerName(model.getCustomerName());
		dto.setOccupation(model.getOccupation());
		dto.setCustomerAddress(model.getCustomerAddress());
		dto.setCustomerMobileNo(model.getCustomerMobileNo());
		
		return dto;
	}
	
	public static CustomerInfo dtoToModel(CustomerInfoDTO dto) {
		
		CustomerInfo model = new CustomerInfo();
		model.setCustomerId(dto.getCustomerId());
		model.setCustomerName(dto.getCustomerName());
		model.setOccupation(dto.getOccupation());
		model.setCustomerAddress(dto.getCustomerAddress());
		model.setCustomerMobileNo(dto.getCustomerMobileNo());
		
		return model;
	}
	
	public static EmployeeInfoDTO voToDto(EmployeeInfoVO vo) {
		EmployeeInfoDTO dto = new EmployeeInfoDTO();
		dto.setEmployeeId(vo.getEmployeeId());
		dto.setEmployeeName(vo.getEmployeeName());
		dto.setEmployeeMobileNo(vo.getEmployeeMobileNo());
		dto.setEmployeeRateId(vo.getEmployeeRateId());
		dto.setEmployeeAddress(vo.getEmployeeAddress());
		return dto;
	}
	
	public static EmployeeInfoVO dtoToVo(EmployeeInfoDTO dto) {
		EmployeeInfoVO vo = new EmployeeInfoVO();
		vo.setEmployeeId(dto.getEmployeeId());
		vo.setEmployeeName(dto.getEmployeeName());
		vo.setEmployeeMobileNo(dto.getEmployeeMobileNo());
		vo.setEmployeeRateId(dto.getEmployeeRateId());
		vo.setEmployeeAddress(dto.getEmployeeAddress());
		return vo;
	}
	
	public static EmployeeInfoDTO modelToDto(EmployeeInfo model) {
		EmployeeInfoDTO dto = new EmployeeInfoDTO();
		dto.setEmployeeId(model.getEmployeeId());
		dto.setEmployeeName(model.getEmployeeName());
		dto.setEmployeeMobileNo(model.getEmployeeMobileNo());
		dto.setEmployeeRateId(model.getEmployeeRate().getRateId());
		dto.setEmployeeAddress(model.getEmployeeAddress());
		return dto;
	}
	
	public static EmployeeInfo dtoToModel(EmployeeInfoDTO dto) {
		EmployeeInfo model = new EmployeeInfo();
		model.setEmployeeId(dto.getEmployeeId());
		model.setEmployeeName(dto.getEmployeeName());
		model.setEmployeeMobileNo(dto.getEmployeeMobileNo());
		model.setEmployeeAddress(model.getEmployeeAddress());
		return model;
	}

}
