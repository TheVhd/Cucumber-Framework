package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Clients_056;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

import static java.awt.SystemColor.window;
import static stepDefinitions.Hooks.driver;

public class US_072_StepDefs {
    Clients_056 session = new Clients_056(driver);

    @And("User clicks session icon")
    public void userClicksSessionIcon() {
        ReusableMethods.waitFor(1);
        session.sessions.click();
    }

//    @And("User clicks add new session button")
//    public void userClicksAddNewSessionButton() {
//        ReusableMethods.waitFor(4);
//        session.addNewSessionButton.click();
//    }

    @And("User clicks the Key Points text box")
    public void userClicksTheKeyPointsTextBox() {
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollToView(driver,session.keyPoints);
        ReusableMethods.clickWithJS(session.keyPoints);
    }

    @And("User sends the text {string}")
    public void userSendsTheText(String arg0) {
        session.keyPoints.clear();
        session.keyPoints.sendKeys(arg0+Keys.TAB);


    }

    @Then("User verifies the Note updated toast message appears")
    public void userVerifiesTheNoteUpdatedToastMessageAppears() {
        Assert.assertTrue(session.toastMessage.isDisplayed());
    }


    @And("User clicks After thought text box")
    public void userClicksAfterThoughtTextBox() {
        ( (JavascriptExecutor)driver).executeScript("window.scrollTo(0, 500)");
        ReusableMethods.clickWithJS(session.afterThoughts);
    }

    @And("User sends the text {string} into the After thought text box")
    public void userSendsTheTextIntoTheAfterThoughtTextBox(String arg0) {
        session.keyPoints.clear();
        session.keyPoints.sendKeys(arg0+Keys.TAB);

    }

    @Then("User verifies the After thought updated toast message appears")
    public void userVerifiesTheAfterThoughtUpdatedToastMessageAppears() {
        Assert.assertTrue(session.toastMessage.isDisplayed());
    }


    @And("User clicks suggestions text box")
    public void userClicksSuggestionsTextBox() {
        ( (JavascriptExecutor)driver).executeScript("window.scrollTo(0, 800)");
        ReusableMethods.clickWithJS(session.suggestions);
    }

    @And("User sends the text {string} into the suggestions text box")
    public void userSendsTheTextIntoTheSuggestionsTextBox(String arg0) {
        session.suggestions.clear();
        session.suggestions.sendKeys(arg0+Keys.TAB);
    }

    @Then("User verifies the suggestions updated toast message appears")
    public void userVerifiesTheSuggestionsUpdatedToastMessageAppears() {
        Assert.assertTrue(session.toastMessage.isDisplayed());
    }






}
