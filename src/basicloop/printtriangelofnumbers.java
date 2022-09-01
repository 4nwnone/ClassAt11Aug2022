package basicloop;

public class printtriangelofnumbers {
	public static void main(String[] args) {
		int i;
		int j,k;
		for(i=1;i<6;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"\t");
			}
			System.out.println("");
		}
		
		System.out.println();
		for(i=5;i>0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"\t");
			}
			System.out.println("");
		}
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				System.out.print(i+""+j+"\t");
			}
			System.out.println("");
		}
		
		//for chess board
		for(i=1;i<=8;i++)
		{		
			if(i%2!=0)
			{
				for(j=1;j<=8;j++)
				{
					if(i%2!=0&&j%2!=0) {System.out.println(0);}
					else if(i%2==0&&j%2==0){System.out.println(0);}
					else
						System.out.println(1);
					if(j%2!=0)
					{
						System.out.print(" 0 ");
					}
					else
					{
						System.out.print(" 1 ");
					}
					
				}
			}
			else
			{
				for(j=1;j<=8;j++)
				{
					if(j%2!=0)
					{
						System.out.print(" 1 ");
					}
					else
					{
						System.out.print(" 0 ");
					}
					
				}
			}
			System.out.println("");
		}
		
	//rightside triangle
	for(i=1;i<=5;i++)
	{
		for(j=5;j>=1;j--)
		{
			if(j<=i)
			{
				System.out.print("**");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
//	System.out.println("gap");
//	for(i=1;i<=5;i++)
//	{
//		for(j=1;j<=i;j++)
//		{
//			System.out.print("*");
//		}
//		System.out.println("");
//	}
//	System.out.println("gap");
	//leftside inverted triangle
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=5;j++)
		{
			if(j<=i)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("**");
			}
		}
		System.out.println("");
	}
	for(i=1;i<=8;i++)
	{	
		for(j=1;j<=8;j++)
		{
			if(i%2!=0&&j%2!=0) {System.out.print(0);}
			else if(i%2==0&&j%2==0){System.out.print(0);}
			else
			System.out.print(1);
		}
		System.out.println();
	}
		
	}
}
