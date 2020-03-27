package choosefile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import browsers.Browser;

public class ChooseFile extends Browser {

	public static void main(String[] args) throws InterruptedException, AWTException {

		dr.findElement(By.xpath("//button[@class='ideal-file-upload']")).click();

		Robot robot = new Robot();

		StringSelection cb = new StringSelection(
				"J:\\Shashank_Bharati_Wedding\\Wedding_Photo\\FInal_Photo_Wedding\\DSC_9386.JPG");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb, null);

		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println(dr.findElement((By.xpath("//button[@class='ideal-file-upload']"))).getText());
		System.out.println(dr.findElement((By.xpath("//button[@class='ideal-file-upload']"))).getAttribute("value"));

		Select sel = new Select(dr.findElement(By.id("Anand_file")));
		int i = sel.getOptions().size();
	}

}
