package newproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Complete {

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

		
		//Selection of Licences plate
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
		dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("04/02/2020");
		
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
		
		// truck selection
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
		Select country1 = new Select(dr.findElement(By.id("country")));
		country1.selectByVisibleText("Aruba");

		// Hobbies
		dr.findElement(By.xpath("//label[contains(.,'Bungee')]")).click();
		dr.findElement(By.xpath("//label[contains(.,'Skydiving')]")).click();

		// Zip Code
		dr.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("411014");

		// City
		dr.findElement(By.xpath("//input[@id='city']")).sendKeys("Pin");

		// Occupation
		Select Occu1 = new Select(dr.findElement(By.xpath("//select[@id='occupation']")));
		Occu1.selectByVisibleText("Employee");

		// Website
		dr.findElement(By.xpath("//input[@id='website']")).sendKeys("www.google.com");

		// Picture
		WebElement choosefile1 = dr.findElement(By.xpath("//button[@class='ideal-file-upload']"));
		choosefile1.sendKeys("J:\\Shashank_Bharati_Wedding\\Wedding_Photo\\FInal_Photo_Wedding\\DSC_9386.JPG");

		// Next
		dr.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
		
		//Start Date
		dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("04/02/2020");
		//Insurance Sum
		Select insurance1 = new Select(dr.findElement(By.xpath("//select[@id='insurancesum']")));
		insurance1.selectByIndex(1);
		
		//Damage Insurance
		Select Damage1  = new Select(dr.findElement(By.xpath("//select[@id='damageinsurance']")));
		Damage1.selectByIndex(1);
		
		//Optional Products
		dr.findElement(By.xpath("//label[contains(.,'Euro')]")).click();
		
		//dr.findElement(By.xpath("//label[text()=EuroProtection"))
		dr.findElement(By.xpath("//label[contains(.,'Legal')]")).click();
		
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
		

		// truck selection
		dr.findElement(By.cssSelector("a#nav_motorcycle")).click();

		// Selection of Model
		Select make1= new Select(dr.findElement(By.id("make")));
		make1.selectByIndex(4);
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
		Select seats1 = new Select(dr.findElement(By.id("numberofseatsmotorcycle")));
		seats1.selectByIndex(2);
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
		Select country2 = new Select(dr.findElement(By.id("country")));
		country2.selectByVisibleText("Aruba");

		// Hobbies
		dr.findElement(By.xpath("//label[contains(.,'Bungee')]")).click();
		dr.findElement(By.xpath("//label[contains(.,'Skydiving')]")).click();

		// Zip Code
		dr.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("411014");

		// City
		dr.findElement(By.xpath("//input[@id='city']")).sendKeys("Pin");

		// Occupation
		Select Occu2= new Select(dr.findElement(By.xpath("//select[@id='occupation']")));
		Occu2.selectByVisibleText("Employee");

		// Website
		dr.findElement(By.xpath("//input[@id='website']")).sendKeys("www.google.com");

		// Picture
		WebElement choosefile3 = dr.findElement(By.xpath("//button[@class='ideal-file-upload']"));
		choosefile3.sendKeys("J:\\Shashank_Bharati_Wedding\\Wedding_Photo\\FInal_Photo_Wedding\\DSC_9386.JPG");

		// Next
		dr.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();

		// Enter product data
		// Start Date
		dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("04/02/2020");

		// Insurance Sum
		Select insurance3 = new Select(dr.findElement(By.xpath("//select[@id='insurancesum']")));
		insurance3.selectByIndex(3);

		// Damage Insurance
		Select Damage4 = new Select(dr.findElement(By.xpath("//select[@id='damageinsurance']")));
		Damage4.selectByIndex(1);

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
		
		// truck selection
		dr.findElement(By.cssSelector("a#nav_camper")).click();

		// Selection of make
		Select Make = new Select(dr.findElement(By.id("make")));
		Make.selectByIndex(4);

		// Engine Performance [kW]
		dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1234");

		// Selection of Date of Manufacture
		dr.findElement(By.id("dateofmanufacture")).sendKeys("02/05/2020");

		// Selection of Number of Seats
		Select seats5 = new Select(dr.findElement(By.id("numberofseats")));
		seats5.selectByIndex(4);
 
		//Right Hand Drive
		dr.findElement(By.xpath("// label[text()='Yes']")).click();		
			
		// Fuel Type
		Select fuel5 = new Select(dr.findElement(By.id("fuel")));
		fuel5.selectByIndex(2);

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
		Select country5 = new Select(dr.findElement(By.id("country")));
		country5.selectByVisibleText("Andorra");

		// Zip Code
		dr.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("411014");

		// City
		dr.findElement(By.xpath("//input[@id='city']")).sendKeys("Pune");
		// Occupation
		Select Occu5 = new Select(dr.findElement(By.xpath("//select[@id='occupation']")));
		Occu5.selectByVisibleText("Employee");

		// Hobbies
		dr.findElement(By.xpath("//label[contains(.,'Bungee')]")).click();
		dr.findElement(By.xpath("//label[contains(.,'Skydiving')]")).click();

		// Website
		dr.findElement(By.xpath("//input[@id='website']")).sendKeys("www.google.com");

		// Picture
		WebElement choosefile6 = dr.findElement(By.xpath("//button[@class='ideal-file-upload']"));
		choosefile6.sendKeys("J:\\Shashank_Bharati_Wedding\\Wedding_Photo\\FInal_Photo_Wedding\\DSC_9386.JPG");

		// Next
		dr.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();

		// Start Date
		dr.findElement(By.xpath("//input[@id='startdate']")).sendKeys("04/02/2020");
		// Insurance Sum
		Select insurance7 = new Select(dr.findElement(By.xpath("//select[@id='insurancesum']")));
		insurance7.selectByIndex(5);

		// Damage Insurance
		Select Damage7 = new Select(dr.findElement(By.xpath("//select[@id='damageinsurance']")));
		Damage7.selectByIndex(2);

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
