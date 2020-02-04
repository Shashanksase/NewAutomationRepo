
public class Test {

	String colour;
	String model;
	int wheel = 4;

	public void features() {
		System.out.println("There is " + wheel + " wheeler with " + colour + " colour model " + model);
	}

	public Test() {
	}

	public Test(String colour, String model) {
		this.colour = colour;
		this.model = model;
	}

}
