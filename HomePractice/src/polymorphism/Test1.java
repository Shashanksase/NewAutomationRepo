package polymorphism;

public class Test1 {

	public static int func(int a) {
		return a;
	}

	public static int func(int a, int b) {
		return a + b;

	}
	
	public static double func(double a) {
		return a;
		
	}
class Child extends Edureka{}
	
	public static void main(String[] args) {

		System.out.println(func(1));
		System.out.println(func(45, 78));
		System.out.println(func(78));
	}

}



