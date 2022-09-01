package basicloop;
import java.util.Scanner;
public class countnumberofdigit {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int count = 0;
		while(n!=0)
		{
			n /=10;
			count++;
		}
		System.out.println("The number of digits are "+count);
	}
}
