package com.wcs.app.rh.main.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rh_customer_product_quantity", catalog = "republic_hyundai")
public class CustomerProductQuantity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int quantity;
	public CustomerProductQuantity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerProductQuantity(int id, int quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

}
