package camper;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import browsers.Browser;

public class EnterProductData extends Browser {

	@Test

	public void ProductData() {
		/// Start Date
		dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("05/02/2020");
		// Insurance Sum
		Select insurance = new Select(dr.findElement(By.xpath("//select[@id='insurancesum']")));
		insurance.selectByIndex(5);

		// Damage Insurance
		Select Damage = new Select(dr.findElement(By.xpath("//select[@id='damageinsurance']")));
		Damage.selectByIndex(2);

		// Optional Products
		dr.findElement(By.xpath("//label[contains(.,'Euro')]")).click();

		// dr.findElement(By.xpath("//label[text()=EuroProtection"))
		dr.findElement(By.xpath("//label[contains(.,'Legal')]")).click();

		// Next
		dr.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
	}
}
