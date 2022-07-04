package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Therapist;

import static stepDefinitions.Hooks.driver;

public class US_044_ThrpstDocuments_StepDf {

    Therapist thrpst = new Therapist(driver);

    @And("User verifies Documents text is visible")
    public void userVerifiesDocumentsTextIsVisible() {
        Assert.assertTrue(thrpst.documentsLink.isDisplayed());
    }

    @Then("User verifies Documents  is clickable")
    public void userVerifiesDocumentsIsClickable() {
        Assert.assertTrue(thrpst.documentsLink.isEnabled());
        thrpst.documentsLink.click();
    }
}
