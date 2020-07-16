package newproj;

public class InitializationtThroughMethod {
	int rollno;
	String name;

	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}

	void Display() {
		System.out.println(rollno + " " + name);
	}

	static void record (){
		System.out.println("Static method ");
	}
	public static void main(String[] args) {
		
		InitializationtThroughMethod s1= new InitializationtThroughMethod();
		InitializationtThroughMethod s2 = new InitializationtThroughMethod();
		s1.insertRecord(111, "shashank");
		s2.insertRecord(123, "sudhir");
		s1.Display();
		s2.Display();
		s1.rollno=1;
		record();

	}

}
