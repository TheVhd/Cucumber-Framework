package stepDefinitions.UIStepDef.sprint3;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Appointment;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

import static stepDefinitions.Hooks.driver;

public class US_087_StepDefs {

    Appointment appointment = new Appointment(driver);

    @Given("user goes to {string} with the cookie")
    public void user_goes_to_with_the_cookie(String string) {
        driver.get(ConfigReader.getProperty("hypnotesURL") + string);
        driver.manage().addCookie(new Cookie("PHPSESSID", "l85e27rdseb1hvvev60nsjhlim"));
        driver.get(ConfigReader.getProperty("hypnotesURL") + string);

    }

    @And("user clicks the selected date")
    public void userClicksTheSelectedDate() {


        ReusableMethods.waitFor(1);
        WebElement date = driver.findElement(By.xpath("(//table//tr[4]//td[1])[1]"));
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 3000)");
        ReusableMethods.waitFor(1);
        date.click();
    }

    @And("user clicks the repeat options box")
    public void userClicksTheRepeatOptionsBox() {

        ReusableMethods.waitFor(2);
        appointment.repeatOptionsBox.click();
        System.out.println("1.point");
        ReusableMethods.waitFor(2);


    }

    @Then("user verifies when does not repeat options selected repeat times does not appear")
    public void userVerifiesWhenDoesNotRepeatOptionsSelectedRepeatTimesDoesNotAppear() {

        ReusableMethods.waitFor(2);

        System.out.println(appointment.controls.size());
        if (appointment.controls.size() > 1) {
            System.out.println("Repeat Times appears");
            Assert.assertTrue(false);
        } else
        {
            System.out.println("Repeat Times does NOT appear ");
            Assert.assertTrue(true);



        }
        if(appointment.repeatOptionsBox.isDisplayed()) {
            System.out.println("repeted times is displayed");
            Assert.assertTrue(true);
        }
    }

    @Then("user verifies obtions are enabled")
    public void userVerifiesObtionsAreEnabled(DataTable dataTable) {
        List<String> options = dataTable.asList();
        for (String o : options) {
            WebElement element = driver.findElement(By.xpath("//*[@title='" + o + "']"));
            ReusableMethods.waitFor(3);
            System.out.println(element.getText());
            Assert.assertTrue(element.isDisplayed());
            Assert.assertTrue(element.isEnabled());


        }
    }

    @And("user clicks weekly")
    public void userClicksWeekly() {

        ReusableMethods.clickWithJS(appointment.weekly);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(appointment.repeatTimesButton.isDisplayed());

    }


    @And("user clicks the monthly option box")
    public void userClicksTheMonthlyOptionBox() {
        appointment.monthly.click();
    }

    @And("user clicks the Repeat Options UP arrow")
    public void userClicksTheRepeatOptionsUPArrow() {
        appointment.repeatOptionsUp.click();
        ReusableMethods.waitFor(4);
    }

    @And("user clicks the BiWeekly option box")
    public void userClicksTheBiWeeklyOptionBox() {
        appointment.repeatOptionsUp.click();
        ReusableMethods.waitFor(4);
    }

    @And("user clicks the Repeat Options DOWN arrow")
    public void userClicksTheRepeatOptionsDOWNArrow() throws IOException {
    for(int i=0; i<10; i++) {
        appointment.repeatOptionsDownArrow.click();
    }
    ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("negativeNumbersNotAllowed");

    }
}
