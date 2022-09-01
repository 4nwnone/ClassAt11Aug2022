package j2basic.conditional;

public class swappingwithoutusingtemp {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println("Before swapping:\na = "+a+" b = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping:\na = "+a+" b = "+b);
	}
}
