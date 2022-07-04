package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.ClientRegister;
import pages.HomePage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_014 {


    HomePage hp = new HomePage(driver);
    ClientRegister clientRegister= new ClientRegister(driver);

    @And("user should be able click on Facebook button on the right of the page.")
    public void userShouldBeAbleClickOnFacebookButtonOnTheRightOfThePage() {
        clientRegister.cookies.click();
        clientRegister.facebookLoginButton.click();

    }

    @When("the user logs in with Facebook,")
    public void theUserLogsInWithFacebook() {
        clientRegister.facebookEmailBox.sendKeys("conclienhypnotes@gmail.com");
        clientRegister.facebookPasswordBox.sendKeys("Tayfa.client" + Keys.ENTER);
        ReusableMethods.waitFor(15);
    }
}
