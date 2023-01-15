package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static String readPropertyFile(String value) throws Exception
	{
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\ankit\\eclipse-workspace\\OrangeHRM\\TestData\\config.properties");
		p.load(file);
		return p.getProperty(value);
	}
}
