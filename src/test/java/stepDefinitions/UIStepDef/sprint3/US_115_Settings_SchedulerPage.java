package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Cookie;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import pages.Settings;

import static stepDefinitions.Hooks.driver;




public class US_115_Settings_SchedulerPage {
    Settings pg = new Settings(driver);

    @Given("User Goes to {string}")
    public void user_goes_to(String string) {
        driver.get(ConfigReader.getProperty("hypnotesURL") + string);
        driver.manage().addCookie(new Cookie("PHPSESSID", "m7mk5cuqol0nee472pdkf7p60e"));
        driver.get(ConfigReader.getProperty("hypnotesURL") + string);

    }

    @When("User Clicks Scheduler Page Settings button")
    public void user_clicks_scheduler_page_settings_button() {
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(pg.settingsButton);
    }

    @Then("User verifies The Settings Button is clickable")
    public void user_verifies_the_settings_button_is_clickable() {
        ReusableMethods.verifyElementClickable(pg.settingsButton);
    }

    @And("User Verifies the Categories are clickable")
    public void user_verifies_the_categories_are_clickable() {
        ReusableMethods.verifyElementClickable(pg.CategoriesButton);
    }

    @Then("User Click the Categories Button")
    public void user_click_the_categories_button() {
        ReusableMethods.clickWithJS(pg.CategoriesButton);
    }

    @And("User Verifies the Color palette window is opened")
    public void user_verifies_the_color_palette_window_is_opened() {
        ReusableMethods.waitFor(4);
        ReusableMethods.verifyElementDisplayed(pg.colorPalette);
        ReusableMethods.clickWithJS(pg.cancelButton);
    }

    @And("User verifies {string} button is visible")
    public void user_verifies_button_is_visible(String string) {
        ReusableMethods.verifyElementDisplayed(pg.bgImageButton);
    }

    @And("User verifies {string} button is clickable")
    public void user_verifies_button_is_clickable(String string) {
        ReusableMethods.clickWithJS(pg.bgImageButton);
    }

    @And("User verifies the BG changes successfully")
    public void user_verifies_the_bg_changes_successfully() {
        ReusableMethods.verifyElementDisplayed(pg.bgImage);
    }


}
