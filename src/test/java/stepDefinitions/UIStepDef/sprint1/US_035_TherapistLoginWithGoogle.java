package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TherapistLogin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_035_TherapistLoginWithGoogle {
    TherapistLogin therapistLogin = new TherapistLogin(driver);

    @Then("user clicks on the Google login icon")
    public void userClicksOnTheGoogleLoginIcon() {
        therapistLogin.googleLoginButton.click();
    }

    @Then("user enters email address for Google")
    public void userEntersEmailAddressForGoogle() {
        therapistLogin.googleEmailBox.sendKeys(ConfigReader.getProperty("TherapistLoginEmail") + Keys.ENTER);
    }

    @And("user enters password for Google")
    public void userEntersPasswordForGoogle() {
        therapistLogin.googlePasswordBox.sendKeys(ConfigReader.getProperty("therapistPassword") + Keys.ENTER);
    }

    @And("user verifies current URL is {string}")
    public void userVerifiesCurrentURLIs(String login) {
        ReusableMethods.waitFor(2);
        Assert.assertEquals(ConfigReader.getProperty(login), Driver.getDriver().getCurrentUrl());
    }
}
