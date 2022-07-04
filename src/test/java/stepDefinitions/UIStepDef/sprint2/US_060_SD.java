package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TherapistLogin;
import utilities.Driver;

import static stepDefinitions.Hooks.driver;

public class US_060_SD {

    TherapistLogin therapistLogin = new TherapistLogin(driver);


    @Given("The user goes to {string}")
    public void theUserGoesTo(String arg0) {

    }

    @Then("the user  clicks the {string} button")
    public void theUserClicksTheButton(String arg0) {
    }

    @And("User should click on {string} tab")
    public void userShouldClickOnTab(String arg0) {
    }

    @Then("user should go to a client and click")
    public void userShouldGoToAClientAndClick() {
    }

    @Then("user should scroll down")
    public void userShouldScrollDown() {
    }

    @And("User should go to meetings button")
    public void userShouldGoToMeetingsButton() {
    }

    @And("meeting button should be clickable")
    public void meetingButtonShouldBeClickable() {
    }

    @When("User clicks on meetings button")
    public void userClicksOnMeetingsButton() {
    }

    @Then("meetings should be appear")
    public void meetingsShouldBeAppear() {
    }

    @When("User click meetings button")
    public void userClickMeetingsButton() {
    }

    @Then("{string} and  {string} buttons should be visible")
    public void andButtonsShouldBeVisible(String arg0, String arg1) {
    }

    @Then("{string} and {string} buttons should be enabled")
    public void andButtonsShouldBeEnabled(String arg0, String arg1) {
    }
}
