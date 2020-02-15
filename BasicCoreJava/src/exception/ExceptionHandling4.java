package exception;

import constructor.Car;

public class ExceptionHandling4 {

	public static Car car;

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
			
			Thread.sleep(5000);
			String str = "name";
			System.out.println(str.charAt(8));
			car.features();
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
