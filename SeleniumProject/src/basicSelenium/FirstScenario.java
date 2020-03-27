package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstScenario {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");

		dr.findElement(By.cssSelector("a#nav_automobile")).click();
		
		WebDriverWait wait = new  WebDriverWait(dr,10);
		//wait.until(ExpectedConditions.visibilityOf(automobile));
		
		//Select make
		Select sel= new Select(dr.findElement(By.id("make")));		
		sel.selectByVisibleText("Renault");
		
		//Enter Engine Performance
		dr.findElement(By.id("engineperformance")).sendKeys("1200");
		
		//Select date
		dr.findElement(By.id("dateofmanufacture")).sendKeys("02/13/2020");
		
		//Number of seats
		sel= new Select(dr.findElement(By.id("numberofseats")));		
		sel.selectByVisibleText("3");
		
		//Fuel Type
		sel= new Select(dr.findElement(By.id("fuel")));		
		sel.selectByVisibleText("Petrol");
		
		//List price
		dr.findElement(By.id("listprice")).sendKeys("100000");
		
		//License
		dr.findElement(By.id("licenseplatenumber")).sendKeys("test1234");
		
		//Annual mileage
		dr.findElement(By.id("annualmileage")).sendKeys("160");
		
		
		//click next
		dr.findElement(By.id("nextenterinsurantdata")).click();
		
		//Radio button 
		//dr.findElement(By.
		
	}

}
