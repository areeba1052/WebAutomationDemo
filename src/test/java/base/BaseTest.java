package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import java.time.Duration;


public class BaseTest {

    // WebDriver instance
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        // Initialize Chrome browser
        driver = new ChromeDriver();

        // Maximize window and set implicit wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Load application ONCE per test
        driver.get(ConfigReader.get("BASE_URL"));
    }

/*    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }*/
}