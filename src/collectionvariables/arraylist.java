package collectionvariables;
import java.util.ArrayList;
public class arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		//to add the value
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		//to remove the value
		num.remove(0);
		
		//to edit the value of the arraylist
		//num.set(index, element)
		num.set(1,9);
		
		int asize = num.size();
//		for(int i=0;i<asize;i++)
//		{
//			System.out.println(num.get(i));
//		}
		for(int j: num)
		{
			System.out.println(j);
		}
		
	}

}
