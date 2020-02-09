package polymorphism;

public class StringFunction {

	public static void main(String[] args) {

		String name = "Shashank";

		// Function1
		System.out.println(name.length());

		// Function2
		System.out.println(name.charAt(7));

		// function 3
		String name2 = "ShasHank";
		System.out.println(name.equals(name2));

		// Function4
		System.out.println(name.equalsIgnoreCase(name2));

		// Function 5
		String temp = "Shashank sase";
		String[] arr = temp.split(" ");// When can use by space , can use anything ex dot,number etc
		for (String s : arr) {
			
			System.out.println("Function 5");
			System.out.println(s);
		}
		
		
		////function 6	
		System.out.println(temp.substring(4));
		System.out.println(temp.substring(4, 10));//sub string 
		
		//function  7 
		System.out.println(temp.replace(" ", ""));
		
		//function 8
		String temp2 = " Shashank ";
		System.out.println(temp2);
		System.out.println(temp2.trim());
		
		//Function 9
		String temp3 ="ShaSHANK";
		System.out.println(temp3.toLowerCase());
		System.out.println(temp3.toUpperCase());
		
		
//Shashank
		String temp4 ="SHASHANK";
for (int temp41 = 0; temp41 < arr.length; temp41++) {
	String string = arr[temp41];
	
}
		
			}

}
