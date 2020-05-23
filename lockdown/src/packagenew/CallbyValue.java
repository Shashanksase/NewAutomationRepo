package packagenew;

public class CallbyValue extends BMW {
	int p;
	int q;

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		CallbyValue obj = new CallbyValue();
		obj.testSum(a, b);
		obj.p = 50;
		obj.q = 10;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		obj.car();
	
	}

	public int testSum(int x, int y) {
		int c = x + y;
		return c;
	}

	public void swap(CallbyValue t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;

	}

}
