package JDBC.Statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

import JDBC.Product;

public class StatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "root";
		Product p = new Product("Apple","Nepal","This is apple",122.2f, true);
		Class.forName(driver); 
		//this is optional for newer version, but for older needed
		
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		System.out.println("Connected to the database...");
		
		String query = "Insert into product(name,manufacturer,description,price,inStock)"+
		"values('"+p.name+"','"+p.manufacturer+"','"+p.description+"',"+p.price+","+p.isStock+")";
		Statement stm = con.createStatement();
		stm.executeUpdate(query);
		con.close();
	}
}
