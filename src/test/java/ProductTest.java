import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void movetoproduct() {
        LoginPage loginPage = new LoginPage(driver);
        // Login with valid credentials
        var homePage = loginPage.loginWithValidCredentials();

        Assert.assertTrue(
                homePage.isProductsPageDisplayed(),
                "User should be on Products page after login"
        );

        homePage.selectProduct();

        ProductPage obj = new ProductPage(driver);
        Assert.assertTrue(
                obj.isProductDisplayed(),
                "User should be on next page"
        );

    }
}
