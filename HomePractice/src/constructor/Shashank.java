package constructor;

public class Shashank {

	/*
	 * Shashank()//Non- Parameterized Constructor
	 * 
	 * { System.out.println("NOn PARAMETRIZED CONSTRUCTOR"); }
	 */

	String name, course, technology;

	Shashank(String s, String n)// Parameterized constructor
	{

		name = s;
		course = n;

	}

	Shashank(String s, String n, String t)// Constructor overloading
	{

		name = s;
		course = n;
		technology = t;

	}

	void show() {

		System.out.println(name+ " " +course + " " +technology);

	}

	public static void main(String[] args) {
		Shashank ob1 = new Shashank("Java", "J2ee");
		Shashank ob2 = new Shashank("JAVA", "ADV.JAVA","Shashank");
		//Shashank ob3 = new Shashank();
		//System.out.println(ob3);
		ob1.show();
		ob2.show();
	}

}
