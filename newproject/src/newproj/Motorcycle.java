package newproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Motorcycle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		// website launch

		Thread.sleep(6000);
		dr.get("http://sampleapp.tricentis.com/101/");

		Thread.sleep(6000);

		// truck selection
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

		// Enter product data
		// Start Date
		dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("04/02/2020");

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
		// Select option

		///Select price option
		//dr.findElement(By.xpath("//section[@id='pricePlans']//label[2]//span[1]")).click();
		dr.findElement(By.xpath("//label[@class=\"choosePrice ideal-radiocheck-label\"][2]/span")).click();
		//label[@class="choosePrice ideal-radiocheck-label"][2]/span
		
		Thread.sleep(4000);
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
