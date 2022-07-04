package stepDefinitions.UIStepDef.sprint3;
import pages.ProfileCompany;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Cookie;
import pages.Appointment;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;


public class US_111 {

    ProfileCompany page = new ProfileCompany(driver);

    @Given("User Navigates to {string}")
    public void user_navigates_to_profile_details(String string) {
          driver.get(ConfigReader.getProperty("hypnotesURL") + string);
          driver.manage().addCookie(new Cookie("PHPSESSID", "rjq63g2dgm4sa31vhmvgv4qb2t"));
          driver.get(ConfigReader.getProperty("hypnotesURL") + string);

    }
    @When("User Open Company details Page")
    public void user_open_company_details_page() {
        ReusableMethods.clickWithJS(page.comLink);
    }

    @Then("User verifies Company title is clickable")
    public void user_verifies_company_title_is_clickable() {
        ReusableMethods.verifyElementClickable(page.comTitle);
    }
    @Then("User clicks on the company title")
    public void user_clicks_on_the_company_title() {
        ReusableMethods.clickWithJS(page.comTitle);
    }
    @And("User Verifies Add New Company button is visible")
    public void user_verifies_add_new_company_button_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User Clicks on Add New Company button")
    public void user_cliks_on_add_new_company_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies the \"Your Logo, Your Company, Company's Address, City, State, Zip, Country\\(Default US),Company's URL, Company's Phone Number Fields are visible")
    public void user_verifies_the_your_logo_your_company_company_s_address_city_state_zip_country_default_us_company_s_url_company_s_phone_number_fields_are_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies a Valid logo is loadable")
    public void user_verifies_a_valid_logo_is_loadable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies a valid company name is applicable")
    public void user_verifies_a_valid_company_name_is_applicable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies a valid company address is applicable")
    public void user_verifies_a_valid_company_address_is_applicable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User Verifies a valid City, State, Zip Should be applicable into the related fields")
    public void user_verifies_a_valid_city_state_zip_should_be_applicable_into_the_related_fields() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies Country Dropdown menu is functional")
    public void user_verifies_country_dropdown_menu_is_functional() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies A country is selectable from the Dropdown menu")
    public void user_verifies_a_country_is_selectable_from_the_dropdown_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies a Valid URL is applicable")
    public void user_verifies_a_valid_url_is_applicable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies a valid company's phone number is applicable into the related field")
    public void user_verifies_a_valid_company_s_phone_number_is_applicable_into_the_related_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
