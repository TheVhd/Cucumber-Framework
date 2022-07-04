package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.Calendar;
import pages.ScheduleSettings;
import pages.TherapistHome;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_100_Calendar_Reschedule {
    TherapistHome trpsH=new TherapistHome(driver);
    ScheduleSettings sch=new ScheduleSettings(driver);
    Calendar clndr=new Calendar(driver);
    @And("Client can see {string}")
    public void clientCanSee(String URL) {
        ReusableMethods.waitForPageToLoad(20);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals(URL));
    }


    @Then("Client click Scheduling Button")
    public void clientClickSchedulingButton() {
        trpsH.scheduleButton.click();
    }

    @And("Client click Calendar")
    public void clientClickCalendar() {
        trpsH.calendarsButton.click();

    }

    @When("Client can be see  own appointment in calendar")
    public void clientCanBeSeeOwnAppointmentInCalendar() {
        Assert.assertTrue( driver.findElement(By.xpath("(//div[contains(text(),'MEHMET test')])[1]")).isDisplayed());
    }


    @When("Client can be see  {string} in calendar")
    public void clientCanBeSeeInCalendar(String appointment) {
        driver.findElement(By.xpath("(//div[contains(text(),"+appointment+")])[1]"));


    }


    @Then("Client click {string}")
    public void clientClick(String appointment) {
        ReusableMethods.waitForPageToLoad(20);
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("(//div[contains(text(),"+appointment+")])[1]")).click();
        //Assert.assertTrue(driver.findElement(By.xpath("(//div[@class='site-description-item-profile-wrapper'])[8]")).getText().contains(appointment));

    }

    @And("Client click Reschedule button")
    public void clientClickRescheduleButton() {
        clndr.Btn_Reschedule_Appointment.click();
    }


    @And("Client should be appearing appointment screen")
    public void clientShouldBeAppearingAppointmentScreen() {
        Assert.assertTrue(clndr.Txt_Title_Book_an_appointment.isDisplayed());
    }

    @And("Client should be see Schedule pipeline")
    public void clientShouldBeSeeSchedulePipeline() {
        Assert.assertTrue(clndr.Txt_scheduler_pipeline.isDisplayed());
    }

    @And("Client should be see Appointment, Docs, Confirmation, Details headers")
    public void clientShouldBeSeeAppointmentDocsConfirmationDetailsHeaders() {
        Assert.assertTrue(clndr.Txt_scheduler_pipeline.isDisplayed());
    }

    @And("Client should be see Service, Locations dropdown menus and Collect Payment button")
    public void clientShouldBeSeeServiceLocationsDropdownMenusAndCollectPaymentButton() {
        Assert.assertTrue(clndr.Txt_Service.isDisplayed());
        Assert.assertTrue(clndr.Txt_Locations.isDisplayed());
        Assert.assertTrue(clndr.Txt_Collect_payment_select.isDisplayed());

    }
}
