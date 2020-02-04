package functions;

public class NonStaticFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticFunction reff = new NonStaticFunction();

		int sum = reff.sum(25, 10);
		System.out.println(sum);
	}

	public int sum(int a, int b) {
		return a + b;
	}
}