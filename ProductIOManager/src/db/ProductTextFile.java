package db;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import business.Product;

public class ProductTextFile implements DAO<Product> {

	private List<Product> products = null;
	private Path productsPath = null;
	private File productsFile = null;
	private final String FIELD_SEP = "\t";

	public ProductTextFile() {
		// define the path to the file
		productsPath = Paths.get("products.txt");
		// define the file
		productsFile = productsPath.toFile();
		// initialize our list of products
		products = getAll();

	}

	@Override
	public Product get(String code) {
		for (Product p : products) {
			if (p.getCode().equalsIgnoreCase(code)) {
				return p;

			}
		}
		return null;
	}

	@Override
	public List<Product> getAll() {
		// if the products file has already been read, don't read it again
		// * if this app support multiple user, it could be dangerous

		if (products != null) {
			return products;
		}

		products = new ArrayList<>();
		if (Files.exists(productsPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(productsFile))) {

				// read a line form products.txt
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);
					String code = fields[0];
					String desc = fields[1];
					double price = Double.parseDouble(fields[2]);
					// create instance of product from line
					Product p = new Product(code, desc, price);
					// add that product to the list of product
					products.add(p);

					line = in.readLine();
				}

			}
			// this is auto generated, IOExeption will handle
//			catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println(productsPath.toAbsolutePath() + " does not exist");
			return null;
		}

		return products;
	}

	@Override
	public boolean add(Product t) {
		products.add(t);
		return saveAll();
	}

	@Override
	public boolean update(Product t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Product t) {
		products.remove(t);
		return saveAll();
	}

//when processing text files, we will resave the entire file every time we add /update/delete	}
	private boolean saveAll() {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(productsFile)))) {
			for (Product p : products) {
				out.print(p.getCode() + FIELD_SEP);
				out.print(p.getDescription() + FIELD_SEP);
				out.print(p.getPrice() + FIELD_SEP);
			}
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
