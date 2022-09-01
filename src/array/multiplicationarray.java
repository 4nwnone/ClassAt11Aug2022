package array;

public class multiplicationarray {
	public static void main(String[] args) {
		int[][]num1 = {{1,2,3},{1,2,3},{1,2,3}};
		int[][]num2 = {{4,5,6},{4,5,6},{4,5,6}};
		int[][]mul  = new int[3][3];
		int i,j,k;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mul[i][j]=0;
				for(k=0;k<3;k++)
				{
					mul[i][j]+=num1[i][k]*num2[k][j];
				}
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mul[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

