package arrays;

public class ArrayClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[8];
		str[0] = "shashank";
		str[1] = "shashan";
		str[2] = "shasha";
		str[3] = "shash";
		str[4] = "shas";
		str[5] = "sha";
		str[6] = "sh";
		str[7] = "s";
		//System.out.println(str[8]);

		/*
		 * for (int i = 0; i < 8; i++) { System.out.println(str[i]); }
		 */
		//  data type variable  
		//Enchanced forloop
		for (String    s :       str) {
			System.out.println(s);
			
		}
	}
}