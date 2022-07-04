package stepDefinitions.UIStepDef.sprint1;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_008_SD {
    WebElement element = null;

    @Then("User verifies if all headings are visible, {string}") //general step?
    public void userVerifiesIfAllHeadingsAreVisible(String text) {
        //h3[text()='Video Conferencing - Telehealth']
        WebElement element = driver.findElement(By.xpath("//h3[text()='" + text + "']"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Then("User checks if all headings are clickable, {string}")
    public void userChecksIfAllHeadingsAreClickable(String text) {
        WebElement element = ReusableMethods.getElementFromGetText(text); // dikkat et çalışıyor mu
        Assert.assertTrue((element.isEnabled()));
        Driver.closeDriver();
    }

/*
    @When("User clicks on the heading link, {string}")
    public void userClicksOnTheHeadingLink(String text) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//h3[text()='" + text + "']"));
        //String expectedUrl = element.findElement(By.xpath("parent::a")).getAttribute("href");
        BrowserUtilities.clickWithJS(element);
        //System.out.println(Driver.getDriver().getCurrentUrl().contains(expectedUrl));
    }
*/


    @When("User clicks on the heading link, {string}")
    public void userClicksOnTheHeadingLink(String text) {
        System.out.println("girdim");
        WebElement element = ReusableMethods.getElementFromGetText(text);
        String expectedUrl = element.findElement(By.xpath("parent::a")).getAttribute("href");
        System.out.println("Expected URL" + expectedUrl);
        ReusableMethods.clickWithJS(element);
        System.out.println("tikladim");
        System.out.println(Driver.getDriver().getCurrentUrl().contains(expectedUrl));
    }


    @Then("User verifies if relevant pages open")
    public void userVerifiesIfRelevantPagesOpen() {
        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));
        Driver.closeDriver();

    }

}
