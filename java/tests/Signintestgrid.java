package tests;

import org.testng.annotations.Test;

import data.Loadpropertiesfile;
import pages.Homepage;
import pages.Signinpage;

public class Signintestgrid extends Testbase2 {

	
	Homepage  Homeobj;	
	Signinpage Signinobj;
	
	String mail=Loadpropertiesfile.userdata.getProperty("Email");
	String password=Loadpropertiesfile.userdata.getProperty("Password");	
	
	
	
	
	
	
@Test
public void usersignintest() throws InterruptedException
{
 	Homeobj	= new Homepage(getdriver());
 	Homeobj.userpressonlogin();
 	Signinobj = new Signinpage(getdriver());
 	Signinobj.usersignin(mail, password);

}
	
	
	
	
	
}
