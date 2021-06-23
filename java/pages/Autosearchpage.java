package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Autosearchpage extends Pagebase {

	public Autosearchpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="small-searchterms")
	WebElement searchtxt;
	
     @FindBy(id="ui-id-1")
	List<WebElement> autosearch;
	
	
	
	public void userautosearch(String pro) throws InterruptedException
	{
	usersenddata(searchtxt, pro);
	Thread.sleep(2000);
	autosearch.get(0).click();
	
		
		
	}

	
	
	
	
	
}
