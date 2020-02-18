package collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
// when we want to store in key and value.
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Shashank");
		map.put(2, "Sudhir");
		System.out.println(map.get(2));
	}

}
