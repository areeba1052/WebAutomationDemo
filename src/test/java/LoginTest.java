import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest extends BaseTest {

    /**
     * 1️⃣ Valid Login Test
     */
    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

      var homePage = loginPage.loginWithValidCredentials();

        Assert.assertTrue(
                homePage.isProductsPageDisplayed(),
                "User should land on the Products page after valid login"
        );
    }


    /**
     * 2️⃣ Invalid Login Test
     */
    @Test
    public void invalidLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("wrong_user")
                .enterPassword("wrong_pass")
                .clickLoginExpectingError();

        String errorText = loginPage.getErrorMessage();

        Assert.assertTrue(
                errorText.contains("Username and password do not match"),
                "Expected error message for invalid login"
        );
    }
}
