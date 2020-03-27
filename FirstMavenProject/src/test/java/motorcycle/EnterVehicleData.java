package motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import browsers.Browser;

public class EnterVehicleData extends Browser {
	@Test

	public void VehicleData() throws InterruptedException {
		// Truck selection
		dr.findElement(By.cssSelector("a#nav_motorcycle")).click();

		// Selection of Model
		Select make = new Select(dr.findElement(By.id("make")));
		make.selectByIndex(4);
		Thread.sleep(2000);

		// Model
		Select Model = new Select(dr.findElement(By.id("model")));
		Model.selectByIndex(2);
		Thread.sleep(2000);

		// Capacity
		dr.findElement(By.xpath("//input[@id='cylindercapacity']")).sendKeys("12");

		// Engine Performance [kW]
		dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1200");
		Thread.sleep(2000);

		// Selection of Date of Manufacture
		dr.findElement(By.id("dateofmanufacture")).sendKeys("02/03/2020");
		Thread.sleep(2000);

		// Selection of Number of Seats
		Select seats = new Select(dr.findElement(By.id("numberofseatsmotorcycle")));
		seats.selectByIndex(2);
		Thread.sleep(2000);

		// List Price [$]
		dr.findElement(By.xpath("//input[@id='listprice']")).sendKeys("1111");
		Thread.sleep(2000);

		// Annual Mileage [mi]
		dr.findElement(By.xpath("//input[@id='annualmileage']")).sendKeys("128");
		Thread.sleep(2000);

		// Next
		dr.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
		Thread.sleep(2000);
	}

}
