package com.cms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cms.model.CustomerInfo;

@Repository
public interface CustomerInfoRepository extends CrudRepository<CustomerInfo, String> {

}
