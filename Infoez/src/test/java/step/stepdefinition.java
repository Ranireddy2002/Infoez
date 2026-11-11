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

    public class stepdefinition {
	public static customerpanel customer;
	public static WebDriverWait Wait;
	
	@Given("User launches the browser")
	public void user_launches_the_browser() {
		
		Baseclass.browserLaunch();
		Baseclass.maximize();
	    customer = new customerpanel(Baseclass.driver);
	}

	@When("User open the Infoez application")
	public void user_open_the_infoez_application() {
		
		Baseclass.driver.get("https://d2mojgetgp5xie.cloudfront.net/");
		 customer = new customerpanel(Baseclass.driver);
		 Wait = new WebDriverWait(Baseclass.driver,Duration.ofSeconds(20));
	    
	}

	@When("User Enters Customer Email and password")
	public void user_enters_customer_email_and_password() {
		customer.signinbtn.click();
		Wait.until(ExpectedConditions.visibilityOf(customer.email));
		customer.getemail().sendKeys("customer@infoez.com");
		Wait.until(ExpectedConditions.visibilityOf(customer.password));
		customer.getpassword().sendKeys("Customer@123");
	    
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		customer.getsignin().click();
	    
	}

	@Then("Customer should login successully")
	public void customer_should_login_successully() {
		Assert.assertTrue(customer.getHomepage().isDisplayed());
	}
	@Given("Customer is logged in")
	public void customer_is_logged_in() {
		       
				customer = new customerpanel(Baseclass.driver);
				Wait = new WebDriverWait(Baseclass.driver,Duration.ofSeconds(20));
				Wait.until(ExpectedConditions.visibilityOf(customer.Homepage));
				Assert.assertTrue(customer.getHomepage().isDisplayed());
				
		}
		
	    
	

	@Then("Customer home page should be displayed")
	public void customer_home_page_should_be_displayed() {
		Assert.assertTrue(customer.getHomepage().isDisplayed());
	    
	}

	@Given("Customer is on home page")
	public void customer_is_on_home_page() {
		if (Baseclass.driver == null) {
			Baseclass.browserLaunch();
			Baseclass.maximize();
		}
		Baseclass.driver.get("https://d2mojgetgp5xie.cloudfront.net/");
		customer = new customerpanel(Baseclass.driver);
		Wait = new WebDriverWait(Baseclass.driver,Duration.ofSeconds(20));
		Wait.until(ExpectedConditions.visibilityOf(customer.Homepage));
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
		Wait.until(driver -> customer.getBusinessCards().size() > 0);
		Assert.assertTrue(customer.getBusinessCards().size()>0);
		
	   
	}

	@When("Customer views business categories")
	public void customer_views_business_categories() {
		//customer views the categories section
		
	   
	}
	@Then("Business listings should be displayed")
	public void business_listings_should_be_displayed() {
		Wait.until(ExpectedConditions.visibilityOf(customer.getcategories()));
	   Assert.assertTrue(customer.getcategories().isDisplayed());
	}

	@When("Customer views featured businesses")
	public void customer_views_featured_businesses() {
		Wait.until(ExpectedConditions.visibilityOf(customer.getFeaturedthisweek()));
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

	//@When("Customer clicks add your business")
	//public void customer_clicks_add_your_business() {
		//customer.getaddyourbusiness().click();
	    
	//}

	//@Then("add your business page should be displayed")
	//public void add_your_business_page_should_be_displayed() {
		//Assert.assertTrue(customer.getaddyourbusiness().isDisplayed());
	    
	//}

	@When("Customer clicks see pricing")
	public void customer_clicks_see_pricing() {
		WebDriverWait wait = new WebDriverWait (Baseclass.driver, Duration.ofSeconds(20));
		Wait.until(ExpectedConditions.elementToBeClickable(customer.getseepricing())).click();;
		
	    
	}

	@Then("Pricing page should be displayed")
	public void pricing_page_should_be_displayed() {
		WebDriverWait wait = new WebDriverWait (Baseclass.driver, Duration.ofSeconds(20));
		Wait.until(ExpectedConditions.urlContains("/pricing"));
		Assert.assertTrue(Baseclass.driver.getCurrentUrl().contains("/pricing"));
	    
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
		Assert.assertTrue(Baseclass.driver.getCurrentUrl().contains("sort=rating"));
	    
	}

	//@When("Customer clicks on add your business footer link")
	//public void customer_clicks_on_add_your_business_footer_link() {
	//    customer.getaddyourbusinessfooterlink().click();
	//}

	//@Then("Add your business page should be displayed")
	//public void add_your_business_page_should_be_displayed1() {
	//	Assert.assertTrue(customer.getaddyourbusinessespage().isDisplayed());
	   
	//}

	@When("Customer clicks on pricing plan footer link")
	public void customer_clicks_on_pricing_plan_footer_link() {
		customer.getpricingfooterlink().click();
	    
	}

	@Then("Pricing plan page should be displayed")
	public void pricing_plan_page_should_be_displayed() {
		
	    Assert.assertTrue(customer.getpricingplanpage().isDisplayed());
	}

	//@When("Customer clicks on How claims works footer link")
	//public void customer_clicks_on_how_claims_works_footer_link() {
	//	customer.gethowclaimsworkfooterlink().click();
	    
	//}

	//@Then("How claims works page should be displayed")
	//public void how_claims_works_page_should_be_displayed() {
		
	    
	//}

	@When("Customer clicks on How it works footer link")
	public void customer_clicks_on_how_it_works_footer_link() {
		customer.gethowitworksfooterliink().click();
	    
	}
	@Then("How it works page should be displayed")
	public void how_it_works_page_should_be_displayed() {
		Assert.assertTrue(customer.gethowitworkspage().isDisplayed());
	    
	}

	@When("Customer clicks on pricing footer link")
	public void customer_clicks_on_pricing_footer_link() {
		customer.getpricingfooterlink().click();
	    
	}

	//@When("Customer clicks on contact footer link")
//	public void customer_clicks_on_contact_footer_link() {
	//	customer.getcontactfooterlink().click();
	    
	//}

	//@Then("Contact details should be displayed")
	//public void contact_details_should_be_displayed() {
	    
	//}
	
	@When("Customer clicks on explore")
	public void customer_clicks_on_explore() {
		customer.getexplore().click();
	    
	}

	@Then("Explore page should be displayed")
	public void explore_page_should_be_displayed() {
	    Assert.assertTrue(customer.getexplorepage().isDisplayed());
	}

	@Then("explore business listings should be displayed")
	public void explore_business_listings_should_be_displayed() {
		Wait.until(driver -> customer.getBusinessCards().size() > 0);
	    Assert.assertTrue(customer.getBusinessCards().size() > 0);
	}

	@When("Customer enters business name")
	public void customer_enters_business_name() {
	   customer.getexplorebusinessearchield().sendKeys("sivam cafe");
	}

	@When("Customer enters city name")
	public void customer_enters_city_name() {
	    customer.getexplorelocationfield().sendKeys("Bengaluru");
	}

	@When("Customer clicks on explore search button")
	public void customer_clicks_on_explore_search_button() {
		WebElement searchButton = customer.getexploresearchbtn();
		((JavascriptExecutor)Baseclass.driver).executeScript
		("arguments[0].scrollIntoView({block:'center'});", searchButton);
		Wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
	    
	}

	@Then("Matching business results should be displayed")
	public void matching_business_results_should_be_displayed() {
		Wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//a[starts-with(@data-testid,'business-card-')]"),0));
		Assert.assertTrue(customer.getBusinessCards().size() > 0);
	    
	}

	@Given("Customer is on Explore page")
	public void customer_is_on_explore_page1() {
	    //customer.explore.click();
	    Assert.assertTrue(customer.getexplorepage().isDisplayed());
	}

	@Then("Filter section should be displayed")
	public void filter_section_should_be_displayed() {
	    Assert.assertTrue(customer.getfiltercategory().isDisplayed());
	    Assert.assertTrue(customer.getfiltersort().isDisplayed());
	    Assert.assertTrue(customer.getfiltermin().isDisplayed());
	    Assert.assertTrue(customer.getfilterverifiedonly().isDisplayed());
	}

	@Then("Category dropdown should be displayed")
	public void category_dropdown_should_be_displayed() {
		
		Assert.assertTrue(customer.getfiltercategory().isDisplayed());
	}

	@Then("Sort by dropdown should be displayed")
	public void sort_by_dropdown_should_be_displayed() {
		Assert.assertTrue(customer.getfiltersort().isDisplayed());
	}

	@Then("Min rating dropdown should be displayed")
	public void min_rating_dropdown_should_be_displayed() {
		Assert.assertTrue(customer.getfiltermin().isDisplayed());
	    
	}

	@Then("Verified only checkbox should be displayed")
	public void verified_only_checkbox_should_be_displayed() {
		 Assert.assertTrue(customer.getfilterverifiedonly().isDisplayed());
	}

	@Given("Customer is on explore page")
	public void customer_is_on_explore_page() {
		Baseclass.driver.get("https://d2mojgetgp5xie.cloudfront.net/search");
		Wait.until(ExpectedConditions.visibilityOf(customer.filtercategory));
	}

	@When("Customer selects a category")
	public void customer_selects_a_category() {
	    customer.filtercategory.click();
	}

	@Then("Businesses related to selected category should be displayed")
	public void businesses_related_to_selected_category_should_be_displayed() {
		Assert.assertTrue(customer.getBusinessCards().size() > 0);
	}

	@When("Customer selects a sorting option")
	public void customer_selects_a_sorting_option() {
		customer.filtersort.click();
	    
	}

	@Then("Businesses should be sorted accordinng to the selected option")
	public void businesses_should_be_sorted_accordinng_to_the_selected_option() {
	    Assert.assertTrue(customer.getBusinessCards().size() > 0);
	}

	@When("Customer selects a min rating")
	public void customer_selects_a_min_rating() {
	    customer.filtermin.click();
	    Wait.until(ExpectedConditions.elementToBeClickable(customer.rating4));
	    customer.rating4.click();
	}

	@Then("Businesses matching the selected rating should be displayed")
	public void businesses_matching_the_selected_rating_should_be_displayed() {
		Wait.until(ExpectedConditions.visibilityOfAllElements(customer.getBusinessCards()));
		Assert.assertTrue(customer.getBusinessCards().size() > 0);
	}

	@When("Customer selects verified only checkbox")
	public void customer_selects_verified_only_checkbox() {
		if (!customer.filterverifiedonly.isSelected()) {
			
		}
	   customer.filterverifiedonly.click();
	   
	   }

	@Then("Only verified businesses should be displayed")
	public void only_verified_businesses_should_be_displayed() {
		Wait.until(ExpectedConditions.visibilityOfAllElements(customer.getBusinessCards()));
		Assert.assertTrue(customer.getBusinessCards().size() > 0);
	   
	}
	@When("Customer clicks on near me")
	public void customer_clicks_on_near_me() {
		//customer.getnearme().click();
		if (Baseclass.driver == null) {
			throw new IllegalStateException("Webriver is not initialized");
		}
		if (customer == null) {
			customer = new customerpanel(Baseclass.driver);
		}
		customer.getnearme().click();
	}

	@Then("Near me page should be displayed")
	public void near_me_page_should_be_displayed() {
		Wait.until(ExpectedConditions.visibilityOf(customer.searchnearby));
		Assert.assertTrue(customer.getsearchnearby().isDisplayed());
		//Assert.assertTrue("Nearme menu is not Displayed", customer.nearmeconfirm.isDisplayed());
		//Assert.assertTrue(customer.getnearmepage().isDisplayed());
	    
	}

	@Then("Search near by field should be displayed")
	public void search_near_by_field_should_be_displayed() {
	    Assert.assertTrue(customer.getsearchnearby().isDisplayed());
	}

	@Then("Near me Category dropdown should be displayed")
	public void near_me_category_dropdown_should_be_displayed() {
		Assert.assertTrue(customer.getallcategoriesbtn().isDisplayed());
	    
	}

	@Then("Distance dropdown should be displayed")
	public void distance_dropdown_should_be_displayed() {
		Assert.assertTrue(customer.getwithinKMbtn().isDisplayed());
	    
	}

	@Then("Apply button should be displayed")
	public void apply_button_should_be_displayed() {
	    Assert.assertTrue(customer.getmapapplybtn().isDisplayed());
	}

	@Then("Use my location button should be displayed")
	public void use_my_location_button_should_be_displayed() {
	    Assert.assertTrue(customer.getusemylocationbtn().isDisplayed());
	}

	@Then("Business results should be displayed")
	public void business_results_should_be_displayed() {
	    Assert.assertTrue(customer.getusemylocationbusiness().isDisplayed());
	}

	@When("Customer enters a business name in search nearby field")
	public void customer_enters_a_business_name_in_search_nearby_field() {
		customer.getsearchnearby().sendKeys("Restaurant");
	   
	}

	@Then("Matching nearby businesses should be displayed")
	public void matching_nearby_businesses_should_be_displayed() {
	   Assert.assertTrue(customer.getfilteredbusines().isDisplayed());
	}

	@When("Customer selects a category from category dropdown")
	public void customer_selects_a_category_from_category_dropdown() {
		Wait.until(ExpectedConditions.elementToBeClickable(
		customer.getallcategoriesbtn())).click();
	   customer.getrestaurants().click();
	}

	@When("Customer clicks apply button")
	public void customer_clicks_apply_button() {
		WebDriverWait wait = new WebDriverWait(Baseclass.driver, Duration.ofSeconds(20));
		WebElement apply = wait.until(ExpectedConditions.visibilityOf(customer.getmapapplybtn()));
		((JavascriptExecutor) Baseclass.driver).executeScript("arguments[0].scrollIntoView(true);", apply);
		((JavascriptExecutor) Baseclass.driver).executeScript("arguments[0].click();", apply);
		Wait.until(ExpectedConditions.elementToBeClickable(customer.getmapapplybtn()));
	 //customer.getmapapplybtn().click();
	    
	}

	@Then("Businesses matching the selected category should be displayed")
	public void businesses_matching_the_selected_category_should_be_displayed() {
		Assert.assertTrue(customer.getfilteredbusines().isDisplayed());
	}

	@When("Customer selects a distance from distance dropdown")
	public void customer_selects_a_distance_from_distance_dropdown() {
		//if (customer == null) {
			//customer = new customerpanel(Baseclass.driver);
		//}
		WebDriverWait wait = new WebDriverWait(Baseclass.driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(customer.getwithinKMbtn())).click();
		//WebElement distance = Wait.until(ExpectedConditions.elementToBeClickable(customer.getwithinKMbtn()));
		//distance.click();
		//customer.getwithinKMbtn().click();
		//customer.getwithin25km().click();
	}

	@Then("Businesses within the selected distance should be displayed")
	public void businesses_within_the_selected_distance_should_be_displayed() {
		Assert.assertTrue(customer.getfilteredbusines().isDisplayed());
	}


	@When("Customer clicks Use my location button")
	public void customer_clicks_use_my_location_button() {
		WebDriverWait wait = new WebDriverWait(Baseclass.driver, Duration.ofSeconds(20));
		WebElement location = wait.until(ExpectedConditions.elementToBeClickable(customer.getusemylocationbtn()));
		location.click();
		//customer.getusemylocationbtn().click();
	    
	}

	@Then("Browser should request location permission")
	public void browser_should_request_location_permission() {
	   
	    		
	}

	@Then("Nearby businesses should be displayed based on current location")
	public void nearby_businesses_should_be_displayed_based_on_current_location() {
		Assert.assertTrue(customer.getfilteredbusines().isDisplayed());
	}
}