package function;

import java.util.Scanner;

public class addnnaturalnumber {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the range of natrual number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int sum = calculate(n);
		System.out.println("The sum is "+sum);
		
	}
	static int calculate(int n)
	{
		int i;
		int sum=0;
		for(i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
}
