package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class WebFactory {
    public static WebDriver createChromeWebDriver() {
        final ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
        options.addArguments("--no-sandbox");
        return new ChromeDriver(options);
    }

}
