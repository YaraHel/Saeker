package Core;

import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private static WebDriver driver;

    @BeforeAll()
    public static void setup(){
        driver = WebFactory.createChromeWebDriver();
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    /*@After
    public static void quit(){
        driver.quit();
    }

     */
}
