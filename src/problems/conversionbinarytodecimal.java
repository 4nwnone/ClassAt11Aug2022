package problems;
import java.util.Scanner;
public class conversionbinarytodecimal {
	public static void main(String[] args) {
		int binary,decimal = 0,temp,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number:");
		binary = sc.nextInt();
		temp = binary;
		int pow=1;
		while(temp!=0)
		{
			rem = temp%10;
			decimal += (rem*pow);
			pow*=2;
			temp = temp/10;
		}
		System.out.println(decimal);
	}
}
