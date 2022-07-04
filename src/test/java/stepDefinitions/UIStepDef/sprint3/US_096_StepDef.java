package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.Calendar;
import pages.CalendarPagCB;
import pages.RegisterCB;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_096_StepDef {

    RegisterCB register= new RegisterCB(driver);

    @Then("the user verifies the {string} is visible")
    public void theUserVerifiesTheIsVisible(String arg0) {
        ReusableMethods.verifyElementDisplayed(register.repeatOption);

    }

    @When("the user clicks on the {string} dropdown menu")
    public void theUserClicksOnTheDropdownMenu(String arg0) {
        ReusableMethods.scrollUntilEnd(driver);
        register.repeatOption.click();
    }

    @And("the user verifies that various options should be visible in the Repeat Options dropdown menu")
    public void theUserVerifiesThatVariousOptionsShouldBeVisibleInTheRepeatOptionsDropdownMenu() {

    }

    @And("the user verifies that {string} not visible when we select {string} option")
    public void theUserVerifiesThatNotVisibleWhenWeSelectOption(String arg0, String arg1) {
    }

    @And("the user verifies that {string} drop down menu is visible when we select any option")
    public void theUserVerifiesThatDropDownMenuIsVisibleWhenWeSelectAnyOption(String arg0) {
    }

    @Then("the user selects a number from Repeat times dropdown menu")
    public void theUserSelectsANumberFromRepeatTimesDropdownMenu() {
    }
}
