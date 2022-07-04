package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import pages.TherapistRegister;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_029_TherapistRegisterPassword {
    TherapistRegister page = new TherapistRegister(driver);

    @Given("user goes to the {string}")
    public void userGoesToThe(String url) {
        //Driver.getDriver().get(url);

        Driver.getDriver().get(ConfigReader.getProperty("environment") +url);
        Driver.getDriver().manage().addCookie(new Cookie("PHPSESSID","framg7lo5o20ddbql04dbhndct" ));
        Driver.getDriver().get(ConfigReader.getProperty("environment")+url);
    }

    @When("user types {string} to the fullname input")
    public void userTypesToTheFullnameInput(String arg0) {
        page.fullName.sendKeys(arg0);
    }

    @When("user types {string} to the email input")
    public void userTypesToTheEmailInput(String arg0) {
        page.registration_form_email.sendKeys(arg0); //
    }

    @When("user types {string} to the password input")
    public void userTypesToThePasswordInput(String arg0) {
        page.passwordInput.sendKeys(arg0);
    }


    @Then("user verifies length of valid list is {string}")
    public void userVerifiesLengthOfValidListIs(String arg0) {
        Assert.assertEquals(page.validList.size(), Integer.parseInt(arg0));
    }

    @Then("user verifies the signup button is not clickable")
    public void userVerifiesTheSignupButtonIsNotClickable() {
        ReusableMethods.verifyElementNotClickable( page.SignUpButton);
    }

    @Then("user verifies the signup button is clickable.us029")
    public void userVerifiesTheSignupButtonIsClickable() {
        ReusableMethods.verifyElementClickable( page.SignUpButton );
    }
}
