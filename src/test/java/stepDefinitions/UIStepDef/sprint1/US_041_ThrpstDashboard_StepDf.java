package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Therapist;

import static stepDefinitions.Hooks.driver;

public class US_041_ThrpstDashboard_StepDf {
    Therapist thrpst = new Therapist(driver);


    @And("User verifies Dashboard text is visible")
    public void userVerifiesDashboardTextIsVisible() {

        Assert.assertTrue(thrpst.dashboardLink.isDisplayed());
    }

    @Then("User verifies Dashboard is clickable")
    public void userVerifiesDashboardIsClickable() {
        Assert.assertTrue(thrpst.dashboardLink.isEnabled());
        thrpst.dashboardLink.click();
    }
}
