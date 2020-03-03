package automobile;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import testngAnnotations.SuiteIntilizationAndTearDown;

public class Testintialization  extends SuiteIntilizationAndTearDown {

	@BeforeTest
	public void automobileInitialztion() {
		System.out.println("Preconditions of Automobile module");
	}
	@AfterTest
	public void automobileTeardown() {
		System.out.println("Revert back changes made in initilization");
	}
	
}
