package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Pagebase{

	public Homepage(WebDriver driver) {
		super(driver);	
	}

	@FindBy(linkText="Register")
	WebElement registerlink;
	
	
	@FindBy(linkText="Log in")
	WebElement signinlink;
	
	public void userpressonregister() throws InterruptedException
	{
		Thread.sleep(2000);
		userpress(registerlink);
	}
	public void userpressonlogin() throws InterruptedException
	{
		Thread.sleep(2000);
		userpress(signinlink);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
