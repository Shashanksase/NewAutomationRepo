package newproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Automobile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		// website launch
		
		Thread.sleep(4000);
		dr.get("http://sampleapp.tricentis.com/101/");

		// Enter Vehicle Data
		Thread.sleep(3000);
		// automobile selection
		dr.findElement(By.cssSelector("a#nav_automobile")).click();

		// Select make
		Select sel = new Select(dr.findElement(By.id("make")));
		sel.selectByVisibleText("Honda");

		
		// Selection of engineperformance
		dr.findElement(By.id("engineperformance")).sendKeys("1200");

		// Selection of date
		dr.findElement(By.id("dateofmanufacture")).sendKeys("02/25/2020");
		
// Selection of Number of Seats dropdown
		sel = new Select(dr.findElement(By.xpath("//select[@name='Number of Seats']")));
		sel.selectByVisibleText("4");


		//Selection of fuel
		sel = new Select(dr.findElement(By.id("fuel")));
		sel.selectByVisibleText("Gas");

		
		// List price
		dr.findElement(By.id("listprice")).sendKeys("100000");

		
		//Selection of Licenses plate
		dr.findElement(By.id("licenseplatenumber")).sendKeys("1231323");

		//annualmileage
		dr.findElement(By.id("annualmileage")).sendKeys("231");
		
		
		//Next
		dr.findElement(By.id("nextenterinsurantdata")).click();

		//First Name
		dr.findElement(By.name("First Name")).sendKeys("Shashank");
		
		//Last Name
		dr.findElement(By.id("lastname")).sendKeys("sase");
		
		//Date of Birth
		dr.findElement(By.id("birthdate")).sendKeys("02/25/1995");

		//Radio button
	dr.findElement(By.xpath("(//span[@class='ideal-radio'])[1]")).click();		
	//	System.out.println(dr.findElement(By.xpath("(// label[text()='Male']/input")) .isSelected());
		
		//Street Address
			dr.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("Pune");
		
		//Countrycc 
			Select 	country = new Select (dr.findElement(By.id("country")));
		country.selectByVisibleText("Aruba");
		
		 // Hobbies 
		dr.findElement(By.xpath("//label[contains(.,'Bungee')]")).click();
		dr.findElement(By.xpath("//label[contains(.,'Skydiving')]")).click();
		
		//Zip Code
		dr.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("411014");

		//City
		dr.findElement(By.xpath("//input[@id='city']")).sendKeys("Pin");
		
		//Occupation
		Select Occu= new Select(dr.findElement(By.xpath("//select[@id='occupation']")));
		Occu.selectByVisibleText("Employee");
		
		//Website
		dr.findElement(By.xpath("//input[@id='website']")).sendKeys("www.google.com");
		
		//Picture J:\Shashank_Bharati_Wedding\Wedding_Photo\FInal_Photo_Wedding\DSC_9386.JPG
		WebElement choosefile=dr.findElement(By.xpath("//button[@class='ideal-file-upload']"));
		choosefile.sendKeys("J:\\Shashank_Bharati_Wedding\\Wedding_Photo\\FInal_Photo_Wedding\\DSC_9386.JPG");
		
		//Next
		dr.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
		
		//Start Date 
		dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("04/04/2020");
		
		//Insurance Sum
		Select insurance = new Select(dr.findElement(By.xpath("//select[@id='insurancesum']")));
		insurance.selectByIndex(4);
		
		
		//Merit Rating
		
		Select Merit = new Select(dr.findElement(By.xpath("//select[@id ='meritrating']")));
		Merit.selectByIndex(4);
		
		//Damage Insurance
		Select Damage  = new Select(dr.findElement(By.xpath("//select[@id='damageinsurance']")));
		Damage.selectByIndex(1);
		
		//Optional Products
		dr.findElement(By.xpath("//label[contains(.,'Euro')]")).click();
		dr.findElement(By.xpath("//label[contains(.,'Legal')]")).click();
		
		//Car
		Select Car  = new Select(dr.findElement(By.xpath("//select[@id ='courtesycar']")));
		Car.selectByIndex(1);
		
		// Next
		dr.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();		
		
		//Select option 
		dr.findElement(By.xpath("//label[@class=\"choosePrice ideal-radiocheck-label\"][2]/span")).click();
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
