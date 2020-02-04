package loops;

import functions.AccessModifier;

public class TestAccessModAtPac extends AccessModifier  {
	public static void main(String[] arg) {
		AccessModifier obj = new AccessModifier();
		obj.publicFunction();
		TestAccessModAtPac obj2 = new TestAccessModAtPac();
		obj2.protectedFunction();
	}

}
