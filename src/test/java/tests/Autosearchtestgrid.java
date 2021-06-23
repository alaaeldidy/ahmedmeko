package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import data.Loadpropertiesfile;
import pages.Autosearchpage;
import pages.Productpage;

public class Autosearchtestgrid extends Testbase2 {


	String pro=Loadpropertiesfile.userdata.getProperty("Product");
	
	
	Autosearchpage Autosearchobj;
	Productpage  Productpobj;
@Test	
public void userautosearchtest() throws InterruptedException
{
	Autosearchobj = new Autosearchpage(getdriver());
	Autosearchobj.userautosearch(pro);
	Productpobj = new Productpage(getdriver());
	Assert.assertEquals("Apple MacBook Pro 13-inch",Productpobj.successsearch.getText());

}



	
	
	
	
	
}
