package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class customerpanel {
	WebDriver driver;
	WebDriverWait wait;
	public customerpanel(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[@data-testid='header-signin-btn']")
	public WebElement signinbtn;
	
	@FindBy(xpath = "//input[@type='email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement signin;
	
	
	

}
