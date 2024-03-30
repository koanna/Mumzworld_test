package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(id="")
    WebElement numberOfItemsField;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public void waitForSCPageToLoad(){
    }

    public void setNumberOfItems(Integer number){
        numberOfItemsField.sendKeys();
    }

}
