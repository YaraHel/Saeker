package Core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private static WebDriver driver;

    @Before()
    public static void setup(){
        driver = WebFactory.createChromeWebDriver();
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    @After
    public static void quit(){
        driver.quit();
    }
}
