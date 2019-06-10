package com.wcs.app.rh.main.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_customer_service_details", catalog = "republic_hyundai")
public class CustomerServiceDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerVehicle customerVehicle;
	@OneToOne(cascade = CascadeType.ALL)
	private ServicePackages servicePackages;
	public CustomerServiceDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CustomerVehicle getCustomerVehicle() {
		return customerVehicle;
	}
	public void setCustomerVehicle(CustomerVehicle customerVehicle) {
		this.customerVehicle = customerVehicle;
	}
	public ServicePackages getServicePackages() {
		return servicePackages;
	}
	public void setServicePackages(ServicePackages servicePackages) {
		this.servicePackages = servicePackages;
	}
	
}
