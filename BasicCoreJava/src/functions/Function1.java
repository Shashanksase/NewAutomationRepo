package functions;

public class Function1 {

	public static void main(String[] args) {
		// sum();

		// different way when function in another class
		// Function1.sum();
		int add1 = sum(10, 12);
		int add2 = sum(14, 45);
		int add3 = sum(12, 41);
		System.out.println(add1 + add2 + add3);
		sum();
		String name = sha("shashank", 31);
		System.out.println(name);
		float total = total(45, 65, 99, 67, 75);
		
	}

	
	  public static void sum ()  { int a = 5; int b = 15;
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  System.out.println(a + b);
	  
	  }
	 

	public static int sum(int a, int b) {
		// System.out.println(a + b);
		return a + b;
	}

	public static String sha(String sha) {
		return "your name is " + sha;
	}

	public static String sha(String sha, int age) {
		return "your name is " + sha    +    " and your age is " + age;

	}

	// public static float (m1=58,m2=78,m3=45,m4=66,m5=85)
public static float total (float m1, float m2,float m3,float m4, float m5 )
{
	return m1+m2+m3+m4+m5;	
}
}
