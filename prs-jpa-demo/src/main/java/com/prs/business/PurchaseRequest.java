package com.prs.business;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PurchaseRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JoinColumn(name = "userID")
	@ManyToOne
	private User user;
	private String description;
	private String justification;
	private LocalDate dateneeded;
	private String deliverymode;
	private String status;
	private Double total;
	private LocalDate submitteddate;
	private String reasonforrejection;
	private boolean isactive;

	public PurchaseRequest() {
		super();
	}

	public PurchaseRequest(int id, User user, String description, String justification, LocalDate dateneeded,
			String deliverymode, String status, Double total, LocalDate submitteddate, String reasonforrejection,
			boolean isactive) {
		super();
		this.id = id;
		this.user = user;
		this.description = description;
		this.justification = justification;
		this.dateneeded = dateneeded;
		this.deliverymode = deliverymode;
		this.status = status;
		this.total = total;
		this.submitteddate = submitteddate;
		this.reasonforrejection = reasonforrejection;
		this.isactive = isactive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public LocalDate getDateneeded() {
		return dateneeded;
	}

	public void setDateneeded(LocalDate dateneeded) {
		this.dateneeded = dateneeded;
	}

	public String getDeliverymode() {
		return deliverymode;
	}

	public void setDeliverymode(String deliverymode) {
		this.deliverymode = deliverymode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public LocalDate getSubmitteddate() {
		return submitteddate;
	}

	public void setSubmitteddate(LocalDate submitteddate) {
		this.submitteddate = submitteddate;
	}

	public String getReasonforrejection() {
		return reasonforrejection;
	}

	public void setReasonforrejection(String reasonforrejection) {
		this.reasonforrejection = reasonforrejection;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	@Override
	public String toString() {
		return "PurchaseRequest [id=" + id + ", user=" + user + ", description=" + description + ", justification="
				+ justification + ", dateneeded=" + dateneeded + ", deliverymode=" + deliverymode + ", status=" + status
				+ ", total=" + total + ", submitteddate=" + submitteddate + ", reasonforrejection=" + reasonforrejection
				+ ", isactive=" + isactive + "]";
	}

}