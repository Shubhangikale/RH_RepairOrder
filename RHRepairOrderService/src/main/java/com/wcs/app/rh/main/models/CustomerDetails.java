package com.wcs.app.rh.main.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_customer_details", catalog = "republic_hyundai")
public class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String address;
	private String mobile;
	private String email;
	private String gender;
	private String profession;
	private String cust_type;
	private String yearly_income;
	private String created_date;
	private String house_number;
	private int ro_status;
	@OneToOne(cascade = CascadeType.ALL)
	private Status status;
	@OneToOne(cascade = CascadeType.ALL)
	private States state;
	@OneToOne(cascade = CascadeType.ALL)
	private District district;
	
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDetails(int id, String first_name, String middle_name, String last_name, String address,
			String mobile, String email, String gender, String profession, String cust_type, String yearly_income,
			String created_date, String house_number, int ro_status, Status status, States state, District district) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.gender = gender;
		this.profession = profession;
		this.cust_type = cust_type;
		this.yearly_income = yearly_income;
		this.created_date = created_date;
		this.house_number = house_number;
		this.ro_status = ro_status;
		this.status = status;
		this.state = state;
		this.district = district;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getCust_type() {
		return cust_type;
	}

	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}

	public String getYearly_income() {
		return yearly_income;
	}

	public void setYearly_income(String yearly_income) {
		this.yearly_income = yearly_income;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getHouse_number() {
		return house_number;
	}

	public void setHouse_number(String house_number) {
		this.house_number = house_number;
	}

	public int getRo_status() {
		return ro_status;
	}

	public void setRo_status(int ro_status) {
		this.ro_status = ro_status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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


}
