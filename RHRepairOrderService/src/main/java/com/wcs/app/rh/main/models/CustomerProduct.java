package com.wcs.app.rh.main.models;

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
@Table(name = "rh_customer_product_details", catalog = "republic_hyundai")
public class CustomerProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String receiving_date;
    private String promise_date;
    private String receiving_time;
    private String promise_time;
    private String remark;
    @OneToOne(cascade = CascadeType.ALL)
    private SystemUsers systemUsers;
    @OneToOne(cascade = CascadeType.ALL)
    private ROInvoice invoice;
    @OneToMany(cascade = CascadeType.ALL)
    private Map<Products, CustomerProductQuantity> cust_pro_list;
	public CustomerProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerProduct(int id, String receiving_date, String promise_date, String receiving_time,
			String promise_time, String remark, SystemUsers systemUsers, ROInvoice invoice,
			Map<Products, CustomerProductQuantity> cust_pro_list) {
		super();
		this.id = id;
		this.receiving_date = receiving_date;
		this.promise_date = promise_date;
		this.receiving_time = receiving_time;
		this.promise_time = promise_time;
		this.remark = remark;
		this.systemUsers = systemUsers;
		this.invoice = invoice;
		this.cust_pro_list = cust_pro_list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReceiving_date() {
		return receiving_date;
	}
	public void setReceiving_date(String receiving_date) {
		this.receiving_date = receiving_date;
	}
	public String getPromise_date() {
		return promise_date;
	}
	public void setPromise_date(String promise_date) {
		this.promise_date = promise_date;
	}
	public String getReceiving_time() {
		return receiving_time;
	}
	public void setReceiving_time(String receiving_time) {
		this.receiving_time = receiving_time;
	}
	public String getPromise_time() {
		return promise_time;
	}
	public void setPromise_time(String promise_time) {
		this.promise_time = promise_time;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public SystemUsers getSystemUsers() {
		return systemUsers;
	}
	public void setSystemUsers(SystemUsers systemUsers) {
		this.systemUsers = systemUsers;
	}
	public ROInvoice getInvoice() {
		return invoice;
	}
	public void setInvoice(ROInvoice invoice) {
		this.invoice = invoice;
	}
	public Map<Products, CustomerProductQuantity> getCust_pro_list() {
		return cust_pro_list;
	}
	public void setCust_pro_list(Map<Products, CustomerProductQuantity> cust_pro_list) {
		this.cust_pro_list = cust_pro_list;
	}


}
