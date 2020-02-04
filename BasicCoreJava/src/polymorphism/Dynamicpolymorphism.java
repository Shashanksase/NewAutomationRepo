package polymorphism;

import inheritence.Mobile;
import inheritence.Samartphone;
import inheritence.Telephone;

public class Dynamicpolymorphism {

	public static void main(String[] args) {

		Telephone phone = new Mobile();
		phone.calling();
		phone = new Telephone();
		phone.calling();
		phone = new Samartphone();
		phone.calling();
		// Function which are present in parent , class object of child class.
		// the calling of overridden fun is resolve it runtime rather then compile time
	}

}
