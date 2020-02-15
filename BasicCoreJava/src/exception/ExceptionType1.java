package exception;

import constructor.Car;

public class ExceptionType1 {

	
	
	public static Car car =new Car(); 
	//public static Car car ;  //we created reference created 
	
	public static void main(String[] args) {
		System.out.println(10 / 2);
		// Exception 1 :ArithmeticException
		// System.out.println(10 / 0);

		// Exception 2: StringIndexOutOfBoundsException as index is not present.

		String name = "shash";
		// System.out.println(name.charAt(5));

      //Exception 3 : NullPointerException
		
		car.features();// When we don't object and create reference
		// Checked exception and Non checked  exception

	}

}
