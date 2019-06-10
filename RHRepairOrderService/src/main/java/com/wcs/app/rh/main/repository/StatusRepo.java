package com.wcs.app.rh.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.rh.main.models.Status;

public interface StatusRepo extends CrudRepository<Status,Integer> {

}
