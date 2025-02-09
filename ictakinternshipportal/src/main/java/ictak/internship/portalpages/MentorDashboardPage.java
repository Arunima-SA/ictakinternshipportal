package ictak.internship.portalpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MentorDashboardPage {
	
	WebDriver driver;
	
	public MentorDashboardPage(WebDriver driver1) {
	this.driver =driver1;
	}
	
	public boolean ValidateMentordashboardtext() {
		boolean validatementordashboardtext;
		WebElement displaymentordashboardtext = driver.findElement(By.xpath("//h6[text()='ICTAK-Mentor Dashboard']"));
		validatementordashboardtext = displaymentordashboardtext.isDisplayed();
		return validatementordashboardtext;
	}
	public boolean ValidateWelcometext() {
		boolean validatewelcometext;
		WebElement displaywelcometext = driver.findElement(By.xpath("//td[text()='Welcome, ']"));
		validatewelcometext = displaywelcometext.isDisplayed();
		return validatewelcometext;
	}
	public boolean ValidateHomefield() {
		boolean validatehomefield;
		WebElement enabledhomefield = driver.findElement(By.xpath("//a[text()='Home']"));
		validatehomefield = enabledhomefield.isEnabled();
		return validatehomefield;
	}
	public boolean ValidateProfileTable() {
		boolean validateprofiletable;
		WebElement displayprofiletable = driver.findElement(By.xpath("//td[text()='Profile']"));
		validateprofiletable = displayprofiletable.isDisplayed();
		return validateprofiletable;
	}
	public boolean ValidateProfileShowbutton() {
		boolean validateprofileshowbutton;
		WebElement enabledprofiletable = driver.findElement(By.xpath("//button[text()='SHOW']"));
		validateprofileshowbutton = enabledprofiletable.isEnabled();
		return validateprofileshowbutton;
	}
	public void ClickShowbutton() {

		WebElement enabledprofiletable = driver.findElement(By.xpath("//button[text()='SHOW']"));
		enabledprofiletable.click();
	}
	
	public boolean ValidateBottomField() {
		boolean validatebottomfield;
		WebElement displaybottomfield = driver.findElement(By.xpath("//p[text()='G1, Ground Floor, Thejaswini, Technopark Campus']"));
		validatebottomfield = displaybottomfield.isDisplayed();
		return validatebottomfield;
	}
	public boolean ValidateHideButton() {
		boolean validatehidebutton;
		WebElement enabledhidebutton = driver.findElement(By.xpath("//button[text()='HIDE']"));
		validatehidebutton = enabledhidebutton.isEnabled();
		return validatehidebutton;
	}
	public boolean ValidateAllottedprojectfield() {
		boolean validateallottedprojectfield;
		WebElement displayallottedprojectfield = driver.findElement(By.xpath("//h5[text()='Allotted Projects']"));
		validateallottedprojectfield = displayallottedprojectfield.isDisplayed();
		return validateallottedprojectfield;
	}
	public boolean ValidateReferenceMaterialField() {
		boolean validatereferencematerialfield;
		WebElement enabledreferencematerialfield = driver.findElement(By.xpath("//a[text()='Reference Material']"));
		validatereferencematerialfield = enabledreferencematerialfield.isEnabled();
		return validatereferencematerialfield;
	}
	public void ClkReferenceMaterial() {
		WebElement clickreferencematerial = driver.findElement(By.xpath("//a[text()='Reference Material']"));
		clickreferencematerial.click();
		
	}
	public boolean ValidateAddMaterialField() {
		boolean validateaddmaterialfield;
		WebElement enabledaddmaterialfield = driver.findElement(By.xpath("//button[text()='Add Material']"));
		validateaddmaterialfield = enabledaddmaterialfield.isEnabled();
		return validateaddmaterialfield;
	}
	public void ClickAddMaterialField() {
	
		WebElement clickaddmaterialfield = driver.findElement(By.xpath("//button[text()='Add Material']"));
		clickaddmaterialfield.click();
	}
	public void ClickCancelfield() {
		
		WebElement clickcancelfield = driver.findElement(By.xpath("//button[text()='Cancel']"));
		clickcancelfield.click();
	
	}
	public boolean ValidateDeletebutton() {
		boolean validatedeletebutton;
		WebElement enableddeletebutton = driver.findElement(By.xpath("(//button[text()='Delete'])[1]"));
		validatedeletebutton = enableddeletebutton.isEnabled();
		return validatedeletebutton;
		
	}
	
	public boolean ValidateLogoutField() {
		boolean validatelogoutfield;
		WebElement enabledrelogoutfield = driver.findElement(By.xpath("//a[text()='Logout']"));
		validatelogoutfield = enabledrelogoutfield.isEnabled();
		return validatelogoutfield;
	}
	public void ClkLogoutField() throws InterruptedException {
		WebElement enabledrelogoutfield = driver.findElement(By.xpath("//a[text()='Logout']"));
		enabledrelogoutfield.click();
		
	}
	
	
	
	
	
	
	
}
