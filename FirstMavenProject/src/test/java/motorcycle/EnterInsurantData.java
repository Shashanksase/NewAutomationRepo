package motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import browsers.Browser;

public class EnterInsurantData extends Browser {
	@Test

	public void InsurantData() throws InterruptedException {
		// First Name enterinsurantdata
		dr.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Shasha");
		Thread.sleep(2000);

		// Last Name
		dr.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Sase");
		Thread.sleep(2000);

		// Date Selection
		dr.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("01/01/1992");

		// Gender
		dr.findElement(By.xpath("(//span[@class='ideal-radio'])[2]")).click();

		// Street Address
		dr.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("Pune");

		// Country
		Select country = new Select(dr.findElement(By.id("country")));
		country.selectByVisibleText("Aruba");

		// Hobbies
		dr.findElement(By.xpath("//label[contains(.,'Bungee')]")).click();
		dr.findElement(By.xpath("//label[contains(.,'Skydiving')]")).click();

		// Zip Code
		dr.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("411014");

		// City
		dr.findElement(By.xpath("//input[@id='city']")).sendKeys("Pin");

		// Occupation
		Select Occu = new Select(dr.findElement(By.xpath("//select[@id='occupation']")));
		Occu.selectByVisibleText("Employee");

		// Website
		dr.findElement(By.xpath("//input[@id='website']")).sendKeys("www.google.com");

		// Picture
		WebElement choosefile = dr.findElement(By.xpath("//button[@class='ideal-file-upload']"));
		choosefile.sendKeys("J:\\Shashank_Bharati_Wedding\\Wedding_Photo\\FInal_Photo_Wedding\\DSC_9386.JPG");

		// Next
		dr.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
	}

}
