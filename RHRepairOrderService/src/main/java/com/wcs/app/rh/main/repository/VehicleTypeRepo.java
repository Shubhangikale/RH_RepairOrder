package com.wcs.app.rh.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.rh.main.models.VehicleType;

public interface VehicleTypeRepo extends CrudRepository<VehicleType, Integer>{
	public List<VehicleType> findAllByModel_id(int id);
}
