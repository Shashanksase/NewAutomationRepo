package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelIFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://paytm.com/"); 
		System.out.println(dr.getTitle());
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(4000);
		dr.findElement(By.xpath("//*[@data-reactid='190']")).click();

		/*
		 * dr.switchTo().frame(0); //dr.findElement(By.
		 * xpath("//span[text()='Login/Signup with mobile number and password']")).click
		 * ();
		 * 
		 * dr.switchTo().frame(dr.findElementByTagName(
		 * "//*[@id=\"app\"]/div/div[6]/div[2]/div/a/img"));
		 */

	}

}
