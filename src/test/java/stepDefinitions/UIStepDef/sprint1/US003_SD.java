package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.US_002Pages;

import static stepDefinitions.Hooks.driver;

public class US003_SD {
    HomePage page= new HomePage(driver);

    @Then("User verifies Try it for free and Sign in  are visible")
    public void user_verifies_try_it_for_free_and_sign_in_are_visible() {
       Assert.assertTrue(page.tryItFreeBanner.isDisplayed());
        Assert.assertTrue(page.signInLinkBanner.isDisplayed());


    }



    @Then("User verifies the Try it for free and Sign in are clickable")
    public void user_verifies_the_try_it_for_free_and_sign_in_are_clickable() {
       Assert.assertTrue(page.tryItFreeBanner.isEnabled());
       Assert.assertTrue(page.signInLinkBanner.isEnabled());

    }



}
