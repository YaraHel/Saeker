package Pages;

public class LoginLogic extends LoginPO {

    private String userEmail = "yarahelal96@gmail.com";
    private String userPassword = "$Udemy456";

    public void goToClientSide() {
        driver.navigate().to("https://child-test.saeker.com/");
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
        }
        //to be implemented all buttons
    }

    public void verifyThatUserCanLoginSuccessfully() {
        waitForVisibility(DashboardPage);
    }

    public void leavePasswordFieldBlank() {
        clearTextField(password);
    }

    public void verifyThatMessagePopsUpSayingMissingCredentials(String message) {
        switch (message) {
            case "Missing credentials":
                waitForVisibility(Login);

                break;
            case "This password is not correct. Please use the below “Forgot your password” link to reset":
                //to be implemented
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
