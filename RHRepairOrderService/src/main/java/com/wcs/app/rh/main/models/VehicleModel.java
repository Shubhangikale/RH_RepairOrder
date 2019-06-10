package com.wcs.app.rh.main.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_vehicle_model_master", catalog = "republic_hyundai")
public class VehicleModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	private String model_name;
	@OneToOne(cascade = CascadeType.ALL)
	private Status status;
	public VehicleModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleModel(int id, String model_name, Status status) {
		super();
		this.id = id;
		this.model_name = model_name;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	

}
