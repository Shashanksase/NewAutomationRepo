package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorInterface {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Shasnank");
		set.add("Sudhir");
		set.add("Shasnank");
		set.add("Suddha");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
