package polymorphism;

public class Test {

	void show(StringBuffer b) {
		System.out.println("First Show ");
		
	}
	
	void show(String a) {
		System.out.println("Second Show ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t = new Test();
t.show(" Shashank");
//System.out.println( t);
	}

}
