package ictak.internshipportal.testcases;

import org.testng.annotations.Test;

import ictak.internship.portalpages.LoginPage;

public class LoginPagemntrTest {
	public class LoginTest extends TestBase{
		LoginPage logobj;
		/*  Test cases for Login Page_Enter Email address and password of 'Mentor' */
		
		/* Method Invalid Email address and Valid Password */
		@Test(priority = 1)
		public void NegativeLoginFirstmntr() {
			logobj = new LoginPage(driver);
			logobj.SetEmailaddress("Adon@gmail.com");
			logobj.SetPassword("adon123456");
			logobj.LogInclick();
			logobj.ErrorlogginText();
		}
		/* Method Valid Email address and Invalid Password */
		@Test(priority = 2)
		public void NegativeLoginSecondmntr() {
			logobj = new LoginPage(driver);
			logobj.SetEmailaddress("adon@gmail.com");
			logobj.SetPassword("Adon123456");
			logobj.LogInclick();
			logobj.ErrorlogginText();
		}
		/* Method Invalid Email address and Invalid Password */
		@Test(priority = 3)
		public void NegativeLoginThirdmntr() {
			logobj = new LoginPage(driver);
			logobj.SetEmailaddress("Adon@gmail.com");
			logobj.SetPassword("Adon123456");
			logobj.LogInclick();
			logobj.ErrorlogginText();
		}
		/* Method Blank Email address field and Valid Password */
		@Test(priority = 4)
		public void NegativeLoginforthmntr() {
			logobj = new LoginPage(driver);
			logobj.SetEmailaddress(" ");
			logobj.SetPassword("adon123456");
			logobj.LogInclick();
			logobj.InvalidEmailaddressText();
		}
		/* Method Valid Email address and Blank Password field */
		@Test(priority = 5)
		public void NegativeLoginFifthmntr() {
			logobj = new LoginPage(driver);
			logobj.SetEmailaddress("adon@gmail.com");
			logobj.SetPassword(" ");
			logobj.LogInclick();
			logobj.Invalidpassword();
		}
		/* Method Both Email address and Password field are blanks */
		@Test(priority = 6)
		public void NegativeLoginSixthmntr() {
			logobj = new LoginPage(driver);
			logobj.SetEmailaddress(" ");
			logobj.SetPassword(" ");
			logobj.LogInclick();
			logobj.InvalidEmailaddressText();
		}
		/* Method Valid Email address and Valid Password */
		@Test(priority = 7)
		public void PositiveLoginmntr() {
			logobj = new LoginPage(driver);
			logobj.SetEmailaddress("adon@gmail.com");
			logobj.SetPassword("adon123456");
			logobj.LogInclick();
		
	}

	}
	
		

}
