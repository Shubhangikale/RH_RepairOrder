package com.wcs.app.rh.main.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "rh_InvoiceMaster", catalog = "republic_hyundai")
public class InvoiceMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(cascade = CascadeType.ALL)
	private ROInvoice roInvoice;
	@OneToOne(cascade = CascadeType.ALL)
	private SystemUsers createdBy;
	@OneToOne(cascade = CascadeType.ALL)
	private Status status;
	public InvoiceMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InvoiceMaster(int id, ROInvoice roInvoice, SystemUsers createdBy, Status status) {
		super();
		this.id = id;
		this.roInvoice = roInvoice;
		this.createdBy = createdBy;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ROInvoice getRoInvoice() {
		return roInvoice;
	}
	public void setRoInvoice(ROInvoice roInvoice) {
		this.roInvoice = roInvoice;
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
