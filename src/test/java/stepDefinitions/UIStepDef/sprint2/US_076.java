package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.TherapistLogin;
import pages.TherapistRegister;
import utilities.ConfigReader;
import utilities.Driver;
import org.openqa.selenium.By;
import pages.HomePage;

import static stepDefinitions.Hooks.driver;

public class US_076 {
    HomePage page = new HomePage(driver);

    @Given("User goes to the {string}.us076")
    public void userGoesToThe(String url) {
        Driver.getDriver().get(url);
    }

    @When("user types {string} to the email input on the login page.us076")
    public void userTypesToTheEmailInputOnTheLoginPage(String email) {
        page.loginEmail.sendKeys(email);
    }

    @When("user types {string} to the password input on the login page.us076")
    public void userTypesToThePasswordInputOnTheLoginPage(String password) {
        page.loginPassword.sendKeys(password);
    }

    @When("user clicks on the {string} button on the login page")
    public void userClicksOnTheButtonOnTheLoginPage(String arg0) {
        page.loginEnterButton.click();

    }

    @When("user clicks on the {string} button")
    public void userClicksOnTheButton(String arg0) {
        WebElement clients = driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/aside[1]/div[1]/ul[1]/li[2]/span[2]/a[1]"));
        clients.click();

    }

    @When("user clicks on a {string}")
    public void userClicksOnA(String arg0) {WebElement aClient = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div/div/div[1]/div[4]/div/div/ul/div[1]/div[1]/div/div/div/a/h5"));
        aClient.click();
    }

    @When("user clicks on the {string}")
    public void userClicksOnThe(String arg0) {WebElement invoice = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div/div[1]/a[4]"));
        invoice.click();
    }

    @When("user inputs name in the name field")
    public void userInputsNameInTheNameField() {
        WebElement clientName = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div/div[1]/a[4]"));
        clientName.sendKeys("Ali Veli");
    }

    @When("user inputs a valid address in the address field")
    public void userInputsAValidAddressInTheAddressField() {

    }

    @When("user inputs city, State, and Zipcode in the City, State, Zip field")
    public void userInputsCityStateAndZipcodeInTheCityStateZipField() {
        WebElement clientzip = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div/div[2]/div[3]/div[1]/input[4]"));
        clientzip.sendKeys("85225");
    }

    @When("user checks if Country drop down is functional")
    public void userChecksIfCountryDropDownIsFunctional() {
        WebElement country = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div/div[2]/div[3]/div[1]/input[5]"));
        Assert.assertTrue(country.isEnabled());
        country.click();
        country.click();
    }

    @Then("user selects a Country from the drop down")
    public void userSelectsACountryFromTheDropDown() {
        WebElement country = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div/div[2]/div[3]/div[1]/input[5]"));
        country.click();
    }
}
