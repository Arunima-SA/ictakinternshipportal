package ictak.internshipportal.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ictak.internship.portalpages.HomePage;
import ictak.internship.portalpages.LoginPage;
import ictak.internship.portalpages.MentorDashboardPage;

public class MentorDashboardTest extends TestBase {
	LoginPage logobj;
	HomePage homeobj;
	MentorDashboardPage dashobj;
	
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
		logobj.SetEmailaddress("adon@gmail.com");
		logobj.SetPassword("adon123456");
		logobj.LogInclick();
		
	}
	@Test(priority = 3)
	public void ValidateMentorDashboardtext() {
		
	    boolean validatementordashbordtext;
		dashobj = new MentorDashboardPage(driver);
		validatementordashbordtext = dashobj.ValidateMentordashboardtext();
		Assert.assertTrue(validatementordashbordtext, "ICTAK_Mentor_Dashboard");
	}
	
	@Test(priority = 4)
public void ValidateHomefield() {
		
	    boolean validatehomefield;
		dashobj = new MentorDashboardPage(driver);
		validatehomefield= dashobj.ValidateHomefield();
		Assert.assertTrue(validatehomefield, "Home");
	}
	@Test(priority = 5)
	public void ValidateWelcometext() {
		
	    boolean validatewelcometext;
		dashobj = new MentorDashboardPage(driver);
		validatewelcometext = dashobj.ValidateWelcometext();
		Assert.assertTrue(validatewelcometext, "Welcome,Adon !!!");
	}
	@Test(priority = 6)
	public void ValidateProfiletable() {
		
	    boolean validateprofiletable;
		dashobj = new MentorDashboardPage(driver);
		validateprofiletable = dashobj.ValidateProfileTable();
		Assert.assertTrue(validateprofiletable, "Profile");
	}
	@Test(priority = 7)
	public void ValidateProfileshowbutton() {
		
	    boolean validateprofileshowbutton;
		dashobj = new MentorDashboardPage(driver);
		validateprofileshowbutton = dashobj.ValidateProfileShowbutton();
		Assert.assertTrue(validateprofileshowbutton, "SHOW");
	}
	@Test(priority = 8)
	public void Clickshowbutton() {
		
		dashobj = new MentorDashboardPage(driver);
		dashobj.ClickShowbutton();
		
	}
	
	
	@Test(priority = 9)
	public void ValidateHideButton(){
		
	    boolean validatehidebutton;
		dashobj = new MentorDashboardPage(driver);
		validatehidebutton= dashobj.ValidateHideButton();
		Assert.assertTrue(validatehidebutton, "Hide");
	}
	@Test(priority = 10)
	public void ValidateBottomField(){
		
	    boolean validatebottomfield;
		dashobj = new MentorDashboardPage(driver);
		validatebottomfield= dashobj.ValidateBottomField();
		Assert.assertTrue(validatebottomfield, "G1, Ground Floor, Thejaswini, Technopark Campus");
	}
	@Test(priority = 11)
	public void ValidateAllottedprojectfield(){
		
	    boolean validateallottedprojectfield;
		dashobj = new MentorDashboardPage(driver);
		validateallottedprojectfield= dashobj.ValidateAllottedprojectfield();
		Assert.assertTrue(validateallottedprojectfield, "Allotted Projects");
	}
	@Test(priority = 12)
	public void ValidateReferenceMateriaField(){
		
	    boolean validatereferencematerialfield;
		dashobj = new MentorDashboardPage(driver);
		validatereferencematerialfield = dashobj.ValidateReferenceMaterialField();
		Assert.assertTrue(validatereferencematerialfield, "ReferenceMaterial");
	}
	@Test(priority = 13)
	public void ClickReferenceMaterial(){
		
		dashobj = new MentorDashboardPage(driver);
		dashobj.ClkReferenceMaterial();
	}
	@Test(priority = 14)
	public void ValidateAddMaterialField(){
		
	    boolean validateaddmaterialfield;
		dashobj = new MentorDashboardPage(driver);
		validateaddmaterialfield = dashobj.ValidateAddMaterialField();
		Assert.assertTrue(validateaddmaterialfield, "Add Material");
	}
	
	@Test(priority = 15)
	public void ValidateDeletebutton() {
		
	    boolean validatedeletebutton;
		dashobj = new MentorDashboardPage(driver);
		validatedeletebutton = dashobj.ValidateDeletebutton();
		Assert.assertTrue(validatedeletebutton, "Delete");
		
	}
	@Test(priority = 16)
	public void ClickAddMaterialField() throws InterruptedException{
		
		dashobj = new MentorDashboardPage(driver);
		dashobj.ClickAddMaterialField();
		
		Thread.sleep(2000);
	
	}
	@Test(priority = 17)
	public void ClickCancelfield() {
		
		dashobj = new MentorDashboardPage(driver);
		dashobj.ClickCancelfield();
	}
	
	
	@Test(priority = 18)
	public void ValidateLogoutField(){
		
	    boolean validaterelogoutfield;
		dashobj = new MentorDashboardPage(driver);
		validaterelogoutfield= dashobj.ValidateLogoutField();
		Assert.assertTrue(validaterelogoutfield, "Logout");
	}
	
	@Test(priority = 19)
	public void ClickLogoutField() throws InterruptedException {
		
		dashobj = new MentorDashboardPage(driver);
		dashobj.ClkLogoutField();
		
		
	}

}
