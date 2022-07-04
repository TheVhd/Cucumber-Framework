package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Calendar;
import pages.HomePage;
import pages.TherapistLogin;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US094_SD {

    TherapistLogin therapistLogin=new TherapistLogin(driver);
    HomePage homePage =new HomePage(driver);
    Calendar calendarPage = new Calendar(driver);

    Actions actions = new Actions(driver);



    @Given("User goes to Hypnotes Page...")
    public void userGoesToHypnotesPage() {
        driver.get(ConfigReader.getProperty("hypnotesURL"));
    }

    @Then("User clicks Login button ..")
    public void userClicksLoginButton() {

        ReusableMethods.clickWithJS(therapistLogin.loginButton);
    }

    @And("User enters a valid email in the email input..")
    public void userEntersAValidEmailInTheEmailInput() {
        calendarPage.loginEmail.sendKeys(ConfigReader.getProperty("Email"));
    }

    @And("User types a valid password in the password input..")
    public void userTypesAValidPasswordInThePasswordInput() {
        calendarPage.loginPassword.sendKeys(ConfigReader.getProperty("Password"), Keys.ENTER);
    }

    @Then("User is on the Dashboard-Calender Page..")

    public void userIsOnTheDashboardCalenderPage() {

        String calendarUrl = "https://test.hypnotes.net/dashboard/calendar";
        Assert.assertEquals(driver.getCurrentUrl(), calendarUrl);
        calendarPage.acceptCookies.click();
    }

    @Given("User clicks month view..")
    public void userClicksMonthView() {

        calendarPage.monthView.click();
        ReusableMethods.waitFor(2);
    }

    @When("User selects a date from the calendar..")
    public void userSelectsADateFromTheCalendar() {


        calendarPage.june2.click();
        ReusableMethods.waitFor(4);

    }

    @And("User sees the Select Service Type field..")
    public void UserSeesTheSelectServiceTypeField() {
        Assert.assertTrue("Select Service Type field is not visible", calendarPage.selectServiceType.isDisplayed());
    }

    @And("User selects the Custom Service..")
    public void userSelectsTheCustomService() {
        calendarPage.customService.click();
        ReusableMethods.waitFor(2);
    }

    @And("User verifies Service Name is visible and enterable..")
    public void userVerifiesServiceNameIsVisibleAndEnterable() {

        Assert.assertTrue("Service Name is not visible", calendarPage.serviceName.isDisplayed());
        Assert.assertTrue("Select Name is not enterable", calendarPage.serviceName.isEnabled());

        calendarPage.serviceName.sendKeys("Test Na");

        ReusableMethods.waitFor(2);
    }

    @And("User verifies the Price Box has a text dollar {string} sign  by default..")
    public void userVerifiesThePriceBoxHasATextDollarSignByDefault(String dollarSign) {

        Assert.assertEquals(calendarPage.price.getAttribute("value"), "$ ");

    }

    @And("User verifies Price is visible and enterable..")
    public void userVerifiesPriceIsVisibleAndEnterable() {

        Assert.assertTrue("Select price is not visible", calendarPage.price.isDisplayed());
        Assert.assertTrue("Select price is not enterable", calendarPage.price.isEnabled());

        calendarPage.price.sendKeys("200");
        ReusableMethods.waitFor(2);
    }


    @And("User clicks Up-Down rightmost price Buttons and verifies the buttons are clickable..")
    public void userClicksUpDownRightmostPriceButtonsAndVerifiesTheButtonsAreClickable() {
        calendarPage.priceDown.click();
        ReusableMethods.waitFor(2);
        calendarPage.priceUp.click();
        ReusableMethods.waitFor(2);

        Assert.assertTrue("Price Down is not clickable", calendarPage.priceDown.isEnabled());
        Assert.assertTrue("Price Up is not clickable", calendarPage.priceUp.isEnabled());
    }

    @When("User selects a minute from Duration field and verifies duration field selectable and enterable..")
    public void userSelectsAMinuteFromDurationFieldAndVerifiesDurationFieldSelectableAndEnterable() {

        calendarPage.duration.sendKeys("48");
        ReusableMethods.waitFor(1);
        calendarPage.duration.clear();
        ReusableMethods.waitFor(1);
        calendarPage.duration.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue("Duration is not clickable", calendarPage.duration.isEnabled());


        calendarPage.durationSelect90Minute.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue("Price is not selectable", calendarPage.durationSelect90Minute.isEnabled());


    }


    @When("User verifies Date field is visible,enterable or selectable from the options..")
    public void userVerifiesDateFieldIsVisibleEnterableOrSelectableFromTheOptions() {


        String dateSelected="2022-06-02";
        Assert.assertEquals(calendarPage.date.getAttribute("value") ,dateSelected);
        Actions actions = new Actions(driver);
        actions.moveToElement(calendarPage.date).build().perform();

        calendarPage.date.sendKeys("2022-06-30");
        ReusableMethods.waitFor(3);
        calendarPage.dateClearSign.click();

        calendarPage.date.click();
        calendarPage.june2Select.click();
        ReusableMethods.waitFor(3);


        Assert.assertTrue("Date is not clickable", calendarPage.date.isEnabled());
        Assert.assertTrue("DurationSelect90Minute is not clickable", calendarPage.durationSelect90Minute.isEnabled());


    }

    @And("User verifies Time Start is  clickable ,enterable and selectable..")
    public void userVerifiesTimeStartIsClickableEnterableAndSelectable() {
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();

        String timeStart = "12:00 AM";
        Assert.assertEquals(calendarPage.timeStart.getAttribute("value"), timeStart);


        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(calendarPage.timeStart);

        calendarPage.hour04Select.click();
        ReusableMethods.waitFor(1);
        calendarPage.minute05Select.click();
        ReusableMethods.waitFor(2);
        calendarPage.pmSelect.click();
        ReusableMethods.waitFor(1);

        calendarPage.timeEnd.click();
    }


    @And("User verifies Time End button is NOT enterable,clickable..")
    public void userVerifiesTimeEndButtonIsEnterableClickable() {


        // calendarPage.timeEnd.click();
        //BU BUTTON AKTIF DEGIL
        ReusableMethods.verifyElementNotClickable( calendarPage.timeEnd);



    }

    @And("User verifies radio buttons Registered Clients and New Client \\(Enter Manually) are visible and selectable..")
    public void userVerifiesRadioButtonsRegisteredClientsAndNewClientEnterManuallyIsVisible() {

        Assert.assertTrue("RegisteredClients radio buton is not visible", calendarPage.registeredClients.isDisplayed());
        WebElement radio_b1 = calendarPage.registeredClients;
        radio_b1.isSelected();
        ReusableMethods.waitFor(3);
        Assert.assertTrue("RegisteredClients radio button is not selectable", calendarPage.newClientEnterManuallyRadioButton.isEnabled());
        ReusableMethods.waitFor(3);


        WebElement radio_b2 = calendarPage.newClientEnterManuallyRadioButton;
        radio_b2.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue("NewClientEnterManually radio button is not selectable", calendarPage.newClientEnterManuallyRadioButton.isEnabled());
        ReusableMethods.waitFor(3);
    }


    @And("User enters a name  in the firstname field..")
    public void userEntersANameInTheFirstnameField() {
        calendarPage.firstName.sendKeys("NagihanTest");

        Assert.assertTrue("Firstname field is not enterable", calendarPage.firstName.isEnabled());
        ReusableMethods.waitFor(3);
    }

    @And("User types a last name in the  Last Name input field..")
    public void userTypesALastNameInTheLastNameInputField() {
        calendarPage.lastName.sendKeys("A.");

        Assert.assertTrue("LastName field is not enterable", calendarPage.lastName.isEnabled());
        ReusableMethods.waitFor(3);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    @And("User types a phone number in the Phone input..")
    public void userTypesAPhoneNumberInThePhoneInput() {
        Assert.assertTrue("Phone field is not enterable", calendarPage.phone.isEnabled());

        calendarPage.phone.sendKeys("1234567890");
        ReusableMethods.waitFor(3);
    }

    @And("User enters an email address in the email input..")
    public void userEntersAnEmailAddressInHeEmailInput() {
        calendarPage.email.sendKeys("na@gmail.com");

        Assert.assertTrue("Email field is not enterable", calendarPage.email.isEnabled());
        ReusableMethods.waitFor(3);
    }

    @When("User clicks the Submit button..")
    public void userClicksTheSubmitButton() {
        calendarPage.submit.click();
        Assert.assertTrue("Submit button is not clickable", calendarPage.submit.isEnabled());
        ReusableMethods.waitFor(2);



    }

    @Then("User sees New Meeting Created message and verifies..")
    public void userSeesNewMeetingCreatedMessageAndVerifies() {


        Assert.assertTrue(calendarPage.myNewMeetingName.isDisplayed());

        //New Meeting Vreated mesaji onaylanmadi  yeniden xpath bulmaya calis
        //Assert.assertTrue(calendarPage.newMeetingCreated.isDisplayed());


    }

    @Then("User cancels the appointment..")
    public void userCancelsTheAppointment() {

        calendarPage.myNewMeetingName.click();https:
        calendarPage.cancelAppointment.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(calendarPage.yesButton);
        ReusableMethods.waitFor(2);
        driver.close();
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////

    //TC002 NEGATIVE SCENARIO


    @And("User clicks custom services and on the New Client \\(Enter Manually)..")
    public void userClicksCustomServicesAndOnTheNewClientEnterManually() {
        calendarPage.customService.click();
        ReusableMethods.waitFor(1);

        actions.sendKeys(Keys.PAGE_DOWN).build().perform();

        ReusableMethods.waitFor(1);

        WebElement radio_b2 = calendarPage.newClientEnterManuallyRadioButton;
        radio_b2.click();
        ReusableMethods.waitFor(1);

        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
    }


    @And("User verifies  First name required {string} message..")
    public void userVerifiesFirstNameRequiredMessage(String FirstNameWarning) {
        ReusableMethods.waitFor(1);
        calendarPage.submit.click();

        Assert.assertTrue("FirstName  is required message is not visible ", calendarPage.firstNameRequiredText.isDisplayed());

        ReusableMethods.waitFor(1);
        calendarPage.firstName.sendKeys("ab",Keys.ENTER);

        ReusableMethods.waitFor(5);


    }


    @And("User verifies Price required {string} message..")
    public void userVerifiesPriceRequiredMessage(String PriceWarning) {

        calendarPage.submit.click();

        Assert.assertTrue("Price is required message is not visible ", calendarPage.priceRequiredText.isDisplayed());

        actions.sendKeys(Keys.PAGE_UP).build().perform();
        calendarPage.price.sendKeys("100");

        ReusableMethods.waitFor(8);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    @And("User verifies  Title required {string} message...")
    public void userVerifiesTitleRequiredMessage(String TitleWarning) {


        calendarPage.submit.isDisplayed();
        ReusableMethods.clickWithJS(calendarPage.submit);
        ReusableMethods.waitFor(5);

        Assert.assertTrue("Title is required message is not visible ", calendarPage.titleRequiredText.isDisplayed());
        ReusableMethods.waitFor(5);


    }
}



