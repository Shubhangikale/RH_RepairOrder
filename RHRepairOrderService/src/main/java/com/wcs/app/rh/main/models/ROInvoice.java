package com.wcs.app.rh.main.models;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_roinvioce", catalog = "republic_hyundai")
public class ROInvoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ro_invioce_no;
	private String date;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerLabour customerLabour;
	@OneToOne(cascade = CascadeType.ALL)
	private SystemUsers createdBy;
	@OneToOne(cascade = CascadeType.ALL)
	private Status status;
	public ROInvoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ROInvoice(int id, String ro_invioce_no, String date, CustomerLabour customerLabour, SystemUsers createdBy,
			Status status) {
		super();
		this.id = id;
		this.ro_invioce_no = ro_invioce_no;
		this.date = date;
		this.customerLabour = customerLabour;
		this.createdBy = createdBy;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRo_invioce_no() {
		return ro_invioce_no;
	}
	public void setRo_invioce_no(String ro_invioce_no) {
		this.ro_invioce_no = ro_invioce_no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public CustomerLabour getCustomerLabour() {
		return customerLabour;
	}
	public void setCustomerLabour(CustomerLabour customerLabour) {
		this.customerLabour = customerLabour;
	}
	public SystemUsers getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(SystemUsers createdBy) {
		this.createdBy = createdBy;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}
