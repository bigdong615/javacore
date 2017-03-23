package j2se.core.io.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class PropertiesXml {

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();

		File input = new File("src/config.xml");

		prop.loadFromXML(new FileInputStream(input));

		System.out.println(prop.getProperty("username"));

		prop.setProperty("key", "value");

		File output = new File("src/new.xml");

		prop.storeToXML(new FileOutputStream(output), " Ù–‘¡–±Ì√Ë ˆ");

	}

}
