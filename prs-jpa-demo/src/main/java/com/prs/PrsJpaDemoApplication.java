package com.prs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.Product;
import com.prs.business.PurchaseRequest;
import com.prs.business.PurchaseRequestLineItem;
import com.prs.business.User;
import com.prs.business.Vendor;
import com.prs.db.ProductDB;
import com.prs.db.PurchaseRequestDB;
import com.prs.db.PurchaseRequestLineItemDB;
import com.prs.db.UserDB;
import com.prs.db.VendorDB;
import com.prs.util.Console;

@SpringBootApplication
public class PrsJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemoApplication.class, args);
		// welcome message
		System.out.println("Welcome to the PrsJpaDemo Application!");
		// display menu to choose the table
		displayCommandMenu();
		String action = "";
		while (!action.equalsIgnoreCase("exit")) {

			// get input from user (select the table)
			action = Console.getRequiredString("Enter a table name:    ");
			System.out.println();			
			
			if (action.equalsIgnoreCase("user")) {
				// list the available features for user table
				// display table' operation menu
				displayMenu();
				while (!action.equalsIgnoreCase("back")) {
					action = Console.getRequiredString("Enter command:   ");
					System.out.println();
					// display all users
					if (action.equalsIgnoreCase("list")) {
						for (User user : UserDB.getAll()) {
							System.out.println(user);
						}
					}
					// add user
					if (action.equalsIgnoreCase("add")) {
						addUser();
					}
					// display one user
//				if (action.equalsIgnoreCase("get")) {
//					getUser();
//				} 				
					// delete user
//					if (action.equalsIgnoreCase("del")) {
//						deleteUser();
//									}
					else {
						System.out.println("");
					}
				}
				
				// list' feature for others tables
			} else if (action.equalsIgnoreCase("vendor")) {
				// display all vendors
				for (Vendor vendor : VendorDB.getAll()) {
					System.out.println(vendor);
				}
			} else if (action.equalsIgnoreCase("product")) {
				// display all products
				for (Product product : ProductDB.getAll()) {
					System.out.println(product);
				}
			} else if (action.equalsIgnoreCase("pr")) {
				// display all purchaselines
				for (PurchaseRequest purchaserequest : PurchaseRequestDB.getAll()) {
					System.out.println(purchaserequest);
				}
			} else if (action.equalsIgnoreCase("prli")) {
				// display all purchaserequestlineitems
				for (PurchaseRequestLineItem purchaserequestlineitem : PurchaseRequestLineItemDB.getAll()) {
					System.out.println(purchaserequestlineitem);
				}
			}else if (action.equalsIgnoreCase("exit")) {
					System.out.println();				
				}
			 else {
				System.out.println("Invalid command.\n");
			}
		}
		System.out.println("Bye!");
	}

	// menu for choosing the table
	public static void displayCommandMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("================+++++++++++++++++++++++++======");
		System.out.println("user		-for table Users");
		System.out.println("vendor      -for table Vendors");
		System.out.println("product     -for table Products");
		System.out.println("pr          -for table PurchaseRequests");
		System.out.println("prli        -for table PurchaseRequestListItems");
		System.out.println("exit        -for exit");
	}

	// menu for choosing the operations with the rows of the table
	public static void displayMenu() {
		System.out.println("TABLE COMMAND MENU");
		System.out.println("========================");
		System.out.println("list           -for listing all rows");
		System.out.println("add            -for adding new row");
//		System.out.println("list one user  -for listing one user by id");
//		System.out.println("del            -for deleting one row");
		System.out.println("back           -get back to tables");
	}

	private static void addUser() {
		String username = Console.getRequiredString("Enter Username:    ");
		String password = Console.getRequiredString("Enter Password:    ");
		String firstname = Console.getRequiredString("Enter Firstname:    ");
		String lastname = Console.getRequiredString("Enter Lastname:    ");
		String phonenumber = Console.getRequiredString("Enter Phonenumber:    ");
		String email = Console.getRequiredString("Enter Email:    ");
		boolean isreviewer = Console.getBoolean("Is Reviewer? :    ", "yes", "no");
		boolean isadmin = Console.getBoolean("Is Admin? :    ", "yes", "no");
		User p = new User(username, password, firstname, lastname, phonenumber, email, isreviewer, isadmin);
		if (UserDB.add(p)) {
			System.out.println("User " + p.getId() + " successfully added");
		} else {
			System.out.println("Error adding user");
		}
	}
}
