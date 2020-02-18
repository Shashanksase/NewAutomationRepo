package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		/*
		 * Object[] arr = new Object[3]; arr[0] = "Shashank"; arr[1] = true; arr[0] =
		 * 31;
		 */
		List<String> list = new ArrayList<>();
		list.add("Shashank");
		list.add("Shasha");
		list.add("Shas");
		for (String s : list) {
			System.out.println(s);

		}
		list = new LinkedList<>();
		list.add("Shashank");
		list.add("Shasha");
		list.add("Shas");
		for (String s : list) {
			System.out.println(s);

		}

		list = new Vector<>();
		list.add("Shashank");
		list.add("Shasha");
		list.add("Shas");
		for (String s : list) {
			System.out.println(s);

		}

	}

}
