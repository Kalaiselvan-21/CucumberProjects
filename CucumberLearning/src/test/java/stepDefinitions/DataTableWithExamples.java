package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.DriverManager;

public class DataTableWithExamples {
	
	WebDriver driver;
	
	
	@Given("Proceed to login scenario")
	public void proceed_to_login_scenario() throws InterruptedException {
		driver = DriverManager.createChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	    
	}

	@When("user enters {string} and password {string}")
	public void user_enters_and_password(String userName, String passWord) {
	    	
		WebElement usernameInput = driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']"));
        usernameInput.sendKeys(userName);
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']"));
        passwordInput.sendKeys(passWord);
	    
	}
	
	@When("clicked button")
	public void clicked_button() {
		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
        login.click();
        driver.close();
	    
	}



	
}
