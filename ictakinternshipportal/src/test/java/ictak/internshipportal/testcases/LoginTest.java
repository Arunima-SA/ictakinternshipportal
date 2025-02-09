package ictak.internshipportal.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ictak.internship.portalpages.HomePage;
import ictak.internship.portalpages.LoginPage;

public class LoginTest extends TestBase{
	LoginPage logobj;
	HomePage homeobj;
	
	
	
	/*  Test cases for Login Page_ */
	/* Validate the presence of Login field */
	@Test (priority = 1)
	public void ValidateLoginfield() {
		homeobj=new HomePage(driver);
		homeobj.Loginfieldbuttonclk();
	}
	
	
	/* Validate the presence of Email field */
	@Test (priority = 2)
	public void Validateemailfield() {
		logobj=new LoginPage(driver);
		boolean displayemailfield = logobj.ValidateEmailfield();
		Assert.assertTrue(displayemailfield, "emailfield displayed");
		
	}
	
	/* Validate the presence of Password field */
	@Test (priority = 3)
	public void ValidatePasswordfield() {
		logobj =new LoginPage(driver);
		boolean displaypasswordfield=logobj.ValidatePasswordfield();
		Assert.assertTrue(displaypasswordfield,"password field displayed");
		
	}
	
	/* Validate the Logging button enable or not*/
	@Test (priority = 4)
	public void ValidateEnabilityofLoggingbutton() {
		logobj =new LoginPage(driver);
		boolean enabledloginbutton=logobj.ValidateEnableLoggingbutton();
		Assert.assertTrue(enabledloginbutton,"loggin button enabled");
		
	}
	
	/*  Test cases for Login Page_Enter Email address and password of admin */
	
	/* Method Invalid Email address and Valid Password */
	@Test(priority = 5)
	public void NegativeLoginFirst() {
		logobj = new LoginPage(driver);
		logobj.SetEmailaddress("Admin@gmail.com");
		logobj.SetPassword("admin@12345");
		logobj.LogInclick();
		logobj.ErrorlogginText();
	
	}
	/* Method Valid Email address and Invalid Password */
	@Test(priority = 6)
	public void NegativeLoginSecond() {
		logobj = new LoginPage(driver);
		logobj.SetEmailaddress("admin@gmail.com");
		logobj.SetPassword("Admin@12345");
		logobj.LogInclick();
		logobj.ErrorlogginText();
	}
	/* Method Invalid Email address and Invalid Password */
	@Test(priority = 7)
	public void NegativeLoginThird() {
		logobj = new LoginPage(driver);
		logobj.SetEmailaddress("Admin@gmail.com");
		logobj.SetPassword("Admin@12345");
		logobj.LogInclick();
		logobj.ErrorlogginText();
		
	}
	/* Method Blank Email address field and Valid Password */
	@Test(priority = 8)
	public void NegativeLoginforth() {
		logobj = new LoginPage(driver);
		logobj.SetEmailaddress(" ");
		logobj.SetPassword("admin@12345");
		logobj.LogInclick();
		logobj.InvalidEmailaddressText();
	}
	/* Method Valid Email address and Blank Password field */
	@Test(priority = 9)
	public void NegativeLoginFifth() {
		logobj = new LoginPage(driver);
		logobj.SetEmailaddress("admin@gmail.com");
		logobj.SetPassword(" ");
		logobj.LogInclick();
		logobj.Invalidpassword();
	}
	/* Method Both Email address and Password field are blanks */
	@Test(priority = 10)
	public void NegativeLoginSixth() {
		logobj = new LoginPage(driver);
		logobj.SetEmailaddress(" ");
		logobj.SetPassword(" ");
		logobj.LogInclick();
		logobj.InvalidEmailaddressText();
	}
	/* Method Valid Email address and Valid Password */
	@Test(priority = 11)
	public void PositiveLogin() {
		logobj = new LoginPage(driver);
		logobj.SetEmailaddress("admin@gmail.com");
		logobj.SetPassword("admin@12345");
		logobj.LogInclick();
	}
	

}
