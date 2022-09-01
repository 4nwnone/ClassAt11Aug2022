package array;

public class multidimensionalarray {
	public static void main(String[] args) {
		int[][] num= {{1,2,3},{4,5,6},{7,8,9}};
		int[][][] array3d = {{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6},{7,8,9}}};
		int length = num.length;
		int i,j;
		for(i=0;i<length;i++)
		{
			for(j=0;j<length;j++)
			{
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		int len = array3d.length;
		System.out.println(len);
	}
}
