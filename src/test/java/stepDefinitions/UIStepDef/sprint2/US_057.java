package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Cookie;
import pages.LoginPageCB;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;


public class US_057 {

    LoginPageCB page = new LoginPageCB(driver);


     @When("user types {string} to the email input on the login page.us057")
    public void userTypesToTheEmailInputOnTheLoginPage(String email) {
        page.emailInput.sendKeys(email);


     }

    @When("user types {string} to the password input on the login page")
    public void userTypesToThePasswordInputOnTheLoginPage(String pass) {
        page.passwordInput.sendKeys(pass);
    }


    @When("user clicks on the login button on the login page")
    public void userClicksOnTheLoginButtonOnTheLoginPage() {
        ReusableMethods.clickWithJS(page.loginButton);
    }

    @When("user clicks on the Client link")
    public void userClicksOnTheClientLink() {
        ReusableMethods.clickWithJS(page.clientLink);
    }

    @When("user clicks on the Viev Detail button")
    public void userClicksOnTheVievDetailButton() {
        ReusableMethods.clickWithJS(page.viewDetailButton);
        //ReusableMethods.waitFor(2);
    }

    @Then("user verifies the Presenting Issues button is clickable")
    public void userVerifiesThePresentingIssuesButtonIsClickable() {
       ReusableMethods.clickWithJS(page.presentingIssueButton);

    }

    @When("user logs out of the system")
    public void userLogsOutOfTheSystem() {
        ReusableMethods.clickWithJS(page.logoutButton);
    }

    @And("user can see Generalized Anxiety Disorder link")
    public void userCanSeeGeneralizedAnxietyDisorderLink() {
        ReusableMethods.waitFor(2);
       page.title2.isDisplayed();



    }

    @And("Social Phobia button can be seen")
    public void socialPhobiaButtonCanBeSeen() {
        Assert.assertTrue(page.socialPhobia.isDisplayed());
    }

    @When("Social Phobia button clikable")
    public void socialPhobiaButtonClikable() {
        ReusableMethods.waitForClickablility(page.socialPhobia,2);
        page.socialPhobia.click();
       //ReusableMethods.clickWithJS(page.socialPhobia);

    }

    @And("Paranoid Personality Disorder button clikable")
    public void paranoidPersonalityDisorderButtonClikable() {
        ReusableMethods.clickWithJS(page.paranoidPersDisorder);
    }

    @And("user  can see  Title, Description, Attachment Titles")
    public void userCanSeeTitleDescriptionAttachmentTitles() {
      Assert.assertTrue(page.Title.isDisplayed());
    }

    }

