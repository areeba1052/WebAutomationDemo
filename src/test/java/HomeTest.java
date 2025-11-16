import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class HomeTest extends BaseTest {

    @Test
    public void logoutTest() {
        LoginPage loginPage = new LoginPage(driver);

        // Login with valid credentials
        var homePage = loginPage.loginWithValidCredentials();

        Assert.assertTrue(
                homePage.isProductsPageDisplayed(),
                "User should be on Products page after login"
        );

        // Perform logout
        var loginPageAfterLogout = homePage.logout();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("saucedemo.com"),
                "User should be redirected to login page after logout"
        );

    }

}
