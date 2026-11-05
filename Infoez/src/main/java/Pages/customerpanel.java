package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(xpath = "//div [@class='leading-tight']")
	public WebElement Homepage;
	
	@FindBy(xpath = "//input[@data-testid='hero-search-query']")
	public WebElement Businessname;
	
	@FindBy(xpath = "//input[@data-testid='hero-search-location']")
	public WebElement cityname;
	
	@FindBy(xpath = "//button[@data-testid='hero-search-submit']")
	public WebElement searchbtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/div[2]/div/div/a")
	public WebElement businesslistings;
	
	@FindBy(id = "categories")
	public WebElement categories;
	
	@FindBy(xpath = "//*[@id=\"categories\"]/div[2]/a[1]")
	public WebElement Restaurants;
	
	@FindBy(xpath = "//*[@id=\"categories\"]/div[2]/a[2]")
	public WebElement Beautyandspa;
	
	@FindBy(xpath = "//h2[normalize-space()='Featured this week']")
	public WebElement Featuredthisweek;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/section[3]/div/div[2]/a[1]")
	public WebElement ironpeakgym;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/section[3]/div/div[2]/a[2]")
	public WebElement Bloombeautystudio;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/section[4]/div/div[1]/div/h2")
	public WebElement Topratednearyou;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/section[4]/div/div[2]/a[4]")
	public WebElement vedhamart;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/section[4]/div/div[2]/a[7]")
	public WebElement sivamcafe;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/section[5]/div/div[1]/div/h2")
	public WebElement recentlyadded;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/section[5]/div/div[2]/a[1]")
	public WebElement Hotel;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/section[5]/div/div[2]/a[2]")
	public WebElement cafe;
	
	@FindBy(xpath = "//a[@data-testid='cta-add-business']")
	public WebElement addyourbusiness;
	
	@FindBy(xpath = "//a[@href='/pricing' and normalize-space()='See pricing']")
	public WebElement seepricing;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/footer")
	public WebElement footerlinksection;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/footer/div[1]/div[2]/ul/li[1]/a")
	public WebElement Allbusinessesfooterlink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/footer/div[1]/div[2]/ul/li[2]/a")
	public WebElement featuredfooterlink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/footer/div[1]/div[2]/ul/li[3]/a")
	public WebElement Topratedfooterlink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/footer/div[1]/div[3]/ul/li[1]/a")
	public WebElement addyourbusinessfooterlink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/footer/div[1]/div[3]/ul/li[2]/a")
	public WebElement pricingplansfooterlink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/footer/div[1]/div[3]/ul/li[3]/a")
	public WebElement howclaimsworkfooterlink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/footer/div[1]/div[4]/ul/li[1]/a")
	public WebElement howitworksfooterlink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/footer/div[1]/div[4]/ul/li[2]/a")
	public WebElement pricingfooterlink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/footer/div[1]/div[4]/ul/li[3]/a")
	public WebElement contactfooterlink;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div/h1")
	public WebElement Allbusinesses;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div/h1")
	public WebElement Featuredbusinesses;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div/h1")
	public WebElement Topratedbusinesses;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main")
	public WebElement addyourbusinessespage;
	
	@FindBy(xpath = "//input[@required data-testid='register-name']")
	public WebElement fullname;
	
	@FindBy(xpath = "//input[required data-testid='register-email']")
	public WebElement addyourbusinessemail;
	
	@FindBy(xpath = "//input[data-testid='register-phone']")
	public WebElement addyourbusinessphone;
	
	@FindBy(xpath = "//input[data-testid='register-password']")
	public WebElement addyourbusinesspassword;
	
	@FindBy(xpath = "//button[data-testid='register-submit-btn']")
	public WebElement addyourbusinesssignbtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div")
	public WebElement pricingplanpage;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main")
	public WebElement howitworkspage;
	
	@FindBy(xpath = "//a[starts-with(@data-testid,'business-card-')]")
	List<WebElement> businessCards;
	
	//Getters
	public WebElement getsigninbtn() {
		return signinbtn;
	}
	public WebElement getemail() {
		return email;
	}
	public WebElement getpassword() {
		return password;
	}
	public WebElement getsignin() {
		return signin;
	}
	public WebElement getHomepage() {
		return Homepage;
	}
	public WebElement getBusinessname() {
		return Businessname;
	}
	public WebElement getcityname() {
		return cityname;
	}
	public WebElement getsearchbtn() {
		return searchbtn;
	}
	public WebElement getcategories() {
		return categories;
	}
	public WebElement getRestaurants() {
		return Restaurants;
	}
	public WebElement getBeautyandspa() {
		return Beautyandspa;
	}
	public WebElement getFeaturedthisweek() {
		return Featuredthisweek;
	}
	public WebElement getironpeakgym() {
		return ironpeakgym;
	}
	public WebElement getbusinesslistings() {
		return businesslistings;
	}
	public WebElement getBloombeautystudio() {
		return Bloombeautystudio;
	}
	public WebElement getTopratednearyou() {
		return Topratednearyou;
	}
	public WebElement getvedhamart() {
		return vedhamart;
	}
	public WebElement getsivamcafe() {
		return sivamcafe;
	}
	public WebElement getrecentlyadded() {
		return recentlyadded;
	}
	public WebElement getHotel() {
		return Hotel;
	}
	public WebElement getcafe() {
		return cafe;
	}
	public WebElement getaddyourbusiness() {
		return addyourbusiness;
	}
	public WebElement getseepricing() {
		return seepricing;
	}
	public WebElement getfooterlinksection() {
		return footerlinksection;
	}
	public WebElement getAllbusinessesfooterlink() {
		return Allbusinessesfooterlink;
	}
	public WebElement getfeaturedfooterlink() {
		return featuredfooterlink;
	}
	public WebElement getTopratedfooterlink() {
		return Topratedfooterlink;
	}
	public WebElement getaddyourbusinessfooterlink() {
		return addyourbusinessfooterlink;
	}
	public WebElement getpricingplansfooterlink() {
		return pricingplansfooterlink;
	}
	public WebElement gethowclaimsworkfooterlink() {
		return howclaimsworkfooterlink;
	}
	
	public WebElement gethowitworksfooterliink() {
		return howitworksfooterlink;
	}
	public WebElement getpricingfooterlink() {
		return pricingfooterlink;
	}
	public WebElement getcontactfooterlink() {
		return contactfooterlink;
	}
	public WebElement getAllbusinesses() {
		return Allbusinesses;
	}
	public WebElement getFeaturedbusinesses() {
		return Featuredbusinesses;
	}
	public WebElement getTopratedbusinesses() {
		return Topratedbusinesses;
	}
	
	public WebElement getfullname()  {
		return fullname;
	}
	
	public WebElement getaddyourbusinessemail()  {
		return addyourbusinessemail;
	}
	public WebElement getaddyourbusinessphone()  {
		return addyourbusinessphone;
	}
	
	public WebElement getaddyourbusinesspassword()  {
		return addyourbusinesspassword;
	}
	
	public WebElement getaddyourbusinesssignbtn()  {
		return addyourbusinesssignbtn;
	}
	
	public WebElement getaddyourbusinessespage() {
		return addyourbusinessespage;
	}
	public WebElement getpricingplanpage() {
		return pricingplanpage;
	}
	public WebElement gethowitworkspage() {
		return howitworkspage;
	}
	public List<WebElement> getBusinessCards() {
		return businessCards;
	}
	public void scrollToFooter() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
		

}
