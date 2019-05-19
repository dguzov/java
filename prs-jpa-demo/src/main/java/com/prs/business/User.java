package com.prs.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String phonenumber;
	private String email;
	private boolean isreviewer;
	private boolean isadmin;

	public User() {
		super();
	}

	public User(int id, String username, String password, String firstname, String lastname, String phonenumber,
			String email, boolean isreviewer, boolean isadmin) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.email = email;
		this.isreviewer = isreviewer;
		this.isadmin = isadmin;
	}

	public User(String username, String password, String firstname, String lastname, String phonenumber, String email,
			boolean isreviewer, boolean isadmin) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.email = email;
		this.isreviewer = isreviewer;
		this.isadmin = isadmin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getIsreviewer() {
		return isreviewer;
	}

	public void setIsreviewer(boolean reviewer) {
		this.isreviewer = reviewer;
	}

	public boolean getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(boolean admin) {
		this.isadmin = admin;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", phonenumber=" + phonenumber + ", email=" + email + ", reviewer="
				+ isreviewer + ", admin=" + isadmin + "]";
	}

}
