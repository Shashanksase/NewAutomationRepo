package testngAnnotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

///it will run multiple time for same test case
public class LearnDataProvider {

	@BeforeClass
	@Parameters({ "browser" })
	public void intilialize(String browser) {
		System.out.println("Open" + browser + "");
	}

	// inside the test we have to pass "dataprovider" and the name we provide
	// currently getData
	@Test(dataProvider = "getData")
	public void test1(String username, String password) {
		System.out.println(" Enter " + username + " in userame filed");
		System.out.println(" Enter " + password + " in password filed");
	}
	
	
	//(enabled = false)  // to exclude another way from testcase as we have done from .xml
	@Test
	public void Test1() {
		System.out.println("Test case 2");
	}

	@DataProvider
	public String[][] getData() {
		String[][] data = new String[4][2];
         //row 1
		data[0][0] = "shashank";
		data[0][1] = "passwo";

		// row 2
		data[1][0] = "sudhir";
		data[1][1] = "pass";

		// row 3
		data[2][0] = "sasas";
		data[2][1] = "passsss";

		// row 4
		data[3][0] = "dgdfdt";
		data[3][1] = "paspssp";

		return data;

	}
}
