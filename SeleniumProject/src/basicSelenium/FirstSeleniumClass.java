package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		// WebElement automobile = dr.findElement(By.id("nav_automobile")); ---- By id
		// WebElement automobile = dr.findElement(By.name("Navigation Automobile"));
		// //// ------By name
		// WebElement automobile = dr.findElement(By.linkText("Automobile"));// ---By
		// Linktext
		// WebElement automobile = dr.findElement(By.partialLinkText("Auto")); //-- By
		// partiallinktext
		// WebElement automobile =
		// dr.findElement(By.xpath("//a[@id='nav_automobile']"));// xpath

		//WebElement automobile = dr.findElement(By.cssSelector("a#nav_automobile"));
		WebElement automobile = dr.findElement(By.id("nav_automobile"));
		String actual = automobile.getText();
		System.out.println(actual);
	
		automobile.click();
		dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1200");

		// dr.quit();
	}

}
