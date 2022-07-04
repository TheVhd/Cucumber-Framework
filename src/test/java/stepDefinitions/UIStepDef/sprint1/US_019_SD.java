package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ClientRegister;
import utilities.BrowserUtilies;

import static stepDefinitions.Hooks.driver;

public class US_019_SD {
    ClientRegister clientRegister = new ClientRegister(driver);

    @Given("the user lands on home page")
    public void theUserLandsOnHomePage() {

        driver.get("https://test.hypnotes.net");
    }

    @When("the user clicks the Sign Up Button")
    public void theUserClicksTheSignUpButton() {


        clientRegister.singUpButtonS.click();

    }

    @When("the user selects the Client option")
    public void theUserSelectsTheClientOption() {
        clientRegister.clientButton.click();


    }

    @And("the user enters a valid Username {string}")
    public void theUserEntersAValidUsername(String name) {


        BrowserUtilies.clickWithJS(clientRegister.cookies);
        //BrowserUtilies.clickWithJS(clientRegister.clossX);

       clientRegister.name.sendKeys(name);

    }

    @And("the user enters a valid Surname {string}")
    public void theUserEntersAValidSurname(String surname) {

        clientRegister.surName.sendKeys(surname);
    }


    @And("the user enters a valid Email {string}")
    public void theUserEntersAValidEmail(String email) {
        clientRegister.client_registration_form_email.sendKeys(BrowserUtilies.generateAnEmail());
    }

    @And("the user enters valid password {string}")
    public void theUserEntersValidPassword(String password) {

        clientRegister.passwordInput.sendKeys(password);
    }

    @Then("the user verifies that sign up button clickable")
    public void theUserVerifiesThatSignUpButtonClickable() {
        Assert.assertTrue(clientRegister.singUpButtonS.isEnabled());

    }

    @Then("the user verifies that the warning message {string} is displayed")
    public void theUserVerifiesThatTheWarningMessageIsDisplayed(String text) {

        BrowserUtilies.clickWithJS(clientRegister.signUpButton);
        String message = driver.findElement(By.cssSelector("form[method='POST'] p.mb-3")).getText();
        message = message.split("Send")[0].trim();
        Assert.assertEquals(text, message);
    }

    @Then("the user verifies that {string} button is functional")
    public void theUserVerifiesThatButtonIsFunctional(String string) {

        clientRegister.singUpButtonS.click();
        Assert.assertTrue(string, clientRegister.sendAgainEmail.isEnabled());

    }

    @And("the user clicks Send again! the Button")
    public void theUserClicksSendAgainTheButton() {

        BrowserUtilies.clickWithJS(clientRegister.sendAgainEmail);
    }

    @Then("the user verifies that {string} Button is clickable after the valid information is entere and clicks")
    public void theUserVerifiesThatButtonIsClickableAfterTheValidInformationIsEntereAndClicks(String text) {

        Assert.assertTrue(text, clientRegister.signUpButton.isEnabled());
    }

    @Then("the user verifies that warning message {string} is displayed")
    public void theUserVerifiesThatWarningMessageIsDisplayed(String text) {
        WebElement element = clientRegister.verifyEmail;

        System.out.println(element.getText());
    }

    @Then("the user verifies that the message {string} is displayed")
    public void theUserVerifiesThatTheMessageIsDisplayed(String text) {

        String message = driver.findElement(By.xpath("//a[@href='/register']/parent::p")).getText();
        Assert.assertEquals(text, message);



    }
}


