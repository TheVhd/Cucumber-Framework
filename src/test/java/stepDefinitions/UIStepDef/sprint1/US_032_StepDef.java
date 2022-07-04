package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_032_StepDef {
HomePage hp=new HomePage(driver);

    @When("User click SignUp Button")
    public void userClickSignUpButton() {
        hp.signUp.click();
    }

    @Then("Client verifies the titles are visible")
    public void clientVerifiesTheTitlesAreVisible() {
        Assert.assertTrue("US_032_TC001_client button not visible", hp.clientButton.isDisplayed());
    }

    @Then("Client verifies Client Register is clickable")
    public void clientVerifiesClientRegisterIsClickable() {
        WebElement ClientButton=driver.findElement(By.xpath("//a[normalize-space()='Client']"));

        Assert.assertTrue("US_032_TC001_client button not selected",ClientButton.isEnabled() );
    }

    @When("Client clicks on the Client Register link")
    public void clientClicksOnTheClientRegisterLink() {
        hp.clientButton.click();
    }

    @Then("Client verifies the url is {string}")
    public void clientVerifiesTheUrlIs(String URL) {
        Assert.assertTrue("US_032_TC003_ Url verifies is failed", driver.getCurrentUrl().equals(URL));
    }



}
