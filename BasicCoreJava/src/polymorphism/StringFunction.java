package polymorphism;

public class StringFunction {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String name = "Shashank";

		// Function1
		System.out.println(name.length());

		// Function2
		System.out.println(name.charAt(7));// Returns the char value at the specified index
		//

		System.out.println("index ");
		System.out.println(name.indexOf("s"));
		System.out.println(name.indexOf('s'));

		// function 3
		String name2 = "ShasHank";
		System.out.println(name.equals(name2));

		// Function4
		System.out.println(name.equalsIgnoreCase(name2));

		// Function 5
		String temp = "Shashank sase";
		String[] arr = temp.split(" ");// When can use by split , can use anything ex dot,number etc
		for (String s : arr) {

			System.out.println("Function 5");
			System.out.println(s);
		}

		//// function 6
		System.out.println(temp.substring(4));
		System.out.println(temp.substring(4, 10));// sub string

		// function 7
		System.out.println(temp.replace(" ", ""));

		// function 8
		String temp2 = " Shashank ";
		System.out.println(temp2);
		System.out.println(temp2.trim());

		// Function 9
		String temp3 = "ShaSHANK";
		System.out.println(temp3.toLowerCase());
		System.out.println(temp3.toUpperCase());
		System.out.println("SPLIT+_________-----------------------");
		String test = "Hello_World_how_are_You";
		String testval[] = test.split("_");
		for (int i = 0; i < testval.length; i++) {
			System.out.print(testval[i]);
		}

//Shashank count "s" from the name.
		String temp4 = "SHASHANKqw";
		for (int temp41 = 0; temp41 < arr.length; temp41++) {
			String string1 = arr[temp41];
			System.out.println(string1);
		}

	}

}
