package oop;

import java.util.ArrayList;

public class CategoryDao extends AbstractData<Category> {

	@Override
	public int save(Category t) {
		System.out.println("The Category is saved");
		return 0;
	}

	@Override
	public Category getOne(int id) {
		System.out.println("The product is pen");
		return null;
	}

	@Override
	public ArrayList<Category> getAll() {
		System.out.println("All Category is reterived");
		return null;
	}

	@Override
	public int update(Category t) {
		// TODO Auto-generated method stub
		System.out.println("Category is updated");
		return 0;
	}

	@Override
	public int delete(int id) {
		System.out.println("The Category is deleted");
		return 0;
		
	}
}
