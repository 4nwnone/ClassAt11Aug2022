package basicloop;

import java.util.Scanner;

public class fibonnaci {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 =1;	
		int n3;
		int num;
		System.out.println("Enter the range:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while(n1<=num) {
			System.out.println(n1);
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
		}
		n1 = 0;
		n2 = 1;
		System.out.println("Enter the iterations");
		int n = sc.nextInt();
		int count = 0;
		while(count<=n)
		{
			System.out.println(n1);
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			count++;

		}
		
		
	}
}
