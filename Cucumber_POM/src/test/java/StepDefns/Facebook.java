package StepDefns;

import com.pages.LoginPage;
import com.pages.SignUpPage;
import com.util.ConfigReader;
import com.webdriverfactory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class Facebook {
	
	private ConfigReader cr = new ConfigReader();
	private LoginPage lpage = new LoginPage(DriverFactory.getDriver());
	private SignUpPage supage = new SignUpPage(DriverFactory.getDriver());
	
	
	@Given("the user launches facebook")
	public void the_user_launches_facebook() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(cr.getConfigProperty("url"));
		DriverFactory.getDriver().get(cr.getConfigProperty("url"));
	}

	@Then("the user verifies facebook title")
	public void the_user_verifies_facebook_title() throws InterruptedException {
		//Thread.sleep(20000);
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Facebook – log in or sign up", DriverFactory.getDriver().getTitle());
	}

	@Then("the user enters {string} in username field")
	public void the_user_enters_in_username_field(String string) {
		lpage.EnterUsername(string);
	}

	@Then("the user enters {string} in password field")
	public void the_user_enters_in_password_field(String string) {
		// Write code here that turns the phrase above into concrete actions
		lpage.EnterPassword(string);
	
	}

	@Then("the user clicks on createnew button")
	public void the_user_clicks_on_createnew_button() {
		// Write code here that turns the phrase above into concrete actions
		lpage.clickCreateNew();
	}

	@Then("the user enters {string} in firstname field")
	public void the_user_enters_in_firstname_field(String string) {
		// Write code here that turns the phrase above into concrete actions
		supage.EnterFirstname(string);
	}

	@Then("the user enters {string} in lastname field")
	public void the_user_enters_in_lastname_field(String string) {
		// Write code here that turns the phrase above into concrete actions
		supage.EnterLastname(string);
		Assert.assertTrue(false);
	}

}
