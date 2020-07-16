package method;

public class Method {

	public static void main(String[] args) {
		Method obj = new Method();
		System.out.println(obj.asd(12, 78));
		long c = obj.asd(12, 78);
		obj.asd(1, 2);
		//System.out.println(qw);
		System.out.println(c);
		obj.test();
		obj.sum();
		trt();
		int d = obj.IO();
		System.out.println(d);
	}

	public void test() {
		System.out.println("test method ");
	}

	public void sum() {
		System.out.println("Sum Method with no retun type");
	}

	public int IO() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("IO method with return type Integer" );
		return c;
	}

	public long asd(int x, int y) {
		int q = 5;
		int w = 1;
		int r = q + w;
		int qw= x+y;
		System.out.println("in method not in main "+qw);
		return r;

	}
	public static void trt() {
		System.out.println("Static method");
	}

}
