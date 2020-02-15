package inheritence;

public class User {

	public static void main(String[] args) {
		Telephone phone = new Telephone();
		phone.calling();
		System.out.println("User ");
		
		// u can't access multiple inheritance , it can access only one class
		
		Samartphone sw = new Samartphone();
		sw.calling();
		sw.internet();
		
		Mobile mb = new Mobile();
		mb.texting();
		
		Samartphone sm = new Samartphone();
		sm.internet();
		sm.calling();
 		
	}

}
