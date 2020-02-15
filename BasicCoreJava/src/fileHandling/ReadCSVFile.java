package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSVFile {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(
				new File("H:\\Automation\\NewAutomationRepo\\BasicCoreJava\\src\\fileHandling\\SampleHandling.csv"));

		sc.useDelimiter(",");// set the delimiter pattern

		while (sc.hasNext()) {
			System.out.print(sc.next() + " ");
		}
	}

}
