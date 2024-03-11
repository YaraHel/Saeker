package Pages.MyWorkTab;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyWorkLogic extends MyWorkPO {

    public void checkUserNameOnMyWorkPage() {
        waitForVisibility(userNameWorkTab);
    }

    public void verifyLocationOption() {
        waitForVisibility(groupCheckBox);
        isMessageDisplayed(locationLabel, "Location");
        isElementDisplayed(locationDropDownList);
        isMessageDisplayed(locationDropDownList, "All locations");
        isElementDisplayed(groupCheckBox);
        waitForVisibility(itemCheckBox);
        isElementDisplayed(itemCheckBox);
    }

    public void verifySearchOption() {
        waitForVisibility(locationSearch);
    }

    public void scrollInsideDropDown() {
        // Find all elements with the specified ID
        List<WebElement> elements = driver.findElements(itemCheckBox);
        // Check if there are at least three elements with the specified ID
        if (elements.size() >= 3) {
            // Access the third element and perform actions on it
            WebElement thirdElement = elements.get(2);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", thirdElement);
            //scrollToElement(thirdElement);
            isElementNotDisplayed(groupCheckBox);
        }
    }

}
