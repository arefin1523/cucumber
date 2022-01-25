package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class loginStep {
	
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("Browser");
		System.setProperty("webdriver.chrome.driver","C:/Users/sumon/eclipse-workspace/CucumberSelenium/Driver/chromedriver.exe");
		
		driver = new ChromeDriver();
	}
		    

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.out.println("Login");
		driver.get("https://example.testproject.io/web/");
		
	
	   }

	@When("^user enters(.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
		
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		
		driver.findElement(By.id("login")).click();
	  
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    
		driver.findElement(By.id("logout")).isDisplayed();
		System.out.println("pass");
		driver.quit();
		
	}


}
