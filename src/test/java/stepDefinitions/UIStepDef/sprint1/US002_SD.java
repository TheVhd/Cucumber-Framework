package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.US_002Pages;
import utilities.Driver;

import static stepDefinitions.Hooks.driver;

public class US002_SD {

   HomePage page= new HomePage(driver);


    @Then("User   verifies the titles are visible")
    public void user_verifies_the_titles_are_visible() {
        Assert.assertTrue(page.services.isDisplayed());
        Assert.assertTrue(page.aboutUs.isDisplayed());
        Assert.assertTrue(page.contactUs.isDisplayed());
        Assert.assertTrue(page.pricing.isDisplayed());
        Assert.assertTrue(page.howitworks.isDisplayed());
        Assert.assertTrue(page.login.isDisplayed());
        Assert.assertTrue(page.signUp.isDisplayed());

    }

    @Then("User verifies the titles are clickable")
    public void user_verifies_the_titles_are_clickable() {
        Assert.assertTrue(page.services.isEnabled());
        Assert.assertTrue(page.aboutUs.isEnabled());
        Assert.assertTrue(page.contactUs.isEnabled());
        Assert.assertTrue(page.pricing.isEnabled());
        Assert.assertTrue(page.howitworks.isEnabled());
        Assert.assertTrue(page.login.isEnabled());
        Assert.assertTrue(page.signUp.isEnabled());


    }




}
