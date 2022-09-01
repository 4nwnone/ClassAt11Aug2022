package method;

import java.util.Scanner;

public class primeorcomposite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n;
		n= sc.nextInt();
		if(isPrime(n))
		{
			System.out.println("Prime");
		}
		else
			System.out.println("Composite");
	}
	static boolean isPrime(int n)
	{
		int i;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
