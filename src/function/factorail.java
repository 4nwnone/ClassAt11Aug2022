package function;

import java.util.Scanner;

public class factorail {
	public static void main(String[] args) {
		int fact = calculate();
		System.out.println("The factorial is "+ fact);
	}
	static int calculate()
	{
		int a,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		a = sc.nextInt();
		int b = a;
		while(a!=0)
		{
			fact*=a;
			a--;
		}
		
		int f=1;
		
		for(int i=b; i>0; i--)
		{
			f = f*i;
		}
		System.out.println(f);
		
		return fact;
	}
}
