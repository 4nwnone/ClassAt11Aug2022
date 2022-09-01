package j2basic.conditional;

import java.util.Scanner;

public class condtionPractise {
	public static void main(String[] args) {
		System.out.println("Enter your choice");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccino");
		System.out.println("c. Cappuccion");
		System.out.println("d. Cafe latte");
		System.out.println("e. Hot chocolate");
		Scanner sc = new Scanner(System.in);
		char choice = sc.next().charAt(0);
		if(choice == 'a')
		{
			System.out.println("Americano is served");
		}
		else if(choice == 'b')
		{
			System.out.println("Mochaccino is served");
		}
		else if(choice == 'c')
		{
			System.out.println("Cappucciono is served");
		}
		else if(choice == 'd')
		{
			System.out.println("Cafe latte is served");
		}
		else if(choice == 'e')
		{
			System.out.println("Hot chocolate is served");
		}
		else 
		{
			System.out.println("Invalid choice");
		}
	}
}
