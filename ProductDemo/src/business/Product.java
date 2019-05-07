package business;
import db.ProductReader;

public class Product implements ProductReader{

	private String code;
	private String description;
	private double price;
	
	public Product() {
		code = "";
		description = "";
		price = 0.0;		
	}

	public Product(String inCode, String inDesc, double inPrice) {
		code = inCode;
		description = inDesc;
		price = inPrice;
	}
//public Product(String code, String description, double price) {
	//	this.code = code;
	//	this.description = description;
	//	this.price = price;
//}
	
	// I wrote this getter/setter
	//public String getCode() {
		//return code;
	//}
	//public void setCode(String c) {
	//	code = c;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}

	@Override
	public Product get(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}
	


