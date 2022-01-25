package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {

	WebDriver driver;

	@Given("brower is open")
	public void brower_is_open() {
		System.setProperty("webdriver.chrome.driver","C:/Users/sumon/eclipse-workspace/CucumberSelenium/Driver/chromedriver.exe");
		
		driver = new ChromeDriver();
	}

	@Given("user on google search page")
	public void user_on_google_search_page() {
		
		driver.get("https://Google.com");
		
	}

	@When("user enter text box")
	public void user_enter_text_box() {
		
		  driver.findElement(By.name("q")).sendKeys("WsCube Tech");
		
	}

	@When("hit enter")
	public void hit_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}

	@Then("user navigate to the result")
	public void user_navigate_to_the_result() {
		driver.getPageSource().contains("About Us");
		System.out.println("Test is pass");
		driver.quit();
		
		
	}

}
