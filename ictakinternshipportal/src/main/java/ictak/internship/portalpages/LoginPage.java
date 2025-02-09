package ictak.internship.portalpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
	}
	WebDriver driver;

	public boolean ValidateEmailfield() {
		WebElement displayemailfield=driver.findElement(By.xpath("//input[@type=\'text\']"));
		return displayemailfield.isDisplayed();
	}
	public boolean ValidatePasswordfield() {
		WebElement displaypasswordfield=driver.findElement(By.xpath("//input[@type='password']"));
		return displaypasswordfield.isDisplayed();
	}
	public boolean ValidateEnableLoggingbutton() {
		WebElement enableloggingbutton=driver.findElement(By.xpath("//button[text()='Log in']"));
		return enableloggingbutton.isEnabled();
	}
	public void SetEmailaddress(String email) {
		WebElement emailaddress=driver.findElement(By.xpath("//input[@type=\'text\']"));
		emailaddress.sendKeys(email);
	
	}
	public void SetPassword(String password) {
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys(password);
	
	}
	public void LogInclick() {
		WebElement logclick=driver.findElement(By.xpath("//button[text()='Log in']"));
		logclick.click();
	
	}
	/* Method for error logging message of Invalid email address and invalid password check */
	public boolean ErrorlogginText() {
		WebElement errorloggin=driver.findElement(By.xpath("//p[text()='Error logging in']"));
		 return errorloggin.isDisplayed();


	}/* Method for error logging message of blank email address check */
	public boolean InvalidEmailaddressText() {
		WebElement invalidemailaddress=driver.findElement(By.xpath("//p[text()='Invalid email address']"));
		return invalidemailaddress.isDisplayed();
		
	}/* Method for error logging message of blank password check */
	public boolean Invalidpassword() {
		WebElement Invalidpassword=driver.findElement(By.xpath("//p[text()='Password must be at least 8 characters']"));
		return Invalidpassword.isDisplayed();
	}
	
}
