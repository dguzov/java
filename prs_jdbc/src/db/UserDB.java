package db;

import java.sql.*;
import java.util.*;

import business.User;

public class UserDB implements DAO<User> {
	
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/prs";
		String username = "prs_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
				return conn;
		
	}
	
	@Override
	public User get(int id) {
		String sql = "SELECT * FROM user "+ 
				" where id = ?";
		try (Connection conn = getConnection(); 
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1,  id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String username = rs.getString("UserName");
				String password = rs.getString("Password");
				String firstname = rs.getString("FirstName");
				String lastname = rs.getString("LastName");
				String phonenumber = rs.getString("PhoneNumber");
				String email = rs.getString("Email");
				int isreviewer = rs.getInt("IsReviewer");
				int isadmin = rs.getInt("IsAdmin");
	
				User p = new User(id, username, password, firstname, lastname, phonenumber, email, isreviewer, isadmin);
				return p;
			}
			else {
				rs.close();
			return null;
		}
		} catch (SQLException e) {
			System.err.println(e);
			return null;
		}
	}
	@Override
	public List<User> getAll() {
		String sql = "SELECT ID, UserName, Password, FirstName, LastName, PhoneNumber, Email, IsReviewer, IsAdmin "+
	"FROM User";
		List<User>users = new ArrayList<>();
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)){
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("ID");
				String username = rs.getString("UserName");
				String password = rs.getString("Password");
				String firstname = rs.getString("FirstName");
				String lastname = rs.getString("LastName");
				String phonenumber = rs.getString("PhoneNumber");
				String email = rs.getString("Email");
				int isreviewer = rs.getInt("IsReviewer");
				int isadmin = rs.getInt("IsAdmin");
			User p = new User(id, username, password, firstname, lastname, phonenumber, email, isreviewer, isadmin);
			users.add(p);
			}
		}
		catch (SQLException e) {
			System.err.println(e);
			users = null;
		}
				
		return users;
	}
	@Override
	public boolean add(User t) {
	String sql = "INSERT INTO User (ID, UserName, Password, FirstName, LastName, PhoneNumber, Email, IsReviewer, IsAdmin)"
			+"VALUES (?,?,?,?,?,?,?,?,?)";
	try (Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)){
		ps.setInt(1, t.getId());
		ps. setString (2, t.getUsername());
		ps. setString (3, t.getPassword());
		ps. setString (4, t.getFirstname());
		ps. setString (5, t.getLastname());
		ps. setString (6, t.getPhonenumber());
		ps. setString (7, t.getEmail());
		ps. setInt (8, t.getIsreviewer());
		ps. setInt (9, t.getIsadmin());
		ps.executeUpdate();
		return true;
		
	} 
	catch (SQLException e) {
	System.err.println(e);
		return false;
	}
	
	}

	@Override
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User t) {
String sql = "delete from user where id = ?";
try (Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement(sql)){
	ps.setInt(1, t.getId());
	ps. executeUpdate();
	return true;
} catch (SQLException e) {
	System.err.println(e);
	return false;
}
	}

}
