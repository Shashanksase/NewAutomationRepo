package head;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeadLessBrowser {

	@Test
	public void verifyFacebooktitle() {

		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		String facebook = driver.getTitle();
		Assert.assertTrue(facebook.contains("Facebook"));
	}
}
