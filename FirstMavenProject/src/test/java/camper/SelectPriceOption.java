package camper;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import browsers.Browser;

public class SelectPriceOption extends Browser{
	@Test

	public void PriceOption() throws InterruptedException {
		// Select option
		dr.findElement(By.xpath("//label[@class=\"choosePrice ideal-radiocheck-label\"][2]/span")).click();

		Thread.sleep(3000);
		// Next
		dr.findElement(By.xpath("//button[@id='nextsendquote']")).click();
	}
}
