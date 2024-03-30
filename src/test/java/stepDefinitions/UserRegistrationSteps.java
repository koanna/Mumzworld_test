package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.UserRegistrationPage;

public class UserRegistrationSteps {

    UserRegistrationPage userRegistrationPage;

    @Then("customer is shown a new user registration page")
    public void aCustomerIsShownANewUserRegistrationPage(){
        userRegistrationPage.waitForURPageToLoad();
    }

    @And("customer fills the new user registration page")
    public void aCustomerFillsTheNewUserRegistrationPage(){

    }

    @Then("customer is shown a registration success message")
    public void aCustomerIsShownARegistrationSuccessMessage(){
        userRegistrationPage.registrationSuccessMessageIsDisplayed();
    }
}
