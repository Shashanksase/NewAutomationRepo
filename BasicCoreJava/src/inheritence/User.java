package inheritence;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone phone = new Telephone();
		phone.calling();
		//System.out.println("User ");
		
		// u can't access multiple inheritance , it can access only one class
		
		Samartphone sw = new Samartphone();
		sw.calling();
		//sw.
	}

}
