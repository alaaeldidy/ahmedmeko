package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Loadpropertiesfile {

	
	
public static Properties userdata=Loadpropertiesfile(System.getProperty("user.dir")+"\\src\\test\\java\\data\\userdata.properties")	;

private static Properties Loadpropertiesfile(String path) 
{
	Properties pro=new Properties();
	FileInputStream stream;
	try {
		stream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\data\\userdata.properties");
		pro.load(stream);
	} catch (FileNotFoundException e)
	{
		System.out.println("error"+e.getMessage());
	}
	catch (IOException e) {
		System.out.println("error"+e.getMessage());
	}
	return pro;
}
	
	
	
	
	
	
	
	
}
