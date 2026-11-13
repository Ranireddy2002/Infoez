package Base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	public static WebDriver driver;
	
	//Browser Methods 
	public static void browserLaunch() {
		if (driver == null) {
			driver = new ChromeDriver();
		}
		//driver = new ChromeDriver();
		//return driver;
		
	}
	public static void maximize() {
		driver.manage().window().maximize();
		
	}
	public static void openUrl(String url) {
		driver.get(url);
	}
	public static void minimize()  {
		driver.manage().window().minimize();
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void title() {
		driver.getTitle();
		}
		 
	public static void url() {
		driver.getCurrentUrl();
		}
	
	//Navigation methods 
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void navigate(String url) {
		driver.navigate().to(url);
		}
	
	//Alerts Methods
	 public static void acceptAlert() {
		driver.switchTo().alert().accept();
		}
		 
	 public static void dismissAlert() {
		driver.switchTo().alert().dismiss();
		}
		 
	 public static void sendKeysToAlert(String text) {
		driver.switchTo().alert().sendKeys(text);
		}
	 
	 //Frame Methods 
	 public static void switchFrame(String name) {
		 driver.switchTo().frame(name);
		 
	 }
	 public static void switchFrame(WebElement element) {
		 driver.switchTo().frame(element);
	 }
	 public static void parentFrame() {
		 driver.switchTo().parentFrame();
	 }
	 
	 //DropDown Methods 
	 public static void selectByIndex(WebElement element, int index) {
		 Select s = new Select(element);
		 s.selectByIndex(index);
	 }
	 public static void selectByValue(WebElement element, String value) {
		 Select s = new Select(element);
		 s.selectByValue(value);
	 }
	 public static void selectByVisibleText(WebElement element, String visibleText) {
		 Select s = new Select (element);
		 s.selectByVisibleText(visibleText);
	 }
	 public static void deselectByIndex(WebElement element, int index) {
		 Select s = new Select(element);
		 s.selectByIndex(index);
	 }
	 public static void deselectByValue(WebElement element, String value) {
		 Select s = new Select(element);
		 s.deselectByValue(value);
	 }
	 public static void deselectByVisibleText(WebElement element, String visibleText) {
		 Select s = new Select (element);
		 s.deselectByVisibleText(visibleText);
	 }
	 public static void deselectAll(WebElement element) {
		 Select s = new Select(element);
		 s.deselectAll();
	 }
	 //List of web Elements
	 public static List<WebElement> getOptions(WebElement element) {
		 Select s = new Select(element);
		 return s.getOptions();
	 }
	 public static List<WebElement> getAllSelectedOptions(WebElement element) {
		 Select s = new Select(element);
		 return s.getAllSelectedOptions();
	 }
	 public static WebElement getFirstSelectedOption(WebElement element) {
		 Select s = new Select(element);
		 return s.getFirstSelectedOption();
	 }
	 public static boolean isMultiple(WebElement element) {
		 Select s = new Select(element);
		 return s.isMultiple();
	 }
	 public void clearText(WebElement element) {
		 element.clear();
	 }
	 public boolean isDisplayed(WebElement element) {
		 return element.isDisplayed();
	 }
	 
	 //Wait Methods 
	 public static void implicitWait(int seconds) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	 }
	 public static WebElement explicitWaitClickable(WebElement element) {
		 return new WebDriverWait(driver, Duration.ofSeconds(10)).
				 until(ExpectedConditions.elementToBeClickable(element));
	 }
	 public static WebElement explicitWaitVisible(By locator) {
		 return new WebDriverWait(driver, Duration.ofSeconds(10)).
				 until(ExpectedConditions.visibilityOfElementLocated(locator));
	 }
	 public static Boolean explicitWaitTitleContains(String title) {
		 return new WebDriverWait(driver, Duration.ofSeconds(10)).
				 until(ExpectedConditions.titleContains(title));
	 }
	 public static Boolean explicitWaitUrlContains(String url) {
		 return new WebDriverWait(driver, Duration.ofSeconds(10)).
				 until(ExpectedConditions.urlContains(url));
	 }
	 public static Boolean explicitWaitInvisibility(WebElement element) {
		 return new WebDriverWait(driver, Duration.ofSeconds(10)).
				 until(ExpectedConditions.invisibilityOf(element));
	 }
	 
	 //Actions Methods
	 public static void dragAndDrop(WebElement source, WebElement target) {
		 Actions a = new Actions(driver);
		 a.dragAndDrop(source, target).perform();
	 }
	 public static void click(WebElement element) {
		 element.click();
	 }
	 public static void sendKeys(WebElement textBox, String value) {
		 textBox.clear();
		 textBox.sendKeys(value);
	 }
	 public static void doubleClick(WebElement element) {
		 Actions a = new Actions(driver);
		 a.doubleClick(element).perform();
	 }
	 public static void rightClick(WebElement element) {
		 Actions a = new Actions(driver);
		 a.contextClick(element).perform();
	 }
	 public static void moveToElement(WebElement element) {
		 Actions a = new Actions(driver);
		 a.moveToElement(element).perform();
	 }
	 public static void clickAndHold(WebElement element) {
		 Actions a = new Actions(driver);
		 a.clickAndHold(element).perform();
	 }
	 public static void release(WebElement element) {
		 Actions a = new Actions(driver);
		 a.release(element).perform();
	 }
	 //JavascriptExecutor methods 
	 public static void scrollDown() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
	 }
	 public static void scrollUp() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,-500)");
	 }
	 public static void scrollIntoView(WebElement element) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",element);
	 }
	 public static void clickByJS(WebElement element) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();",element);
	 }
	 public static void sendKeysByJS(WebElement element, String value) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].value=arguments[1];", element, value);
	 }
	 public static void closeBrowser() {
		 driver.quit();
	 }
	 
	 
	

}

