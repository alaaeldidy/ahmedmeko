package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import data.Loadpropertiesfile;
import pages.Autosearchpage;
import pages.Productpage;

public class Autosearchtest extends Testbase {


	String pro=Loadpropertiesfile.userdata.getProperty("Product");
	
	
	Autosearchpage Autosearchobj;
	Productpage  Productpobj;
@Test	
public void userautosearchtest() throws InterruptedException
{
	Autosearchobj = new Autosearchpage(driver);
	Autosearchobj.userautosearch(pro);
	Productpobj = new Productpage(driver);
	Assert.assertEquals("Apple MacBook Pro 13-inch",Productpobj.successsearch.getText());

}



	
	
	
	
	
}
