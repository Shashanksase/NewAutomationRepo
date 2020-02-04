package start;

public class ForStar {

	public static void main(String[] args) {
		/*
		 * // For Start in forward direction for (int i = 0; i <= 4; i++) {
		 * 
		 * for (int j = 0; j <= i; j++) {
		 * 
		 * System.out.print("*");
		 * 
		 * } System.out.println(); } // For Start in reverse order for (int i = 0; i <=
		 * 4; i++) {
		 * 
		 * for (int j = 4; j >= i; j--) {
		 * 
		 * System.out.print("*");
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */

		// For right side star start with single star
		/*
		 * for (int i = 1; i <= 4; i++) { for (int j = 3; j >= i; j--) {
		 * System.out.print(" "); } for (int k = 1; k <= i; k++) {
		 * System.out.print("*"); } System.out.println(" "); }
		 */
		// For Star starting with space and start onn

		/*
		 * for (int i = 1; i <=4 ; i++) {
		 * 
		 * for (int j = 2; j <=i; j++) { System.out.print(" "); } for (int k = 4; k >=i
		 * ; k--) { System.out.print("*");
		 * 
		 * } System.out.println(); }
		 * 
		 */
		
		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("");
			}
			for (int k = 3; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
