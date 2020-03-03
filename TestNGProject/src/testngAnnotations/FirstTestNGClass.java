package testngAnnotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGClass extends TestIntilizationAndTearDown {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Precondition for FirstTestNGClass ");
	}	
	
	@AfterClass
	public void afterClass() {
		System.out.println("Postcondition for FirstTestNGClass");
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
	public void test1() {
		System.out.println("Hello testNG");
	}
	
	@Test
	public void test2() {
		System.out.println("Hello testNG");
	}

	public void test3() {
		System.out.println("Hello testNG");
	}
	@Test
	public void test4() {
		System.out.println("Hello testNG");
	}
	@Test(priority=2)
	public void test5() {
		System.out.println("Hello testNG");
	}
	@Test(priority=0)
	public void test6() {
		System.out.println("Hello testNG");
	}
	@Test(priority=1)
	public void test7() {
		System.out.println("Hello testNG");
	}
	
}
