package oop;

import java.util.ArrayList;

public interface DataAccessObject<T> {//T is generalized type
	public void connect();
	public void disconnect();
	public int save(T t);
	public T getOne(int id);
	public ArrayList<T> getAll();
	public int update(T t);
	public int delete(int id);
}
