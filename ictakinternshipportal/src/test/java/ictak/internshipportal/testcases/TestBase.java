package ictak.internshipportal.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	WebDriver driver;
	@BeforeTest 
	public void SetConfig(){
		driver = new ChromeDriver();
		driver.get("https://quiet-dasik-c4c3a7.netlify.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	}
	/* After test and browser close */
	@AfterTest
	public void browserQuit() {
		driver.close();
	}
	
}
