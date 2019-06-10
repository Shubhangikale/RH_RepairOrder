package com.wcs.app.rh.main.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rh_service_packages", catalog = "republic_hyundai")
public class ServicePackages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String service_pkg_name;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Products> product_list;
	public ServicePackages() {
		super();
	}
	public ServicePackages(int id, String service_pkg_name, List<Products> product_list) {
		super();
		this.id = id;
		this.service_pkg_name = service_pkg_name;
		this.product_list = product_list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getService_pkg_name() {
		return service_pkg_name;
	}
	public void setService_pkg_name(String service_pkg_name) {
		this.service_pkg_name = service_pkg_name;
	}
	public List<Products> getProduct_list() {
		return product_list;
	}
	public void setProduct_list(List<Products> product_list) {
		this.product_list = product_list;
	}
}
