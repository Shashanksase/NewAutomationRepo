package truck;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import browsers.Browser;

public class EnterVehicleData extends Browser {
	@Test

	public void Vehicledata() throws InterruptedException {
		// Truck selection
		dr.findElement(By.cssSelector("a#nav_truck")).click();
		Thread.sleep(2000);

		// Selection of make
		Select make = new Select(dr.findElement(By.id("make")));
		make.selectByIndex(4);
		Thread.sleep(2000);

		// Engine Performance [kW]
		dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1200");
		Thread.sleep(2000);

		// Selection of Date of Manufacture
		dr.findElement(By.id("dateofmanufacture")).sendKeys("02/05/2020");
		Thread.sleep(2000);

		// Selection of Number of Seats
		Select seats = new Select(dr.findElement(By.id("numberofseats")));
		seats.selectByIndex(2);
		Thread.sleep(2000);
		// Fuel Type
		Select fuel = new Select(dr.findElement(By.id("fuel")));
		fuel.selectByIndex(3);
		Thread.sleep(2000);

		// Payload
		dr.findElement(By.xpath("//input[@id='payload']")).sendKeys("212");
		Thread.sleep(2000);

		// Total Weight [kg]
		dr.findElement(By.xpath("//input[@id='totalweight']")).sendKeys("215");
		Thread.sleep(2000);
		// List Price [$]
		dr.findElement(By.xpath("//input[@id='listprice']")).sendKeys("789");
		Thread.sleep(2000);

		// License Plate Number
		dr.findElement(By.xpath("//input[@id='licenseplatenumber']")).sendKeys("124521");
		Thread.sleep(2000);

		// Annual Mileage [mi]
		dr.findElement(By.xpath("//input[@id='annualmileage']")).sendKeys("128");
		Thread.sleep(2000);
		// Next
		dr.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
		Thread.sleep(2000);

	}
}