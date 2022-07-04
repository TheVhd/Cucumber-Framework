package stepDefinitions.UIStepDef.sprint1;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TherapistRegister;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_029_First {
    TherapistRegister therapistRegister = new TherapistRegister(driver);
    Faker faker = new Faker();
    Actions actions=new Actions(driver);

//    @And("user clicks email box and provides valid email")
//    public void userClicksEmailBoxAndProvidesValidEmail() {
//        therapistRegister.registration_form_email.sendKeys(faker.internet().emailAddress());

        @When("cihan types {string} to the email input")
        public void cihanTypesToTheEmailInput() {
            therapistRegister.registration_form_email.sendKeys(faker.internet().emailAddress());
        }

    @And("user enter valid password")
    public void userEnterValidPassword() {
        therapistRegister.passwordInput.sendKeys("Ademoglunun50yili!");

    }

    @Then("user verifies color changed to green")
    public void userVerifiesColorChangedToGreen() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        Assert.assertTrue(therapistRegister.validList.size()==5);

    }

    @And("user clicks password and does not provides appropriate password")
    public void userClicksPasswordAndDoesNotProvidesAppropriatePassword() {
        therapistRegister.passwordInput.sendKeys("----");
    }

    @Then("user verifies color  changed to red")
    public void userVerifiesColorChangedToRed() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);

        Assert.assertTrue(therapistRegister.invalidList.size()==5);
    }


}