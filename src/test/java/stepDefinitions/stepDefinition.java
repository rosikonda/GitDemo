package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

  @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
      System.out.println("User is in Landing Page");
    }

    @When("^User login into the application with username and password$")
    public void user_login_into_the_application_with_username_and_password() throws Throwable {
       System.out.println("Provided Username and Password");
    }
    @When("^User login into the application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_the_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home Page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Home Page is showing");
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("All Cards are showing");
    } 
    
    @And("^cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg3) throws Throwable {
        System.out.println(strArg3);
    }

}