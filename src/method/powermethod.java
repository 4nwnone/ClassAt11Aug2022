package method;

import java.util.Scanner;

public class powermethod {
	public static void main(String[] args) {
		int base, power;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		base = sc.nextInt();
		System.out.println("Enter the power");
		power = sc.nextInt();
		int result = power(base,power);
		System.out.println("The result is "+result);
	}
	static int power(int b, int p)
	{
		int res=1;
		while(p!=0)
		{
			res*=b;
			p--;
		}
		return res;
	}
	
}

