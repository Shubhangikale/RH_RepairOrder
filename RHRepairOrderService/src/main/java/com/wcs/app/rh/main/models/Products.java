package com.wcs.app.rh.main.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_products_master", catalog = "republic_hyundai")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String product_code;
	private String product_name;
	private String product_buying_price;
	@OneToOne(cascade = CascadeType.ALL)
	private Supplier supplier;
	private int product_quantity;
	@OneToOne(cascade = CascadeType.ALL)
	private Category category;
	private String hsn_num;
	@OneToOne(cascade = CascadeType.ALL)
	private TaxType taxtype;
	private String product_buying_price_with_gst;
	@OneToOne(cascade = CascadeType.ALL)
	private Block block;
	@OneToOne(cascade = CascadeType.ALL)
	private VehicleModel vehicleModel;
	@OneToOne(cascade = CascadeType.ALL)
	private VehicleType vehicleType;
	private String receiving_date;
	@OneToOne(cascade = CascadeType.ALL)
	private SystemUsers systemUsers;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int id, String product_code, String product_name, String product_buying_price, Supplier supplier,
			int product_quantity, Category category, String hsn_num, TaxType taxtype,
			String product_buying_price_with_gst, Block block, VehicleModel vehicleModel, VehicleType vehicleType,
			String receiving_date, SystemUsers systemUsers) {
		super();
		this.id = id;
		this.product_code = product_code;
		this.product_name = product_name;
		this.product_buying_price = product_buying_price;
		this.supplier = supplier;
		this.product_quantity = product_quantity;
		this.category = category;
		this.hsn_num = hsn_num;
		this.taxtype = taxtype;
		this.product_buying_price_with_gst = product_buying_price_with_gst;
		this.block = block;
		this.vehicleModel = vehicleModel;
		this.vehicleType = vehicleType;
		this.receiving_date = receiving_date;
		this.systemUsers = systemUsers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_buying_price() {
		return product_buying_price;
	}
	public void setProduct_buying_price(String product_buying_price) {
		this.product_buying_price = product_buying_price;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public int getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getHsn_num() {
		return hsn_num;
	}
	public void setHsn_num(String hsn_num) {
		this.hsn_num = hsn_num;
	}
	public TaxType getTaxtype() {
		return taxtype;
	}
	public void setTaxtype(TaxType taxtype) {
		this.taxtype = taxtype;
	}
	public String getProduct_buying_price_with_gst() {
		return product_buying_price_with_gst;
	}
	public void setProduct_buying_price_with_gst(String product_buying_price_with_gst) {
		this.product_buying_price_with_gst = product_buying_price_with_gst;
	}
	public Block getBlock() {
		return block;
	}
	public void setBlock(Block block) {
		this.block = block;
	}
	public VehicleModel getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(VehicleModel vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getReceiving_date() {
		return receiving_date;
	}
	public void setReceiving_date(String receiving_date) {
		this.receiving_date = receiving_date;
	}
	public SystemUsers getSystemUsers() {
		return systemUsers;
	}
	public void setSystemUsers(SystemUsers systemUsers) {
		this.systemUsers = systemUsers;
	}
	
	
}
