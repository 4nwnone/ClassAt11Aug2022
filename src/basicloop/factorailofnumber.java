package basicloop;
import java.util.Scanner;
public class factorailofnumber {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int i = 1;
		int fact = 1;
		while(i<=n)
		{
			fact = fact*i;
			i++;
		}

		System.out.println("The factorial is "+fact);
		System.out.println(i);
		
	}
}
