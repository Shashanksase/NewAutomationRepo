package testngAnnotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethod  extends TestIntilizationAndTearDown{
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Precondition for DependsOnMethod ");
	}	
	
	@AfterClass
	public void afterClass() {
		System.out.println("Postcondition for DependsOnMethod");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Precondtion for every test case");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Postcondtion for every test case");
	}
	
	@Test
	public void login() {
		System.out.println("Login");
		System.out.println(10/0);
	}

	@Test(dependsOnMethods = { "login" })
	public void verifyhomepage() {
		System.out.println("homepage");
	}

	@Test(dependsOnMethods = { "login", "verifyhomepage" })
	public void logout() {
		System.out.println("logout");
	}
}
