package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.ProfileCompany;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_112_SD {
    ProfileCompany profileCompany = new ProfileCompany(driver);
    HomePage homePage = new HomePage(driver);


    @Given("User goes to the {string}nag")
    public void userGoesToTheNag(String Url) {
        driver.get(ConfigReader.getProperty("loginUrl"));

    }

    @When("user types {string} to the email input on the login page.nag")
    public void userTypesToTheEmailInputOnTheLoginPageNag(String email) {
        homePage.loginEmail.sendKeys(ConfigReader.getProperty("Email"));
    }

    @When("user types {string} to the password input on the login page.nagi")
    public void userTypesToThePasswordInputOnTheLoginPageNagi(String password) {
        homePage.loginPassword.sendKeys(ConfigReader.getProperty("Password"), Keys.ENTER);
        ReusableMethods.waitFor(2);

    }

    @Given("User clicks the Profile link.nag")
    public void userClicksTheProfileLinkNag() {

        profileCompany.profileLink.click();
        String ProfilePage = "https://test.hypnotes.net/dashboard/profile";
        Assert.assertEquals(driver.getCurrentUrl(), ProfilePage);
        ReusableMethods.waitFor(2);
    }


    @Then("User verifies the company title is clickable and clicks the your company button.nag")
    public void userVerifiesTheCompanyTitleIsClickableAndClicksTheYourCompanyButtonNag() {

        profileCompany.acceptCookies.click();
        ReusableMethods.verifyElementClickable(profileCompany.yourCompanyTitle);
        profileCompany.yourCompanyTitle.click();
        ReusableMethods.waitFor(2);

    }

    @Then("User verifies  the previously attached company informations are visible.nag")
    public void userVerifiesThePreviouslyAttachedCompanyInformationsAreVisibleNag() {


        ReusableMethods.verifyElementDisplayed(profileCompany.mycompany2Name);
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(profileCompany.logoImage);
        ReusableMethods.waitFor(1);
        ReusableMethods.isTextVisible(profileCompany.john, "John");
        ReusableMethods.waitFor(1);
        ReusableMethods.scrollUntilEnd(driver);
        ReusableMethods.scrollUntilEnd(driver);
        ReusableMethods.verifyElementDisplayed(profileCompany.john);
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(profileCompany.CompanysURL);
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(profileCompany.cityStateZipcode);
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(profileCompany.country);
        ReusableMethods.waitFor(1);
        ReusableMethods.isTextVisible(profileCompany.companysPhoneNumber, "-");
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(profileCompany.address);
        ReusableMethods.waitFor(1);

    }


    @Then("User clicks the Edit Button.nag")
    public void userClicksTheEditButtonNag() {

        profileCompany.edit.click();
        ReusableMethods.waitFor(2);
    }

    @Then("User verifies the Edit your company information page is visible.nag")
    public void userVerifiesTheEditYourCompanyInformationPageIsVisibleNag() {


        ReusableMethods.isTextVisible(profileCompany.editYourCompanyInformation, "Edit your company information");
        ReusableMethods.waitFor(1);
    }

    @Then("User inputs the current company name in the Your Company name field.nag")
    public void userInputsTheCurrentCompanyNameInTheYourCompanyNameFieldNag() {

        profileCompany.yourCompanyNameInput.clear();
        ReusableMethods.waitFor(1);
        profileCompany.yourCompanyNameInput.sendKeys("My New Company");
        ReusableMethods.waitFor(1);

    }

    @Then("User inputs the current Address in the Address field.nag")
    public void userInputsTheCurrentAddressInTheAddressFieldNag() {

        profileCompany.companysAddressInput.clear();
        ReusableMethods.waitFor(1);
        profileCompany.companysAddressInput.sendKeys("New Street");
        ReusableMethods.waitFor(1);
    }


    @Then("User inputs the city, State, Zip code in the city, State, Zip code field.nag")
    public void userInputsTheCityStateZipCodeInTheCityStateZipCodeFieldNag() {

        profileCompany.cityStateZipcodeInput.clear();
        ReusableMethods.waitFor(1);
        profileCompany.cityStateZipcodeInput.sendKeys("New City New State 9999 ZipCode");
        ReusableMethods.waitFor(1);
    }

    @Then("User inputs the current Country in the Country field.nag")
    public void userInputsTheCurrentCountryInTheCountryFieldNag() {

        Actions actions = new Actions(driver);
        Assert.assertEquals(profileCompany.countryInput.getAttribute("value"), "United States");
        actions.doubleClick(profileCompany.countryInput).perform();
        actions.sendKeys("United Kingdom", Keys.ENTER).build().perform();

    }

    @Then("User inputs the current Companys URL in the Company's URL field.nag")
    public void userInputsTheCurrentCompanysURLInTheCompanySURLFieldNag() {

        profileCompany.companyURLinput.clear();
        ReusableMethods.waitFor(1);
        profileCompany.companyURLinput.sendKeys("99999999999");
        ReusableMethods.waitFor(1);
    }

    @Then("User inputs the current  Companys Phone Number in the  Company's Phone Number field.nag")
    public void userInputsTheCurrentCompanysPhoneNumberInTheCompanySPhoneNumberFieldNag() {


        profileCompany.companysPhoneNumberInput.clear();
        ReusableMethods.waitFor(1);
        profileCompany.companysPhoneNumberInput.sendKeys("449999999999");
        ReusableMethods.waitFor(1);
    }

    @Then("User replaces the current image in the image field.nag")
    public void userReplacesTheCurrentImageInTheImageFieldNag() {

        //String path = System.getProperty("user.dir") + "\\src\\test\\resources\\files\\23-08.jpg";//LOGO1
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\files\\91716.jpg";//LOGO2
        profileCompany.fileUpload.sendKeys(path);
        ReusableMethods.waitFor(1);

    }

    @Then("User verifies Your Company information has been updated text is visible.nag")
    public void userVerifiesYourCompanyInformationHasBeenUpdatedTextIsVisibleNag() {

        profileCompany.update.click();
        ReusableMethods.waitFor(4);

        //ESKI HALINE DONDURMEK VE TEKRAR CALISTIRDIGIMIZDA AYNI BILGILERLE KENDI COMPANY NAMEmimize UlASABILMEK
        // ve ayni bilgileri verify edebilmek icin ESKI BILGILERI YENIDEN GIRIYORUZ
        profileCompany.edit.click();
        profileCompany.yourCompanyNameInput.clear();
        profileCompany.yourCompanyNameInput.sendKeys("My company");
        profileCompany.companysAddressInput.clear();
        profileCompany.companysAddressInput.sendKeys("ABC STREET2");
        profileCompany.cityStateZipcodeInput.clear();
        profileCompany.cityStateZipcodeInput.sendKeys("Abc city Abc state 10000 zipCode");
        Actions actions = new Actions(driver);
        actions.doubleClick(profileCompany.countryInput).perform();
        actions.sendKeys("United States", Keys.ENTER).build().perform();
        profileCompany.companyURLinput.clear();
        profileCompany.companyURLinput.sendKeys("1234567890");
        profileCompany.companysPhoneNumberInput.clear();
        profileCompany.companysPhoneNumberInput.sendKeys(" 16003040");
        ReusableMethods.waitFor(1);
        profileCompany.update.click();
        ReusableMethods.waitFor(3);
        driver.get("https://test.hypnotes.net/dashboard/profile");
        ReusableMethods.waitFor(3);
        driver.close();

    }

}


