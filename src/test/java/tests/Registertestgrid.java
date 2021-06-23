package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import data.Loadpropertiesfile;
import pages.Homepage;
import pages.Registerpage;

public class Registertestgrid extends Testbase2 {

	Homepage  Homeobj;
	Registerpage  Registerobj;
	
	String name=Loadpropertiesfile.userdata.getProperty("Firstname");
	String last=Loadpropertiesfile.userdata.getProperty("Lastname");	
	String mail=Loadpropertiesfile.userdata.getProperty("Email");
	String pass=Loadpropertiesfile.userdata.getProperty("Password");

	
	
	
	
@Test
public void userregistertest() throws InterruptedException
{
	Homeobj=new Homepage(getdriver());
	Homeobj.userpressonregister();
	Registerobj = new Registerpage(getdriver());
	Registerobj.userregister(name, last, mail, pass);
	Assert.assertEquals("Your registration completed",Registerobj.successregister.getText());

}
	
	
	
	
	
	
	
}
