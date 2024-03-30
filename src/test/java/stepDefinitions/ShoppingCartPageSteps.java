package stepDefinitions;

import io.cucumber.java.en.And;
import pages.ShoppingCartPage;

public class ShoppingCartPageSteps {

    ShoppingCartPage shoppingCartPage;

    @And("customer sets the quantity of '' item in the cart to ''")
    public void aCustomerSetsTheQuantityOfItemInTheCartTo(Integer number){
        shoppingCartPage.setNumberOfItems(number);
    }

}
