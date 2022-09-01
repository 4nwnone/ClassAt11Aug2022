package classandpackage;

public class Account {
	int acNumber;
	String holderName;
	float balance;
	
	//default constructor is hidden
	public Account()
	{
		
	}
	public Account(int acNumber, String holderName, float balance) {
		super();
		this.acNumber = acNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public void display()
	{
		System.out.println(acNumber+"\t"+holderName+"\t\t"+balance);
	}
}
