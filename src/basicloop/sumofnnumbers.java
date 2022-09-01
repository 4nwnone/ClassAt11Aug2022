package basicloop;
import java.util.Scanner;
public class sumofnnumbers {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println("The sum of "+n+" natural number is "+sum);
	}
}
