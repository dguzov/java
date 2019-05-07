package ui;
import business.Book;

public class ProductDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
//		Product product1 = new Product("Java", "Murach's Java Programming", 57.50);
//		Product product2 = new Product("mySql", "Murach's sql", 54.50);
//		
//		System.out.println(product1.getCode()+" "+product1.getDescription()+ " " +product1.getPrice());
//		System.out.println(product2.toString());
		
		Book seansBook = new Book("java", "Murachs java", 57.50, "Joel Murach");
		System.out.println(seansBook);
		System.out.println("Bye");
	}

}
