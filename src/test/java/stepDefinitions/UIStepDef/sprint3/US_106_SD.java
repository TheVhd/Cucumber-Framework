package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TherapistProfil;
import utilities.BrowserUtilies;

import static stepDefinitions.Hooks.driver;

public class US_106_SD {

    TherapistProfil therapistProfil = new TherapistProfil(driver);

    @Given("the user clicks the {string} Button")
    public void theUserClicksTheButton(String text) {

        BrowserUtilies.clickWithJS(therapistProfil.dashboardProfileButton);    }

    @Given("the user verifies {string} heading and {string} text is visible")
    public void theUserVerifiesHeadingAndTextIsVisible(String text, String text1) {

        Assert.assertTrue(therapistProfil.yourProfile.isDisplayed());
        Assert.assertTrue(therapistProfil.about.isDisplayed());
    }

    @And("the user verifies {string} and {string} Profile information of the therapist should be visible")
    public void theUserVerifiesAndProfileInformationOfTheTherapistShouldBeVisible(String text, String text1) {

        Assert.assertTrue(therapistProfil.profil_name.isDisplayed());
        Assert.assertTrue(therapistProfil.profil_mail.isDisplayed());
    }

    @Then("the user verifies that {string} button is visible")
    public void theUserVerifiesThatButtonIsVisible(String text) {

        Assert.assertTrue(therapistProfil.Educations.isDisplayed());
        Assert.assertTrue(therapistProfil.Experiences.isDisplayed());
        Assert.assertTrue(therapistProfil.specialties_Certifications.isDisplayed());
        Assert.assertTrue(therapistProfil.your_Company.isDisplayed());
    }

    @When("the page is loaded, the {string} section should be open and the {string} button should be visible")
    public void thePageIsLoadedTheSectionShouldBeOpenAndTheButtonShouldBeVisible(String text, String text1) {

        Assert.assertTrue(therapistProfil.addNewEducation.isDisplayed());
        Assert.assertTrue(therapistProfil.educations_1.isDisplayed());

    }

    @And("the user previously {string} should be visible when entering the page")
    public void theUserPreviouslyShouldBeVisibleWhenEnteringThePage(String text) {

        Assert.assertTrue(therapistProfil.addedEducations.isDisplayed());

    }

    @And("the user verifies that {string} button should be clickable")
    public void theUserVerifiesThatButtonShouldBeClickable(String text) {
        Assert.assertTrue(therapistProfil.addNewEducation.isEnabled());
    }


}
