package projecteuler;

public class PrimeFactor {

	public static void main(String[] args) {
		long number = 600851475143L;
		for (long i = 2; i < number / i; i++) {
			while (number % i == 0) {
				System.out.println(i + " ");
				number = number / i;
			}
		}
		if (number > 2) {

		}
		System.out.println(number);
	}

}
