package camper;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import browsers.Browser;

public class EnterVehicleData extends Browser{
	@Test

	public void VehicleData() {
		// Camper selection
				dr.findElement(By.cssSelector("a#nav_camper")).click();

				// Selection of make
				Select make = new Select(dr.findElement(By.id("make")));
				make.selectByIndex(4);

				// Engine Performance [kW]
				dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1234");

				// Selection of Date of Manufacture
				dr.findElement(By.id("dateofmanufacture")).sendKeys("02/05/2020");

				// Selection of Number of Seats
				Select seats = new Select(dr.findElement(By.id("numberofseats")));
				seats.selectByIndex(4);
		 
				//Right Hand Drive
				dr.findElement(By.xpath("// label[text()='Yes']")).click();		
					
				// Fuel Type
				Select fuel = new Select(dr.findElement(By.id("fuel")));
				fuel.selectByIndex(2);

				//Payload
				dr.findElement(By.xpath("//input[@id='payload']")).sendKeys("123");
				
				//Total weight 
				dr.findElement(By.xpath("//input[@id='totalweight']")).sendKeys("5456");
				
				// List Price [$]
				dr.findElement(By.xpath("//input[@id='listprice']")).sendKeys("1231");

				// License Plate Number
				dr.findElement(By.xpath("//input[@id='licenseplatenumber']")).sendKeys("56789");

				// Annual Mileage [mi]
				dr.findElement(By.xpath("//input[@id='annualmileage']")).sendKeys("907");

				// Next
				dr.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();	}

}
