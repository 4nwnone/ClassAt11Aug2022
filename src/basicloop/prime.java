package basicloop;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = new Scanner(System.in).nextInt();
		int i;
		for(i=2;i<num/2;i++) {
			if(num%i==0)
			{
				break;
			}
		}
		if(i == (num/2)+1)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is composite");
		}
		int flag = 0;
		for(i=2;i<num ;i++)
		{
			if(num%i==0)
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is composite");
		}
			
			
	}
}
