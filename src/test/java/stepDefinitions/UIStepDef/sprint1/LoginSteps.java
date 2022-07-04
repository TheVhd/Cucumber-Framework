package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ClientRegister;
import pages.HomePage;
import pages.TherapistLogin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class LoginSteps{

HomePage homePage=new HomePage(driver);
TherapistLogin tpl = new TherapistLogin(driver);
ClientRegister clientRegister=new ClientRegister(driver);



    @Given("User go to {string}")
    public void user_go_to(String url) {
        driver.get(ConfigReader.getProperty(url));


    }

    @Then("User enter {string}")
    public void userEnter(String email) {
        // login page
        if(tpl.acceptButton.isDisplayed())
        {
            tpl.acceptButton.click();
        }

        tpl.loginEmail.sendKeys(ConfigReader.getProperty(email));
    }

    @And("User enter password {string}")
    public void userEnterPassword(String password) {
        tpl.loginPassword.sendKeys(ConfigReader.getProperty(password));
    }

    @When("User click Login Button")
    public void userClickLoginButton() {
        homePage.login.click();
    }

    @Then("User click Login Enter Button")
    public void userClickLoginEnterButton() {
        ReusableMethods.clickWithJS(tpl.loginEnterButton);
    }

    @And("User exits successfully")
    public void userClosesThePage() {
       Driver.closeDriver();
    }



}
