package file_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_utility {
	public String getpropertyfile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/main/resources/common_data/ninja_common.properties");
		Properties obj=new Properties();
		obj.load(fis);
		String data =obj.getProperty(key);
		return data;
		
	}

}
