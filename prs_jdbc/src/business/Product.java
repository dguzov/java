package business;

public class Product {
	
	private int id;
	private int vendorid;
	private String partnumber;
	private String name;
	private Double price;
	private String unit;
	private String photopath;
	
	public Product() {
		super();
	}

	public Product(int id, int vendorid, String partnumber, String name, Double price, String unit, String photopath) {
		super();
		this.id = id;
		this.vendorid = vendorid;
		this.partnumber = partnumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photopath = photopath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVendorid() {
		return vendorid;
	}

	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
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

	@Override
	public String toString() {
		return "Product [id=" + id + ", vendorid=" + vendorid + ", partnumber=" + partnumber + ", name=" + name
				+ ", price=" + price + ", unit=" + unit + ", photopath=" + photopath + "]";
	}
	
	
}
