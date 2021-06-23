package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends Pagebase {

	public Registerpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="gender-female")
	WebElement gender;
	
	
	@FindBy(id="FirstName")
	WebElement fname;
	
	@FindBy(id="LastName")
	WebElement lname;
	
	

	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confpass;
	
	@FindBy(id="register-button")
	WebElement registerbtn;
	
	
	
//	Your registration completed
	@FindBy(css="div.result")
   public  WebElement successregister;
	
	
	public void userregister(String name,String last,String mail,String passs) throws InterruptedException
	{
	userpress(gender);
	Thread.sleep(2000);
	usersenddata(fname, name);
	Thread.sleep(2000);
	usersenddata(lname, last);
	Thread.sleep(2000);
	usersenddata(email, mail);
	Thread.sleep(2000);
	usersenddata(password, passs);
	Thread.sleep(2000);
	usersenddata(confpass, passs);
	Thread.sleep(2000);
    userpress(registerbtn);
    Thread.sleep(2000);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
