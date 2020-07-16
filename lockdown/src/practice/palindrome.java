package practice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to check if it's palindrome:");
		original = in.nextLine();
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
	}
}
