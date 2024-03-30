package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UserRegistrationPage extends BasePage{

    @FindBy(id="")
    WebElement successMessage;

    @FindBy(id="")
    WebElement email;

    @FindBy(id="")
    WebElement password;

    @FindBy(id="")
    WebElement signUpButton;

    public void waitForURPageToLoad(){

    }

    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void registrationSuccessMessageIsDisplayed(){
        Assert.assertTrue(successMessage.isDisplayed());
    }

    public void fillRegistrationForm(){

    }
}
