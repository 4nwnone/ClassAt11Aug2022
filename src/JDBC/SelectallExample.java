package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class SelectallExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/mydb";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(dbUrl,"root","root");
		String query = "SELECT * FROM product";
		PreparedStatement pstm = con.prepareStatement(query);
		System.out.println("Enter the number");
		ResultSet rs = pstm.executeQuery();
		ArrayList<Product> products = new ArrayList<>();
		
		while(rs.next())
		{
			Product p = new Product();
			p.id = rs.getInt("id");
			p.name = rs.getString("name");
			p.manufacturer= rs.getString("manufacturer");
			p.description= rs.getString("description");
			p.price = rs.getFloat("price");
			p.isStock = rs.getBoolean("instock");
			products.add(p);
			
		}
		for(Product pr: products)
		{
			System.out.println(pr);
		}
		pstm.close();
		con.close();
		
	}
}
