package JDBC;

public class Product {
	public int id;
	public String name;
	public String manufacturer;
	public String description;
	public float price;
	public boolean isStock;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String manufacturer, String description, float price, boolean isStock) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
		this.isStock = isStock;
	}
	

	public Product(String name, String manufacturer, String description, float price, boolean isStock) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
		this.isStock = isStock;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", description="
				+ description + ", price=" + price + ", isStock=" + isStock + "]";
	}
	
	
	
}
