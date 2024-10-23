package stepDefinitions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleDefinitions {
	
	WebDriver driver;
	
	
	@Given("user is entering google.co.in")
	public void user_is_entering_google_co_in() 
	{
	   driver = new ChromeDriver();
	   driver.get("http://google.co.in");
	    
	}

	@When("user is typing the search terms {string}")
	public void user_is_typing_the_search_terms(String searchTerm) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(searchTerm);
		
	    
	}

	@When("enters the return key")
	public void enters_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	    
	}

	@Then("the user should see the search results")
	public void the_user_should_see_the_search_results() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.partialLinkText("linked")).isDisplayed();
		
	    if(status) {
	    	System.out.println("Search done");
	    }
	    driver.quit();
	}


}
