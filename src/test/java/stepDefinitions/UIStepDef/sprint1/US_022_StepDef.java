package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ClientRegister;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_022_StepDef {


    HomePage homePage=new HomePage(driver);
    ClientRegister clientRegister=new ClientRegister(driver);


    @Given("User goes to  {string}")
    public void user_goes_to(String url)  {

        Driver.getDriver().get(ConfigReader.getProperty("hypnotesURL"));

    }

    @When("User clicks sign up button")
    public void user_clicks_sign_up_button() {

        homePage.signUp.click();

    }

    @And("User clicks client button")
    public void user_clicks_client_button() {

        homePage.clientButton.click();

    }

    @And("User clicks and verifies the already have an account login button")
    public void user_clicks_and_verifies_the_already_have_an_account_login_button()  {


        ReusableMethods.waitForClickablility(clientRegister.loginLinkAlready,5);
        ReusableMethods.verifyElementClickable(clientRegister.loginLinkAlready);

        clientRegister.loginLinkAlready.click();


    }

    @Then("User should able to see new URL as {string}")
    public void user_should_able_to_see_new_url_as(String expectedLoginLink) {

        Assert.assertEquals("Url does not match" ,Driver.getDriver().getCurrentUrl(), expectedLoginLink);


    }

}
