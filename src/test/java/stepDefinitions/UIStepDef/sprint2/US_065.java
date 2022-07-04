package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.TherapistLogin;
import pages.US_065_clientPage;
import pages.TherapistRegister;
import stepDefinitions.Hooks;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

import static io.netty.handler.codec.rtsp.RtspHeaderValues.URL;
import static java.lang.Thread.sleep;
import static org.bouncycastle.crypto.tls.ConnectionEnd.client;
import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitForVisibility;

public class US_065 {

    US_065_clientPage navi = new US_065_clientPage(driver);
    Actions action = new Actions(driver);
    Cookie ck = new Cookie("PHPSESSID", "tpj6k31qaoum3mi1bit622rha1");

    @When("User navigates to {string}")
    public void navigate_to_client(String url) {
        driver.get(ConfigReader.getProperty("HypnotesTestUrl") + url);
        driver.manage().addCookie(new Cookie("PHPSESSID", "5t53ofu7ntf721lg7ucg7jno61"));
        driver.get(ConfigReader.getProperty("HypnotesTestUrl") + url);
        ReusableMethods.clickWithJS(navi.client_p);
    }

    @And("User verifies the Clients name {string}")
    public void verify_clients_name(String arg) {
        Assert.assertTrue("Name Not Correct", navi.client_name.isDisplayed());
    }

    @And("User verifies the phone field is displayed")
    public void verify_clients_phone() {
        Assert.assertTrue("Phone Numbers Do not match", navi.client_phone.isDisplayed());
    }

    @And("User verifies the time zone is displayed")
    public void verify_time_zone() {

        Assert.assertTrue("time zone does not match", navi.timeZone.isDisplayed());
    }

    @When("User opens client chart")
    public void open_client_chart() {
        ReusableMethods.clickWithJS(navi.client_chart);
    }

    @Then("User navigates to presenting_issue section")
    public void presenting_iss() {
        ReusableMethods.clickWithJS(navi.presenting_issue);
    }

    @Then("User Verifies the additional notes field is visible")
    public void additional_notes() {
        ReusableMethods.verifyElementDisplayed(navi.additional_notes);
    }

    @And("User Verifies the attachments field is visible")
    public void attachments() {
        ReusableMethods.verifyElementDisplayed(navi.attachments);
    }

    @And("Voice notes field is visible")
    public void voiceNotes() {
        ReusableMethods.verifyElementDisplayed(navi.addVoice);
    }

    @And("User User Clicks on additional notes sections")
    public void add_notes() throws InterruptedException {
        ReusableMethods.clickWithJS(navi.addNote);
    }

    @And("User Adds some notes")
    public void add_some_notes() {
        navi.addNote.sendKeys("Test Scope_1");
    }

    @And("User Verifies the note added")
    public void verify_note() {
        //ReusableMethods.verifyElementDisplayed(navi.addNote);
        Assert.assertTrue("Text not visible", navi.addNote.isDisplayed());
    }

    @And("User adds a file")
    public void add_file() {
        String fPath = "C:\\Users\\vtest\\OneDrive\\Desktop\\Hypnotes\\src\\test\\resources\\hypnotesData\\TestData.txt";
        navi.file_input.sendKeys(fPath);
    }

    @And("User adds a voice message")
    public void add_voice_message() throws InterruptedException {
        ReusableMethods.clickWithJS(navi.addVoice);
        action.clickAndHold();
        sleep(125);
        action.release();
    }

}
