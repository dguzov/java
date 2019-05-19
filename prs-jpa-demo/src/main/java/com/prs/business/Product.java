package com.prs.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JoinColumn(name = "vendorID")
	@ManyToOne
	private Vendor vendor;
	private String partnumber;
	private String name;
	private double price;
	private String unit;
	private String photopath;
	private boolean isactive;

	public Product() {
		super();
	}

	public Product(int id, Vendor vendor, String partnumber, String name, double price, String unit, String photopath,
			boolean isactive) {
		super();
		this.id = id;
		this.vendor = vendor;
		this.partnumber = partnumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photopath = photopath;
		this.isactive = isactive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public String getPartnumber() {
		return partnumber;
	}

	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPhotopath() {
		return photopath;
	}

	public void setPhotopath(String photopath) {
		this.photopath = photopath;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", vendor=" + vendor + ", partnumber=" + partnumber + ", name=" + name + ", price="
				+ price + ", unit=" + unit + ", photopath=" + photopath + ", isactive=" + isactive + "]";
	}
}
