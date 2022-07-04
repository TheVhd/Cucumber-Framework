package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.Services;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;



public class US082_SD {

    HomePage homePage = new HomePage(driver);
    Services services = new Services(driver);

    @Given("User lands Login Page {string}.NA")
    public void user_lands_login_page(String url) {
        driver.get(ConfigReader.getProperty("loginUrl"));
        homePage.cookies.click();
        ReusableMethods.waitFor(1);
    }


    @And("User enters a valid email.NA")
    public void userEntersAValidEmail() {
        homePage.loginEmail.sendKeys(ConfigReader.getProperty("EmailMy"));
        ReusableMethods.waitFor(1);
    }

    @When("User enters a valid password.NA")
    public void userEntersAValidPassword() {
        homePage.loginPassword.sendKeys(ConfigReader.getProperty("PasswordMy"), Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @And("User is on the Dashboard-Calender Page  {string}.NA")
    public void userIsOnTheDashboardCalenderPage(String dashboardCalender) {
        Assert.assertEquals(driver.getCurrentUrl(), dashboardCalender);
    }

    @And("User is on the Dashboard-Services Page {string}.NA")
    public void userIsOnTheDashboardServicesPage(String ServicesLink) {
        services.servicesLink.click();
        // homePage.services.click();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(driver.getCurrentUrl(), ServicesLink);
    }

    @And("User clicks on the packages field.NA")
    public void userClicksOnThePackagesField() {
        Assert.assertTrue("Packages button is not clickable", services.packages.isEnabled());
        services.packages.click();
    }

    @Given("User verifies the Add New Package field is visible and clickable.NA")
    public void userVerifiesTheAddNewPackageFieldIsVisibleandClickable() {
        Assert.assertTrue(services.addNewPackageButton.isDisplayed());
        ReusableMethods.clickWithJS(services.addNewPackageButton);
        ReusableMethods.waitFor(4);
        System.out.println(driver.findElement(By.xpath("//label[@title='Package Name']")).isDisplayed()
        );
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //  Scenario: US082_TC001  Create a new Package
    //TC-001

    @And("User verifies PackageName Label is visible.NA")
    public void userVerifiesPackageNameIsVisible() {
        ReusableMethods.verifyElementDisplayed(services.packageName);
    }

    @And("User verifies the PackageName Box has a text {string} by default.NA")
    public void userVerifiesThePackageNameBoxHasATextByDefault(String DefaultText) {
        Assert.assertEquals(services.packageNameInput.getAttribute("placeholder"), DefaultText);
    }

    @And("User verifies PackageName Box is writable.NA")
    public void user_verifies_name_box_is_writable() throws InterruptedException {
        services.packageNameInput.sendKeys("NA");
        ReusableMethods.waitFor(1);
        Assert.assertEquals(services.packageNameInput.getText(), "NA");
        services.packageNameInput.clear();
    }

    @Then("User should be able to enter a valid name in the PackageName Box.NA")
    public void userShouldBeAbleToEnterAValidNameInTheNameBox() {
        String packageName = "Trail Package (For 1 Month $500)";
        services.packageNameInput.sendKeys(packageName);
        ReusableMethods.waitFor(1);
        Assert.assertEquals(services.packageNameInput.getText(), packageName);
    }

    @And("User verifies Price Label is visible.NA")
    public void userVerifiesPriceIsVisible() {
        Assert.assertTrue(services.priceName.isDisplayed());
    }


    @And("User verifies the Price Box has a text {string} by default.NA")
    public void userVerifiesThePriceBoxHasATextByDefault(String DollarSign) {

        Assert.assertEquals(services.priceInput.getAttribute("value"), "$ ");
    }

    @And("User should be able to enter a valid price in the Price Box.NA")
    public void userShouldBeAbleToEnterAValidPriceInThePriceBox() {
        Assert.assertTrue(services.priceInput.isEnabled());
        Assert.assertTrue(services.priceName.isDisplayed());
        services.priceInput.sendKeys("200");
        ReusableMethods.waitFor(1);
    }

    @And("User verifies show prices scheduler button movable.NA")
    public void userVerifiesShowPricesSchedulerButtonMovable() {


        Assert.assertTrue(services.showPriceButtonName.isDisplayed());
        ReusableMethods.waitFor(3);

        Assert.assertTrue(services.showPriceButtonn.isDisplayed());

        ReusableMethods.waitFor(3);
        Assert.assertTrue(services.showPriceButtonn.isEnabled());

        ReusableMethods.waitFor(3);
        services.showPriceButtonn.click();


    }

    @And("User should be see each time options when clicks on Duration drop-down menu.NA")
    public void userShouldBeSeeEachTimeOptionsWhenClicksOnDurationDropDownMenu() {
        Assert.assertEquals(services.durationTextDefault.getText(), "min");
        services.durationInput.click();
        ReusableMethods.waitFor(1);
    }

    @And("User verifies the time options are visible.NA")
    public void userVerifiesTheTimeOptionsAreVisible() {
        Assert.assertTrue(services.durationSelect75.isDisplayed());
    }

    @Given("User selects only one Duration in the Duration drop-down menu.NA")
    public void userSelectsOnlyOneDurationInTheDurationDropDownMenu() {
        services.durationSelect75.click();
        ReusableMethods.waitFor(1);
    }

    @Then("User verifies Duration drop-down menu is selectable.NA")
    public void userVerifiesDurationDropDownMenuIsSelectable() {
        Assert.assertEquals(services.durationText.getAttribute("value"), "75");

        Assert.assertTrue("Duration input is not enterable or selectable", services.durationInput.isEnabled());
    }

    @Given("User verifies Block Extra Time Name button is visible.NA")
    public void userVerifiesBlockExtraTimeNameButtonIsVisible() {
        Assert.assertTrue(services.blockExtraTimeButtonName.isDisplayed());
    }

    @Then("User verifies Block Extra Time button is movable.NA")
    public void userVerifiesBlockExtraTimeButtonisMovable() {
        Assert.assertTrue(services.blockExtraTimeButton.isEnabled());
        services.blockExtraTimeButton.click();
    }

    @And("User verifies  Block Time Before Appointment \\(min) field and Block Time After Appointment \\(min) field are visible.NA")
    public void userVerifiesBlockTimeBeforeAppointmentMinFieldAndBlockTimeAfterAppointmentMinFieldAreVisible() {
        Assert.assertTrue(services.blockBeforeInput.isDisplayed());
        Assert.assertTrue(services.blockAfterInput.isDisplayed());
    }

    @And("User verifies  Block Time Before Appointment \\(min) field  Block Time After Appointment \\(min) field are enterable.NA")
    public void userVerifiesBlockTimeBeforeAppointmentMinFieldBlockTimeAfterAppointmentMinFieldAreEnterable() {
        Assert.assertTrue(services.blockBeforeInput.isEnabled());
        Assert.assertTrue(services.blockAfterInput.isEnabled());
    }
    @Then("User enters a valid time {string} block before and after buttons.NA")
    public void userEntersAValidTimeBlockBeforeAndAfterButtonsNA(String minutes) {

        services.blockBeforeInput.clear();
        services.blockBeforeInput.sendKeys(minutes);
        services.blockAfterInput.clear();
        services.blockAfterInput.sendKeys(minutes);
        ReusableMethods.waitFor(3);

    }
    @Then("User checks rightmost buttons are functional.NA")
    public void userChecksRightmostButtonsAreFunctionalNA() {

        Actions actions=new Actions(driver);

        actions.moveToElement(services.blockBeforeInput).build().perform();
        actions.click(services.blockBeforeRightmostUpButton).build().perform();
        ReusableMethods.waitFor(2);
        actions.doubleClick(services.blockBeforeRightmostDownButton).build().perform();
        ReusableMethods.waitFor(3);


        actions.moveToElement(services.blockAfterInput).build().perform();
        actions.click(services.blockAfterRightmostUpButton).build().perform();
        ReusableMethods.waitFor(2);
        actions.doubleClick(services.blockAfterRightmostDownButton).build().perform();
        ReusableMethods.waitFor(2);




        Assert.assertTrue("Before Rightmost button  up not clickable", services.blockBeforeRightmostUpButton.isEnabled());
        Assert.assertTrue("Before Rightmost button  down not clickable", services.blockBeforeRightmostDownButton.isEnabled());

        Assert.assertTrue("After Rightmost button  up not clickable", services.blockAfterRightmostUpButton.isEnabled());
        Assert.assertTrue("After Rightmost button  down not clickable", services.blockAfterRightmostDownButton.isEnabled());


    }

    @And("User verifies Payment Required button is movable and User clicks Payment Button.NA")
    public void userVerifiesPaymentRequiredButtonIsMovableAndUserClicksPaymentButton() {

        Assert.assertTrue("Payment Required is not visible", services.paymentRequiredName.isDisplayed());
        ReusableMethods.verifyElementClickable(services.paymentRequiredButton);
        services.paymentRequiredButtonn.click();
        ReusableMethods.waitFor(2);


    }

    @And("User verifies that Bookable button is visible and movable.NA")
    public void userVerifiesThatBookableButtonIsVisible() {
        


        Assert.assertTrue("Bookable button is not visible ", services.bookableButtonn.isDisplayed());
        Assert.assertTrue("Bookable button is not visible", services.bookableButtonn.isEnabled());
    }

    @And("User clicks  Bookable button.NA")
    public void userClicksPaymentBookableButton() {
        services.bookableButtonn.click();
        ReusableMethods.waitFor(5);
        services.bookableButtonn.click();
        ReusableMethods.waitFor(5);
    }

    @And("User sees and verifies {string} and {string} texts are visible and clicks on All documents Button.NA")
    public void userSeesAndVerifiesAndTextsAreVisibleAndClicksOnAllDocumentsButton(String DocumentNeedsToSignedString, String AllDocumentsString) {

        Assert.assertTrue("All DocumentButton is not clickable", services.allDocumentsCheckBox.isEnabled());

        ReusableMethods.clickWithJS(services.allDocumentsCheckBox);

    }

    @When("User verifies Total Sessions field is visible and enterable.NA")
    public void userVerifiesTotalSessionsFieldIsVisibleAndEnterable() {
        Assert.assertTrue("Total session field is not visible", services.totalSessionsInput.isDisplayed());
        Assert.assertTrue("Total session field is not enterable", services.totalSessionsInput.isEnabled());
    }

    @And("User types a valid time on the Total Sessions Button.NA")
    public void userTypesAValidTimeOnTheTotalSessionsButton() {
        services.totalSessionsInput.sendKeys("6");
        ReusableMethods.waitFor(6);
    }

    @Given("User verifies  Session Interval \\(Weeks) field  is visible and enterable.NA")
    public void userVerifiesSessionIntervalWeeksFieldIsVisible() {
        Assert.assertTrue(services.sessionIntervalInput.isDisplayed());
        Assert.assertTrue(services.sessionIntervalInput.isEnabled());
    }

    @And("User enters a valid number on the Session Interval \\(Weeks) field.NA")
    public void userEntersAValidNumberOnTheSessionIntervalWeeksField() {
        services.sessionIntervalInput.sendKeys("2");
    }

    @Given("User verifies Package Description field  is visible and enterable.NA")
    public void userVerifiesPackageDescriptionFieldIsVisibleAndEnterable() {
        ReusableMethods.verifyElementDisplayed(services.descriptionInput);
        ReusableMethods.verifyElementClickable(services.descriptionInput);
    }

    @And("User writes any notes in the Package Description.NA")
    public void userWritesAnyNotesInThePackageDescription() {
        services.descriptionInput.sendKeys("Trail Package  Detail");
        ReusableMethods.waitFor(5);
    }


    @Given("User verifies Cancel button  is visible and clickable.NA")
    public void userVerifiesCancelButtonIsVisibleAndClickable() {
        ReusableMethods.verifyElementDisplayed(services.cancelButton);
        ReusableMethods.verifyElementClickable(services.cancelButton);
    }


    @And("User verifies save button  is visible and clickable.NA")
    public void userVerifiesSaveButtonIsVisibleAndClickable() {
        ReusableMethods.verifyElementDisplayed(services.saveButton);
        ReusableMethods.verifyElementClickable(services.saveButton);
    }

    @And("User clicks the save button.NA")
    public void userClicksTheSaveButton() {
        ReusableMethods.clickWithJS(services.saveButton);
        System.out.println("save edildi'");
        ReusableMethods.waitFor(2);//Gecici saniyeyi degistir
    }

    @Then("User verifies the {string} new package is visible on the available packages section.NA")
    public void userVerifiesThePackageIsVisibleOnTheAvailablePackagesSection(String NewPackageName) {

        Assert.assertTrue(services.newPackageName.isDisplayed());
        System.out.println(services.newPackageName.getText());
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(services.deleteButton);
        ReusableMethods.clickWithJS(services.deleteOkButton);
        ReusableMethods.waitFor(3);


        driver.close();

    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //  Scenario: US082_TC02 Cancel Button and Url Generate Url
    //TC002


    @Then("User sees and verifies the Packages page is visible after clicking cancel button.NA")
    public void userSeesAndVerifiesThePackagesPageAfterClickingCancelButton() {

        ReusableMethods.waitFor(3);
        Assert.assertTrue("Cancel button is not visible", services.cancelButton.isDisplayed());
        Assert.assertTrue("Cancel button is not clickable", services.cancelButton.isEnabled());
        ReusableMethods.clickWithJS(services.cancelButton);

        ReusableMethods.waitFor(3);


        ReusableMethods.switchToWindow("Packages");
        Assert.assertTrue(services.packagesSectionLink.isDisplayed());
    }



    @And("User clicks  on the {string} button.NA")
    public void userClicksOnTheGenerateSchedulerURLButton(String GenerateUrl) {

        ReusableMethods.waitFor(3);

        WebElement element = Driver.getDriver().findElement(By.xpath("//button/*[contains(text(), '" + GenerateUrl + "')]"));
        ReusableMethods.clickWithJS(services.generateUrlButton);
        ReusableMethods.waitFor(3);
        driver.close();



    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  @WarningCases
    //  Scenario: US082_TC003
    //TC003

    @When("user clicks save button after left blanks.NA")
    public void userClicksSaveButtonAfterLeftBlanks() {

        ReusableMethods.waitFor(3);
        services.saveButton.click();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_UP).build().perform();
    }


    @Then("user verifies the  PageName {string}  Warning is visible.NA")
    public void userVerifiesThePageNameWarningIsVisible(String PageNameWarning) {


        ReusableMethods.waitFor(2);
        Assert.assertTrue("PackageName Warning is not visible", services.packageNameInputWarning.isDisplayed());


    }

    @Then("user verifies the  Price {string}  Warning is visible.NA")
    public void userVerifiesThePriceWarningIsVisible(String PriceWarning) {
        ReusableMethods.waitFor(2);
        Assert.assertTrue("PriceWarning is not visible", services.priceInputWarning.isDisplayed());

    }

    @Then("user verifies the Duration {string} Warning is visible.NA")
    public void userVerifiesTheDurationWarningIsVisible(String DurationWarning) {
        ReusableMethods.waitFor(3);
        Assert.assertTrue("DurationWarning is not visible", services.durationWarning.isDisplayed());

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).build().perform();

    }

    @Then("user verifies the Total Session {string}  Warning is visible.NA")
    public void userVerifiesTheTotalSessionWarningIsVisible(String TotalSessionWarning) {
        ReusableMethods.waitFor(3);
        Assert.assertTrue("TotalSessionWarning is not visible", services.totalSessionsInputWarning.isDisplayed());

    }

    @Then("user verifies the Interval Session {string}  Warning is visible.NA")
    public void userVerifiesTheIntervalSessionWarningIsVisible(String IntervalSessionWarning) {
        ReusableMethods.waitFor(3);
        Assert.assertTrue("IntervalSessionWarning is not visible", services.intervalInputWarning.isDisplayed());

    }

    @Then("user verifies the  Description Session  {string}  Warning is visible.NA")
    public void userVerifiesTheDesciriptionSessionWarningIsVisible(String DesciriptionSessionWarning) {
        ReusableMethods.waitFor(3);
        Assert.assertTrue("DesciriptionSessionWarning is not visible", services.descriptionInputWarning.isDisplayed());


    }


}
