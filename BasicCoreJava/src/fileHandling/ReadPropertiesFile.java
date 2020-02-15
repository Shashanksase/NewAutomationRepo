package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(
				"H:\\Automation\\NewAutomationRepo\\BasicCoreJava\\src\\fileHandling\\or.properties");

		Properties or = new Properties();
		or.load(file);
		System.out.println(or.get("name"));
		System.out.println(or.get("surname"));
		System.out.println(or.get("age"));

	}

}
