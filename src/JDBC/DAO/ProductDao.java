package JDBC.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDao extends AbstractDao<Product> {
	
	PreparedStatement pstm;
	String query;
	ResultSet rs;

	@Override
	public int save(Product t) throws ClassNotFoundException, SQLException {
		query = "Insert into product(name,manufacturer,description,price,inStock)"+
				"values(?,?,?,?,?)";
		connect();
		pstm = con.prepareStatement(query);
		pstm.setString(1, t.getName());
		pstm.setString(2, t.getManufacturer());
		pstm.setString(3, t.getDescription());
		pstm.setFloat(4, t.getPrice());
		pstm.setBoolean(5, t.isInStock());
		int i = pstm.executeUpdate();
		disconnect();
		return i;	
	}

	@Override
	public Product getOne(long id) throws ClassNotFoundException, SQLException {
		query = "SELECT * FROM product WHERE id = ?";
		connect();
		pstm = con.prepareStatement(query);
		pstm.setLong(1, id);
		rs = pstm.executeQuery();
		Product p = new Product();
		if(rs.next())
		{
			p.setId(rs.getLong("id"));
			p.setName(rs.getString("name"));
			p.setManufacturer(rs.getString("manufacturer"));
			p.setDescription(rs.getString("description"));
			p.setPrice(rs.getFloat("price"));
			p.setInStock(rs.getBoolean("inStock"));
		}
		disconnect();
		return p;
	}

	@Override
	public ArrayList<Product> getAll() throws ClassNotFoundException, SQLException {
		query = "SELECT * FROM product";
		connect();
		pstm = con.prepareStatement(query);
		rs = pstm.executeQuery();
		ArrayList<Product> ap = new ArrayList<>();
		while(rs.next())
		{
			Product p = new Product();
			p.setId(rs.getLong("id"));
			p.setName(rs.getString("name"));
			p.setManufacturer(rs.getString("manufacturer"));
			p.setDescription(rs.getString("description"));
			p.setPrice(rs.getFloat("price"));
			p.setInStock(rs.getBoolean("inStock"));
			ap.add(p);
		}
		disconnect();
		return ap;
	}

	@Override
	public int update(Product t) throws ClassNotFoundException, SQLException {
		query = "update product set name=?, manufacturer=?, description =?, price =?, inStock =? where id=?";
		connect();
		pstm = con.prepareStatement(query);
		pstm.setString(1, t.getName());
		pstm.setString(2, t.getManufacturer());
		pstm.setString(3, t.getDescription());
		pstm.setFloat(4, t.getPrice());
		pstm.setBoolean(5, t.isInStock());
		pstm.setLong(6, t.getId());
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public int delete(long id) throws ClassNotFoundException, SQLException {
		query = "DELETE FROM product where id = ?";
		connect();
		pstm = con.prepareStatement(query);
		pstm.setLong(1, id);
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}

}
