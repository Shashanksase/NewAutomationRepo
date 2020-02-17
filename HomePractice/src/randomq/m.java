package randomq;

import java.util.ArrayList;
import java.util.Iterator;

public class m {

	public static void main(String[] args)

	{

		ArrayList<Integer> a = new ArrayList<Integer>();

		a.add(23);

		a.add(45);

		a.add(56);

		a.add(67);

		a.add(89);
		

		Iterator<Integer> i = a.iterator();

	
		while (i.hasNext())

		{

			Object element = i.next();

			System.out.println(element);

		}	

	}
}
