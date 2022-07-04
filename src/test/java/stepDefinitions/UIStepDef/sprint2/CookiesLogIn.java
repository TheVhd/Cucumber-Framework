package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import pages.Clients_056;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class CookiesLogIn {


    @Given("user goes to {string} with cookie")
    public void userGoesToWithCookie(String arg0) {
        driver.get(ConfigReader.getProperty("hypnotesURL") + arg0);
        driver.manage().addCookie(new Cookie("PHPSESSID", "smnn7lu5ckgrsedg05jp4mocua"));
        driver.get(ConfigReader.getProperty("hypnotesURL") + arg0);

    }

    @And("user clicks customizeUrl")
    public void userClicksCustomizeUrl() {
        WebElement element = Driver.getDriver().findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-background-ghost ml-5']"));
        element.click();

    }
}
