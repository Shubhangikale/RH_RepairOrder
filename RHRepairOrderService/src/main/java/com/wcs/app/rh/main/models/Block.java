package com.wcs.app.rh.main.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rh_blocks", catalog = "republic_hyundai")
public class Block {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int block_num;
	private String block_name;
	private String title;
	public Block() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Block(int id, int block_num, String block_name, String title) {
		super();
		this.id = id;
		this.block_num = block_num;
		this.block_name = block_name;
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBlock_num() {
		return block_num;
	}
	public void setBlock_num(int block_num) {
		this.block_num = block_num;
	}
	public String getBlock_name() {
		return block_name;
	}
	public void setBlock_name(String block_name) {
		this.block_name = block_name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
