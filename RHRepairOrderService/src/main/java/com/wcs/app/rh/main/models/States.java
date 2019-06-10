package com.wcs.app.rh.main.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rh_states_master", catalog = "republic_hyundai")
public class States {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int gst_code;
	public States() {
		super();
		// TODO Auto-generated constructor stub
	}
	public States(int id, String name, int gst_code) {
		super();
		this.id = id;
		this.name = name;
		this.gst_code = gst_code;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGst_code() {
		return gst_code;
	}
	public void setGst_code(int gst_code) {
		this.gst_code = gst_code;
	}
	
	

}
