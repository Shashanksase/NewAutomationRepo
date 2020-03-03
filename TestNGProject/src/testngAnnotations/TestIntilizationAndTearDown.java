package testngAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestIntilizationAndTearDown extends SuiteIntilizationAndTearDown {

	@BeforeTest
	public void automobileInitialztion() {
		System.out.println("Preconditions of Automobile module");
	}
	@AfterTest
	public void truckTeardown() {
		System.out.println("Revert back changes made in initilization");
	}
	
}
