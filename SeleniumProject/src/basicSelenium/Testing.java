package basicSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();	
		dr.get("file:///C:/Users/SHANK_SUD/Downloads/Practice.html");
		
		
		WebElement choosefile=dr.findElement(By.id("Anand_file"));
		choosefile.sendKeys("C:\\Users\\SHANK_SUD\\Downloads\\JAVA Source Code-201608211936.txt");
		
		/*
		 * Robot robot= new Robot();
		 * 
		 * StringSelection cb = new
		 * StringSelection("C:\\Users\\SHANK_SUD\\Downloads\\JAVA Source Code-201608211936.txt"
		 * ); Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb,null);
		 * 
		 * Thread.sleep(3000); robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.delay(2000);
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 * System.out.println(dr.findElement(By.id("Anand_file")).getText());
		 * System.out.println(dr.findElement(By.id("Anand_file")).getAttribute("value"))
		 * ;
		 * 
		 * Select sel= new Select(dr.findElement(By.id("Anand_file"))); int
		 * i=sel.getOptions().size();
		 */
	}

}
