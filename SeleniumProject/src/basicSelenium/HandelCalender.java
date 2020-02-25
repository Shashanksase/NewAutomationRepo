package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandelCalender {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/#");
	 dr.findElement(By.id("nav_automobile")).click();

		Select sel = new Select(dr.findElement(By.id("make")));
		sel.selectByVisibleText("Renault");

		// Enter Engine Performance
		dr.findElement(By.id("engineperformance")).sendKeys("1200");

		// Select date
		dr.findElement(By.id("dateofmanufacture")).sendKeys("02/13/2020");

		// mouse hover
		/*
		 * Actions act = new Actions(dr);
		 * act.moveToElement(dr.findElement(By.id("opendateofbirthcalender"))).build().
		 * perform();
		 */
		/*
		 * String Targetyear = "2020"; String TargetMonth = "July";
		 */
		// year selection
		String month = dr.findElement(By.xpath("///span[@class='ui-datepicker-month']")).getText();
		String year = dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println(month);
		System.out.println(year);
	}

}
