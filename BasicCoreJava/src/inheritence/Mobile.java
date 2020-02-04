package inheritence;

public class Mobile extends Telephone {
	
	public void texting() {
		System.out.println("Texting  ");
	}
	
	public void calling() {
		System.out.println("Calling from mobile");
		// override when there is same method in parent class 
		// 
	}

}
