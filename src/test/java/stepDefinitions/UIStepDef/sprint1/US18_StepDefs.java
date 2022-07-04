package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ClientRegister;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US18_StepDefs {

    ClientRegister clientRegister = new ClientRegister(driver);

////    @Given("user goes to the {string}")
////    public void userGoesToThe(String string) {
////        driver.get(string);
//
//    }

//    @When("user types {string} to the name input")
//    public void userTypesToTheNameInput(String arg0) {
//        clientRegister.name.sendKeys(arg0);
//    }

//    @When("user types {string} to the surname input")
//    public void userTypesToTheSurnameInput(String arg0) {
//        clientRegister.surName.sendKeys(arg0);
//    }
//
//    @When("user types {string} to the email input")
//    public void userTypesToTheEmailInput(String arg0) {
//        clientRegister.client_registration_form_email.sendKeys(arg0);
//    }

    @When("user types {string} to the client password input")
    public void userTypesToTheClientPasswordInput(String arg0)  {
        clientRegister.passwordInput.click();
        clientRegister.passwordInput.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }

    @Then("user verifies length of valid list as {string}")
    public void userVerifiesLengthOfValidListAs(String arg0)  {
        Assert.assertEquals(clientRegister.validList.size(),Integer.parseInt(arg0));
        ReusableMethods.waitFor(2);
    }

    @Then("user verifies the client signup button is not clickable")
    public void userVerifiesTheClientSignupButtonIsNotClickable() {
        ReusableMethods.verifyElementNotClickable(clientRegister.signUpButton);
    }

    @Then("user verifies the client signup button is clickable")
    public void userVerifiesTheClientSignupButtonIsClickable() {
        ReusableMethods.verifyElementClickable(clientRegister.signUpButton);
    }
}
