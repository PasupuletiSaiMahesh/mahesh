package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertitesUtility 
{
	public String getDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream fis=new  FileInputStream(IpathUtility.Propertiespath);
		Properties prop=new Properties();
		prop.load(fis);
		String value =prop.getProperty(key);
		return value;		
	}

}
