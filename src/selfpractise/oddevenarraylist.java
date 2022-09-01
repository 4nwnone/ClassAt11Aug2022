package selfpractise;

import java.util.ArrayList;
import java.util.Scanner;

public class oddevenarraylist {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> oddnum = new ArrayList<Integer>();
		ArrayList<Integer> evennum = new ArrayList<Integer>();
		int i,takenum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(i=0;i<10;i++)
		{
			takenum = sc.nextInt();
			num.add(takenum);
		}
		for(i=0;i<10;i++)
		{
			if(num.get(i)%2==0)
			{
				evennum.add(num.get(i));
			}
			else
			{
				oddnum.add(num.get(i));
			}
		}
		int oddsize = oddnum.size();
		for(i=0;i<oddsize;i++)
		{
			System.out.println(oddnum.get(i));
		}
		for(Integer k: evennum)
		{
			System.out.println(k);
		}
	}
}
