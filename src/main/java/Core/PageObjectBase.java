package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Assertions;


import java.time.Duration;

public class PageObjectBase {

    public WebDriver driver;

    public PageObjectBase() {
        this.driver = Hooks.getDriver();
    }

    public void waitForVisibility(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void sendKeys(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

    public void clickToElement(By element) {
        driver.findElement(element).click();
    }

    public void clearTextField(By element) {
        driver.findElement(element).clear();
    }

    public void isElementDisplayed(By element) {
        Assertions.assertTrue(driver.findElement(element).isDisplayed());
    }

    public void isElementNotDisplayed(By element) {
        Assertions.assertFalse(driver.findElement(element).isDisplayed());
    }

    public void isMessageDisplayed(By element, String message) {
        Assertions.assertEquals(message, driver.findElement(element).getText());
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
