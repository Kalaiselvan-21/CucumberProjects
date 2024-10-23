package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Expressions {
	@Given("^i have (\\d+) laptops$")
	public void i_have_laptops(Integer int1) {
		System.out.println(int1);
	    
	}

	@When("^I have (\\d+\\.\\d+) CGPA")
	public void i_have_cgpa(Double double1) {
		System.out.println(double1);
	}

	@When("^\"(.*?)\" is elder than \\\"(.*?)\\\" and \\\"(.*?)\\\"")
	public void is_elder_than_and(String name1, String name2, String name3) {
		System.out.println(name1 + " is elder than " + name2 + " and " + name3);
	}


}
