package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObjectBase {

    public WebDriver driver;

    public PageObjectBase() {
        this.driver = Hooks.getDriver();
    }

    public void waitForVisibility(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }

    public void sendKeys(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

    public void clickToElement(By element){
        driver.findElement(element).click();
    }

    public void clearTextField(By element){
        driver.findElement(element).clear();
    }
}
