package motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import browsers.Browser;

public class EnterProductData extends Browser {

	@Test

	public void ProductData() throws InterruptedException {
		// Enter product data
		// Start Date
		dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("05/02/2020");

		// Insurance Sum
		Select insurance = new Select(dr.findElement(By.xpath("//select[@id='insurancesum']")));
		insurance.selectByIndex(3);

		// Damage Insurance
		Select Damage = new Select(dr.findElement(By.xpath("//select[@id='damageinsurance']")));
		Damage.selectByIndex(1);

		// Optional Products
		dr.findElement(By.xpath("//label[contains(.,'Euro')]")).click();

		// Next
		dr.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
		Thread.sleep(4000);
	}
}
