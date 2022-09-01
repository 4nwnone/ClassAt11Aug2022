package problems;
import java.util.Scanner;
public class conversiondecimaltobinary {
	public static void main(String[] args) {
		int decimal, binary=0, temp, revbinary=1, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number");
		decimal = sc.nextInt();
		while(decimal!=0)
		{
			rem = decimal%2;
			revbinary = (revbinary*10)+rem;
			decimal /=2;
		}
		while(revbinary>1) {//revbinary!=0
			rem = revbinary%10;
			binary = (binary*10)+rem;
			revbinary /=10;
		}
		System.out.println(binary);
	}
}
