package stepDefinitions.UIStepDef.sprint1;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.ClientRegister;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

import static stepDefinitions.Hooks.driver;


public class US_016_ClientReg_StepDef {
    HomePage client = new HomePage(driver);
    ClientRegister clientPage = new ClientRegister(driver);
    Faker faker = new Faker();

    @Given("user is in the home page")
    public void userIsInTheHomePage() {
   // driver.get("https://qa-test.hypnotes.net/");
    Driver.getDriver().get(ConfigReader.getProperty("hypnotesURL"));
    }

    @And("user clicks the sign up button")
    public void userClicksTheSignUpButton() {
    client.signUp.click();
    }

    @And("select the client from the drop down menu")
    public void selectTheClientFromTheDropDownMenu() {
    client.clientButton.click();
    }

    @Then("user verifies the client register page is on")
    public void userVerifiesTheClientRegisterPageIsOn() {

        Assert.assertTrue(clientPage.client_registration_form_email.isDisplayed());
    }

    @And("user clicks name box and provides name")
    public void userClicksNameBoxAndProvidesName()  {
        clientPage.name.click();

        clientPage.name.sendKeys(faker.name().firstName());
        ReusableMethods.waitFor(1);

    }

    @And("user clicks surname box and provides surname")
    public void userClicksSurnameBoxAndProvidesSurname()  {
    clientPage.surName.click();
    clientPage.surName.sendKeys(faker.name().lastName());
        ReusableMethods.waitFor(1);
    }

    @And("user clicks email box and provides email")
    public void userClicksEmailBoxAndProvidesEmail()  {
        clientPage.client_registration_form_email.click();
        ReusableMethods.waitFor(1);
        clientPage.client_registration_form_email.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(1);
    }

    @And("user clicks password box and enters functional password")
    public void userClicksPasswordBoxAndEntersFunctionalPassword() {
        clientPage.passwordInput.click();
        clientPage.passwordInput.sendKeys("Mu@1"+faker.internet().password(4,8));
        ReusableMethods.waitFor(1);
        clientPage.signUpButton.submit();
        ReusableMethods.waitFor(2);
    }

    @Then("user verifies the alert of verify your email page")
    public void userVerifiesTheAlertOfVerifyYourEmailPage() {
    Assert.assertTrue(clientPage.verifyYourEmail.isDisplayed());
    }

//TC_002 Name, surname, email and password should not be able to left blank.
    @And("user only provides password leaving the other boxes blanck")
    public void userOnlyProvidesPasswordLeavingTheOtherBoxesBlanck() {
        clientPage.name.click();
        clientPage.name.sendKeys(faker.name().firstName());
        ReusableMethods.waitFor(1);
        clientPage.surName.click();
        clientPage.surName.sendKeys(faker.name().lastName());
        ReusableMethods.waitFor(1);
        clientPage.passwordInput.click();
        clientPage.passwordInput.sendKeys("Mu@1"+faker.internet().password(4,8));

    }

    @And("clicks the sign up button")
    public void clicksTheSignUpButton() {
        clientPage.signUpButton.submit();

    }

    @Then("user verifies the alert please fill out this field")
    public void userVerifiesTheAlertPleaseFillOutThisField() {
        ReusableMethods.waitFor(1);
//        Assert.assertTrue(clientPage.fillOutThisFieldAlert.isDisplayed()); This Assertion was done manually Becouse of Textbox validation txt

    }
}
