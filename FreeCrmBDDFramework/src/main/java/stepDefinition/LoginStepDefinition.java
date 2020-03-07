package stepDefinition;

//import io.cucumber.java.en.Given;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is alrady on Login Page$")
	public void user_already_on_login_page(){
		System.setProperty("webdriver.chrome.driver", "");
		driver = new ChromeDriver();
		driver.get("https://sandbox.xpand-it.com/");	
	}
	@Then("^User enters UserName and Password$")
	public void user_enters_username_and_password(){
		driver.findElement(By.name("os_username")).sendKeys("user43");
		driver.findElement(By.name("os_password")).sendKeys("Abcd@1234");
	}
	@Then("^User Clicks on Login button$")
	public void user_clicks_on_login_button(){
		driver.findElement(By.name("login")).click();
	}
	@Then("^User is on the home page$")
	public void user_is_on_the_home_page(){		
		Assert.assertEquals(By.id("create_link"), "create_link");		
	}
	
	

}
