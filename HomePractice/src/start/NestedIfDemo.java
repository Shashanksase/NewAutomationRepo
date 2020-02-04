package start;

public class NestedIfDemo {

	public static void main(String[] args) {

		int i = 16;
		if (i == 16) 
		{
			if (i < 15)
				System.out.println("i is smaller then 15");
			if (i < 12)
				System.out.println("i is smaller then 12 too");
			if (i < 17) {
			System.out.println("i is grater then 16");	
			}
			if (i>0) {
				System.out.println("i is greater ");
			}
				else
					System.out.println("i is greater then 15");
			}

	
}
	}