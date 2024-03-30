package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.BasePage;
import pages.MainPage;

public class MainPageSteps {

    MainPage mainPage;
    BasePage basePage;


    @Given("a customer is on the mumzworld webstore main page")
    public void aCustomerIsOnTheMumzworldWebstoreMainPage(){
        basePage.goToPage();
    }

    @And("customer searches for (.)")
    public void aCustomerSearchesFor(String searchInput){
        mainPage.searchFor(searchInput);
    }

    @And("customer adds '' to the bag")
    public void aCustomerAddsToTheBag(String productName){
        mainPage.addToBag(productName);
    }


}
