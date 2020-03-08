
public class reverseindex {

	public static void main(String[] args) {

		String str = "		Shashank";
		String t = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			t = t + str.charAt(i);
		}
		System.out.println(t);
	}
}