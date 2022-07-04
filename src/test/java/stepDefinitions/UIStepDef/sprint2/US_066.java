package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.US_065_clientPage;
import utilities.ReusableMethods;

import static java.lang.Thread.sleep;
import static stepDefinitions.Hooks.driver;

public class US_066 {

    US_065_clientPage dr = new US_065_clientPage(driver);

    @When("User verifies the delete button is enabled")
    public void verify_deleteIssue(){
        ReusableMethods.verifyElementDisplayed(dr.deleteIssue);
    }
    @Then("User picks a client issue")
    public void selectIssue(){
        ReusableMethods.clickWithJS(dr.select_issue);
    }
    @Then("User click Delete Button")
    public void deleteIssue() throws InterruptedException {
        ReusableMethods.clickWithJS(dr.deleteIssue);
        sleep(250);
    }
    @And("User verifies the \"Yes\" \"No\" Buttons are visible")
    public void verify_delete_button() throws InterruptedException {
        ReusableMethods.verifyElementDisplayed(dr.yesDeleteButton);
        sleep(300);
        ReusableMethods.verifyElementDisplayed(dr.noDeleteButton);
    }
    @When("User Clicks on the Yes button")
    public void yes_delete_button(){
        ReusableMethods.clickWithJS(dr.yesDeleteButton);
    }
    @And("Successfully deleted message is displayed")
    public void success_delete_message(){
        ReusableMethods.verifyElementDisplayed(dr.issueDeleted);
    }


}
