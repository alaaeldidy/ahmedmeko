package tests;

import org.testng.annotations.Test;

import data.Loadpropertiesfile;
import pages.Homepage;
import pages.Signinpage;

public class Signintest extends Testbase {

	
	Homepage  Homeobj;	
	Signinpage Signinobj;
	
	String mail=Loadpropertiesfile.userdata.getProperty("Email");
	String password=Loadpropertiesfile.userdata.getProperty("Password");	
	
	
	
	
	
	
@Test
public void usersignintest() throws InterruptedException
{
 	Homeobj	= new Homepage(driver);
 	Homeobj.userpressonlogin();
 	Signinobj = new Signinpage(driver);
 	Signinobj.usersignin(mail, password);

}
	
	
	
	
	
}
