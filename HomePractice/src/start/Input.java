package start;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter  an integer: ");
		int number = input.nextInt();
		System.out.print("You entered " + number);
		
		System.out.print("Enter double: ");
		Double mydouble =input.nextDouble();
		System.out.print("You Enter double " +mydouble);
		
		System.out.print("Enter your Name:");
		String my = input.next();
		System.out.print("Ente name is: " +my);
		
	}

}
