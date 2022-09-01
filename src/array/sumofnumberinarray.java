package array;
import java.util.Scanner;
public class sumofnumberinarray {
	public static void main(String[] args) {
//		int[] num= {1,2,3,4,5};
//		int length = num.length;
//		int i,sum=0;
//		for(i=0;i<length;i++)
//		{
//			sum+=num[i];
//		}
//		System.out.println("The sum is "+sum);
//		int[] num = new int[10];
		int i, sum=0;
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(i=0;i<n;i++)
		{
			num[i]= sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum+=num[i];
		}
		System.out.println("The sum is "+sum);
	}
}
