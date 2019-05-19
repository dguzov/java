package com.prs.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PurchaseRequestLineItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JoinColumn(name = "purchaserequestID")
	@ManyToOne
	private PurchaseRequest purchaserequest;
	@JoinColumn(name = "productID")
	@ManyToOne
	private Product product;
	private int quantity;
	private boolean isactive;

	public PurchaseRequestLineItem() {
		super();
	}

	public PurchaseRequestLineItem(int id, PurchaseRequest purchaserequest, Product product, int quantity,
			boolean isactive) {
		super();
		this.id = id;
		this.purchaserequest = purchaserequest;
		this.product = product;
		this.quantity = quantity;
		this.isactive = isactive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PurchaseRequest getPurchaserequest() {
		return purchaserequest;
	}

	public void setPurchaserequest(PurchaseRequest purchaserequest) {
		this.purchaserequest = purchaserequest;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	@Override
	public String toString() {
		return "PurchaseRequestLineItem [id=" + id + ", purchaserequest=" + purchaserequest + ", product=" + product
				+ ", quantity=" + quantity + ", isactive=" + isactive + "]";
	}

}