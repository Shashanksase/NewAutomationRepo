package practice;

public class Conf {
	String x = "100";

	public static void main(String[] args) {
		/*
		 * int a = 2; System.out.println("Value of add : " + a);
		 */
		Conf p = new Conf();
		int i = Integer.parseInt(p.x);
		System.out.println(i + 20);

		String y = "12.23";
		double d = Double.parseDouble(y);
		System.out.println(d + 10);
		
		int j =25;
		String s=String.valueOf(j);
		System.out.println(s+25);

	}
}