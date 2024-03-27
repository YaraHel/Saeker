package Pages.Login;

import org.junit.jupiter.api.Assertions;

public class LoginLogic extends LoginPO {

    private String userEmail = "yarahelal96@gmail.com";
    private String userPassword = "$Udemy456";

    public void goToClientSide() {
        driver.navigate().to("https://child-test.saeker.com");
    }

    public void enterValidUsername() {
        waitForVisibility(email);
        sendKeys(email, userEmail);
    }

    public void enterValidPassword() {
        waitForVisibility(password);
        sendKeys(password, userPassword);
    }

    public void clickOnButton(String Btn) {
        switch (Btn) {
            case "Login":
                waitForVisibility(Login);
                clickToElement(Login);
                break;
            case "Forgot your password?":
                waitForVisibility(forgotPassword);
                clickToElement(forgotPassword);
                break;
            case "Resend Password":
                waitForVisibility(resetPassword);
                clickToElement(resetPassword);
                break;
            case "My Work":
                waitForVisibility(myWorkTab);
                clickToElement(myWorkTab);
                break;
            case "All locations":
                waitForVisibility(locationDropDownList);
                clickToElement(locationDropDownList);
                break;
            case "I Icon":
                waitForVisibility(iIcon);
                clickToElement(iIcon);
                break;
            case "Mid Arrow":
                waitForVisibility(midArrow);
                clickToElement(midArrow);
                break;
            case "Only show tasks missing documents":
                waitForVisibility(onlyMissingDocs);
                clickToElement(onlyMissingDocs);
                break;
            case "ActiveInternal", "ActiveExternal", "ActiveActions":
                waitForVisibility(active);
                clickToElement(active);
                break;
            default:
                break;
        }
        //to be implemented all buttons
    }

    public void verifyThatUserCanLoginSuccessfully() {
        waitForVisibility(DashboardPage);
        validateURL("admin");
    }

    public void leavePasswordFieldBlank() {
        clearTextField(password);
    }

    public void verifyThatMessagePopsUpSayingMissingCredentials(String message) {
        switch (message) {
            case "Missing credentials":
                waitForVisibility(missingCredentials);
                isMessageDisplayed(missingCredentials, message);
                //Assertions.assertEquals(message,driver.findElement(missingCredentials).getText());
                break;
            case "This password is not correct. Please use the below “Forgot your password” link to reset":
                waitForVisibility(incorrectPassword);
                isMessageDisplayed(incorrectPassword, message);
                //Assertions.assertEquals(message,driver.findElement(incorrectPassword).getText());
                break;
            case "This email is not registered.":
                waitForVisibility(emailNotRegistered);
                isMessageDisplayed(emailNotRegistered, message);
                //Assertions.assertEquals(message,driver.findElement(emailNotRegistered).getText());
                break;
            case "Password reset link sent to your email address":
                waitForVisibility(resetToastMessage);
                isMessageDisplayed(resetToastMessage, message);
                break;
            case "The compliance and efficiency wheels show live compliance of tasks and actions currently in view on the screen. Compliance will be affected if the most recent occurrence has been missed and is currently overdue, or if the task is missing a required document that is overdue. Efficiency will be affected if the most recent occurrence was completed but was either completed late or a document was added late or if compliance is affected.":
                waitForVisibility(infoMessage);
                isMessageDisplayed(infoMessage, message);
                break;
            default:
                break;
        }
    }

    public void leaveEmailFieldBlank(){
        clearTextField(email);
    }

    public void enterInvalidPassword(){
        clearTextField(password);
        sendKeys(password,"invalid");
    }

    public void enterInvalidUsername(){
        clearTextField(email);
        sendKeys(email,"invalid");
    }

}
