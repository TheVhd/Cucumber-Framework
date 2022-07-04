package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.TherapistRegister;
import utilities.Driver;

import java.util.List;

import static stepDefinitions.Hooks.driver;

public class US_030_SD {
    TherapistRegister page = new TherapistRegister(driver);
    @Given("User goes to the {string}.us030")
    public void userGoesToThe(String url) {
        Driver.getDriver().get(url);

    }

    @When("user types {string} to the fullname input.us030")
    public void userTypesToTheFullnameInput(String fullname) {
        page.fullName.sendKeys(fullname);
    }

    @When("user types {string} to the email input.us030")
    public void userTypesToTheEmailInput(String email) {
        page.registration_form_email.sendKeys(email);
    }

    @When("user types {string} to the password input.us030")
    public void userTypesToThePasswordInput(String password) {
        page.passwordInput.sendKeys(password);
    }

    @Then("user verifies the signup button is clickable")
    public void userVerifiesTheSignupButtonIsClickable() {
        Assert.assertTrue(page.SignUpButton.isEnabled());
        page.cookies.click();
    }

    @When("user clicks on signup button")
    public void userClicksOnSignupButton() {
        page.SignUpButton.click();
    }


    @Then("the user verifies that the warning message {string} is displayed.us030")
    public void theUserVerifiesThatTheWarningMessageIsDisplayed(String text) {
        System.out.println("test");
        WebElement element = driver.findElement(By.xpath("//div[contains(@class,'auth-form')]/p"));
        String expectedText = element.getText().split("\n")[0];
        Assert.assertEquals(expectedText, text);
    }

    @Then("User verifies {string}")
    public void userVerifies(String text) {
        List<WebElement> elements = page.verifyTexts;
        for (WebElement element: elements) {
            System.out.println(element.getText());

        }
    }

    @Then("User verifies Sign Up Button is clickable")
    public void userVerifiesSignUpButtonIsClickable() {
        Assert.assertTrue(page.textSignup.isEnabled());
    }

    @Then("User verifies Send again Button is clickable")
    public void userVerifiesSendAgainButtonIsClickable() {
        System.out.println("sdsd");
    }
}
