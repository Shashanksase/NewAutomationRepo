package practice;

public class TwoD {
	String ne;
	int i;

	public static void main(String[] args) {
		int a =20;
		TwoD s1 = new TwoD();
		int d = s1.test();
		System.out.println(d);
		int e = s1.division(10, 2);
		System.out.println(e);
	}

	public int test() {

		int a = 10;
		int b = 20;
		int c = a + b;

		return c;
	}

	public int division(int x, int y) {
		int d = x / y;
		return d;

	}

}
