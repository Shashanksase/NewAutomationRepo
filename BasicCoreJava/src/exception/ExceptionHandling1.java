package exception;

public class ExceptionHandling1 {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		try {
			String str = "name";
			System.out.println(str.charAt(5));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
