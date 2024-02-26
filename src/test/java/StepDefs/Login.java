package StepDefs;

import Pages.Login.LoginLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    public Login() {}
    LoginLogic obj = new LoginLogic();

    @Given("I go to the client side url")
    public void goToClientSide(){
        obj.goToClientSide();
    }

    @When("Enter valid username")
    public void enterValidUsername() {
        obj.enterValidUsername();
    }

    @And("Enter valid password")
    public void enterValidPassword() {
        obj.enterValidPassword();
    }

    @And("Click on {string}")
    public void clickOnLogin(String Btn) {
        obj.clickOnButton(Btn);
    }

    @Then("Verify that user can login successfully")
    public void verifyThatUserCanLoginSuccessfully() {
        obj.verifyThatUserCanLoginSuccessfully();
    }

    @And("Leave password field blank")
    public void leavePasswordFieldBlank() {
        obj.leavePasswordFieldBlank();
    }

    @Then("Verify that Message pops up saying {string}")
    public void verifyThatMessagePopsUpSayingMissingCredentials(String message) {
        obj.verifyThatMessagePopsUpSayingMissingCredentials(message);
    }

    @When("Leave email address blank")
    public void leaveEmailAddressBlank() {
        obj.leaveEmailFieldBlank();
    }

    @And("Enter invalid password")
    public void enterInvalidPassword() {
        obj.enterInvalidPassword();
    }

    @When("Enter invalid username")
    public void enterInvalidUsername() {
        obj.enterInvalidUsername();
    }
}
