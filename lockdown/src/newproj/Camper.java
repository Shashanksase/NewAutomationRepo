	package newproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Camper {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		// website launch

		Thread.sleep(6000);
		dr.get("http://sampleapp.tricentis.com/101/");

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
		dr.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();

		// First Name enterinsurantdata
		dr.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Shashank");

		// Last Name
		dr.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Sase");

		// Date Selection
		dr.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("01/01/1992");

		// Right hand drive 
		dr.findElement(By.xpath("//label[text()='Male']")).click();

		// Street Address
		dr.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("Pune");

		// Country
		Select country = new Select(dr.findElement(By.id("country")));
		country.selectByVisibleText("Andorra");

		// Zip Code
		dr.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("411014");

		// City
		dr.findElement(By.xpath("//input[@id='city']")).sendKeys("Pune");
		// Occupation
		Select Occu = new Select(dr.findElement(By.xpath("//select[@id='occupation']")));
		Occu.selectByVisibleText("Employee");

		// Hobbies
		dr.findElement(By.xpath("//label[contains(.,'Bungee')]")).click();
		dr.findElement(By.xpath("//label[contains(.,'Skydiving')]")).click();

		// Website
		dr.findElement(By.xpath("//input[@id='website']")).sendKeys("www.google.com");

		// Picture
		WebElement choosefile = dr.findElement(By.xpath("//button[@class='ideal-file-upload']"));
		choosefile.sendKeys("J:\\Shashank_Bharati_Wedding\\Wedding_Photo\\FInal_Photo_Wedding\\DSC_9386.JPG");

		// Next
		dr.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();

		// Start Date
		dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("04/02/2020");
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

		//Select option 
		dr.findElement(By.xpath("//label[@class=\"choosePrice ideal-radiocheck-label\"][2]/span")).click();
		
		Thread.sleep(3000);
		//Next
				dr.findElement(By.xpath("//button[@id='nextsendquote']")).click();	
				
				//Email
				dr.findElement(By.id("email")).sendKeys("shasha@gmail.com");
				
				//Phone 
				dr.findElement(By.xpath("//input[@id='phone']")).sendKeys("342424223");
				
				//username
				dr.findElement(By.xpath("//input[@id='username']")).sendKeys("omgindia");
				
				//Password
				dr.findElement(By.xpath("//input[@id='password']")).sendKeys("Qwer1234");
				
				//confirm password
				dr.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("Qwer1234");
				
				//Comment
				dr.findElement(By.xpath("//textarea[@id='Comments']")).sendKeys("Who are you");
				
				//Send
				dr.findElement(By.xpath("//button[@id='sendemail']")).click();	

	}

}
