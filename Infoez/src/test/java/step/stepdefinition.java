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
	@Then("Explore page should be displayed")
	public void explore_page_should_be_displayed() {
	    Assert.assertTrue("Explore page not displayed", p.explorepage.isDisplayed());
	}
	@Given("User is clicks the explore page")
	public void user_is_clicks_the_explore_page() {
	    click(p.explorepage);
	}
 

	@When("user enters {string} in search field")
	public void user_enters_in_search_field(String businessname) {
	    WebDriverWait wait = new WebDriverWait(Baseclass.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(p.explorebusinessearchield));
	    p.explorebusinessearchield.clear();
	    p.explorebusinessearchield.sendKeys(businessname);
	}

	@When("User enters {string} in city field")
	public void user_enters_in_city_field(String city) {
		p.explorelocationfield.clear();
		p.explorelocationfield.sendKeys(city);
	    
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
	    p.exploresearchbtn.click();
	}

	@Then("Search results should be {string} for {string}")
	public void search_results_should_be_for(String Results, String Businessname) {
	   if (Results.equalsIgnoreCase("Valid")) {
		   if (Businessname.isEmpty()) {
			   Assert.assertTrue(explicitWaitClickable(p.getbusinesscard()).isDisplayed());
		   } 
		   
	   } else if (Results.equalsIgnoreCase("Invalid")) {
		   Assert.assertTrue(p.Nobusinessesfound.isDisplayed());
	   }
	}
	

	/* @When("User clicks on category filter")
	public void user_clicks_on_category_filter() {
	   explicitWaitClickable(p.filtercategory).click();
	}

	@When("Category options should be displayed")
	public void category_options_should_be_displayed() {
	   Assert.assertTrue(p.filtercategory.isDisplayed());
	}

	@When("user selects a category")
	public void user_selects_a_category() {
	   p.gethomeservices().click();
	}

	@Then("Related businesses should be displayed")
	public void related_businesses_should_be_displayed() {
	  Assert.assertTrue(explicitWaitClickable(p.getbusinesscard()).isDisplayed());
	  }
	@When("user clicks on sort by filter")
	public void user_clicks_on_sort_by_filter() {
	   p.filtersort.click();
	}

	@When("sort options should be displayed")
	public void sort_options_should_be_displayed() {
	   Assert.assertTrue(p.getrecentlyadded().isDisplayed());
	}

	@When("user selects recently added")
	public void user_selects_recently_added() {
	   p.getrecentlyadded().click();
	}

	@Then("businesses should be sorted accordingly")
	public void businesses_should_be_sorted_accordingly() {
	    Assert.assertTrue(p.getbusinesscard().isDisplayed());
	}  */
	@When("User selects a category from the category dropdown")
	public void user_selects_a_category_from_the_category_dropdown() {
		explicitWaitClickable(p.filtercategory).click();
		explicitWaitClickable(p.gethomeservices()).click();
	}

	@When("User selects a sorting option from the sort by dropdown")
	public void user_selects_a_sorting_option_from_the_sort_by_dropdown() {
	   p.filtersort.click();
	   p.gettoprated().click();
	}

	@When("User selects a minimium rating from the min rating dropdown")
	public void user_selects_a_minimium_rating_from_the_min_rating_dropdown() {
	   p.filtermin.click();
	   p.getrating4().click();
	}

	@When("user selects the verified only checkbox")
	public void user_selects_the_verified_only_checkbox() {
	    p.filterverifiedonly.click();
	}

	@Then("The business listings should be displayed based on the selected filter criteria")
	public void the_business_listings_should_be_displayed_based_on_the_selected_filter_criteria() {
		Assert.assertTrue(explicitWaitClickable(p.getbusinesscard()).isDisplayed());
	}

	
 }





    
	
