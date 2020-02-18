package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Shasnank");
		set.add("Sudhir");
		set.add("Shasnank");
		set.add("Suddha");
		for (String s : set) {
			System.out.println(s);

		}
		System.out.println("********8");

		set = new LinkedHashSet<>();
		set.add("Shasnank");
		set.add("Sudhir");
		set.add("Shasnank");
		set.add("Suddha");
		for (String s : set) {
			System.out.println(s);

		}
		System.out.println("#############");
		set = new TreeSet<>();
		set.add("Shasnank");
		set.add("Sudhir");
		set.add("Shasnank");
		set.add("Suddha");
		for (String s : set) {
			System.out.println(s);

		}
	}
}
