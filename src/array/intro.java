package array;
import java.util.Scanner;
public class intro {
	public static void main(String[] args) {
//		int[] arr1 = {1,2,3,4,5};
//		int arr2[] = {1,2,3,4,5};
//		//starts from index 0
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		System.out.println("Enter the size of data");
		int arr3[]= new int[5];
		System.out.println("Enter the inputs");
		for(int i=0;i<5;i++)
		{
			arr3[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.print(arr3[i]+"\t");
		}
//		int[] marks = new int[10];
//		int i;
//		for(i=0;i<10;i++)
//		{
//			System.out.println("Enter the marks obtained of roll no. "+" "+(i+1));
//			marks[i]=sc.nextInt();
//		}
//		System.out.println("The marks obtained are: ");
//		for(i=0;i<10;i++) {
//			System.out.println("Roll no "+" "+(i+1)+" = "+marks[i]);
//		}
	}
}
