package com.wcs.app.rh.main.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_vehicle_type_master", catalog = "republic_hyundai")
public class VehicleType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String model_type;
	@ManyToOne(cascade = CascadeType.ALL)
	private VehicleModel model;
	public VehicleType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleType(int id, String model_type, VehicleModel model) {
		super();
		this.id = id;
		this.model_type = model_type;
		this.model = model;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel_type() {
		return model_type;
	}
	public void setModel_type(String model_type) {
		this.model_type = model_type;
	}
	public VehicleModel getModel() {
		return model;
	}
	public void setModel(VehicleModel model) {
		this.model = model;
	}
	
}
