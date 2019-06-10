package com.wcs.app.rh.main.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_customer_labour_details", catalog = "republic_hyundai")
public class CustomerLabour {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    @OneToOne(cascade = CascadeType.ALL)
	private CustomerServiceDetails customerServiceDetails;
    @OneToOne(cascade = CascadeType.ALL)
    private SystemUsers systemUsers;
	public CustomerLabour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerLabour(int id, CustomerServiceDetails customerServiceDetails, SystemUsers systemUsers) {
		super();
		this.id = id;
		this.customerServiceDetails = customerServiceDetails;
		this.systemUsers = systemUsers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CustomerServiceDetails getCustomerServiceDetails() {
		return customerServiceDetails;
	}
	public void setCustomerServiceDetails(CustomerServiceDetails customerServiceDetails) {
		this.customerServiceDetails = customerServiceDetails;
	}
	public SystemUsers getSystemUsers() {
		return systemUsers;
	}
	public void setSystemUsers(SystemUsers systemUsers) {
		this.systemUsers = systemUsers;
	}
	

	
}
