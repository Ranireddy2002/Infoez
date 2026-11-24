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
	@FindBy(xpath = "//button[@data-testid = 'header-signin-btn']")
	public WebElement signinbtn;
	
	@FindBy(xpath = "//input[@id = 'email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@data-testid='login-password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@data-testid = 'login-submit-btn']")
	public WebElement signin;
	
	@FindBy(xpath = "//div [@class='leading-tight']")
	public WebElement Homepage;
	
	@FindBy(xpath = "//input[@data-testid='hero-search-query']")
	public WebElement Businessname;
	
	@FindBy(xpath = "//input[@data-testid='hero-search-location']")
	public WebElement cityname;
	
	@FindBy(xpath = "//button[@data-testid='hero-search-submit']")
	public WebElement searchbtn;
	
	@FindBy(id = "categories")
	public WebElement categories;
	
	@FindBy(xpath = "//a[@data-testid='cta-add-business']")
	public WebElement addyourbusiness;
	
	@FindBy(xpath = "//a[@href='/pricing' and normalize-space()='See pricing']")
	public WebElement seepricing;
	
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
	public List<WebElement> businessCards;
	
	@FindBy(xpath = "//a[@data-testid='nav-explore']")
	public WebElement explore;
	
	@FindBy(xpath = "//a[@data-testid = 'nav-near-me']")
	public WebElement nearme;
	
	@FindBy (xpath = "//a[@data-testid = 'nav-how-it-works']")
	public WebElement howitworks;
	
	//@FindBy (xpath = "//a[@data-testid = 'nav-pricing']")
	//public WebElement pricing;
	
	@FindBy(xpath = "//input[@data-testid='search-query-input']")
	public WebElement explorebusinessearchield;
	
	@FindBy(xpath = "//input[@data-testid='search-location-input']")
	public WebElement explorelocationfield;
	
	@FindBy(xpath = "//button[@data-testid='filter-category']")
	public WebElement exploresearchbtn;
	
	@FindBy(xpath = "//button[@data-testid='filter-category']")
	public WebElement filtercategory;
	
	@FindBy(xpath = "//button[@data-testid='filter-min-rating']")
	public WebElement filtermin;
	
	@FindBy(xpath = "//input[@data-testid='filter-verified']")
	public WebElement filterverifiedonly;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/header/div/nav/a[1]")
	public WebElement explorepage;
	
	@FindBy(xpath = "//*[normalize-space()='4.0+']")
	public WebElement rating4;
	
	@FindBy(xpath = "//button[@data-testid = 'map-locate-btn']")
	public WebElement usemylocationbtn;
	
	@FindBy(xpath = "//input[@data-testid = 'map-search-input']")
	public WebElement  searchnearby;
	
	//@FindBy(xpath = "//button[@data-testid = 'map-category']")
	//public WebElement allcategoriesbtn;
	
	@FindBy(xpath = "//button[@data-testid = 'map-radius']")
	public WebElement withinKMbtn;
	
	@FindBy(xpath = "//button[@data-testid = 'map-apply-btn']")
	public WebElement mapapplybtn;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/main/div")
	public WebElement nearmepage;
	
	@FindBy (xpath = "//div[@data-title and normalize-space()='Welcome back!']")
	public WebElement Welcomeback;
	
	@FindBy (xpath = "//a[contains(@class,'group') and contains(.,'Mira Studio')]")
	public WebElement mirastudio;
	
	@FindBy (xpath = "//a[contains(@data-testid,'business-card') and contains(.,'Aroma cafe')]")
	public WebElement Aromacafe;
	
	@FindBy (xpath = "//h3[normalize-space()='No businesses found']")
	public WebElement Nobusinessesfound;
	
	@FindBy (xpath = "//a[starts-with(@data-testid,'business-card-')]")
	public WebElement businesscard;
	
	@FindBy(xpath = "//span[text()='Home Services']")
	public WebElement homeservices;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/aside/div[2]/div[1]/button/svg")
	public WebElement recentlyadded;
	
	@FindBy(xpath = "//span[@data-testid='filter-category']/ancestor::button")
	public WebElement filtercategory1;
	
	@FindBy(xpath = "//span[normalize-space()='Top rated']")
	public WebElement toprated;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/aside/div[2]/div[2]/button" )
	public WebElement filtersort;
	
	@FindBy(xpath = "//input[@data-testid = 'map-search-input']")
	public WebElement nearmesearchnearby;
	
	@FindBy(xpath = "//button[@data-testid = 'map-category']")
	public WebElement nearmecategory;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/div[1]")
	public WebElement searchverifiedlocals;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/div[2]")
	public WebElement trustthebadge;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/div[3]")
	public WebElement sendenquiries;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]/div[4]")
	public WebElement rateandreview;
	
	@FindBy(xpath = "//a[normalize-space()='Start exploring']")
	public WebElement startexploring;
	
	@FindBy(xpath = "//a[normalize-space()='List your business']")
	public WebElement listyourbusiness;
	
	@FindBy(xpath = "//h1[normalize-space()='Create your account']")
	public WebElement listyourbusinesspage;
	
	@FindBy(xpath = "//a[@href='/pricing']")
	public WebElement pricing;
	
	@FindBy(xpath = "//h1[normalize-space()='Choose your plan']")
	public WebElement pricingpage;
	
	@FindBy(xpath = "//h3[text()='Free']")
	public WebElement freeplan;
	
	@FindBy(xpath = "//h3[text()='Starter']")
	public WebElement starterplan;
	
	@FindBy(xpath = "//h3[text()='Pro']")
	public WebElement proplan;
	
	@FindBy(xpath = "//h3[text()='Enterprise']")
	public WebElement enterpriceplan;
	
	@FindBy (xpath="//button[text()='Choose plan']")
	public WebElement chooseplan;
	
	@FindBy(xpath = "//*[@id=\"radix-:r3:\"]")
	public WebElement customerprofilebtn;
	
	public WebElement getcustomerprofilebtn() {
		return customerprofilebtn;
	}
	
	@FindBy(xpath = "//div[@data-testid = 'menu-profile']")
	public WebElement menuprofile;
	
	public WebElement getmenuprofile() {
		return menuprofile;
	}
	@FindBy(xpath = "//div[@data-testid = 'menu-favorites']")
	public WebElement favorites;
	
	public WebElement getfavorites() {
		return favorites;
	}
	@FindBy(xpath = "//div[@data-testid = 'menu-reviews']")
	public WebElement reviews;
	
	public WebElement getreviews() {
		return reviews;
	}
	@FindBy(xpath = "//div[@data-testid = 'menu-enquiries']")
	public WebElement enquiries;
	
	public WebElement getenquiries() {
		return enquiries;
	}
	@FindBy(xpath = "//div[@data-testid = 'menu-notifications']")
	public WebElement notifications;
	
	public WebElement getnotifications() {
		return notifications;
	}
	@FindBy(xpath = "//div[@role='menuitem'and normalize-space()='Subscription']")
	public WebElement subscription;
	
	public WebElement getsubscription() {
		return subscription;
	}
	@FindBy(xpath = "//div[@data-testid = 'menu-logout']")
	public WebElement Logout;
	
	public WebElement getLogout() {
		return Logout;
	}
	@FindBy(xpath = "//label[normalize-space()='Email']/following::input[1]")
	public WebElement profileemail;
	
	public WebElement getprofileemail() {
		return profileemail;
	}
	@FindBy(xpath = "//label[normalize-space()='Email']/following::input[2]")
	public WebElement profilerole;
	
	public WebElement getprofilerole() {
		return profilerole;
	}
	@FindBy(xpath = "//input[@data-testid = 'profile-name']")
	public WebElement profilename;
	
	public WebElement getprofilename() {
		return profilename;
	}
	@FindBy(xpath = "//input[@data-testid = 'profile-number']")
	public WebElement profilenumber;
	
	public WebElement getprofilenumber() {
		return profilenumber;
	}
	@FindBy(xpath = "//input[@data-testid = 'profile-avatar']")
	public WebElement profileavatar;
	
	public WebElement getprofileavatar() {
		return profileavatar;
	}
	@FindBy(xpath = "//button[@data-testid = 'profile-save-btn']")
	public WebElement profilesavebtn;
	
	public WebElement getprofilesavebtn() {
		return profilesavebtn;
	}
	@FindBy(xpath = "//h1[normalize-space()='Your favorites']")
	public WebElement favoritepage;
	
	public WebElement getfavoritepage() {
		return favoritepage;
	}
	
	//Getters
	public WebElement getchooseplan() {
		return chooseplan;
	}
	public WebElement getenterpriceplan() {
		return enterpriceplan;
	}
	public WebElement getproplan() {
		return proplan;
	}
	public WebElement getstarterplan() {
		return starterplan;
	}
	public WebElement getfreeplan() {
		return freeplan;
	}
	public WebElement getpricingpage() {
		return pricingpage;
	}
	public WebElement getlistyourbusinesspage() {
		return listyourbusinesspage;
	}
	public WebElement getlistyourbusiness() {
		return listyourbusiness;
	}
	public WebElement getstartexploring() {
		return startexploring;
	}
	public WebElement getrateandreview() {
		return rateandreview;
	}
	public WebElement getsendenquiries() {
		return sendenquiries;
	}
	public  WebElement gettrustthebadge() {
		return trustthebadge;
	}
	public WebElement getsearchverifiedlocals() {
		return searchverifiedlocals;
	}
	public WebElement getnearmecategory() {
		return nearmecategory;
	}
	public WebElement getnearmesearchnearby() {
		return nearmesearchnearby;
	}
	public WebElement getfiltercategory1() {
		return filtercategory1;
	}
	public WebElement gettoprated() {
		return toprated;
	}
	public WebElement getrecentlyadded() {
		return recentlyadded;
	}
	public WebElement gethomeservices() {
		return homeservices;
	}
	public WebElement getbusinesscard() {
		return businesscard;
	}
	public WebElement getNobusinessesfound() {
		return Nobusinessesfound;
	}
	public WebElement getAromacafe() {
		return Aromacafe;
	}
	public WebElement getmirastudio() {
		return mirastudio;
	}
	public WebElement Welcomeback() {
		return Welcomeback;
	}
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
	
	public WebElement getaddyourbusiness() {
		return addyourbusiness;
	}
	public WebElement getseepricing() {
		return seepricing;
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
	public WebElement getexplore() {
		return explore;
	}
	public WebElement getexplorebusinessearchield() {
		return explorebusinessearchield;
	}
	public WebElement getexplorelocationfield() {
		return explorelocationfield;
	}
	public WebElement getexploresearchbtn() {
		return exploresearchbtn;
	}
	public WebElement getfiltercategory() {
		return filtercategory;
	}
	public WebElement getfiltersort() {
		return filtersort;
	}
	public WebElement getfiltermin() {
		return filtermin;
	}
	
	public WebElement getfilterverifiedonly() {
		return filterverifiedonly;
	}
	public WebElement getexplorepage() {
		return explorepage;
	}	
	
	public WebElement getrating4() {
		return rating4;
	}
	public WebElement getnearme() {
		return nearme;
	}
	public WebElement getusemylocationbtn() {
		return usemylocationbtn;
	}
	public WebElement getsearchnearby() {
		return searchnearby;
	}
	//public WebElement getallcategoriesbtn() {
		//return allcategoriesbtn;
	//}
	public WebElement getwithinKMbtn() {
		return withinKMbtn;
	}
	
	public WebElement getnearmepage() {
		return nearmepage;
	}
	public WebElement getmapapplybtn() {
		return mapapplybtn;
	}
	
	public WebElement gethowitworks() {
		return howitworks;
	}
	
	public boolean isHomePageDisplayed() {
		return signin.isDisplayed();
		
	}
	public WebElement getpricing() {
		return pricing;
	}

}
