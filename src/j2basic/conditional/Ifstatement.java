package j2basic.conditional;

import java.util.Scanner;
public class Ifstatement {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age to check if u eligble for voting?");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("Yor can vote");
		}
		else if(age==69)
		{
			System.out.println("Nice");
		}
		else
		{
			System.out.println("You cannot vote");
		}
		//there is no actual else if, but since there is only one block of code after else of if we remove {} it becomes else if
		
	}

}
