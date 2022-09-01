package array;

public class selectionsort {
	public static void main(String[] args) {
		int num[]= {4,3,2,1};
		int i,j,k;
		int length = num.length;
		for(i=0;i<length-1;i++)
		{
			
			for(j=i+1;j<length;j++)
			{
				for(k=0;k<length;k++)
				{
					System.out.print(num[k]);
				}
				System.out.println();
				if(num[i]>num[j])
				{
					num[i]+=num[j];
					num[j]=num[i]-num[j];
					num[i]-=num[j];
				}
			}
		}
		for(i=0;i<length;i++)
		{
			System.out.print(num[i]);
		}
	}
}
