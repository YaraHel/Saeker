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
}
