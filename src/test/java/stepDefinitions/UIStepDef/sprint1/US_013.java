package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.ClientRegister;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_013 {

    HomePage hp = new HomePage(driver);
    ClientRegister clientRegister= new ClientRegister(driver);

    @Given("client should be able to navigate to hypnotes.net website by using the link.")
    public void clientShouldBeAbleToNavigateToHypnotesNetWebsiteByUsingTheLink() {
        driver.get("https://test.hypnotes.net");

    }

    @And("user should be able click on sign up button on the right top of the page.")
    public void userShouldBeAbleClickOnSignUpButtonOnTheRightTopOfThePage() {
        hp.signUp.click();

    }

    @And("user should be able to select client from list.")
    public void userShouldBeAbleToSelectClientFromList() {
        hp.clientButton.click();
    }

    @And("user should be able click on google button on the right of the page.")
    public void userShouldBeAbleClickOnGoogleButtonOnTheRightOfThePage() {
        clientRegister.cookies.click();
        clientRegister.googleSignIn.click();
    }

    @When("the user logs in with google,")
    public void theUserLogsInWithGoogle() {
        clientRegister.googleEmailBox.sendKeys("conclienhypnotes@gmail.com" + Keys.ENTER);
        clientRegister.googlePasswordBox.sendKeys("Tayfa.client" + Keys.ENTER);
        ReusableMethods.waitFor(15);


    }
}
