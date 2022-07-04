package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.HomePage;
import pages.ResetPassword;
import pages.TherapistRegister;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.io.PrintStream;

import static stepDefinitions.Hooks.driver;

public class US_039_StepDef {
    HomePage hp=new HomePage(driver);
    ResetPassword rp=new ResetPassword(driver);
    TherapistRegister tr=new TherapistRegister(driver);

    @When("Users click Login Button")
    public void usersClickLoginButton() {
        hp.login.click();
    }

    @Then("Users verifies Reset is clickable")
    public void usersVerifiesResetIsClickable() {

        Assert.assertTrue("US_039_TC_001_Reset Button is not selected", tr.reset.isEnabled());
    }


    @Then("Users click Reset Button")
    public void usersClickResetButton() {
        tr.reset.click();
    }


    @And("Users verifies the {string} is Forgot Password")
    public void usersVerifiesTheIsForgotPassword(String URL) {
        ReusableMethods.waitForPageToLoad(5);
        Assert.assertTrue("US_039_TC_002_Forgot Password page is not disappered", driver.getCurrentUrl().contains(URL));
    }

    @And("Users verifies that the Forgot Password window is reachable")
    public void usersVerifiesThatTheForgotPasswordWindowIsReachable() {
    Assert.assertTrue("US_039_TC03_Reset Email ulaşilabilir değil", rp.ResetEmail.isEnabled());
    }

    @And("User enters a {string}\\(positive)")
    public void userEntersAPositive(String validemail) {
        rp.ResetEmail.sendKeys(ConfigReader.getProperty(validemail));

    }

    @And("User enters a {string}")
    public void userEntersA(String invalidemail) {
        rp.ResetEmail.sendKeys(invalidemail);
    }
}
