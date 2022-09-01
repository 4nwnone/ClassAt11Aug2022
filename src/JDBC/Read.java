package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Read {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/mydb";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(dbUrl,"root","root");
		String query = "SELECT * FROM product WHERE id = ?";
		PreparedStatement pstm = con.prepareStatement(query);
		System.out.println("Enter the number");
		int id;
		Scanner sc = new Scanner(System.in);
		id = sc.nextInt();
		pstm.setInt(1, id);
		ResultSet rs = pstm.executeQuery();
		Product p = new Product();
		if(rs.next())
		{
			p.id = rs.getInt("id");
			p.name = rs.getString("name");
			p.manufacturer= rs.getString("manufacturer");
			p.description= rs.getString("description");
			p.price = rs.getFloat("price");
			p.isStock = rs.getBoolean("instock");
			
		}
		System.out.println(p);
		pstm.close();
		con.close();
		
	}
}
