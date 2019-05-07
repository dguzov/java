package business;

public class Book extends Product{
	private String author;
	
	public Book() {
		super ();
		
	}

	public Book(String inCode, String inDesc, double inPrice, String author) {
		super(inCode, inDesc, inPrice);
		this.author = author;
	}
public void setAuthor(String author) {
	this.author = author;
	
	
	

	}
	
	}
