package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import static stepDefinitions.Hooks.driver;
public class US_021_StepDef {


    HomePage homePage = new HomePage(driver);

    @Given("user goes to {string} page")
    public void user_goes_to_page(String url) {

        Driver.getDriver().get(ConfigReader.getProperty("hypnotesURL"));

    }
    @When("user clicks the sign up")
    public void user_click_the_sign_up()  {

        homePage.signUp.click();

    }
    @And("user sees different options as client and therapist")
    public void user_sees_different_options_as_client_and_therapist()   {

        Assert.assertTrue(homePage.clientButton.isDisplayed());
        Assert.assertEquals(homePage.clientButton.getText(), "Client");

        Assert.assertTrue(homePage.therapistButton.isDisplayed());
        Assert.assertEquals(homePage.therapistButton.getText(), "Therapist");

    }
    @And("user clicks therapist link")
    public void user_clicks_therapist_link() {

        homePage.therapistButton.click();
    }
    @Then("user should be in {string} page")
    public void user_should_be_in_page(String expectedRegisterLink) {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedRegisterLink);

    }

}

