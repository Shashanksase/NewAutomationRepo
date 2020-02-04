package functions;

public class AccessModifier {

	public static void main(String[] args) {
		// 4 types public, private, noaccessmodifier/protected.
		
		// private; Within the class.
		// noaccessmodifier;class and  within the package
		// protected: within the package 
		AccessModifier obj = new AccessModifier();
		obj.publicFunction();
		obj.privateFunction();// within class
		obj.noAcessModifier();
		obj.protectedFunction();

	}

	public void publicFunction() {

	}

	private void privateFunction() {
	}

	void noAcessModifier() {
	}

	protected void protectedFunction() {
	}

}
