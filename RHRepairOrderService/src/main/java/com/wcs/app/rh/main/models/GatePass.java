package com.wcs.app.rh.main.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_gate_passes", catalog = "republic_hyundai")
public class GatePass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date date;
	@OneToOne(cascade = CascadeType.ALL)
	private InvoiceMaster invoiceMaster;
	@OneToOne(cascade = CascadeType.ALL)
	private Status status;
	public GatePass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GatePass(int id, Date date, InvoiceMaster invoiceMaster, Status status) {
		super();
		this.id = id;
		this.date = date;
		this.invoiceMaster = invoiceMaster;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public InvoiceMaster getInvoiceMaster() {
		return invoiceMaster;
	}
	public void setInvoiceMaster(InvoiceMaster invoiceMaster) {
		this.invoiceMaster = invoiceMaster;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}