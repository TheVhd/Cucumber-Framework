package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_007_SD {

    HomePage hp = new HomePage(driver);

    @Given("User lands on the related webpage {string}")
    public void userLandsOnTheRelatedWebpage(String url) {
        Driver.getDriver().get(url);
        WebElement element = hp.acceptButton;
        if (element.isDisplayed()) // is visible
        {
            System.out.println("Accept");
            element.click();
        }
    }

    @Then("User checks  the What is Hypnotes? link is clickable")
    public void userChecksTheWhatIsHypnotesLinkIsClickable() {
        WebElement iframe = hp.youtubeIframe;
        Driver.getDriver().switchTo().frame(iframe);
        WebElement link = hp.whatIsHypnotesLink;
        Assert.assertTrue(link.isEnabled());
        //Driver.getDriver().switchTo().defaultContent();
    }

    @When("User clicks on What is Hypnotes? the video link")
    public void userClicksOnWhatIsHypnotesTheVideoLink() {
        // Q: pass JS to iframe -> No
        ReusableMethods.clickWithJS(hp.youtubeVideo);

    }


    @Then("User checks the video plays") // general step for checking youtube videos
    public void userChecksTheVideoPlays() {
        ReusableMethods.verifyVideoPlays(hp.youtubeVideo);
        Driver.closeDriver();
    }

    @Then("User verifies that {string} is visible") // general step for aLink is Visible
    public void userVerifiesThatIsVisible(String text) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[text()='" + text + "']"));
        Assert.assertTrue(element.isDisplayed());
        Driver.closeDriver();
    }

    @Then("User verifies that if {string} is clickable") // general step for aLink is clickable
    public void userVerifiesThatIfIsClickable(String text) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[text()='" + text + "']"));
        Assert.assertTrue(element.isEnabled());
    }

    @When("User clicks on the {string}")
    public void userClicksOnThe(String text) {
        //WebElement element = Driver.getDriver().findElement(By.xpath("//a[text()='" + text + "']"));
        WebElement element = ReusableMethods.getElementFromGetText(text);
        ReusableMethods.clickWithJS(element);
    }

    @Then("User verifies the relevant page opens {string}") //general step for url is correct
    public void userVerifiesTheRelevantPageOpens(String url) {
        Assert.assertEquals(url, Driver.getDriver().getCurrentUrl());
        Driver.closeDriver();
    }


}
