package com.wcs.app.rh.main.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_districts", catalog = "republic_hyundai")
public class District {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name; 
	private String dist_code; 
	@ManyToOne(cascade = CascadeType.ALL)
	private States state;
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}
	public District(int id, String name, String dist_code, States state) {
		super();
		this.id = id;
		this.name = name;
		this.dist_code = dist_code;
		this.state = state;
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
	public String getDist_code() {
		return dist_code;
	}
	public void setDist_code(String dist_code) {
		this.dist_code = dist_code;
	}
	public States getState() {
		return state;
	}
	public void setState(States state) {
		this.state = state;
	}
	
	
	

}
