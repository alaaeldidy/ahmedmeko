package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signinpage extends Pagebase {

	public Signinpage(WebDriver driver) {
		super(driver);
	}

	
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement pass;
	
	
	@FindBy(css="input.button-1.login-button")
	WebElement loginok;
	
	@FindBy(linkText="Log out")
	 public WebElement successlogin;
	
	public void usersignin(String mail,String password) throws InterruptedException  
	{
	Thread.sleep(2000);
	usersenddata(email, mail);
	Thread.sleep(2000);
	usersenddata(pass, password);
	Thread.sleep(2000);
	userpress(loginok);
		
		
		
	}
	
	
	
	
	
}
