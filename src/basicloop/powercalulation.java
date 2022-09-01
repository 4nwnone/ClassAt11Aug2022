package basicloop;
import java.util.Scanner;
public class powercalulation {
	public static void main(String[] args) {
		int n;
		int pow;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = sc.nextInt();
		System.out.println("Enter the power:");
		pow = sc.nextInt();
		int i = 1;
		int result = 1;
		while(i<=pow)
		{
			result *= n;
			i++;
		}

//		while(pow!=0)
//		{
//			result *=n;
//			pow--;
//		}
		System.out.println("The result is "+result);
		
	}
}
