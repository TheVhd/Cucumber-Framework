package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CalendarPagCB;
import utilities.ReusableMethods;

import java.util.List;

import static stepDefinitions.Hooks.driver;

public class US_098_SD_SeeTheAppoinment {
    String appointInfo = "";
    CalendarPagCB ccb = new CalendarPagCB(driver);

    @When("the user clicks on any appointment on the calendar")
    public void theUserClicksOnAnyAppointmentOnTheCalendar() {
        WebElement anyCell = ccb.anyAppoinCell;
        ReusableMethods.waitForClickablility(anyCell, 3);

        appointInfo = anyCell.findElement(ccb.anyAppoinCellNameInfo).getText();
        String date = anyCell.findElement(ccb.anyAppoinCellMain).getAttribute("data-date");
        appointInfo += "," + date;
        anyCell.click();
    }

    @Then("the user verifies if Meet Info field appears")
    public void theUserVerifiesIfMeetInfoFieldAppears() {
        System.out.println(appointInfo);//name,date -> green snail,2022-06-03
        ReusableMethods.waitForClickablility(ccb.googleBtn, 4);
        Assert.assertTrue(ccb.meetInfoForm.isDisplayed());

    }

    @Then("the user verifies if {string} button is clickable")
    public void theUserVerifiesIfButtonIsClickable(String text) {
        if (text.equals("Google")) {
            Assert.assertTrue(ccb.googleBtn.isEnabled());
        } else if (text.equals("Outlook")) {
            Assert.assertTrue(ccb.outlookBtn.isEnabled());
        } else if (text.equals("Go to Meeting")) {
            for (WebElement btns : ccb.goToMeetingBtns) {
                Assert.assertTrue(btns.isEnabled());
            }
        }
    }

    @When("the user clicks on {string} button to see on Calendar")
    public void theUserClicksOnButtonToSeeOnCalendar(String text) {
        if (text.equals("Google")) {
            ReusableMethods.clickWithJS(ccb.googleBtn);
        } else if (text.equals("Outlook")) {
            ccb.outlookBtn.click();
        }

    }

    @Then("the user verifies if {string} calendar page opens")
    public void theUserVerifiesIfCalendarPageOpens(String text) {
        String childUrl = ReusableMethods.getChildWindowURL();
        Assert.assertTrue(childUrl.contains(text.toLowerCase()));
    }


    @Then("the user verifies Mark as options are functional")
    public void theUserVerifiesMarkAsOptionsAreFunctional() {
        List<WebElement> radioBtns = ccb.radioBtnsInMeetInfo;
        for (WebElement rBtn : radioBtns) {
            Assert.assertTrue(rBtn.isEnabled());
            rBtn.click();
            ReusableMethods.waitFor(1);
        }

    }

    @Then("the user verifies if the info of Meeting is correct")
    public void theUserVerifiesIfTheInfoOfMeetingIsCorrect() {
        String[] dates = appointInfo.split(",")[1].split("-");
        Assert.assertTrue(ccb.dateMeetInfo.getText().contains(dates[0]));
        Assert.assertTrue(ccb.dateMeetInfo.getText().contains(dates[2]));
    }

    @When("the user clicks on Meeting Url button")
    public void theUserClicksOnMeetingUrlButton() {
        ccb.goToMeetingBtns.get(0).click();
    }

    @Then("the user verifies if Meeting screen opens")
    public void theUserVerifiesIfMeetingScreenOpens() {
        String childUrl = ReusableMethods.getChildWindowURL();
        Assert.assertTrue(childUrl.contains("https://meet.hypnotes.net/"));
    }


}
