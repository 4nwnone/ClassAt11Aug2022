package basicloop;

public class printfiveloop {
	public static void main(String[] args) {
		int i = 1;
		while(i<6)
		{
			int j = 1;
			while(j<6)
			{
				System.out.print(j+"\t");
				j++;
			}
			System.out.println("");
			i++;
		}
	}
}
