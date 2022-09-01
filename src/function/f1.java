package function;

public class f1 {
	public static void main(String[] args) {
		int a = 1, b=2;
		int sum;
		sum = add(a,b);
		System.out.println(sum);
		difference(a,b);
		float pi = pi();
		System.out.println(pi);
		greetings();
	}
	//function with argument and return type
	static int add(int a, int b)
	{
		return a+b;
	}
	//function with argument but no return type
	static void difference(int a, int b)
	{
		int d;
		if(a>b)
		{
			d = a-b;
		}
		else
		{
			d = b-a;
		}
		System.out.println(d);
	}
	//fuction with no argument but return type
	static float pi()
	{
		return 3.1415f;
	}
	//function with no argument and return type
	static void greetings()
	{
		System.out.println("Hello there");
	}
}
