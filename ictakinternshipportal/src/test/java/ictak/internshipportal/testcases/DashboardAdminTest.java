package ictak.internshipportal.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ictak.internship.portalpages.AdminDashboard;
import ictak.internship.portalpages.HomePage;
import ictak.internship.portalpages.LoginPage;

public class DashboardAdminTest extends TestBase{

	LoginPage logobj;
	HomePage homeobj;
	AdminDashboard dashobj;
	
	
	/*  Test cases for Login Page_ */
	/* Validate the presence of Login field */
	@Test (priority = 1)
	public void ValidateLoginfield() {
		homeobj=new HomePage(driver);
		homeobj.Loginfieldbuttonclk();
	}
	/* Method Valid Email address and Valid Password */
	@Test(priority = 2)
	public void PositiveLogin() {
		logobj = new LoginPage(driver);
		logobj.SetEmailaddress("admin@gmail.com");
		logobj.SetPassword("admin@12345");
		logobj.LogInclick();
	}
	/* Test cases for dashboard */
	@Test(priority = 3)
	public void ValidateAdminDashboardtext() {
		boolean validateadmindashboardtext;
		dashobj = new AdminDashboard(driver);
		validateadmindashboardtext = dashobj.ValidateAdmindashboardtext();
		Assert.assertTrue(validateadmindashboardtext, "display_AdminDashboard");
		
	}
	
	@Test(priority = 4)
	public void ValidteHomefield() {
		boolean validatehomefield;
		dashobj = new AdminDashboard(driver);
		validatehomefield = dashobj.ValidatHomefield();
		Assert.assertTrue(validatehomefield, "HOME");
	}
	@Test(priority = 5)
	public void ValidteMentorForm() {
		boolean validatementorform;
		dashobj = new AdminDashboard(driver);
		validatementorform = dashobj.ValidteMentorForm();
		Assert.assertTrue(validatementorform, "MENTOR_FORM");
	}
	@Test(priority = 6)
	public void ValidteMentorsfield() {
		boolean validatementorsfield;
		dashobj = new AdminDashboard(driver);
		validatementorsfield = dashobj.ValidteMentorsfield();
		Assert.assertTrue(validatementorsfield, "MENTORS");
	}
	@Test(priority = 7)
	public void ValidteProjectfield() {
		boolean validateprojectfield;
		dashobj = new AdminDashboard(driver);
		validateprojectfield = dashobj.ValidteProjectfield();
		Assert.assertTrue(validateprojectfield, "PROJECT");
	}
	@Test(priority = 8)
	public void ValidteLogoutfield() {
		boolean validatelogoutfield;
		dashobj = new AdminDashboard(driver);
		validatelogoutfield = dashobj.ValidteLogoutfield();
		Assert.assertTrue(validatelogoutfield, "LOGOUT");
	}
	@Test (priority = 9)
	public void Mentorformclk() {
		dashobj = new AdminDashboard(driver);
		dashobj.Clickmentorform();
		
	}
	@Test (priority = 10)
	public void ValidateAddmentoremailfileld() {
		boolean addmentoremailfield;
		dashobj = new AdminDashboard(driver);
		addmentoremailfield = dashobj.ValidateAddmentoremailfileld();
		Assert.assertTrue(addmentoremailfield);
		
	}
	@Test (priority = 11)
	public void ValidateAddmentorphnfileld() {
		boolean addmentorphonefield;
		dashobj = new AdminDashboard(driver);
		addmentorphonefield = dashobj.ValidateAddmentorphonefields();
		Assert.assertTrue(addmentorphonefield);
		
	}
	@Test (priority = 12)
	public void ValidateAddmentorsubmitt() {
		boolean addmentorsubmitbutton;
		dashobj = new AdminDashboard(driver);
		addmentorsubmitbutton = dashobj.ValidateAddmentorsubmittbutton();
		Assert.assertTrue(addmentorsubmitbutton);
		
	}
	@Test (priority = 13)
	public void Mentorsfieldclk() {
		dashobj = new AdminDashboard(driver);
		dashobj.ClkMentorsfield();
	}
	@Test (priority = 14)
	public void ValidateMentorInfo() {
		boolean validatementorinfo;
		dashobj = new AdminDashboard(driver);
		validatementorinfo = dashobj.ValidateMentorinfofield();
		Assert.assertTrue(validatementorinfo);
		
	}
	@Test (priority = 15)
	public void Prjectfieldclk() {
		dashobj = new AdminDashboard(driver);
		dashobj.ClkProjectfield();
	}
	@Test (priority = 16)
	public void ValidateAddproject() {
		boolean validateaddproject;
		dashobj = new AdminDashboard(driver);
		validateaddproject = dashobj.ValidateAddprojectfield();
		Assert.assertTrue(validateaddproject);
		
	}
	@Test (priority = 17)
	public void Clicklogout(){
		dashobj = new AdminDashboard(driver);
		dashobj.Clicklogout();
	}
	
	
	
		

}
