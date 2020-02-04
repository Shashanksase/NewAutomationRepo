
public class User {

	public static void main(String[] args) {

		Test ford = new Test();
		ford.colour = "green";
		ford.model = "eco";
		// Test.wheel = 4;
		ford.features();

		Test ford1 = new Test();
		ford1.colour = "blue";
		ford1.model = "no";
		// Test.wheel = 5;
		ford1.features();

		Test bmw = new Test("orange", "yes.");
		bmw.features();
		// bmw.colour();
	}

}
