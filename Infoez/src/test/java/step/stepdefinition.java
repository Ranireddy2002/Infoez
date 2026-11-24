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
	public void the_user_enters_username(String Email) {
		p.email.clear();
	    p.email.sendKeys(Email);
	}

	@When("The user enter password {string}")
	public void the_user_enter_password(String Password) {
		p.password.clear();
	    p.password.sendKeys(Password);
	}

	@When("user clicks on signin")
	public void user_clicks_on_signin() {
		click(p.signin);
	}

	@Then("the user redirected to the home page {string}")
	public void the_user_redirected_to_the_home_page(String Results) {
		if (Results.equals("Invalid1")) {
			Assert.assertTrue("value is not a valid email address: The part after the @-sign is not valid. It should have a period.",p.isHomePageDisplayed());
		}
		else if (Results.equals("Invalid2")) {
			Assert.assertTrue("value is not a valid email address: The part after the @-sign is not valid. It should have a period.",p.isHomePageDisplayed());
		}
		else if (Results.equals("Invalid3")) {
			Assert.assertTrue("!Please fill out these field.",p.isHomePageDisplayed());
		}
		else if (Results.equals("Invalid4")) {
			Assert.assertTrue("!Please include an '@' in the email address, 'asdfgg' is missing an @.",p.isHomePageDisplayed());
		}
		else if (Results.equals("Invalid5")) {
			Assert.assertTrue("!Please enter a part of followed by '@'.'@#$$%^^' is incomplete.",p.isHomePageDisplayed());
		}
		else if (Results.equals("Valid")) {
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
	@Then("Nearme page should displayed")
	public void nearme_page_should_displayed() {
	   Assert.assertTrue(p.nearmepage.isDisplayed());
	   }

	@Then("Search nearby field should be displayed")
	public void search_nearby_field_should_be_displayed() {
	    Assert.assertTrue(p.nearmesearchnearby.isDisplayed());
	}

	@Then("All categories dropdown should displayed")
	public void all_categories_dropdown_should_displayed() {
	   Assert.assertTrue(p.nearmecategory.isDisplayed());
	}

	@Then("Within km dropdown should be displayed")
	public void within_km_dropdown_should_be_displayed() {
	    Assert.assertTrue(p.withinKMbtn.isDisplayed());
	}

	@Then("Apply button should be displayed")
	public void apply_button_should_be_displayed() {
	    Assert.assertTrue(p.mapapplybtn.isDisplayed());
	}

	@Then("Use my location button should be displayed")
	public void use_my_location_button_should_be_displayed() {
	    Assert.assertTrue(p.usemylocationbtn.isDisplayed());
	}
	@Given("User clicks on how it works")
	public void user_clicks_on_how_it_works() {
	    p.howitworks.click();
	}

	@Then("How it works page should be dispalyed")
	public void how_it_works_page_should_be_dispalyed() {
		Assert.assertTrue("How it works page not displayed", p.howitworkspage.isDisplayed());
	}

	@Then("Serch verified locals should be displayed")
	public void serch_verified_locals_should_be_displayed() {
	   Assert.assertTrue(p.searchverifiedlocals.isDisplayed());
	}

	@Then("Trust the badge should be displayed")
	public void trust_the_badge_should_be_displayed() {
	   Assert.assertTrue(p.trustthebadge.isDisplayed());
	}

	@Then("Send enquiries should be displayed")
	public void send_enquiries_should_be_displayed() {
	    Assert.assertTrue(p.sendenquiries.isDisplayed());
	}

	@Then("Rate and review should be displayed")
	public void rate_and_review_should_be_displayed() {
	    Assert.assertTrue(p.rateandreview.isDisplayed());
	}

	@Then("Start exploring button should be displayed")
	public void start_exploring_button_should_be_displayed() {
	    Assert.assertTrue(p.startexploring.isDisplayed());
	}

	@When("user clicks on start exploring")
	public void user_clicks_on_start_exploring() {
	   explicitWaitClickable(p.startexploring).click();
	}

	@When("User navigates back to how it works page")
	public void user_navigates_back_to_how_it_works_page() {
	    driver.navigate().back();
	}

	@When("list your business button should be displayed")
	public void list_your_business_button_should_be_displayed() {
	   Assert.assertTrue(p.listyourbusiness.isDisplayed());
	}

	@When("User clicks on list your business")
	public void user_clicks_on_list_your_business() {
	    explicitWaitClickable(p.listyourbusiness).click();
	}

	@Then("list your business page should be displayed")
	public void list_your_business_page_should_be_displayed() {
	    Assert.assertTrue(p.listyourbusinesspage.isDisplayed());
	}
	@Given("user clciks on pricing")
	public void user_clciks_on_pricing() {
	    p.getpricing().click();
	}

	@Then("Pricing page should be displayed")
	public void pricing_page_should_be_displayed() {
	 Assert.assertTrue(p.pricingplanpage.isDisplayed());
	  }

	@Then("Free plan should be displayed")
	public void free_plan_should_be_displayed() {
	  Assert.assertTrue(p.getfreeplan().isDisplayed());
	}

	@Then("Starter plan should be displayed")
	public void starter_plan_should_be_displayed() {
	    Assert.assertTrue(p.getstarterplan().isDisplayed());
	}

	@Then("Pro plan should be displayed")
	public void pro_plan_should_be_displayed() {
	   Assert.assertTrue(p.getproplan().isDisplayed());
	}

	@Then("Enterprise plan should be displayed")
	public void enterprise_plan_should_be_displayed() {
	    Assert.assertTrue(p.getenterpriceplan().isDisplayed());
	}
	@Given("User clicks on customer profile")
	public void user_clicks_on_customer_profile() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.elementToBeClickable(p.getcustomerprofilebtn())).click();
	}

	@Then("Profile should be displayed")
	public void profile_should_be_displayed() {
	    Assert.assertTrue(p.getmenuprofile().isDisplayed());
	}

	@Then("Favorite should be displayed")
	public void favorite_should_be_displayed() {
	   Assert.assertTrue(p.getfavorites().isDisplayed());
	}

	@Then("My reviews should be displayed")
	public void my_reviews_should_be_displayed() {
	    Assert.assertTrue(p.getreviews().isDisplayed());
	}

	@Then("My enquiries should be displayed")
	public void my_enquiries_should_be_displayed() {
	   Assert.assertTrue(p.getenquiries().isDisplayed());
	}

	@Then("Notifications should be displayed")
	public void notifications_should_be_displayed() {
	    Assert.assertTrue(p.getnotifications().isDisplayed());
	}

	@Then("Subscription should be displayed")
	public void subscription_should_be_displayed() {
	    Assert.assertTrue(p.getsubscription().isDisplayed());
	}

	@Then("Logout should be displayed")
	public void logout_should_be_displayed() {
	  Assert.assertTrue(p.getLogout().isDisplayed());
	}
	@Then("User should navigate to profile page")
	public void user_should_navigate_to_profile_page() {
	    Assert.assertTrue(Baseclass.driver.getCurrentUrl().contains("/profile"));	}

	@Then("User should verify email")
	public void user_should_verify_email() {
	   Assert.assertTrue(p.getprofileemail().isDisplayed());
	}

	@Then("User should verify role")
	public void user_should_verify_role() {
	  Assert.assertTrue(p.getprofilerole().isDisplayed());
	}

	@Then("User enters {string} in name field")
	public void user_enters_in_name_field(String Name) {
	   p.getprofilename().clear();
	   p.getprofilename().sendKeys(Name);
	}

	@Then("User enters {string} in phone field")
	public void user_enters_in_phone_field(String Phone) {
	  p.getprofilenumber().clear();
	  p.getprofilenumber().sendKeys(Phone);
	}

	@Then("User enters {string} in avatar URL field")
	public void user_enters_in_avatar_url_field(String AvatarURL) {
	   p.getprofileavatar().clear();
	   p.getprofileavatar().sendKeys(AvatarURL);
	}

	@When("user clicks on save changes button")
	public void user_clicks_on_save_changes_button() {
	   p.getprofilesavebtn().click();
	}

	@Then("User should verify profile details are updated successfully")
	public void user_should_verify_profile_details_are_updated_successfully() {
	    
	}
	@When("User clicks on favorites")
	public void user_clicks_on_favorites() {
	    
	}

	@Then("Favorite page should be displayed")
	public void favorite_page_should_be_displayed() {
	   
	}

	@When("User clicks on favorite icon")
	public void user_clicks_on_favorite_icon() {
	   
	}

	@Then("selected business should be removed from favorites")
	public void selected_business_should_be_removed_from_favorites() {
	    
	}

	@Then("{string} message should be displayed")
	public void message_should_be_displayed(String string) {
	    
	}

	
 }





    
	
