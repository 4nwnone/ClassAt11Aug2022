package oop;

public class Mainmethod{
	public static void main(String[] args) {
		ProductDao p = new ProductDao();
		p.connect();
		p.save(new Product());
		p.disconnect();
		CategoryDao c = new CategoryDao();
		c.connect();
		c.save(new Category());
		c.disconnect();
		
	}

}
