package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumClass {

	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\drivers\\chromedriver.exe"); ChromeDriver dr = new ChromeDriver();
		 * dr.manage().window().maximize();
		 * dr.get("http://sampleapp.tricentis.com/101/"); //WebElement automobile =
		 * dr.findElement(By.id("nav_automobile")); /// ---- By id // WebElement
		 * automobile = dr.findElement(By.name("Navigation Automobile")); // ////
		 * ------By name // WebElement automobile =
		 * dr.findElement(By.linkText("Automobile"));// ---By // Linktext // WebElement
		 * automobile = dr.findElement(By.partialLinkText("Auto")); //-- By //
		 * partiallinktext // WebElement automobile = //
		 * dr.findElement(By.xpath("//a[@id='nav_automobile']"));// xpath
		 * 
		 * WebElement automobile = dr.findElement(By.cssSelector("a#nav_automobile"));
		 * automobile.click(); /
		 * 
		 * dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1200")
		 * ; dr.findElement(By.xpath("//input[@name='List Price']")).sendKeys("700");
		 * dr.findElement(By.xpath("//input[@id='licenseplatenumber']")).sendKeys("13");
		 * dr.findElement(By.xpath("//input[@id='annualmileage']")).sendKeys("232");
		 * 
		 * // Select make Select sel = new Select(dr.findElement(By.id("make")));
		 * sel.selectByVisibleText("Renault");
		 * 
		 * // Enter Engine Performance
		 * dr.findElement(By.id("engineperformance")).sendKeys("1200");
		 * 
		 * // Select date
		 * dr.findElement(By.id("dateofmanufacture")).sendKeys("02/13/2020");
		 * 
		 * // Number of seats sel = new Select(dr.findElement(By.id("numberofseats")));
		 * sel.selectByVisibleText("3");
		 * 
		 * // Fuel Type sel = new Select(dr.findElement(By.id("fuel")));
		 * sel.selectByVisibleText("Petrol");
		 * 
		 * // List price dr.findElement(By.id("listprice")).sendKeys("100000");
		 * 
		 * // License dr.findElement(By.id("licenseplatenumber")).sendKeys("test1234");
		 * 
		 * // Annual mileage dr.findElement(By.id("annualmileage")).sendKeys("160");
		 * 
		 * // click next dr.findElement(By.id("nextenterinsurantdata")).click();
		 * 
		 * // need to add the before // enterinsurantdata
		 * 
		 * // System.out.println(dr.findElement(By.xpath(
		 * "(//span[@class='ideal-radio'])[1]")).isSelected()); // // to check whether
		 * the element is there.
		 * 
		 * System.out.println(dr.findElement(By.xpath("(// label[text()='Male']/input"))
		 * .isSelected()); // Gender
		 * dr.findElement(By.xpath("(//span[@class='ideal-radio'])[1]")).click(); //
		 * label[text()='Male']/input xpath other way /// span[@class='ideal-radio'])[1]
		 * // to check whether selected element is selected or not
		 * System.out.println(dr.findElement(By.xpath("(// label[text()='Male']/input"))
		 * .isSelected());
		 * 
		 * // Hobbies dr.findElement(By.xpath("//label[contains(.,'Bungee')]")).click();
		 * dr.findElement(By.xpath("//label[contains(.,' Skydiving')]")).click();
		 * dr.findElement(By.xpath("//label[contains(.,'  Other')]")).click();
		 */

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");

		dr.findElement(By.cssSelector("a#nav_automobile")).click();

		// Select make
		Select sel = new Select(dr.findElement(By.id("make")));
		sel.selectByVisibleText("Renault");

		// Enter Engine Performance
		dr.findElement(By.id("engineperformance")).sendKeys("1200");

		// Select date
		dr.findElement(By.id("dateofmanufacture")).sendKeys("02/13/2020");

		// Number of seats
		sel = new Select(dr.findElement(By.id("numberofseats")));
		sel.selectByVisibleText("3");

		// Fuel Type
		sel = new Select(dr.findElement(By.id("fuel")));
		sel.selectByVisibleText("Petrol");

		// List price
		dr.findElement(By.id("listprice")).sendKeys("100000");

		// License
		dr.findElement(By.id("licenseplatenumber")).sendKeys("test1234");

		// Annual mileage
		dr.findElement(By.id("annualmileage")).sendKeys("160");

		// click next
		dr.findElement(By.id("nextenterinsurantdata")).click();

	}

}
