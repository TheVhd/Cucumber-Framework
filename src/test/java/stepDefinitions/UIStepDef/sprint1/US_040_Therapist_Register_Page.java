package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.TherapistLogin;
import pages.TherapistRegister;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_040_Therapist_Register_Page {
    HomePage landingPage=new HomePage(driver);
    TherapistRegister theReg=new TherapistRegister(driver);
    TherapistLogin trLogin=new TherapistLogin(driver);

    @Given("User navigates to login Page")
    public void userNavigatestologinpage() {
        Driver.getDriver().get("https://test.hypnotes.net/");
    }

    @When("Users clicks Register is clickable")
    public void userVerifiesRegisterIsClickable() {

        Assert.assertTrue("US_040_TC_001_Register Button is not functioning", trLogin.register.isEnabled());
    }
    @Then("User Clicks Register link")
    public void userClicksRegisterlink() {trLogin.register.click();}


    @Then("User should be able to navigate to {string}")
    public void userVerifiesRegisterURLIs(String url) {
       Driver.getDriver().get(url);
    }

    @And("Register page loads {string}")
    public void registerPageLoads (String RegPage){
        ReusableMethods.waitFor(2);
        Assert.assertTrue("Page is not Available", theReg.therapistRegisterText.isDisplayed());
    }


}


