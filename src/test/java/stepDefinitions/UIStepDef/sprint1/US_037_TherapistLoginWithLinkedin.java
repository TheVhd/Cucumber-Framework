package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.TherapistLogin;
import utilities.ConfigReader;

import static stepDefinitions.Hooks.driver;

public class US_037_TherapistLoginWithLinkedin {
    TherapistLogin therapistLogin = new TherapistLogin(driver);

    @Then("user clicks on the Linkedin login icon")
    public void userClicksOnTheLinkedinLoginIcon() {
        therapistLogin.linkedinLoginButton.click();
    }

    @Then("user enters an email address for Linkedin")
    public void userEntersAnEmailAddressForLinkedin() {
        therapistLogin.linkedinEmailBox.sendKeys(ConfigReader.getProperty("TherapistLoginEmail"));
    }

    @And("user enters a password for Linkedin")
    public void userEntersAPasswordForLinkedin() {
        therapistLogin.linkedinPasswordBox.sendKeys(ConfigReader.getProperty("therapistPassword") + Keys.ENTER);
    }


}
