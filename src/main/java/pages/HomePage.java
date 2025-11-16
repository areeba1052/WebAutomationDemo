package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(className = "title")
    private WebElement productsTitle;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutLink;

    @FindBy(className = "inventory_item_name")
    private WebElement backpack;


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isProductsPageDisplayed() {
        return productsTitle.getText().equalsIgnoreCase("Products");
    }

    public LoginPage logout() {
        menuButton.click();
        logoutLink.click();
        return new LoginPage(driver);
    }

    public ProductPage selectProduct() {
        backpack.click();
        return new ProductPage(driver);
    }

}
