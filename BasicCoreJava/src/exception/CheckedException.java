package exception;

import functions.Function1;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
   // All function are static from Class Function1

		// Static function are call through class name
		// non static function through creating object
		Function1.sum();
		
		Thread.sleep(5000);   //Unhandled exception type InterruptedException// Complier will tell us this kind of error.
		// We throws to pass the information of checked exception to the next user.
		Function1.sum();

	}

}
