package selfpractise;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		int sum=0,rem;
		System.out.println("Enter the number");
		int num = new Scanner(System.in).nextInt();
		int n = num;
		while(num!=0)
		{
			rem = num%10;
			sum += (Math.pow(rem, 3));
			num /=10;
		}
		if(sum==n)
		{
			System.out.println(n+" is armstrong");
		}
		else
		{
			System.out.println(n+" is not armstrong");
		}
		
	}
}
