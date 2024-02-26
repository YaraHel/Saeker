package Pages.Login;

import Pages.CommonPO.CommonPO;
import org.openqa.selenium.By;

public class LoginPO extends CommonPO {
    By email= By.id("email");
    By password= By.id("password");
    By DashboardPage= By.id("admin-title");
    By emailNotRegistered= By.id("error-message email-not-registered");
    By missingCredentials= By.id("error-message missing-credentials");
    By incorrectPassword= By.id("error-message incorrect-password");
}
