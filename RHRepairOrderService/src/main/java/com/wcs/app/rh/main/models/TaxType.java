package com.wcs.app.rh.main.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "rh_tax_types_master", catalog = "republic_hyundai")
public class TaxType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String tax_type;
	private int tax_percent;
	@OneToOne(cascade = CascadeType.ALL)
	private Status status;
	public TaxType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaxType(int id, String tax_type, int tax_percent, Status status) {
		super();
		this.id = id;
		this.tax_type = tax_type;
		this.tax_percent = tax_percent;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTax_type() {
		return tax_type;
	}
	public void setTax_type(String tax_type) {
		this.tax_type = tax_type;
	}
	public int getTax_percent() {
		return tax_percent;
	}
	public void setTax_percent(int tax_percent) {
		this.tax_percent = tax_percent;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	

}
