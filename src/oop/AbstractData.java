package oop;

public abstract class AbstractData<T> implements DataAccessObject<T>{
	@Override
	public void connect()
	{
		System.out.println("Connected to the database");
	}
	@Override
	public void disconnect()
	{
		System.out.println("Disconnected form the database");
	}
}
