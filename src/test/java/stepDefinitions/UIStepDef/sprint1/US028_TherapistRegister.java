package stepDefinitions.UIStepDef.sprint1;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TherapistRegister;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US028_TherapistRegister {

    TherapistRegister therapistRegister= new TherapistRegister(driver);
    Faker faker= new Faker();


//    @Given("user is in the home page")
//    public void userIsInTheHomePage() {
//        driver.get(ConfigReader.getProperty("hypnotesURL"));
//
//
//    }

    @And("User select Therapist form SignUp drop down")
    public void userSelectTherapistFormSignUpDropDown() {
        therapistRegister.signUpDropdown.click();
        therapistRegister.dropdownTherapist.click();
    }


    @And("user clicks full name box and provides full name")
    public void userClicksFullNameBoxAndProvidesFullName() {
        therapistRegister.fullName.sendKeys(faker.name().fullName());
    }

    @And("user clicks email box and provides  email")
    public void userClicksEmailBoxAndProvidesEmail() {
        therapistRegister.registration_form_email.sendKeys(faker.internet().emailAddress());
    }

    @And("user clicks password provides password")
    public void userClicksPasswordProvidesPassword() {
        therapistRegister.passwordInput.sendKeys("Ademoglunun50yili!" + Keys.ENTER);
    }

    @And("user accept cookies")
    public void userAcceptCookies() {
        therapistRegister.acceptCookies.click();
    }

    @Then("user assert verify your email is visible")
    public void userAssertVerifyYourEmailIsVisible() {

        Assert.assertTrue(therapistRegister.verifyEmailText.isDisplayed());
    }

    @And("user clicks email box and provides invalid  email")
    public void userClicksEmailBoxAndProvidesInvalidEmail() {
        therapistRegister.registration_form_email.sendKeys("chnbulutcom");
    }

    @Then("user verifies the message of please enter a valid email is visible")
    public void userVerifiesTheMessageOfPleaseEnterAValidEmailIsVisible() {
        Assert.assertTrue(therapistRegister.messageOfValidMail.isDisplayed());
    }
}
