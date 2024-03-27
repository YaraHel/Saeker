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
    public By iIcon= By.id("");
    public By infoMessage= By.id("");
    public By midArrow= By.id("");
    public By onlyMissingDocs= By.id("onlyMissingDocs");
    public By active= By.id("Active");

    public CommonPO(){
    }
}
