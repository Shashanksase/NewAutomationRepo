package encapsulation;

public class User {

	public static void main(String[] args) {

		
		UserDetail details = new UserDetail();
		details.setAge(-10);
		System.out.println(details.getAge());
	}

}
