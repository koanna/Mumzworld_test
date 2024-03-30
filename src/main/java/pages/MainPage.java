package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="")
    WebElement searchInputField;

    @FindBy(id="")
    WebElement searchButton;

    @FindBy(id="")
    WebElement addToBagButton;


    public void waitForMainPageToLoad(){
    }
    public void searchFor(String product){
        searchInputField.sendKeys(product);
        searchButton.click();
    }

    public void addToBag(String product){
        //here have to locate the add to bag button corresponding to specific product
    }
}
