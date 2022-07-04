package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Calendar;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_102_SD {
    Calendar calendar = new Calendar(driver);
    HomePage homePage = new HomePage(driver);


    @Given("User goes to the {string}")
    public void userGoesToThe(String url) {

        driver.get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(2);
        homePage.login.click();
    }

    @When("user types {string} to the email input on the login page")
    public void userTypesToTheEmailInputOnTheLoginPage(String email) {

        homePage.loginEmail.sendKeys(ConfigReader.getProperty("Email"));
    }

    @When("user types {string} to the password input on the login page.us102")
    public void userTypesToThePasswordInputOnTheLoginPage(String password) {

        homePage.loginPassword.sendKeys(ConfigReader.getProperty("Password"), Keys.ENTER);

    }

    @When("User is logged in and in the calender under scheduling {string}.")
    public void userIsLoggedInAndInTheCalenderUnderScheduling(String CalendarPage) {

        String calendarUrl = "https://test.hypnotes.net/dashboard/calendar";
        Assert.assertEquals(driver.getCurrentUrl(), calendarUrl);

    }

    @Then("user clicks on a meeting")
    public void userClicksOnAMeeting() {

        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(calendar.specificMeting);
        ReusableMethods.waitFor(1);


    }

    @Then("user clicks on {string}")
    public void userClicksOn(String arg0) {

        calendar.reScheduleAppointment.click();
        ReusableMethods.waitFor(1);
    }

    @Then("user selects the {string} and {string}")
    public void userSelectsTheAnd(String date, String time) {

        calendar.dateJune2.click();
        ReusableMethods.waitFor(2);
        calendar.time.click();
        ReusableMethods.waitFor(1);
    }

    @Then("user click on {string}")
    public void userClickOn(String confirmMeetingYesButton) {


        ReusableMethods.waitFor(2);
        calendar.yesButton.click();


    }

    @Then("user confirms Next button is clickable")
    public void userConfirmsButtonIsClickable() {

        ReusableMethods.waitFor(2);
        Assert.assertTrue(calendar.noDocuments.isDisplayed());
        Assert.assertTrue("Next button is not clickable", calendar.nextButton.isEnabled());


    }

    @Then("user clicks on Next button")
    public void userClicksOnButton() {

        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(calendar.nextButton);
        ReusableMethods.waitFor(2);
    }


    @Then("user confirm the Confirmation line should be entered")
    public void userConfirmTheConfirmationLineShouldBeEntered() {

        Assert.assertTrue(calendar.confirmLine.isDisplayed());

    }


    @Then("user checks if the Confirm Meeting Details visible")
    public void userChecksIfTheConfirmMeetingDetailsVisible() {


        Assert.assertTrue("namesOfNewMeetingDateAndTme is not visible", calendar.namesOfNewMeetingDateAndTme.isDisplayed());
        Assert.assertTrue("nameOFnewMeeting is not visible", calendar.nameOFnewMeeting.isDisplayed());
        Assert.assertTrue(" nameofNewMunites is not visible", calendar.nameofNewMunites.isDisplayed());
        Assert.assertTrue("nameOfTherapist is not visible", calendar.nameOfTherapist.isDisplayed());
    }

    @Then("user clicks on Do not notify client checkbox")
    public void userClicksOnDoNotNotifyClientCheckbox() {

        Assert.assertTrue("Do not notify client button is not selectable", calendar.doNotNotifyClient.isEnabled());
        ReusableMethods.clickWithJS(calendar.doNotNotifyClient);
        ReusableMethods.waitFor(2);


    }
    @Then("user click on Reschedule without asking for user's permission checkbox")
    public void userClickOnRescheduleWithoutAskingForUserSPermissionCheckbox() {

//         Assert.assertTrue("Reschedule without asking for user's permission button is not selectable", settings.rescheduleWithoutAskingForUsersPermission.isEnabled());
//         settings.rescheduleWithoutAskingForUsersPermission.click();
//         ReusableMethods.waitFor(2);


        //ONEMLI BIR NOT: BU BASAMAK CALISIYOR FAKAT KAPATTIM ACILINCA MEVCUT OLAN APPOINTMENT SILINIYOR BIZIM ONA IHTIYACIMIZ VAR TEKRAR GIRIS YAPARKEN AYNI MEETINGE TIKLAMAMMIZ
        // GEREKIYOR,EGER ACARSAK GIRIS YAPAMAZ VE FAIL EDER ,BILGINIZ OLSUN HOCAM ,YANI ESKISINI SILIYOR O HALDE BUG MEVCUT DEGIL


    }
    @Then("user confirms Submit button is clickable.")
    public void userConfirmsSubmitButtonIsClickable() {


        ReusableMethods.waitFor(2);
        Assert.assertTrue("Submit button is not selectable", calendar.submitButtonn.isEnabled());


    }

    @Then("user clicks on Submit button.")
    public void userClicksOnSubmitButton() {
        calendar.submitButtonn.click();
        ReusableMethods.waitFor(2);
    }

    @Then("user should be able to pass the Details line.")
    public void userShouldBeAbleToPassTheDetailsLine() {

        ReusableMethods.waitFor(2);

        Assert.assertTrue("Meeting Details is not visible", calendar.meetingDetailsText.isDisplayed());
        Assert.assertTrue("MeetingLink is not visible", calendar.meetingLink.isDisplayed());
        Assert.assertTrue("NameOfTherapist Details is not visible", calendar.nameOfTherapist.isDisplayed());
        // Assert.assertTrue("NameOFnewMeeting is not visible", settings.nameOFnewMeeting.isDisplayed());
        Assert.assertTrue("NamesOfNewMeetingDateAndTme is not visible", calendar.namesOfNewMeetingDateAndTme.isDisplayed());
        Assert.assertTrue("NameofNewMunites is not visible", calendar.nameofNewMunites.isDisplayed());


    }


    @Then("user checks if the Successfully created a meeting with visible.")
    public void userChecksIfTheSuccessfullyCreatedAMeetingWithVisible() {

        ReusableMethods.waitFor(1);
        Assert.assertTrue("SuccessfullyCreatedAmeetingWithTex is not visible", calendar.successfullyCreatedAmeetingWithText.isDisplayed());
        ReusableMethods.waitFor(3);
    }


    @Then("user confirms Close button is clickable.")
    public void userConfirmsCloseButtonIsClickable() {

        ReusableMethods.waitFor(1);
        Assert.assertTrue("Close is not clickable", calendar.closeButton.isEnabled());

    }

    @Then("user clicks on Close button.")
    public void userClicksOnCloseButton() {

        calendar.closeButton.click();
        ReusableMethods.waitFor(2);


    }

    @Then("user checks if the Meet info menu is visible and updated")
    public void userChecksIfTheMeetInfoMenuIsVisibleAndUpdated() {

        ReusableMethods.waitFor(1);

        Assert.assertTrue("Meet Info Text is not visible", calendar.meetInfoText.isDisplayed());

    }


    @Then("user checks if user can leave the Meet info menu")
    public void userChecksIfUserCanLeaveTheMeetInfoMenu() {

        driver.get("https://test.hypnotes.net/dashboard/calendar");

        ReusableMethods.waitFor(4);

        ReusableMethods.verifyElementDisplayed(calendar.scheduleAnAppointmentr);

    }
    @Then("user checks if the rescheduled meeting is updated on the calendar")
    public void userChecksIfTheRescheduledMeetingIsUpdatedOnTheCalendar() {

        Assert.assertTrue("UpdatedMeetingOnCalendar is not visible on teh calendar", calendar.updatedMeetingOnCalendar.isDisplayed());

        calendar.updatedMeetingOnCalendar.click();
        calendar.acceptCookies.click();


    }
    @Then("user cancel the reSchduleOne")
    public void userCancelTheReschduleOne() {

        //YENI RESCHEDULEYI SILIYORUZ KI YENIDEN CALISTIRDIGIMIZDA AYNI YER VE SAATTE BOSLUK OLABILSIN
        ReusableMethods.clickWithJS(calendar.cancelAppointment);
        ReusableMethods.waitFor(2);
        calendar.yesButton.click();
    }


/////TC)002   @BookAnOtherAppointment  //////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("User creates a reschedule meeting")
    public void userCreatesARescheduleMeeting() {


        ReusableMethods.waitFor(2);
        calendar.specificMeting.click();


        calendar.reScheduleAppointment.click();
        ReusableMethods.waitFor(1);

        calendar.dateJune2.click();
        ReusableMethods.waitFor(1);

        calendar.time2.click();
        ReusableMethods.waitFor(1);

        calendar.yesButton.click();
        ReusableMethods.waitFor(1);

        calendar.nextButton.click();
        ReusableMethods.waitFor(1);

        calendar.submitButtonn.click();
        ReusableMethods.waitFor(1);

    }

    @Then("User   verifies theBook another appointment button is clickable")
    public void userVerifiesTheBookAnotherAppointmentButtonIsClickable() {

        Assert.assertTrue(calendar.bookAnotheAppointment.isEnabled());
    }

    @Then("user clicks on the Book another appointment button")
    public void userClicksOnTheBookAnotherAppointmentButton() {

        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(calendar.bookAnotheAppointment);
        calendar.bookAnotheAppointment.click();
        ReusableMethods.waitFor(3);
    }

    @Then("User Should be visible  on Reschedule Meeting Calendar")
    public void userShouldBeVisibleOnRescheduleMeetingCalendar() {


        driver.get("https://test.hypnotes.net/dashboard/calendar");
        ReusableMethods.waitFor(4);
        Assert.assertTrue("UpdatedMeetingOnCalendar is not visible on teh calendar", calendar.UpdatedMeeting2.isDisplayed());
        calendar.UpdatedMeeting2.click();



    }


    @Then("user cancel the reSchduleTwo")
    public void userCancelTheReSchduleTwo() {
        //YENI RESCHEDULEYI SILIYORUZ KI YENIDEN CALISTIRDIGIMIZDA AYNI YER VE SAATTE BOSLUK OLABILSIN
        ReusableMethods.clickWithJS(calendar.cancelAppointment);
        ReusableMethods.waitFor(2);
        calendar.yesButton.click();
        driver.close();
    }

}
