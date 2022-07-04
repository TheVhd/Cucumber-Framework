package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.TherapistLogin;
import utilities.ConfigReader;

import static stepDefinitions.Hooks.driver;

public class US_036_TherapistLoginWithFacebook {
    TherapistLogin therapistLogin = new TherapistLogin(driver);

    @Then("user clicks on the Facebook login icon")
    public void userClicksOnTheFacebookLoginIcon() {
        therapistLogin.facebookLoginButton.click();
    }

    @Then("user enters an email address for Facebook")
    public void userEntersAnEmailAddressForFacebook() {
        therapistLogin.facebookEmailBox.sendKeys(ConfigReader.getProperty("therapistLoginEmailFb"));
    }

    @And("user enters a password for Facebook")
    public void userEntersAPasswordForFacebook() {
        therapistLogin.facebookPasswordBox.sendKeys(ConfigReader.getProperty("therapistLoginPasswordFb") + Keys.ENTER);
    }
}
