package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.LoginPage;

public class LoginpageTest extends Baseclass {
	LoginPage login;

//	public LoginpageTest() {
//
//		Baseclass.initlization();
//		login = new LoginPage();
//
//	}

	@Test
	public void LoginpageFunctinality() {
		Baseclass.initlization();
		login = new LoginPage();
		//LoginpageTest lp = new LoginpageTest();
		login.usernameEnter(prop.getProperty("username"));
		login.passEnter(prop.getProperty("password"));
		login.clickonLoginbutton();

	}

	//@AfterMethod
	//public void tearDown() {
		//driver.close();
	//}

}
