package array;

public class minmax {
	public static void main(String[] args) {
		int num[] = {8,9,4,5};
		
		int max = num[0];
		int min = num[0];
		int i;
		int length = num.length;
		for(i=0;i<length;i++)
		{
			if(num[i]<min)
			{
				min = num[i];
			}
			if(num[i]>max)
			{
				max = num[i];
			}
		}
		System.out.println("max = "+max+" min = "+ min);
		
	}
}
