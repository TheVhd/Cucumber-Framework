package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ScheduleSettings;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static stepDefinitions.Hooks.driver;

public class US_084_SD {
    ScheduleSettings ss = new ScheduleSettings(driver);

    @Given("the user is on calendar page {string}")
    public void theUserIsOnCalendarPage(String url) {
        String path = ConfigReader.getProperty("environment") + url;
        driver.get(path);

    }

    @When("the user accepts the cookie")
    public void theUserAcceptsTheCookie() {

        try {

            WebElement acceptButton = ss.acceptCookieButton;
            ReusableMethods.clickWithJS(acceptButton);

            WebElement closeToolbar = ss.belowSpeedToolbar;
            closeToolbar.click();
        } catch (Exception e) {
            System.out.println("Tiklayamadım");
        }

    }

    @When("the user clicks on {string} button on Scheduling menu")
    public void theUserClicksOnButton(String text) {
        WebElement menu = driver.findElement(By.xpath("//*[text()='" + text + "']"));
        ReusableMethods.waitForClickablility(menu, 3);
        ReusableMethods.clickWithJS(menu);
        ReusableMethods.waitFor(2);

    }

    @Then("the user verifies Flexible Time Button is clickable")
    public void theUserVerifiesFlexibleTimeButtonIsClickable() {
        ReusableMethods.waitForClickablility(ss.flexibleTimeButton, 3);
        Assert.assertTrue(ss.flexibleTimeButton.isEnabled());

    }

    @Then("the user verifies if Customize your url button is clickable")
    public void theUserVerifiesIfCustomizeYourUrlButtonIsClickable() {
        ReusableMethods.waitForClickablility(ss.customizeYourUrl, 3);
        Assert.assertTrue(ss.customizeYourUrl.isEnabled());

    }

    @Then("the user verifies if Add Block Time, Save, Off Day buttons are clickable")
    public void theUserVerifiesIfAddBlockTimeSaveOffDayButtonsAreClickable() {
        Assert.assertTrue(ss.offDayCheckbox.isEnabled());
        ReusableMethods.waitForClickablility(ss.addBlockTimeButton, 3);
        ReusableMethods.waitForClickablility(ss.saveButton, 3);
        ReusableMethods.clickWithJS(ss.logoutButton);
        Driver.closeDriver();
    }


    @When("the user clicks on Add Block Time button")
    public void theUserClicksOnAddBlockTimeButton() {
        ReusableMethods.waitForClickablility(ss.addBlockTimeButton, 5);
        ReusableMethods.clickWithJS(ss.addBlockTimeButton);


    }

    @Then("the user verifies if Day title, Add button and start-end times controls are visible")
    public void theUserVerifiesIfDayTitleAddButtonAndStartEndTimesControlsAreVisible() {
        ReusableMethods.waitForVisibility(ss.addBlockTimeContainer, 10);
        Assert.assertTrue(ss.dayTitle.isDisplayed());
        Assert.assertTrue(ss.addButtonOnBlockTime.isDisplayed());
        Assert.assertTrue(ss.addCbbStartTime.isEnabled());
        Assert.assertTrue(ss.addCbbEndTime.isEnabled());

    }

    @When("the user selects the start and end time") //!!!!!!!!!scrolldown
    public void theUserSelectsTheStartAndEndTime() {
        ss.addCbbStartTime.click(); // javascript tıklayamadı
        ReusableMethods.waitFor(1);
        List<WebElement> startTimesAdd = ss.addCbbStartTimes;

        ReusableMethods.clickWithJS(startTimesAdd.get(5));
        ReusableMethods.waitFor(2);

        ss.addCbbEndTime.click();
        List<WebElement> endTimesAdd = ss.addCbbEndTimes;
        ReusableMethods.clickWithJS(endTimesAdd.get(6));


    }

    @And("the user clicks on Add button on Add Block Time popup section")
    public void theUserClicksOnAddButtonOnAddBlockTimePopupSection() {

        ReusableMethods.waitForClickablility(ss.addButtonOnBlockTime, 3);
        ss.addButtonOnBlockTime.click();

    }

    @Then("the user verifies if Blocked Times section display under the section")
    public void theUserVerifiesIfBlockedTimesSectionDisplayUnderTheSection() {

        WebElement blockTimesHeader = ss.blockTimesHeader;
        ReusableMethods.waitForVisibility(blockTimesHeader, 3);
        Assert.assertTrue(blockTimesHeader.isDisplayed());

        List<WebElement> blockedTimes = ss.blockTimesCbbs;
        Assert.assertTrue(blockedTimes.size() != 0);

    }

    @Then("the user verifies if Update and Delete buttons are there")
    public void theUserVerifiesIfUpdateAndDeleteButtonsAreThere() {
        List<WebElement> updateBtns = ss.updateButtons;
        Assert.assertTrue(updateBtns.size() != 0);
        List<WebElement> deleteBtns = ss.deleteButtons;
        Assert.assertTrue(deleteBtns.size() != 0);

    }

    @When("the user clicks on Update button")
    public void theUserClicksOnUpdateButton() {
        ReusableMethods.waitForClickablility(ss.updateButtons.get(0), 3);
        ss.updateButtons.get(0).click();
    }

    @Then("the user verifies if the new Update button exists in new popup section")
    public void theUserVerifiesIfTheNewUpdateButtonExistsInNewPopupSection() {
        WebElement updateWindow = ss.updatePopup;
        ReusableMethods.waitForVisibility(updateWindow, 4);
        Assert.assertTrue(ss.updateButtons.get(0).isDisplayed());

        // acilan pencereyi kapatmak için (popup)
        Actions act = new Actions(driver);
        act.click(updateWindow).sendKeys(Keys.ESCAPE).build().perform();
    }

    @When("the user clicks on Delete button.")
    public void theUserClicksOnDeleteButton() {
        ReusableMethods.waitForClickablility(ss.deleteButtons.get(0), 4);
        ss.deleteButtons.get(0).click();

    }

    @Then("the user verifies if {string}  message display")
    public void theUserVerifiesIfMessageDisplay(String message) {
        ReusableMethods.waitForVisibility(ss.toastMessageDeleted, 4);
        Assert.assertTrue(ss.toastMessageDeleted.getText().equals(message));

        ReusableMethods.waitForClickablility(ss.popUpCloseButton, 3);
        ss.popUpCloseButton.click();
        ReusableMethods.clickWithJS(ss.logoutButton);
        Driver.closeDriver();
        ReusableMethods.waitFor(1);

    }

    @When("the user clicks on Off Day button")
    public void theUserClicksOnOffDayButton() {
        ReusableMethods.waitForClickablility(ss.addBlockTimeButton, 15);
        ReusableMethods.clickWithJS(ss.offDayCheckbox);
    }

    @Then("the user verifies if the color of time section changes")
    public void theUserVerifiesIfTheColorOfTimeSectionChanges() {
        Assert.assertFalse(ss.addBlockTimeButton.isEnabled());
    }

    @Then("the user verifies if Off Day option is selected")
    public void theUserVerifiesIfOffDayOptionIsSelected() {
        Assert.assertTrue(ss.offDayCheckbox.isSelected());
    }

    @When("the user clicks on Customize your url")
    public void theUserClicksOnCustomizeYourUrl() {
        ReusableMethods.clickWithJS(ss.customizeYourUrl);
    }

    @Then("the user verifies Upgrade Now popup is visible")
    public void theUserVerifiesUpgradeNowPopupIsVisible() {
        ReusableMethods.waitForVisibility(ss.upgradeNowPopup, 4);
        Assert.assertTrue(ss.upgradeNowPopup.isDisplayed());
    }

    @Then("the user verifies {string} button is clickable on popup")
    public void theUserVerifiesButtonIsClickableOnPopup(String text) {
        WebElement element = driver.findElement(By.xpath("//span[text()='" + text + "']/.."));
        Assert.assertTrue(element.isEnabled());
    }

    @And("the user clicks on {string} button on popup")
    public void theUserClicksOnButtonOnPopup(String text) {
        WebElement element = driver.findElement(By.xpath("//span[text()='" + text + "']/.."));
        ReusableMethods.clickWithJS(element);
    }

    @Then("the user verifies Upgrade Now popup ıs unvisible")
    public void theUserVerifiesUpgradeNowPopupIsUnvisible() {
        ReusableMethods.waitFor(2);
        Assert.assertFalse(ss.upgradeNowPopup.isDisplayed());

    }
    @Then("the user verifies if Subscription page appears")
    public void theUserVerifiesIfSubscriptionPageAppears() {
        String currentURL = driver.getCurrentUrl();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        String childWindowTitle = driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(parent);
        Assert.assertFalse(currentURL.equals(childWindowTitle));
        driver.close();


    }
}
