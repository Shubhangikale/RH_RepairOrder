package com.wcs.app.rh.main.models;

import java.util.Date;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_counter_sale", catalog = "republic_hyundai")
public class CounterSale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String mobile_no;
	private String email;
	@OneToOne (cascade = CascadeType.ALL)
	private States state;
	@OneToOne (cascade = CascadeType.ALL)
	private District district;
	private String city;
	private String address;
	private String pincode;
	private String vehicle_no;
	private String invoice_no;
	private Date date;
	@OneToOne(cascade = CascadeType.ALL)
	private VehicleModel vehicleModel;
	@OneToOne(cascade = CascadeType.ALL)
	private VehicleType vehicleType;
	@OneToMany(cascade = CascadeType.ALL)
	private Map<Products, CounterProductQuantity> product_list;
	public CounterSale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CounterSale(int id, String first_name, String middle_name, String last_name, String mobile_no, String email,
			States state, District district, String city, String address, String pincode, String vehicle_no,
			String invoice_no, Date date, VehicleModel vehicleModel, VehicleType vehicleType,
			Map<Products, CounterProductQuantity> product_list) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.mobile_no = mobile_no;
		this.email = email;
		this.state = state;
		this.district = district;
		this.city = city;
		this.address = address;
		this.pincode = pincode;
		this.vehicle_no = vehicle_no;
		this.invoice_no = invoice_no;
		this.date = date;
		this.vehicleModel = vehicleModel;
		this.vehicleType = vehicleType;
		this.product_list = product_list;
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
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getVehicle_no() {
		return vehicle_no;
	}
	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}
	public String getInvoice_no() {
		return invoice_no;
	}
	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public VehicleModel getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(VehicleModel vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Map<Products, CounterProductQuantity> getProduct_list() {
		return product_list;
	}
	public void setProduct_list(Map<Products, CounterProductQuantity> product_list) {
		this.product_list = product_list;
	}
	
	
	

}
