package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Clients_056;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;


public class US_056_StepDefs {

    Clients_056 clients_56 = new Clients_056(driver);
    @And("User clicks the client button")
    public void userClicksTheClientButton() {
        ReusableMethods.waitForClickablility(clients_56.clientsIcon,5);
        clients_56.clientsIcon.click();
    }


    @And("User clicks View Detail button")
    public void userClicksViewDetailButton() {
        clients_56.viewDetailButton.click();
    }


    @And("user verifies the current url contains{string}")
    public void userVerifiesTheCurrentUrlContains(String str) {
       // Assert.assertTrue(driver.getCurrentUrl().contains(str));       //Condition
     //   Assert.assertTrue("The current url contains "+str, driver.getCurrentUrl().contains(str));
  //      ReusableMethods.verifyUrlContains("https://test.hypnotes.net/dashboard/client");   Bu Reusable degil.
        ReusableMethods.verifyUrlContains(str);
     //   Assert.assertTrue(driver.getCurrentUrl().contains(ConfigReader.getProperty("clientUrl")));
      //  Assert.assertEquals(ConfigReader.getProperty("clientUrl"),driver.getCurrentUrl());

    }

    @Then("user verifies {string} button is visible")
    public void userVerifiesButtonIsVisible(String text) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[text() = '"+text+"']"));

        Assert.assertTrue(element.isDisplayed());





    }
}
