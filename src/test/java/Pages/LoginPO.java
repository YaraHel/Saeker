package Pages;

import Core.PageObjectBase;
import org.openqa.selenium.By;

public class LoginPO extends PageObjectBase {
    By email= By.id("email");
    By password= By.id("password");
    By Login= By.xpath("//*[@type='submit']");
    By DashboardPage= By.xpath("//*[@class='admin-title']");
    By classicTitle= By.id("name-classic");
    By premiumTitle= By.id("name-premium");
    By selectYourCountyButton= By.className("country-current");
    By selectYourCountyTitle= By.id("country-title");
    By kuwaitPO= By.id("kw");
    By BHPO= By.id("bh");
    By SAPO= By.id("sa");
    By currency= By.xpath("//i[text()]");
}
