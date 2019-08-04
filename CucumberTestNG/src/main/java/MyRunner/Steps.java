package MyRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps{

	 WebDriver driver;

	
	 @Given("^user is already on login page$")
	 public void user_is_already_on_login_page() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     //throw new PendingException();
		 System.out.println("Swati: Loing page");
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get("https://www.freecrm.com/index.html");
		 }
	
	 @When("^title of login page is Free CRM$")
		public void title_of_login_page_is_Free_CRM() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new PendingException();
			System.out.println("Swati : Free CRM");
			String title = driver.getTitle();
			System.out.println(title);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			// Assert.assertEquals("Free CRM", title);
			 driver.findElement(By.xpath("//a[@class=\"btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left\"]")).sendKeys(Keys.ENTER);
		}
	 
	  @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_enters_and(String arg1, String arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new PendingException();
			System.out.println("Swati : Enter Credentials");
			driver.findElement(By.name("email")).sendKeys(arg1);
			 driver.findElement(By.name("password")).sendKeys(arg2);
		}
	 
	
	 
	  @Then("^user clicks on login button$")
		public void user_clicks_on_login_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new PendingException();
			System.out.println("Swati : login button");
			//WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
			WebElement loginBtn = 	driver.findElement(By.xpath("//div[@id=\"ui\"]/div/div/form/div/div[3]"));
			//div[@id="ui"]/div/div/form/div/div[4]
					 JavascriptExecutor js = (JavascriptExecutor)driver;
					 js.executeScript("arguments[0].click();", loginBtn);
		}
	 
	  @Then("^user is on the home page$")
		public void user_is_on_the_home_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new PendingException();
			System.out.println("Swati : Home page");
			//String title = driver.getTitle();
			// System.out.println("Home Page title ::"+ title);
			// Assert.assertEquals("CRMPRO", title);
		}
	 
	 @Then("^close the browser$")
		public void close_the_browser() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new PendingException();
			System.out.println("Swati : Close Browser");
			driver.quit();
		}
	
	

}
