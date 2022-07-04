package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TherapistLogin;
import utilities.ConfigReader;
import utilities.Driver;

import static stepDefinitions.Hooks.driver;

public class US_034_TherapistCheckbox {
    TherapistLogin therapistLogin = new TherapistLogin(driver);

    @Given("user goes to {string}")
    public void userGoesTo(String url) {
        driver.get(ConfigReader.getProperty(url));
    }

    @And("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        therapistLogin.loginButton.click();
    }

    @Then("user verifies the therapist checkbox is visible")
    public void userVerifiesTheTherapistCheckboxIsVisible() {
        Assert.assertTrue(therapistLogin.therapistCheckbox.isDisplayed());
    }

    @And("user verifies the therapist checkbox is selected")
    public void userVerifiesTheTherapistCheckboxIsSelected() {
        if (!therapistLogin.therapistCheckbox.isSelected()) {
            therapistLogin.therapistCheckbox.click();
        }
        Assert.assertFalse(therapistLogin.therapistCheckbox.isSelected());
    }

    @Then("user closes the page")
    public void userClosesThePage() {
        Driver.closeDriver();
    }
}