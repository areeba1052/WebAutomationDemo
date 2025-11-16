package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(css = "[data-test='error']")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage enterUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;  //returns the same page object
    }

    public HomePage clickLogin() {
        loginButton.click();
        return new HomePage(driver);
    }

    public LoginPage clickLoginExpectingError() {
        loginButton.click();
        return this;
    }

    public String getErrorMessage() {
        return errorMessage.getText().trim();
    }

    public HomePage loginWithValidCredentials() {
        return enterUsername("standard_user").enterPassword("secret_sauce")
                .clickLogin();
    }
}

/*They may ask why @FindBy is preferred over driver.findElement → Answer: it’s cleaner,
supports lazy initialization, and integrates with PageFactory.*/