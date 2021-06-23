package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pagebase {

	public WebDriver driver;
	
	public Pagebase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void usersenddata(WebElement ele,String txt)
	{
	ele.sendKeys(txt);	
		
	}
	public void userpress(WebElement ele)
	{
		ele.click();
		
	}
	public void scrolldown()
	{
		JavascriptExecutor jse=  (JavascriptExecutor) driver;
		jse.executeScript("SCROLLDown(0,3000)");
	}
	
	
	
	
	
	
	
}
