package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginOrangeHRM {
	
	WebDriver driver;
	
	@Given("user is navigating to login page")
	public void user_is_navigating_to_login_page() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	@When("the user enters username")
	public void the_user_enters_username() {
		WebElement usernameInput = driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']"));
        usernameInput.sendKeys("Admin");
	    
	}
	@When("the user enters password")
	public void the_user_enters_password() {
		WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']"));
        passwordInput.sendKeys("admin123");
		
	}
	@Then("User should be able to login the page successfully")
	public void user_should_be_able_to_login_the_page_successfully() {
	    
		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
        login.click();
        driver.close();
	}
	
}
