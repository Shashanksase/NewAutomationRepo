package exception;

import constructor.Car;

public class ExceptionHandling3 {

	public static Car car;

	public static void main(String[] args) {

		try {
			System.out.println(10 / 2);
			
			String str = "name";
			System.out.println(str.charAt(2));
		//	car.features();
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Exceuting Finally Block");// It's done with try and catch at the end of catch to run both try and catch.
		}

	}
}
