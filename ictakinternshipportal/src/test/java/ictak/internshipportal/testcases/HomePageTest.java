package ictak.internshipportal.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import ictak.internship.portalpages.HomePage;

public class HomePageTest extends TestBase {

		HomePage homeObj;
		
		//*  Test cases Homepage_validations  *//
		
		/*  verify that Header text "ICTAK INTERNSHIP PORTAL" is displayed or not =True */
		@Test(priority = 1)
		public void VerifyHeadertext() {
			boolean headertext;
			homeObj = new HomePage(driver);
			headertext = homeObj.ShowHeadertext();
			Assert.assertTrue(headertext);

		}
		/*  verify the text "Build your career with ICTAK"  is displayed or not =True */
		@Test(priority = 2)
		public void Verifybuildcarrertext() {
			boolean buildcarrertext;
			homeObj = new HomePage(driver);
			buildcarrertext = homeObj.ShowBuildCareerMsg();
			Assert.assertTrue(buildcarrertext);
		}
		/*  verify the text "ICTAK Offline Programs: Back to physical sessions" is displayed or not =True */
		@Test(priority = 3)
		public void Verifyofflinepgrmtext() {
			boolean offlinepgrmtext;
			homeObj = new HomePage(driver);
			offlinepgrmtext = homeObj.Showofflinepgrmtext();
			Assert.assertTrue(offlinepgrmtext);
		}
		
		/*  verify the 'Welcome to ICTAK' text is displayed or not =True */
		@Test(priority = 4)
		public void VerifyWelcometext() {
			boolean welcometext;
			homeObj = new HomePage(driver);
			welcometext = homeObj.ShowloginField();
			Assert.assertTrue(welcometext);
		}
		/*  verify the 'Home' field is displayed or not =True */
		@Test(priority = 5)
		public void VerifyHomefield() {
			boolean homefield;
			homeObj = new HomePage(driver);
			homefield = homeObj.ShowHomeField();
			Assert.assertTrue(homefield);
		}
		/*  verify the 'Student submission' field is displayed or not =True */
		@Test(priority = 6)
		public void VerifyStudentsubmissionfield() {
			boolean studentsubmissionfield;
			homeObj = new HomePage(driver);
			studentsubmissionfield = homeObj.ShowStudentsubmissionField();
			Assert.assertTrue(studentsubmissionfield);
		}
		/*  verify the 'Login field' is displayed or not =True */
		@Test(priority = 7)
		public void VerifyloginField() {
			boolean loginfield;
			homeObj = new HomePage(driver);
			loginfield = homeObj.ShowloginField();
			Assert.assertTrue(loginfield);
		}
		
		
		

		
		

}
		