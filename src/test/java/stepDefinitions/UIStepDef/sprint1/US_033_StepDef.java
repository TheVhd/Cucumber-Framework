package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.TherapistRegister;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;



import static stepDefinitions.Hooks.driver;

public class US_033_StepDef {


    HomePage homePage=new HomePage(driver);
    TherapistRegister therapistRegister=new TherapistRegister(driver);


    @Given("User should go to {string}")
    public void user_should_go_to(String url) {

        Driver.getDriver().get(ConfigReader.getProperty("hypnotesURL"));

    }
    @When("User should click sign up button")
    public void user_should_click_sign_up_button() {

        homePage.signUp.click();


    }
    @And("User should click therapist button")
    public void user_should_click_therapist_button() {

        homePage.therapistButton.click();

    }
    @And("User should click and verify already have an account login button is clickable")
    public void user_should_click_and_verify_already_have_an_account_login_button_is_clickable() {

        ReusableMethods.waitForClickablility(therapistRegister.login_Link,5);
        ReusableMethods.verifyElementClickable(therapistRegister.login_Link);

        therapistRegister.login_Link.click();

    }
    @Then("User should see new URL as {string}")
    public void user_should_see_new_url_as(String expectedLoginLink) {


        Assert.assertEquals(" Url does not match" ,Driver.getDriver().getCurrentUrl(), expectedLoginLink);

    }

}
