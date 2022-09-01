package array;

public class bubblesort {
	public static void main(String[] args) {
		int num[]= {9,8,7,6,5};
		int length = num.length;
		int i,j,k,temp;
		for(i=0;i<length-1;i++)
		{
			for(j=0;j<length-1-i;j++)
			{
//				for(k=0;k<length;k++)
//				{
//					System.out.print(num[k]+"\t");
//				}
//				System.out.println();
				if(num[j]>num[j+1])
				{
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		for(k=0;k<length;k++)
		{
			System.out.print(num[k]+"\t");
		}
	}
}
