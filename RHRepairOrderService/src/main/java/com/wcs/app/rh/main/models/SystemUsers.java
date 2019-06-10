package com.wcs.app.rh.main.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_system_users", catalog = "republic_hyundai")
public class SystemUsers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private String mobile;
	private String email;
	private String id_proof;
	private String username;
	private String password;
	private int pass_activation;
	@OneToOne(cascade = CascadeType.ALL)
	private Status user_status;
	private String qualification;
	private String created_date;
	@OneToOne(cascade = CascadeType.ALL)
	private Role role;
	public SystemUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SystemUsers(int id, String name, String address, String mobile, String email, String id_proof,
			String username, String password, int pass_activation, Status user_status, String qualification,
			String created_date, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.id_proof = id_proof;
		this.username = username;
		this.password = password;
		this.pass_activation = pass_activation;
		this.user_status = user_status;
		this.qualification = qualification;
		this.created_date = created_date;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId_proof() {
		return id_proof;
	}
	public void setId_proof(String id_proof) {
		this.id_proof = id_proof;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPass_activation() {
		return pass_activation;
	}
	public void setPass_activation(int pass_activation) {
		this.pass_activation = pass_activation;
	}
	public Status getUser_status() {
		return user_status;
	}
	public void setUser_status(Status user_status) {
		this.user_status = user_status;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

}
