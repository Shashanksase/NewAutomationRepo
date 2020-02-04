package start;

public class IfElse {

	public static void main(String[] args) {
	 
		
		int number;
		number = 10;
		//number=11;
		if(number < 0) {
			System.out.println("Number is negative ");
		}
		else if (number > 0) {
			System.out.println("number is positive");
		}
		else {
			System.out.println("Number is 0");
		}
		//System.out.println("This statemet is always executed " +number);
	}

}
