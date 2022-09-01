package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/mydb";
		Product p = new Product("Mobile","China","This is mobile from china",255.55f,true);
		Class.forName(driver);
		Connection con = DriverManager.getConnection(dbUrl,"root","root");
		String query = "Insert into product(name,manufacturer,description,price,inStock)"+
				"values(?,?,?,?,?)";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, p.name);
		pstm.setString(2, p.manufacturer);
		pstm.setString(3, p.description);
		pstm.setFloat(4, p.price);
		pstm.setBoolean(5, p.isStock);
		int result = pstm.executeUpdate();
		System.out.println(result);
		con.close();
		if(result == 1)
			System.out.println("Inserted successfully");
		else
			System.out.println("Insert failed");
	}
}
