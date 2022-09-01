package basicloop;

public class shapes {
	public static void main(String[] args) {
		int i,j;
		System.out.println("Rectangel");
		for(i=1;i<6;i++)
		{
			for(j=1;j<6;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Triangle 1");
		for(i=1;i<6;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Triangle 2");
		for(i=1;i<6;i++)
		{
			for(j=1;j<=6-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Triangle 3");
		for(i=1;i<6;i++)
		{
			for(j=1;j<=5-i;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Triangle 4");
		for(i=1;i<6;i++)
		{
			
			for(j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=6-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Diamond");
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5-i;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1;i<5;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<6-i;j++)
			{
				System.out.print("* ");
			}
			for(j=1;j<=4-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Flag");
		
	}
}
