package ictak.internship.portalpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminDashboard {
	
	WebDriver driver;
	public AdminDashboard(WebDriver driver) {
	this.driver =driver;
	}
	
	public boolean ValidateAdmindashboardtext() {
		boolean validateadmindashboardtext;
		WebElement displayadmindashboardtext = driver.findElement(By.xpath("//h6[text()='ADMIN-Dashboard']"));
		validateadmindashboardtext = displayadmindashboardtext.isDisplayed();
		return validateadmindashboardtext;
	}
	public boolean ValidatHomefield() {
		boolean validatehomefield;
		WebElement enabledhomefield = driver.findElement(By.xpath("//a[text()='Home']"));
		validatehomefield = enabledhomefield.isEnabled();
		return validatehomefield;
	}
	public boolean ValidteMentorForm() {
		boolean validatementorform;
		WebElement enabledmentorform = driver.findElement(By.xpath("//a[text()='Mentor Form']"));
		validatementorform = enabledmentorform.isEnabled();
		return validatementorform;
	}
	public boolean ValidteMentorsfield() {
		boolean validatementorsfield;
		WebElement enabledmentorfield = driver.findElement(By.xpath("//a[text()='Mentors']"));
		validatementorsfield = enabledmentorfield.isEnabled();
		return validatementorsfield;
	}
	public boolean ValidteProjectfield() {
		boolean validateprojectfield;
		WebElement enabledprojectfield = driver.findElement(By.xpath("//a[text()='Projects']"));
		validateprojectfield = enabledprojectfield.isEnabled();
		return validateprojectfield;
	}
	public boolean ValidteLogoutfield() {
		boolean validatelogoutfield;
		WebElement enabledlogoutfield = driver.findElement(By.xpath("//a[text()='Logout']"));
		validatelogoutfield = enabledlogoutfield.isEnabled();
		return validatelogoutfield;
	}
	public void Clickmentorform() {
		WebElement mentorformclick = driver.findElement(By.xpath("//a[text()='Mentor Form']"));
		mentorformclick.click();
	}
	public boolean ValidateAddmentoremailfileld() {
		boolean addmentoremail;
		WebElement validateaddmentoremail = driver.findElement(By.xpath("//input[@name='Email']"));
		addmentoremail = validateaddmentoremail.isDisplayed();
		return addmentoremail;
	}
	public boolean ValidateAddmentorphonefields() {
		boolean addmentorphnnum;
		WebElement validateaddmentrphn = driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
		addmentorphnnum = validateaddmentrphn.isDisplayed();
		return addmentorphnnum;
		
	}
	public boolean ValidateAddmentorsubmittbutton() {
		boolean addmentorsubmitbutton;
		WebElement validateaddmentrsubmitbutton = driver.findElement(By.xpath("//button[text()='SUBMIT']"));
		addmentorsubmitbutton= validateaddmentrsubmitbutton.isEnabled();
		return addmentorsubmitbutton;
	}

	public void ClkMentorsfield() {
		WebElement clickmentors = driver.findElement(By.xpath("//a[text()='Mentors']"));
		clickmentors.click();
	}
	public boolean ValidateMentorinfofield() {
		boolean mentorinfofield;
		WebElement validatmentorinfofield = driver.findElement(By.xpath("//h4[text()='MENTOR INFO']"));
		mentorinfofield= validatmentorinfofield.isDisplayed();
		return mentorinfofield;
	}
	public void ClkProjectfield() {
		WebElement clkprojectfield = driver.findElement(By.xpath("//a[text()='Projects']"));
		clkprojectfield.click();
	}
	public boolean ValidateAddprojectfield() {
		boolean addprojectfield;
		WebElement validateaddprojectfield = driver.findElement(By.xpath("//button[text()='Add Project']"));
		addprojectfield= validateaddprojectfield.isEnabled();
		return addprojectfield;
	}
	public void Clicklogout() {
		WebElement clklogout = driver.findElement(By.xpath("//a[text()='Logout']"));
		clklogout.click();
	}
		
	
}

