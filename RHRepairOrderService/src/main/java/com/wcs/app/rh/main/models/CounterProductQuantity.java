package com.wcs.app.rh.main.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rh_counter_product_quantity", catalog = "republic_hyundai")
public class CounterProductQuantity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int quantity;
	public CounterProductQuantity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CounterProductQuantity(int id, int quantity) {
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
