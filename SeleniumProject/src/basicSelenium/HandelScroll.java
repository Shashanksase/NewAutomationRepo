package basicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelScroll {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///C:/Users/SHANK_SUD/Downloads/Practice.html");

		JavascriptExecutor js = dr;
		WebElement ele = dr.findElement(By.tagName("button"));
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		Alert alt =dr.switchTo().alert();
		
		System.out.println(alt.getText());
		//alt.accept();
		alt.dismiss();
		dr.close();
	}

}
