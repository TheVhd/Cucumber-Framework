package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.plugin.event.Node;
import org.junit.Assert;
import pages.ClientRegister;
import pages.Dashboard;
import pages.TherapistRegister;
import utilities.BrowserUtilies;

import static stepDefinitions.Hooks.driver;

public class US_059_SD {

    TherapistRegister therapistRegister = new TherapistRegister(driver);

    ClientRegister clientRegister = new ClientRegister(driver);
    Dashboard Dashboard = new Dashboard(driver);


    @Then("{string} must be clickable and the relevant page must be visible and {string} should appear on the page that opens.")
    public void mustBeClickableAndTheRelevantPageMustBeVisibleAndShouldAppearOnThePageThatOpens(String text, String text1) {

        BrowserUtilies.clickWithJS(Dashboard.documents);

        Assert.assertTrue(Dashboard.documents.isDisplayed());

    }

    @Then("{string} must be clickable  and the relevant page must be visible.")
    public void mustBeClickableAndTheRelevantPageMustBeVisible(String text) {

        BrowserUtilies.clickWithJS(Dashboard.uploadedDocuments);

        Assert.assertTrue(Dashboard.uploadedDocuments.isDisplayed());

    }

    @And("{string} should be  clickable")
    public void shouldBeClickable(String text) {

        BrowserUtilies.clickWithJS(Dashboard.signedDocuments);

        Assert.assertTrue(Dashboard.signedDocuments.isDisplayed());

        BrowserUtilies.clickWithJS(Dashboard.invoices);

    }

    @Then("{string}should show the correct result")
    public void shouldShowTheCorrectResult(String text) {

        Assert.assertTrue(Dashboard.invoices.isDisplayed());

    }
}
