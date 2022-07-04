package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.ClientRegister;
import pages.HomePage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_015 {
    HomePage hp = new HomePage(driver);
    ClientRegister clientRegister= new ClientRegister(driver);

    @And("user should be able click on LinkedIn button on the right of the page.")
    public void userShouldBeAbleClickOnLinkedInButtonOnTheRightOfThePage() {
        clientRegister.cookies.click();
        clientRegister.linkedinLoginButton.click();

    }

    @When("the user logs in with LinkedIn,")
    public void theUserLogsInWithLinkedIn() {
        clientRegister.linkedinEmailBox.sendKeys("conclienhypnotes@gmail.com" );
        clientRegister.linkedinPasswordBox.sendKeys("Tayfa.client"+ Keys.ENTER);
        ReusableMethods.waitFor(15);
    }


}
