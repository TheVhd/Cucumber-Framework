package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Appointment;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static stepDefinitions.Hooks.driver;

public class US_095_Appointment {

    Appointment app = new Appointment(driver);

    @Given("User Goes to Calendar {string}")
    public void user_goes_to_with_the_cookie(String string) {
        driver.get(ConfigReader.getProperty("hypnotesURL") + string);
        driver.manage().addCookie(new Cookie("PHPSESSID", "9abhi8v41mu0g929coq9g9qdbq"));
        driver.get(ConfigReader.getProperty("hypnotesURL") + string);

    }

    @Then("User Verifies the {string} Page Opened")
    public void user_verifies_appointment_page(String string) {
        ReusableMethods.waitFor(5);
        ReusableMethods.verifyElementDisplayed(app.BookingPage);
    }

    @And("User Clicks a day from the calendar")
    public void userClicksTheSelectedDate() {
        ReusableMethods.verifyElementClickable(app.selectedDate15);
        app.selectedDate15.click();
    }

    @And("User Verifies {string} is visible")
    public void RegServices(String string) {
        ReusableMethods.verifyElementDisplayed(app.RegService);
    }

    @And("User Verifies {string} Dropdown menu is is visible")
    public void Dropdown(String string) {
        ReusableMethods.verifyElementDisplayed(app.Service_DDown);
    }

    @And("User verifies the registered services in the DD menu")
    public void RegisteredServices() {
        ReusableMethods.verifyElementDisplayed(app.Service_DDown);
        app.Service_DDown.click();
        ReusableMethods.waitFor(2);
        List<WebElement> cbbElements = driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
        ReusableMethods.clickWithJS(cbbElements.get(4));
    }

    @And("User Selects a service")
    public void SelectService() {
        ReusableMethods.clickWithJS(app.SelectService);

    }

    @Then("User clicks on the location DDown menu")
    public void LocationDDown() {
        ReusableMethods.clickWithJS(app.LocationDDown);
    }

    @And("user verifies the multiple locations in the DDown menu")
    public void MultLoc() {
        ReusableMethods.clickWithJS(app.LocationDDown);
        ReusableMethods.verifyElementDisplayed(app.LocationDDown);
    }

    @And("User verifies a location is clickable")
    public void ClickLocation() {
        ReusableMethods.verifyElementClickable(app.LocationDDown);
    }


}
