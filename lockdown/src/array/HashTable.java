package array;

import java.util.Hashtable;

public class HashTable {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		h.put("A", "Test");
		h.put("C", 13);
		h.put(1, 1312);
		System.out.println(h.size());
		System.out.println(h.get(1));
		System.out.println(h.get("C"));
		h.remove(1);
		System.out.println(h.size());
	}

}
