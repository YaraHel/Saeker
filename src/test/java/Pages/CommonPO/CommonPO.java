package Pages.CommonPO;

import Core.PageObjectBase;
import org.openqa.selenium.By;

public class CommonPO extends PageObjectBase {

    public By forgotPassword= By.id("forget-password");
    public By Login= By.id("login");
    public By resetPassword = By.id("resend-password");
    public By resetToastMessage = By.id("toast-container");
    public By myWorkTab = By.id("my-work-link");
    public By locationDropDownList= By.id("dropdown-menu-button");

    public CommonPO(){
    }
}
