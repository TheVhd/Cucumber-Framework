package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Therapist;

import static stepDefinitions.Hooks.driver;

public class US_043_ThrpstAddClient_StepDf {

    Therapist thrpst = new Therapist(driver);

    @And("User verifies AddClient text is visible")
    public void userVerifiesAddClientTextIsVisible() {
        Assert.assertTrue(thrpst.addClientLink.isDisplayed());
    }

    @Then("User verifies AddClient is clickable")
    public void userVerifiesAddClientIsClickable() {
        Assert.assertTrue(thrpst.addClientLink.isEnabled());
        thrpst.addClientLink.click();
    }
}
