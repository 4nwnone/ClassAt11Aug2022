package oop;

import java.util.ArrayList;

public class ProductDao extends AbstractData<Product>{

	@Override
	public int save(Product t) {
		System.out.println("The product is saved");
		return 0;
	}

	@Override
	public Product getOne(int id) {
		System.out.println("The prodict id pen");
		return null;
	}

	@Override
	public ArrayList<Product> getAll() {
		System.out.println("All product is reterived");
		return null;
	}

	@Override
	public int update(Product t) {
		// TODO Auto-generated method stub
		System.out.println("Product is updated");
		return 0;
	}

	@Override
	public int delete(int id) {
		System.out.println("The product is deleted");
		return 0;
		
	}



}
