package testngAnnotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {
	
	@Test
	@Parameters({"username","password"})
	public void test1(String username,String password) {
		System.out.println(" Enter "+username+ "in userame field");
		System.out.println(" Enter " +password+" in password field");

	}

}
