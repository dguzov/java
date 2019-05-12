package business;

import java.time.LocalDate;

public class PurchaseRequest {
	
	private int id;
	private int userid;
	private String description;
	private String justification;
	private LocalDate dateneeded;
	private String deliverymode;
	private String status;
	private Double total;
	private LocalDate submitteddate;
	private String reasonforrejection;
	
	public PurchaseRequest() {
		super();
	}

	public PurchaseRequest(int id, int userid, String description, String justification, LocalDate dateneeded,
			String deliverymode, String status, Double total, LocalDate submitteddate, String reasonforrejection) {
		super();
		this.id = id;
		this.userid = userid;
		this.description = description;
		this.justification = justification;
		this.dateneeded = dateneeded;
		this.deliverymode = deliverymode;
		this.status = status;
		this.total = total;
		this.submitteddate = submitteddate;
		this.reasonforrejection = reasonforrejection;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	@Override
	public String toString() {
		return "PurchaseRequest [id=" + id + ", userid=" + userid + ", description=" + description + ", justification="
				+ justification + ", dateneeded=" + dateneeded + ", deliverymode=" + deliverymode + ", status=" + status
				+ ", total=" + total + ", submitteddate=" + submitteddate + ", reasonforrejection=" + reasonforrejection
				+ "]";
	}
	
	

}