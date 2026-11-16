package step;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Baseclass;
import Pages.customerpanel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

    public class stepdefinition extends Baseclass {
	customerpanel p;
	@Given("User launches the browser")
	public void user_launches_the_browser() {
		Baseclass.browserLaunch();
		   Baseclass.maximize();
		   p = new customerpanel(Baseclass.driver);
	}

	@When("User open the Infoez application")
	public void user_open_the_infoez_application() {
		Baseclass.driver.get("https://d2mojgetgp5xie.cloudfront.net/");
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		p.signinbtn.click();
	}

	@When("the user enters username {string}")
	public void the_user_enters_username(String string) {
		p.email.clear();
	    p.email.sendKeys(string);
	}

	@When("The user enter password {string}")
	public void the_user_enter_password(String string) {
		p.password.clear();
	    p.password.sendKeys(string);
	}

	@When("user clicks on signin")
	public void user_clicks_on_signin() {
		p.signin.click();
	}

	@Then("the user redirected to the home page {string}")
	public void the_user_redirected_to_the_home_page(String string) {
		if (string.equals("Invalid1")) {
			Assert.assertTrue("value is not a valid email address: The part after the @-sign is not valid. It should have a period.",p.isHomePageDisplayed());
		}
		else if (string.equals("Invalid2")) {
			Assert.assertTrue("value is not a valid email address: The part after the @-sign is not valid. It should have a period.",p.isHomePageDisplayed());
		}
		else if (string.equals("Invalid3")) {
			Assert.assertTrue("!Please fill out these field.",p.isHomePageDisplayed());
		}
		else if (string.equals("Invalid4")) {
			Assert.assertTrue("!Please include an '@' in the email address, 'asdfgg' is missing an @.",p.isHomePageDisplayed());
		}
		else if (string.equals("Invalid5")) {
			Assert.assertTrue("!Please enter a part of followed by '@'.'@#$$%^^' is incomplete.",p.isHomePageDisplayed());
		}
		else if (string.equals("Valid")) {
			Assert.assertTrue(isDisplayed(p.Homepage));
		}
		
	}
	@Given("User is on home page")
	public void user_is_on_home_page() {
	   Assert.assertTrue(p.getHomepage().isDisplayed());	}

	@When("User clicks on explore")
	public void user_clicks_on_explore() throws InterruptedException {
	   moveToElement(p.explore);
	   click(p.explore);
	   Assert.assertTrue("Explore page not displayed", p.explorepage.isDisplayed());
	}

	@When("User clicks near me")
	public void user_clicks_near_me() throws InterruptedException{
	  moveToElement(p.nearme);
	  click(p.nearme);
	  Assert.assertTrue("Near me page not displayed", p.nearmepage.isDisplayed());
	}

	@When("User clicks Howitworks")
	public void user_clicks_howitworks() throws InterruptedException{
	    moveToElement(p.howitworks);
	    click(p.howitworks);
	    Assert.assertTrue("How it works page not displayed", p.howitworkspage.isDisplayed());
	}

	@When("User clicks pricing")
	public void user_clicks_pricing() {
		moveToElement(p.pricing);
		click(p.pricing);
		Assert.assertTrue("Pricing page not displayed", p.pricingplanpage.isDisplayed());
	 
	}
	@Given("User is on explore page")
	public void user_is_on_explore_page() {
	    Assert.assertTrue("Explore page not displayed",p.getexplorepage().isDisplayed());
	}

	@When("user enters business name {string} in search field")
	public void user_enters_business_name_in_search_field(String string) {
	    p.getexplorebusinessearchield().clear();
	    p.getexplorebusinessearchield().sendKeys(string);
	}

	@When("User enters city {string} in city field")
	public void user_enters_city_in_city_field(String string) {
	   p.getexplorelocationfield().clear();
	   p.getexplorelocationfield().sendKeys(string);
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
	    click(p.getexploresearchbtn());
	}

	@Then("Relevent businesses should be displayed")
	public void relevent_businesses_should_be_displayed() {
	    
	}




    }
	
