package newproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
	//dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.get("https://www.naukri.com/");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//input[@class=\"plainBtn\"]")).sendKeys("C:\\Users\\SHANK_SUD\\Desktop\\Shashank_Sase_CV.docx");
		 
		
		/*
		 * String filepath ="G:\\Shashank_Sase_CV.docx"; WebElement Upload
		 * =dr.findElement(By.xpath("//div[@id='uploadBtnCont']")); Thread.sleep(3000);
		 * Upload.sendKeys(filepath);
		 */
		
		/*
		 * WebElement Upload =dr.findElement(By.xpath("//div[@id='uploadBtnCont']"))
		 * Thread.sleep(4000);
		 * Upload.sendKeys("C:\\Users\\SHANK_SUD\\Desktop\\Shashank_Sase_CV.docx");
		 */
	}

}
