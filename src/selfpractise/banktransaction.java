package selfpractise;

import java.util.Scanner;

public class banktransaction {
	public static void main(String[] args) {
		int n=1;
		int balance = 1000;
		Scanner sc = new Scanner(System.in);
		
		while(n!=4)
		{
			System.out.println("Select the following\n1.Deposit\n2.Withdraw\n3.Balance\n4.Exit");
			n = sc.nextInt();
			switch(n)
			{
				case 1:
					balance = deposit(balance);
					break;
				case 2:
					balance = withdraw(balance);
					break;
				case 3:
					displaybalance(balance);
					break;
				case 4:
					System.out.println("System exit");
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
		
	}
	static int deposit(int b)
	{
		System.out.println("Enter the amount");
		int amt = new Scanner(System.in).nextInt();
		System.out.println("Amount deposited.\nYour new balance is "+(amt+b));
		return amt+b;
	}
	static int withdraw(int b)
	{
		System.out.println("Enter the amount");
		int amt = new Scanner(System.in).nextInt();
		if(amt>b)
		{
			System.out.println("Balance is not enough\n");
			return b;
		}
		else
		{
			System.out.println("Amount withdrawn.\nYour new balance is "+(b-amt));
			return b-amt;
		}
		
	}
	static void displaybalance(int b)
	{
		System.out.println("Your balance is "+b+"\n");
	}
}
