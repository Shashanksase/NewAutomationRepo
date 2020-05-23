import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Mainmethodoverloading {

	public static void main(String[] args) {
		System.out.println(" Main method --1 ");
		main("testing");
		main(1);
		main(2,3);
	}

	public static void main(String args) {
		System.out.println(" only String in main method ");
	}

	public static void main(int a) {
		System.out.println("Only one integer in main method");
	}

	public static void main(int a, int b) {
		System.out.println("Two integer in main method");
	}

}