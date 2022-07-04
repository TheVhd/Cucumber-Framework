package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Calendar;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static stepDefinitions.Hooks.driver;

public class US_097_CalendarNewClient {
    Calendar cal = new Calendar(driver);
    Random rand = new Random();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @Then("user clicks on a date in calendar page")
    public void userClicksOnADateInCalendarPage() {
        WebElement randomDate = cal.calendarList.get(rand.nextInt(cal.calendarList.size()));
        System.out.println(randomDate.getText());
        if (randomDate.isDisplayed()) {
            randomDate.click();
        } else {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
            wait.until(ExpectedConditions.elementToBeClickable(randomDate));
            randomDate.click();
        }
    }

    @And("user verifies date dropdown menu is functional")
    public void userVerifiesDateDropdownMenuIsFunctional() {
        ReusableMethods.verifyElementDisplayed(cal.dateDropdown);
        ReusableMethods.verifyElementClickable(cal.dateDropdown);
    }

    @And("user clicks on date dropdown")
    public void userClicksOnDateDropdown() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
        cal.dateDropdown.click();
    }

    @Then("user verifies dates are visible")
    public void userVerifiesDatesAreVisible() {
        for (int i = 0; i == cal.dateDropdownList.size(); i++) {
            ReusableMethods.verifyElementDisplayed(cal.dateDropdownList.get(i));
        }
    }

    @And("user verifies dates are clickable")
    public void userVerifiesDatesAreClickable() {
        for (int i = 0; i == cal.dateDropdownList.size(); i++) {
            ReusableMethods.verifyElementClickable(cal.dateDropdownList.get(i));
        }
    }

    @And("user clicks on a date in the date dropdown")
    public void userClicksOnADateInTheDateDropdown() {
        WebElement randomDate = cal.dateDropdownList.get(rand.nextInt(cal.dateDropdownList.size()));
        System.out.println(randomDate.getText());
        if (!randomDate.isDisplayed()) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
        }
        wait.until(ExpectedConditions.elementToBeClickable(randomDate));
        randomDate.click();
    }

    @And("user verifies time start dropdown menu is functional")
    public void userVerifiesTimeStartDropdownMenuIsFunctional() {
        ReusableMethods.verifyElementDisplayed(cal.timeStartDropdown);
        ReusableMethods.verifyElementClickable(cal.timeStartDropdown);
    }

    @When("user clicks on time start dropdown")
    public void userClicksOnTimeStartDropdown() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
        cal.timeStartDropdown.click();
    }

    @Then("user verifies all times are visible")
    public void userVerifiesAllTimesAreVisible() {
        for (int i = 0; i < cal.timeDropdownList.size(); i++) {
            if (!cal.timeDropdownList.get(i).isDisplayed()) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cal.timeDropdownList.get(i));
                ReusableMethods.verifyElementDisplayed(cal.timeDropdownList.get(i));
            }
            ReusableMethods.verifyElementDisplayed(cal.timeDropdownList.get(i));
        }
    }

    @And("user verifies all times are clickable")
    public void userVerifiesAllTimesAreClickable() {
        for (int i = 0; i < cal.timeDropdownList.size(); i++) {
            if (!cal.timeDropdownList.get(i).isEnabled()) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cal.timeDropdownList.get(i));
                ReusableMethods.verifyElementClickable(cal.timeDropdownList.get(i));
            }
            ReusableMethods.verifyElementClickable(cal.timeDropdownList.get(i));
        }
    }

    @Then("user clicks on a hour in the time start dropdown")
    public void userClicksOnAHourInTheTimeStartDropdown() {
        WebElement randomHour = cal.timeHourList.get(rand.nextInt(cal.timeHourList.size()));
        System.out.println(randomHour.getText());
        if (!randomHour.isDisplayed()) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", randomHour);
        }
        wait.until(ExpectedConditions.elementToBeClickable(randomHour));
        randomHour.click();
    }

    @Then("user clicks on a minute in the time start dropdown")
    public void userClicksOnAMinuteInTheTimeStartDropdown() {
        WebElement randomMin = cal.timeMinuteList.get(rand.nextInt(cal.timeMinuteList.size()));
        System.out.println(randomMin.getText());
        if (!randomMin.isDisplayed()) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", randomMin);
        }
        wait.until(ExpectedConditions.elementToBeClickable(randomMin));
        randomMin.click();
    }

    @Then("user clicks on a period in the time start dropdown")
    public void userClicksOnAPeriodInTheTimeStartDropdown() {
        WebElement randomPeriod = cal.timePeriodList.get(rand.nextInt(cal.timePeriodList.size()));
        System.out.println(randomPeriod.getText());
        if (!randomPeriod.isDisplayed()) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", randomPeriod);
        }
        wait.until(ExpectedConditions.elementToBeClickable(randomPeriod));
        randomPeriod.click();
    }

    @And("user verifies headings are functional")
    public void userVerifiesHeadingsAreFunctional(DataTable dataTable) {
        List<List<String>> table = dataTable.asLists(String.class);
        for (List<String> s : table) {
            for (Object item : s) {
                WebElement element = driver.findElement(By.xpath("//label[contains(text(),'" + item + "')]"));
                if (element.isDisplayed()) {
                    Assert.assertTrue(element.isEnabled());
                }
            }
        }
    }

    @Then("user enters {string} to {string} id")
    public void userEntersToId(String data, String idName) {
        WebElement element = driver.findElement(By.xpath("//input[@id='" + idName + "']"));
        element.sendKeys(data);
    }

    @Then("user verifies {string} is visible text")
    public void userVerifiesIsVisibleText(String vtext) {
        WebElement element = driver.findElement(By.xpath("//*[text()='" + vtext + "']"));
        ReusableMethods.verifyElementDisplayed(element);
    }

    @Then("user enters {string}, {string}, {string}, {string} to create new client")
    public void userEntersToCreateNewClient(String name, String lastName, String phone, String email) {
        cal.nameNewClient.sendKeys(name);
        cal.lastNameNewClient.sendKeys(lastName);
        cal.phoneNewClient.sendKeys(phone);
        cal.emailNewClient.sendKeys(email);
    }

    @And("user verifies submit button is visible")
    public void userVerifiesSubmitButtonIsVisible() {
        ReusableMethods.verifyElementDisplayed(cal.submitButton);
    }

    @And("user verifies submit button is functional")
    public void userVerifiesSubmitButtonIsFunctional() {
        ReusableMethods.verifyElementClickable(cal.submitButton);
    }

    @And("user clicks on submit button")
    public void userClicksOnSubmitButton() {
        cal.submitButton.click();
    }
}
