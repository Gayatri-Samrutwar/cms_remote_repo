package com.cms.util;

import com.cms.dto.CustomerInfoDTO;
import com.cms.model.CustomerInfo;
import com.cms.vo.CustomerInfoVO;

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

}
