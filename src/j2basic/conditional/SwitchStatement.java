package j2basic.conditional;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		System.out.println("What is your favourite sports?");
		System.out.println("a. Football");
		System.out.println("b. Basketball");
		System.out.println("c. Circket");
		System.out.println("d. Chess\n");
		Scanner input = new Scanner(System.in);
		char choice = input.next().charAt(0);
		switch(choice)
		{
		case 'a':
			System.out.println("Football nice");
			break;
		case 'b':
			System.out.println("Basketball nice");
			break;
		case 'c':
			System.out.println("Circket nice");
			break;
		case 'd':
			System.out.println("Chess nice");
			break;
		default:
			System.out.println("Invalid choice");
		}
		
	}
}
