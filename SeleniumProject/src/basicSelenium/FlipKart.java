package basicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com/");

		//dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);// it will wait for all action for below elements

		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

		Thread.sleep(5000);
		
		//For hover
		Actions act = new Actions(dr);
		WebElement ele = dr.findElement(By.xpath("//span[text()='Men']"));
		act.moveToElement(ele).build().perform();
		
		Thread.sleep(2000);
		ele = dr.findElement(By.xpath("//a[text()='Shirts']"));
		ele.click();
		Thread.sleep(2000);
		ele = dr.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']"));
		act.dragAndDropBy(ele, 50, 0).build().perform();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();		
	//	dr.findElement(By.xpath("//div[text()='Available offers']")).click();
		String parent =dr.getWindowHandle();
		Set<String> wins=dr.getWindowHandles();
		for(String w:wins) {
			if(!w.equals(parent))
					dr.switchTo().window(w);
		}
		dr.findElement(By.xpath("//div[text()='Available offers']")).click();

		
		dr.close();
		dr.switchTo().window(parent);
		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();


	}

}
