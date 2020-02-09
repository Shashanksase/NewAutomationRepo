package polymorphism;

public class Edureka {

	public static void main(String[] args) {
		System.out.println("hello1");
		Edureka.main("uyiyiuyi");
	}

	public static void main(String arg1) {
		System.out.println("welcome "  + arg1);
		Edureka.main("welcome", "to edureka");
	}

	public static void main(String arg1, String arg2) {
		System.out.println("hello2");
	}

}
