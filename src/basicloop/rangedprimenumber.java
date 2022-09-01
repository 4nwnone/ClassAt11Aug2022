package basicloop;
import java.util.Scanner;
public class rangedprimenumber {
	public static void main(String[] args) {
		System.out.println("Enter the range:");
		int range = new Scanner(System.in).nextInt();
		int j;
		int flag = 0;
//		for(int i = 2; i<=range; i++)
//		{
//			for(j=2;j<=(i/2);j++)
//			{
//				if(i%j==0) {
//					break;
//				}
//			}
//			if(j==(i/2)+1)
//			{
//				System.out.println(i);
//			}
//		}
		//using flag
		
		for(int i =2; i<range; i++)
		{
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0) {
					flag = 1;
				}
			}
			if(flag ==1)
			{
				System.out.println(i);
			}
		}
	}
}
