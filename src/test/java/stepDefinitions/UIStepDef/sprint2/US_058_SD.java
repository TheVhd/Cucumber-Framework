package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ClientRegister;
import pages.Dashboard;
import pages.Therapist;
import pages.TherapistRegister;
import utilities.BrowserUtilies;
import utilities.ConfigReader;
import utilities.Driver;

import static stepDefinitions.Hooks.driver;

public class US_058_SD {
    TherapistRegister therapistRegister = new TherapistRegister(driver);
    ClientRegister clientRegister = new ClientRegister(driver);

    Dashboard Dashboard = new Dashboard(driver);

    @When("the user Therapist the Sign Up Button")
    public void theUserTherapistTheSignUpButton() {


        try {

            if (clientRegister.cookies.isDisplayed()) {
                clientRegister.cookies.click();
                clientRegister.clossX.click();
            }// hook a konulabilirmiydi
        } catch (Exception ex) {

        }

        clientRegister.signUpButton.click();

    }

    @And("the user selects the Therapist option")
    public void theUserSelectsTheTherapistOption() {
        therapistRegister.TherapistSelect.click();


    }

    @Then("the user  clicks the login link")
    public void theUserClicksTheLoginLink() {
        therapistRegister.login_Link.click();
    }

    @And("the user enters valid Email {string}")
    public void theUserEntersValidEmail(String text) {
        therapistRegister.TherapistLoginEmail.click();
        therapistRegister.TherapistLoginEmail.sendKeys(text);
        //therapistRegister.registration_form_email.click();
        // therapistRegister.registration_form_email.sendKeys(text);
    }

    @And("the user enters a valid password {string}")
    public void theUserEntersAValidPassword(String text) {
        therapistRegister.TherapistLoginPassword.click();
        therapistRegister.TherapistLoginPassword.sendKeys(text);

        //therapistRegister.passwordInput.click();
        //therapistRegister.passwordInput.sendKeys(text);
    }

    @Then("the user clicks the login Button")
    public void theUserClicksTheLoginButton() {
        therapistRegister.TherapistLoginButton.click();
        // therapistRegister.login_Link.click();

    }

    @Given("the user is  on the  {string}  should appear on the page that opens.")
    public void theUserIsOnTheShouldAppearOnThePageThatOpens(String text) {

        Assert.assertTrue(Dashboard.dashboardClients.isDisplayed());


    }

    @And("the user clicking on the Cleints button")
    public void theUserClickingOnTheCleintsButton() {

        Dashboard.dashboardClients.click();

    }

    @Then("the user should appear on the {string} that opens  And   the user clicks the  {string}")
    public void theUserShouldAppearOnTheThatOpensAndTheUserClicksThe(String text, String text1) {
        Assert.assertTrue(Dashboard.viewDetail.isDisplayed());
        Dashboard.viewDetail.click();
    }

    @Then("{string} must be clickable and the relevant page must be visible.")
    public void mustBeClickableAndTheRelevantPageMustBeVisible(String text) {

        Assert.assertTrue(Dashboard.sessionsBtn.isDisplayed());
        BrowserUtilies.clickWithJS(Dashboard.sessionsBtn);

    }

    @Then("{string} should appear on the page that opens.")
    public void shouldAppearOnThePageThatOpens(String text) {

        Assert.assertTrue(Dashboard.details.isDisplayed());

    }

    @And("{string} should be clickable")
    public void shouldBeClickable(String text) {
        BrowserUtilies.clickWithJS(Dashboard.details);

    }

    @Then("clicking on details should see various {string}")
    public void clickingOnDetailsShouldSeeVarious(String text) {

        Assert.assertTrue(Dashboard.details_Date.isDisplayed());

    }
}
