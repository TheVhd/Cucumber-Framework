package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Therapist;

import static stepDefinitions.Hooks.driver;

public class US_042_ThrpstClient_StepDf {
    Therapist thrpst = new Therapist(driver);

    @And("User verifies Client text is visible")
    public void userVerifiesClientTextIsVisible() {
        Assert.assertTrue(thrpst.clientsLink.isDisplayed());
    }

    @Then("User verifies Client is clickable")
    public void userVerifiesClientIsClickable() {
        Assert.assertTrue(thrpst.clientsLink.isEnabled());
        thrpst.clientsLink.click();
    }
}
