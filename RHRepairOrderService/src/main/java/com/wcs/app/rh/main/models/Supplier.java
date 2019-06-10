package com.wcs.app.rh.main.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_supplier_master", catalog = "republic_hyundai")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String mobile;
	private String company_name;
	private String address;
	@OneToOne(cascade = CascadeType.ALL)
	private States state;
	@OneToOne(cascade = CascadeType.ALL)
	private District district;
	@OneToOne(cascade = CascadeType.ALL)
	private SystemUsers createdBy;
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Supplier(int id, String name, String email, String mobile, String company_name, String address, States state,
			District district, SystemUsers createdBy) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.company_name = company_name;
		this.address = address;
		this.state = state;
		this.district = district;
		this.createdBy = createdBy;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public States getState() {
		return state;
	}
	public void setState(States state) {
		this.state = state;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public SystemUsers getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(SystemUsers createdBy) {
		this.createdBy = createdBy;
	}
	
	
}
