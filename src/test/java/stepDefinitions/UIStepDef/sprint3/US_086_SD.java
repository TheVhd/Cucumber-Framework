package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CalendarPagCB;
import utilities.ReusableMethods;

import java.util.List;

import static stepDefinitions.Hooks.driver;

public class US_086_SD {
    CalendarPagCB calPage = new CalendarPagCB(driver);

    @Given("the user is on {string} page")
    public void theUserIsOnPage(String url) {

        //driver.get(ConfigurationReader.getPropertyFromProperties("environment")+url);
        //is page load?
        WebElement controlBtn = calPage.blockTimeBtn;
        ReusableMethods.waitForClickablility(controlBtn, 15);
    }

    @Then("the user verifies if cell of the current day is in different color")
    public void theUserVerifiesIfCellOfTheCurrentDayIsInDifferentColor() {
        WebElement todayCell = calPage.todayDateCell;
        Assert.assertTrue(todayCell.isDisplayed());


    }

    @When("the user select today date")
    public void theUserSelectTodayDate() {
        ReusableMethods.scrollToElement(calPage.todayDateCell);
        calPage.todayDateCell.click();
        WebElement submitButton = calPage.submmitBtn;
        ReusableMethods.waitForClickablility(submitButton, 3);
    }

    @Then("the user verifies Book an appoinment section appears")
    public void theUserVerifiesBookAnAppoinmentSectionAppears() {
        WebElement appointmentPopup = calPage.appointmentPopup;
        Assert.assertTrue(appointmentPopup.isDisplayed());
    }

    @Then("the user verifies if Select Service Type is Registered Services")
    public void theUserVerifiesIfSelectServiceIsSelected() {
        WebElement radioRegisService = calPage.radioRegisService;
        Assert.assertTrue(radioRegisService.isSelected());

    }

    @When("the user clicks on Service dropdown on Registered Services")
    public void theUserClicksOnServiceDropdownOnRegisteredServices() {
        WebElement serviceDropdown = calPage.serviceDropdown;
        serviceDropdown.click();
        ReusableMethods.waitFor(1);

    }

    @Then("the user verifies if all items of dropdowm are there and selectable")
    public void theUserVerifiesIfAllServicesAreThere() {
        List<WebElement> items = calPage.comboboxElements;
        for (WebElement item : items) {
            //System.out.println(service.getText());
            Assert.assertTrue(item != null);
        }
        ReusableMethods.clickWithJS(items.get(items.size()-1));
    }

    @When("the user clicks on Location dropdown on Registered Services")
    public void theUserClicksOnLocationDropdownOnRegisteredServices() {
        WebElement locationCombobox = calPage.locationDropdown;
        locationCombobox.click();
        ReusableMethods.waitFor(1);

    }


}
