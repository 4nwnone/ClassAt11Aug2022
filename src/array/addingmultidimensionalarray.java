package array;

public class addingmultidimensionalarray {
	public static void main(String[] args) {
		int[][]num1 = {{1,2,3},{1,2,3},{1,2,3}};
		int[][]num2 = {{4,5,6},{4,5,6},{4,5,6}};
		int[][]sum = new int[3][3];
		int i,j,k;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				sum[i][j]=num1[i][j]+num2[i][j];
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
