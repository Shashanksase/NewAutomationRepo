package collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
// when we want to store in key and value.
	public static void main(String[] args) {
		Map<Integer, String> ms = new HashMap<>();
		ms.put(1, "Shashank");
		ms.put(4, "Sudhir");
		System.out.println(ms.get(4));
	}

}
