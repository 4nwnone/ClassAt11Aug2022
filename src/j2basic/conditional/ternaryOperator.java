package j2basic.conditional;

import java.util.Scanner;

public class ternaryOperator {
	public static void main(String[] args) {
		System.out.println("Enter password");
		Scanner sc = new Scanner(System.in);
		String pass = sc.next();
		String access = pass.equalsIgnoreCase("apple")?"allowed":"not allowed";
		boolean x = access=="allowed"?true:false;
		if(x)
		{
			System.out.println(x);
		}
		else
		{
			System.out.println(x);
		}
		System.out.println("access = "+access);
	}
}
