package StepDefs;

import Pages.ForgotPassword.ForgotPasswordLogic;
import io.cucumber.java.en.Then;

public class ForgotPassword {
    public ForgotPassword() {}
    ForgotPasswordLogic obj = new ForgotPasswordLogic();
    @Then("Forgot Password link displayed with Resend Password or Login buttons")
    public void forgotPasswordLinkDisplayedWithResendPasswordOrLoginButtons() {
        obj.forgotPasswordLinkDisplayedWithResendPasswordOrLoginButtons();
    }

}
