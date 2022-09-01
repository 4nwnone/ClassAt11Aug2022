package basicloop;
import java.util.Scanner;
public class askusermultiplicationtable {
	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		int num = new Scanner(System.in).nextInt();
		int i;
		for(i=1;i<11;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i)+"\n");
		}
	}
}
