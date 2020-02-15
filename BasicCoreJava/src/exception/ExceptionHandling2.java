package exception;

import constructor.Car;

public class ExceptionHandling2 {

	public  static Car car;
	public static void main(String[] args) {

		try {
			System.out.println(10 / 2);
			String str = "name";
			System.out.println(str.charAt(5));
			car.features();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
