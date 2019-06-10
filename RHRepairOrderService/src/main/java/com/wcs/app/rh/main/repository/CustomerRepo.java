package com.wcs.app.rh.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.rh.main.models.CustomerDetails;

public interface CustomerRepo extends CrudRepository<CustomerDetails, Integer> {

}
