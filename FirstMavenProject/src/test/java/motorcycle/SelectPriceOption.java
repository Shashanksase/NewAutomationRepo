package motorcycle;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import browsers.Browser;

public class SelectPriceOption extends Browser {
	@Test

	public void PriceOption() throws InterruptedException {
		/// Select price option
		// dr.findElement(By.xpath("//section[@id='pricePlans']//label[2]//span[1]")).click();
		dr.findElement(By.xpath("//label[@class=\"choosePrice ideal-radiocheck-label\"][2]/span")).click();
		// label[@class="choosePrice ideal-radiocheck-label"][2]/span

		Thread.sleep(4000);
		// Next
		dr.findElement(By.xpath("//button[@id='nextsendquote']")).click();
	}
}
