package tests;

import org.testng.annotations.AfterClass;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class Testbase2 {


	protected ThreadLocal<RemoteWebDriver> driver =null;	
	public static String baseurl="https://demo.nopcommerce.com/";
@BeforeClass
@Parameters(value={"browser"})
public void useropenurl(@Optional("chrome")String browser) throws MalformedURLException
{
	driver=new ThreadLocal<>();
	DesiredCapabilities caps=new DesiredCapabilities()	;
	caps.setCapability("browsername",browser);
    driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps));
    getdriver().navigate().to(baseurl);
	
}	
	
	
	
	
	
	
public  WebDriver getdriver()
{
	 	return driver.get();
}






@AfterClass
public void usercloseurl()
{
	getdriver().quit();
	driver.remove();

}
	
	
	
	
	
}

