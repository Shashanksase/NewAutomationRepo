package array;

import java.util.ArrayList;

public class ArrayListConcept {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		ArrayList ar = new ArrayList(5);
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add("ksosi");
		ar.add("ks");
		ar.remove("ksosi");

		System.out.println(ar);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println(ar.size());
		// System.out.println(ar.get(5));

		ArrayList<Integer> q = new ArrayList<Integer>();
		q.add(1000);
		q.add(41);
		// q.add("sdasd");
		q.add(null);
		// q.clone();
		System.out.println(q.size());
		for (int i = 0; i < q.size(); i++) {
			System.out.println(q.get(i));
		}
		System.out.println(q);

		ArrayList<String> qa = new ArrayList<String>();
		qa.add("hp");
		qa.add("Lenevo");
		qa.add("Dell");
		System.out.println(qa);
		for (int i = 0; i < qa.size(); i++) {
			System.out.println(qa.get(i));
		}
		System.out.println("**********");
		for (String s : qa) {
			System.out.println(s);
		}

	}
}
