package StepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^User is on Homepage$")
	public void user_is_on_Homepage() {
		System.out.println("navigate to home page");
	}

	@When("^User  search BMW$")
	public void user_search_BMW() {
		System.out.println("search BMW");

	}

	@Then("^New window should open with search results$")
	public void new_window_should_open_with_search_results() {
		System.out.println("Search reult of BMW shown");

	}

	@Given("^Search result available$")
	public void search_result_available() {
		System.out.println("Search result are available");
	}

	@When("^user click on  first result$")
	public void user_click_on_first_result() {
		System.out.println("user will click on first result");
	}

	@Then("^Details should dispaced$")
	public void details_should_dispaced() {
		System.out.println("Detail will be shown");
	}

	@When("^User enters (.*?) and (.*?) on login page$")
	public void entercredentialdetails(String username, String password) {
		System.out.println("" + username + "");
		System.out.println("" + password + "");
	}
}
