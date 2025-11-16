package base;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;   //instance variable


    //parameterized constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;

    }
}

/*When you create a subclass object, Java automatically calls the constructor of its
parent (base) class) first.
This ensures that the parent part of the object is initialized before the child part.*/

/*Always call the parent constructor first if it’s parameterized.

If you forget super(driver) when needed, Java will throw a compile-time error.

This mechanism ensures the base class is properly initialized before the subclass starts
its own initialization.*/