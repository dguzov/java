package ui;

import java.util.List;

import business.User;
import db.DAO;
import db.UserDB;
import util.Console;
import util.StringUtils;

public class prsJdbcApp {

	private static DAO<User> userDAO = new UserDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the Product manager - Text File Edition");

		displayMenu();
		String action = "";
		while (!action.equalsIgnoreCase("exit")) {
			// get input from user
			action = Console.getRequiredString("Enter a command:    ");
			System.out.println();

			if (action.equalsIgnoreCase("list")) {
				// get a list of products and print to screen
				diplayAllUsers();
			} else if (action.equalsIgnoreCase("add")) {
				// add of products
				addUser();
			} else if (action.equalsIgnoreCase("del")) {
				// del of products
				deleteUser();
			} else if (action.equalsIgnoreCase("help")) {
				// get ...a list of products and print to screen
				displayMenu();
			} else {
				System.out.println("Invalid command.\n");
			}
		}

		System.out.println("Bye!");
	}

	public static void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("======================");
		System.out.println("list      -list all users");
		System.out.println("add       -add a user");
		System.out.println("del       -delete a user");
		System.out.println("help      -show this menu");
		System.out.println("exit      -exit");
	}

	private static void diplayAllUsers() {
		System.out.println("USER LIST: ");
		System.out.println("====================");
		List<User> users = userDAO.getAll();
		StringBuilder sb = new StringBuilder();
		for (User p : users) {
			sb.append(p.getId());
			sb.append(StringUtils.padWithSpaces(p.getUsername(), 20));
			sb.append(StringUtils.padWithSpaces(p.getPassword(), 15));
			sb.append(StringUtils.padWithSpaces(p.getFirstname(), 15));
			sb.append(StringUtils.padWithSpaces(p.getLastname(), 20));
			sb.append(StringUtils.padWithSpaces(p.getPhonenumber(), 15));
			sb.append(StringUtils.padWithSpaces(p.getEmail(), 30));
			sb.append(p.getIsreviewer());
			sb.append(p.getIsadmin());
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	private static void addUser() {
		int id = Console.getInt("Enter user ID:    ");
		String username = Console.getRequiredString("Enter Username:    ");
		String password = Console.getRequiredString("Enter Password:    ");
		String firstname = Console.getRequiredString("Enter Firstname:    ");
		String lastname = Console.getRequiredString("Enter Lastname:    ");
		String phonenumber = Console.getRequiredString("Enter Phonenumber:    ");
		String email = Console.getRequiredString("Enter Email:    ");
		int isreviewer = Console.getInt("Is Reviewer? :    ");
		int isadmin = Console.getInt("Is Admin? :    ");		
		User p = new User(id, username, password, firstname, lastname, phonenumber, email, isreviewer, isadmin);
		if (userDAO.add(p)) {
			System.out.println("User " + p.getId() + " successfully added");
		}
		else {
			System.out.println("Error adding user");
		}
		
	}

	private static void deleteUser() {
		System.out.println("!!!Delete User!!!");
		int id = Console.getInt("Enter user' ID to delete:    ");
		// get a user for the id
		User p = userDAO.get(id);
		if (p == null) {
			System.out.println("Invalid code");
		} else {
			if (userDAO.delete(p)) {
				System.out.println("Delete success");
			} else {
				System.out.println("Error deleting user.");
			}
		}
	}
}