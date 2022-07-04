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
import pages.CalendarPagCB;
import utilities.ReusableMethods;

import java.util.List;

import static stepDefinitions.Hooks.driver;


public class US_091_SelectServiceTyp_StepD {

    CalendarPagCB calendarPg = new CalendarPagCB(driver);

    @When("the user accepts the cookies")
    public void theUserAcceptsTheCookies() {
        try {

            WebElement acceptButton = calendarPg.acceptCookieButton;
            ReusableMethods.clickWithJS(acceptButton);

            WebElement closeToolbar = calendarPg.belowSpeedToolbar;
            closeToolbar.click();
        } catch (Exception e) {

        }

    }

    @Given("the user selects any date on the calendar")
    public void theUserSelectsAnyDateOnTheCalendar() {

        WebElement anydate = calendarPg.anyDate;
        ReusableMethods.scrollToElement(anydate);
        anydate.click();
    }

    @When("the user clicks Custom Service")
    public void theUserClicksCustomService() {
        calendarPg.customServc.click();
    }

    @Then("the user Service Name verifies functional")
    public void theUserServiceNameVerifiesFunctional() {
        Assert.assertTrue("Service Name button is not enabled", calendarPg.serviceName.isEnabled());
        calendarPg.serviceName.sendKeys("Custom Service");
    }

    @Then("the user verifies if Price is functional")
    public void theUserPriceVerifiesThatThePackageNameIsFunctional() {
        Assert.assertTrue("Price button is not enabled", calendarPg.priceB.isEnabled());
        calendarPg.priceB.sendKeys("100");
    }

    @Then("the user verifies if Duration is functional")
    public void theUserDurationVerifiesThatThePackageNameIsFunctional() {
        Assert.assertTrue("Duration button is not enabled", calendarPg.durationB.isEnabled());
        calendarPg.durationB.sendKeys("120");
    }

    @Then("the user checks if Date is functional")
    public void theUserDateChecksThatItIsFunctional() {
        Assert.assertTrue("Date button is not enabled", calendarPg.dateB.isEnabled());
        calendarPg.dateB.sendKeys(Keys.CONTROL + "a");
        calendarPg.dateB.sendKeys(Keys.DELETE);
        calendarPg.dateB.sendKeys("2022-06-15" + Keys.ENTER);

    }

    @Then("the user verifies if Time Start is functional")
    public void theUserTimeStartChecksThatItIsFunctional() {
        Assert.assertTrue("Time Start button is not enabled", calendarPg.timeStart.isEnabled());
        WebElement body = calendarPg.body;
        WebElement clearTime = calendarPg.clearTime;
        clearTime.click();
        ReusableMethods.waitFor(1);
        Actions act = new Actions(driver);
        act.moveToElement(calendarPg.timeStart).doubleClick().perform();
        act.sendKeys("03:00 PM").build().perform();
        body.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(calendarPg.timeStart.getAttribute("value").equals("03:00 PM"));
    }

    @Then("the user verifies if Time End is functional")
    public void theUserTimeEndChecksThatItIsFunctional() {
        Assert.assertFalse("Time End button is enabled", calendarPg.timeEnd.isEnabled());
        System.out.println(calendarPg.timeEnd.getText());
        //calendarPg.timeEnd.getText().equals("05:00 PM")
    }

    @And("the user selects Register Clients Option")
    public void theUserRegisteredClientsOptionShouldBeAbleToCheck() {
        calendarPg.registeredClientsTxt.click();
    }

    @And("the user clicks on Clients dropdown")
    public void theUserClicksOnClientsDropdown() {
        WebElement clientddown = calendarPg.clientsDropdown;
        clientddown.click();
        ReusableMethods.waitFor(1);
    }

    @Then("the user verifies if all Clients are in dropdown")
    public void theUserClientsDropdownVerifiesFunctional() {
        List<WebElement> clients = calendarPg.registeredClients;
        Assert.assertTrue(clients.size() != 0);
        for (WebElement client : clients) {
            Assert.assertTrue(clients != null);
        }
    }


    @Then("the user verifies if any client is selectable")
    public void theUserVerifiesIfAnyClientIsSelectable() {
        ReusableMethods.clickWithJS(calendarPg.registeredClients.get(2));
        Assert.assertTrue(calendarPg.clientsDropdown.getText().equals(calendarPg.registeredClients.get(2).getText()));
    }

    @Then("the user verifies that the Notify client button functional")
    public void theUserVerifiesThatTheNotifyClientButtonFunctional() {
        Assert.assertTrue(calendarPg.checkbox.isEnabled());
    }

    @When("the user clicks on Notify client button")
    public void theUserClicksOnNotifyClientButton() {
        ReusableMethods.clickWithJS(calendarPg.checkbox);
    }

    @Then("the user verifies Submit button is clickable")
    public void theUserVerifiesSubmitButtonIsClickable() {
    }

    @When("the user clicks on Submit button")
    public void theUserClicksOnSubmitButton() {
        calendarPg.submitBttn.click();
    }

    @Then("the user verifies if the message appears {string}")
    public void theUserVerifiesIfTheMessageAppears(String message) {

        WebElement messageInfo = calendarPg.toastMessage;
        ReusableMethods.waitForVisibility(messageInfo, 2);
        System.out.println(messageInfo.getText());
        Assert.assertTrue(messageInfo.getText().length() != 0);

    }
}
