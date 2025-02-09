package ictak.internship.portalpages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver3) {
		this.driver = driver3;
	}
	
	/* Method showing Header text" */
	public boolean ShowHeadertext() {
		boolean headertext;
		WebElement displayPageheading = driver.findElement(By.xpath("//div[text()='ICTAK INTERNSHIP PORTAL']"));
		headertext = displayPageheading.isDisplayed();
		return headertext;
	}
	
	/* Method showing text "Build your Career with ICTAK" */
	public boolean ShowBuildCareerMsg() {
		boolean buildcareerMsg;
		WebElement displybuildyourcareerwithictk = driver.findElement(By.xpath("//h2[text()='Build your Career with ICTAK']"));
		buildcareerMsg = displybuildyourcareerwithictk.isDisplayed();
		return buildcareerMsg;
	}
	/* Method showing text "ICTAK Offline Programs: Back to physical sessions" */
	public boolean Showofflinepgrmtext() {
		boolean offlinepgrmtext;
		WebElement txtDisplay_oflinepgrmtext = driver.findElement(By.xpath("//h4[text()='ICTAK Offline Programs: Back to physical sessions']"));
		offlinepgrmtext = txtDisplay_oflinepgrmtext.isDisplayed();
		return offlinepgrmtext;
	}
	/* Method showing 'Welcome to ICTAK' text */
	public boolean ShowWelcometext() {
		boolean welcometext;
		WebElement displayWelcometext = driver.findElement(By.xpath("//h2[text()='Welcome to ICTAK']"));
		welcometext = displayWelcometext.isDisplayed();
		return welcometext;
	}
	/* Method showing 'Enroll now' button */
	public boolean ShowEnrollNowbutton() {
		boolean enrollnowbutton;
		WebElement displayEnrollnowbutton = driver.findElement(By.xpath("//button[text()='Enroll Now']"));
		enrollnowbutton = displayEnrollnowbutton.isEnabled();
		return enrollnowbutton;
		
	}
	/* Method showing 'Home' field */
	public boolean ShowHomeField() {
		boolean homefield;
		WebElement displayhomefield = driver.findElement(By.xpath("//a[text()='Home']"));
		homefield = displayhomefield.isEnabled();
		return homefield;
	}
	/* Method showing 'Student submission' field */
	public boolean ShowStudentsubmissionField() {
		boolean studentsubmission;
		WebElement displaystudentsubmission = driver.findElement(By.xpath("//a[text()='Student Submissions']"));
		studentsubmission = displaystudentsubmission.isEnabled();
		return studentsubmission;
	}
	/* Method showing Login field box */
	public boolean ShowloginField() {
		boolean loginfield;
		WebElement txtloginfield = driver.findElement(By.xpath("//a[text()='Login']"));
		loginfield = txtloginfield.isEnabled();
		return loginfield;
	}
	/* Method  Login field button click */
	public void Loginfieldbuttonclk() {
		WebElement loginfieldbutton=driver.findElement(By.xpath("//a[text()='Login']"));
		loginfieldbutton.click();

	}
	
	

}