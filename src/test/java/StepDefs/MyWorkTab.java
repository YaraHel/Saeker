package StepDefs;

import Pages.MyWorkTab.MyWorkLogic;
import io.cucumber.java.en.Then;

public class MyWorkTab {

    public MyWorkTab(){
        MyWorkLogic obj = new MyWorkLogic();
    }

    @Then("Page loads with user's name followed by dashboard")
    public void pageLoadsWithUserSNameFollowedByDashboard() {

    }
}
