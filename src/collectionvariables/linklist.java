package collectionvariables;

import java.util.LinkedList;

public class linklist {
	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		for(int i=0; i<5;i++)
		{
			System.out.println(num.get(i));
		}
	}

}
