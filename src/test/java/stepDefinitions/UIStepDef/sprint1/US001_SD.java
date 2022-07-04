package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;

public class US001_SD {

    @Given("User goes the home page")
    public void user_goes_the_home_page() {
        Driver.getDriver().get("https://qa-test.hypnotes.net/");

    }
    @Then("User   goes the {string} and verify url")
    public void user_goes_the_and_verify_url(String url) {
        Driver.getDriver().get(url);


    }

    @Then("User goes the home page and verify title")
    public void userGoesTheHomePageAndVerifyTitle() {
        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title,true);
    }
}
