package step;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Baseclass;
import Pages.customerpanel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
	customerpanel customer = new customerpanel(Baseclass.driver);
	WebDriverWait wait = new WebDriverWait(Baseclass.driver,Duration.ofSeconds(20));
	
	@Given("User launches the browser")
	public void user_launches_the_browser() {
		//user launched browser
	    
	}

	@When("User open the Infoez application")
	public void user_open_the_infoez_application() {
		Baseclass.driver.get("https://d2mojgetgp5xie.cloudfront.net/");
		
	    
	}

	@When("User Enters Customer Email and password")
	public void user_enters_customer_email_and_password() {
		customer.getemail().sendKeys("customer@infoez.com");
		customer.getpassword().sendKeys("Customer@123");
	    
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		customer.getsigninbtn().click();
	    
	}

	@Then("Customer should login successully")
	public void customer_should_login_successully() {
		Assert.assertTrue(customer.getHomepage().isDisplayed());
	}
	@Given("Customer is logged in")
	public void customer_is_logged_in() {
		Assert.assertTrue(customer.getHomepage().isDisplayed());
	    
	}

	@Then("Customer home page should be displayed")
	public void customer_home_page_should_be_displayed() {
		Assert.assertTrue(customer.getHomepage().isDisplayed());
	    
	}

	@Given("Customer is on home page")
	public void customer_is_on_home_page() {
		Assert.assertTrue(customer.getHomepage().isDisplayed());
	    
	}

	@When("Customer enters business name in search field")
	public void customer_enters_business_name_in_search_field() {
		customer.getBusinessname().sendKeys("Iron Peak Gym");
	    
	}

	@When("Customer enters city name in search field")
	public void customer_enters_city_name_in_search_field() {
		customer.getcityname().sendKeys("Bengaluru");
	    
	}

	@When("Customer clicks on search button")
	public void customer_clicks_on_search_button() {
		customer.getsearchbtn().click();
	    
	}

	@Then("Relavant Businesses listings should be displayed")
	public void relavant_businesses_listings_should_be_displayed() {
		Assert.assertTrue(customer.getbusinesslistings().isDisplayed());
	   
	}

	@When("Customer views business categories")
	public void customer_views_business_categories() {
		//customer views the categories section
	   
	}
	@Then("Business listings should be displayed")
	public void business_listings_should_be_displayed() {
	   Assert.assertTrue(customer.getbusinesslistings().isDisplayed());
	}

	@When("Customer views featured businesses")
	public void customer_views_featured_businesses() {
		
	    Assert.assertTrue(customer.getFeaturedthisweek().isDisplayed());
	}

	@Then("Featured businesses should be displayed")
	public void featured_businesses_should_be_displayed1() {
		Assert.assertTrue(customer.getFeaturedthisweek().isDisplayed());
	    
	}

	@When("Customer views toprated near you businesses")
	public void customer_views_toprated_near_you_businesses() {
		Assert.assertTrue(customer.getTopratednearyou().isDisplayed());
	}

	@Then("Toprated near you businesses should be displayed")
	public void toprated_near_you_businesses_should_be_displayed() {
		Assert.assertTrue(customer.getTopratednearyou().isDisplayed());
	    
	}

	@When("Customer views recently added businesses")
	public void customer_views_recently_added_businesses() {
		Assert.assertTrue(customer.getrecentlyadded().isDisplayed());
	}

	@Then("Recently added businesses should be displayed")
	public void recently_added_businesses_should_be_displayed() {
		Assert.assertTrue(customer.getrecentlyadded().isDisplayed());
	}

	@When("Customer clicks add your business")
	public void customer_clicks_add_your_business() {
		customer.getaddyourbusiness().click();
	    
	}

	@Then("add your business page should be displayed")
	public void add_your_business_page_should_be_displayed() {
		Assert.assertTrue(customer.getaddyourbusiness().isDisplayed());
	    
	}

	@When("Customer clicks see pricing")
	public void customer_clicks_see_pricing() {
		customer.getseepricing().click();
	    
	}

	@Then("Pricing page should be displayed")
	public void pricing_page_should_be_displayed() {
		Assert.assertTrue(customer.getseepricing().isDisplayed());
	    
	}

	@When("Customer scroll  to the footer section")
	public void customer_scroll_to_the_footer_section() {
		customer.scrollToFooter();
	    
	}

	@Then("Footer section should be displayed")
	public void footer_section_should_be_displayed() {
		customer.getfooterlinksection().isDisplayed();
	    
	}

	@When("Customer clicks on all businesses footer link")
	public void customer_clicks_on_all_businesses_footer_link() {
	    customer.getAllbusinessesfooterlink().click();
	}

	@Then("All businesses should be displayed")
	public void all_businesses_should_be_displayed() {
	    Assert.assertTrue(customer.getAllbusinesses().isDisplayed());
	}

	@When("Customer clicks on featured footer link")
	public void customer_clicks_on_featured_footer_link() {
	    
		customer.getfeaturedfooterlink().click();
	}

	@Then("featured businesses should be displayed")
	public void featured_businesses_should_be_displayed() {
		Assert.assertTrue(customer.getFeaturedbusinesses().isDisplayed());
	    
	}

	@When("Customer clicks on top rated footer link")
	public void customer_clicks_on_top_rated_footer_link() {
		customer.getTopratedfooterlink().click();
	    
	}

	@Then("Top rated businesses should be displayed")
	public void top_rated_businesses_should_be_displayed() {
		Assert.assertTrue(customer.getTopratednearyou().isDisplayed());
	    
	}

	@When("Customer clicks on add your business footer link")
	public void customer_clicks_on_add_your_business_footer_link() {
	    customer.getaddyourbusinessfooterlink().click();
	}

	@Then("Add your business page should be displayed")
	public void add_your_business_page_should_be_displayed1() {
	   
	}

	@When("Customer clicks on pricing plan footer link")
	public void customer_clicks_on_pricing_plan_footer_link() {
		customer.getpricingfooterlink().click();
	    
	}

	@Then("Pricing plan page should be displayed")
	public void pricing_plan_page_should_be_displayed() {
		
	    
	}

	@When("Customer clicks on How claims works footer link")
	public void customer_clicks_on_how_claims_works_footer_link() {
	    
	}

	@Then("How claims works page should be displayed")
	public void how_claims_works_page_should_be_displayed() {
	    
	}

	@When("Customer clicks on How it works footer link")
	public void customer_clicks_on_how_it_works_footer_link() {
	    
	}
	@Then("How it works page should be displayed")
	public void how_it_works_page_should_be_displayed() {
	    
	}

	@When("Customer clicks on pricing footer link")
	public void customer_clicks_on_pricing_footer_link() {
	    
	}

	@When("Customer clicks on contact footer link")
	public void customer_clicks_on_contact_footer_link() {
	    
	}

	@Then("Contact details should be displayed")
	public void contact_details_should_be_displayed() {
	    
	}
}