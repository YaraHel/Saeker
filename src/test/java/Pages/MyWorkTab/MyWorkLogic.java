package Pages.MyWorkTab;

import org.openqa.selenium.WebElement;

import java.util.List;

public class MyWorkLogic extends MyWorkPO {

    public void checkUserNameOnMyWorkPage() {
        waitForVisibility(userNameWorkTab);
        validateURL("dashboard");
    }

    public void verifyLocationOption() {
        //to add isElementsDisplayed here
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
            System.out.println(thirdElement.getText());
            scrollToElement(thirdElement);
            isElementNotDisplayed(groupCheckBox);
        }
    }

    public void verifyTitleAndPercentageOfWheels(){
        isElementsDisplayed(complianceTitle,compliancePercentage,efficiencyTitle,efficiencyPercentage);
    }

    public void collapsRingsAndLocationDropDownShould(){
        //hide rings and location
    }

    public void verifyActivitySummaryBoxes(){
        isElementsDisplayed(internalTasks,externalTasks,actions,riskAssessments,fireRiskAssessments,accidents,incidents,enforcingAuthorityVisits);
        //add softAssert for e_ops
    }

    public void verifyRingsAndLocationAppearance(){

    }

    public void showTasksThatAreMissingDocuments(){

    }

    public void verifyActiveDropDownOptions(){
        isElementsDisplayed();
    }

}
