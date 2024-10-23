package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginwithData {
	
	WebDriver driver;
	
	@Given("user is navigating to the login page")
	public void user_is_navigating_to_the_login_page() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	@When("the user enters valid username as {string}")
	public void the_user_enters_valid_username_as(String uname) {
		WebElement usernameInput = driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']"));
        usernameInput.sendKeys(uname);
	}
	@When("the user enters valid password as {string}")
	public void the_user_enters_valid_password_as(String pword) {
		WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']"));
        passwordInput.sendKeys(pword);
	}
	@Then("User should be able to land in Home page")
	public void user_should_be_able_to_land_in_home_page() {
		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
        login.click();
        driver.close();
	}

	
}
