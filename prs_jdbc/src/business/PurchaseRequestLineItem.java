package business;

public class PurchaseRequestLineItem {
	
	private int id;
	private int purchaserequestid;
	private int productid;
	private int quantity;
	
	public PurchaseRequestLineItem() {
		super();
	}

	public PurchaseRequestLineItem(int id, int purchaserequestid, int productid, int quantity) {
		super();
		this.id = id;
		this.purchaserequestid = purchaserequestid;
		this.productid = productid;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPurchaserequestid() {
		return purchaserequestid;
	}

	public void setPurchaserequestid(int purchaserequestid) {
		this.purchaserequestid = purchaserequestid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "PurchaseRequestLineItem [id=" + id + ", purchaserequestid=" + purchaserequestid + ", productid="
				+ productid + ", quantity=" + quantity + "]";
	}
	
	

}
