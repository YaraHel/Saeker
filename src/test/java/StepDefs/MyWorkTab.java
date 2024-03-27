package StepDefs;

import Pages.MyWorkTab.MyWorkLogic;
import io.cucumber.java.en.Then;

public class MyWorkTab {

    MyWorkLogic obj;
    public MyWorkTab(){
        obj = new MyWorkLogic();
    }

    @Then("Page loads with user's name followed by dashboard")
    public void pageLoadsWithUserSNameFollowedByDashboard() {
        obj.checkUserNameOnMyWorkPage();
    }

    @Then("Verify location option")
    public void verifyLocationOption() {
        obj.verifyLocationOption();
    }

    @Then("Verify search option inside location dropdown list")
    public void verifySearchOptionInsideLocationDropdownList() {
        obj.verifySearchOption();
    }

    @Then("Verify user can scroll down inside location dropdown")
    public void verifyUserCanScrollDownInsideLocationDropdown() {
        obj.scrollInsideDropDown();
    }

    @Then("Verify titles and percentages")
    public void verifyTitlesAndPercentages() {
        obj.verifyTitleAndPercentageOfWheels();
    }

    @Then("The rings and location drop down should collaps")
    public void theRingsAndLocationDropDownShouldCollaps() {
        obj.collapsRingsAndLocationDropDownShould();
    }

    @Then("Display all the activity summary boxes")
    public void displayAllTheActivitySummaryBoxes() {
        obj.verifyActivitySummaryBoxes();
    }

    @Then("The rings and location drop down should visible")
    public void theRingsAndLocationDropDownShouldVisible() {
        obj.verifyRingsAndLocationAppearance();
    }

    @Then("boxes are filtered to only display tasks that are missing documents")
    public void boxesAreFilteredToOnlyDisplayTasksThatAreMissingDocuments() {
        obj.showTasksThatAreMissingDocuments();
    }

    @Then("Verify dropdown options")
    public void verifyDropdownOptions() {
        obj.verifyActiveDropDownOptions();
    }
}
