package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.*;
import utilities.ReusableMethods;

import java.util.Iterator;
import java.util.Set;

import static stepDefinitions.Hooks.driver;


public class US_073_Attachment_StepDf {

    SearchClient attachmentPage = new SearchClient(driver);
    HomePage homePage = new HomePage(driver);
    TherapistLogin thrpstLogin = new TherapistLogin(driver);
    Therapist therapist = new Therapist(driver);


    @Given("the user is on the qa home page")
    public void the_user_is_on_the_qa_home_page() {
        //driver.get(ConfigReader.getProperty("hypnotesURL"));
        driver.get("https://test.hypnotes.net/");

    }

    @When("the user clicks on login button on the homepage")
    public void the_user_clicks_on_login_button_on_the_homepage() {
        homePage.cookies.click();
        homePage.login.click();
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        homePage.loginEmail.sendKeys("therapisthypnotes2020@gmail.com");
        homePage.loginPassword.sendKeys("Therapist+tayfa2022");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

    }

    @When("the user clicks on login button on login page")
    public void the_user_clicks_on_login_button_on_login_page() {
        ReusableMethods.waitFor(3);
        homePage.loginEnterButton.click();
    }

    @When("the user clicks the Clients tab on the Dashboard Calendar Page")
    public void the_user_clicks_the_clients_tab_on_the_dashboard_calendar_page() {
        ReusableMethods.clickWithJS(therapist.clientsLink);
        ReusableMethods.waitFor(3);
    }

    @When("the user inputs Reyhan into the Search Input Box")
    public void the_user_inputs_reyhan_into_the_search_input_box() {
        attachmentPage.searchInput.sendKeys("Reyhan");
    }

    @When("the user clicks the search button")
    public void the_user_clicks_the_search_button() {
        attachmentPage.searchButton.click();
    }

    @When("the user clicks the client name")
    public void the_user_clicks_the_client_name() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
        attachmentPage.clientName.click();
    }

    @When("the user clicks the Sessions")
    public void the_user_clicks_the_sessions() {

        ReusableMethods.clickWithJS(attachmentPage.sessionButtonTop);
        ReusableMethods.waitFor(3);
    }

    @And("the user clicks the Add New Session button")
    public void the_user_clicks_the_add_new_session_button() {
        ReusableMethods.clickWithJS(attachmentPage.addNewSessionButton);
        ReusableMethods.waitFor(8);
    }

    @And("the user clicks the attachment icon")
    public void the_user_clicks_the_attachment_icon() {

        ReusableMethods.clickWithJS(attachmentPage.attachmentIkonu);
    }

    @Then("the user verifies that the attachment icon is enabled")
    public void the_user_verifies_that_the_attachment_icon_is_enabled() {
        ReusableMethods.scrollToElement(attachmentPage.attachmentIkonu);
        Assert.assertTrue("Attachment icon is not enabled", attachmentPage.attachmentIkonu.isEnabled());
    }

    @And("the user attaches the file")
    public void theUserAttachesTheFile() {
        ReusableMethods.clickWithJS(attachmentPage.attachmentIkonu);
        attachmentPage.fileUploadInput.sendKeys("C:\\Users\\Hp\\Desktop\\Hypnotes\\src\\test\\resources\\hypnotesData\\images\\indir.png");
    }

    @Then("the user verifies that the file is selected")
    public void the_user_verifies_that_the_file_is_selected() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue("Attachmend file is not selected", attachmentPage.attachmentFile.isEnabled());

    }

    @Then("the user verifies that the warning message {string} is displayed.")
    public void the_user_verifies_that_the_warning_message_is_displayed(String text) {
        ReusableMethods.waitForVisibility(attachmentPage.imagesAddedText, 5);

        Assert.assertEquals(text, attachmentPage.imagesAddedText.getText());
        Assert.assertTrue("Warning message is not displayed", attachmentPage.imagesAddedText.isDisplayed());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

    }


    @When("the user opens the added images by clicking")
    public void theUserOpensTheAddedImagesByClicking() {
        ReusableMethods.clickWithJS(attachmentPage.addedImage);

    }

  @Then("the user verifies that Copy, Extract text, Send to client, Delete Image buttons are displayed")
    public void the_user_verifies_that_copy_extract_text_send_to_client_delete_image_buttons_are_displayed() {
        Assert.assertTrue(attachmentPage.coppyButtn.isDisplayed());
        Assert.assertTrue(attachmentPage.extractTextButton.isDisplayed());
        Assert.assertTrue(attachmentPage.sendToClientBttn.isDisplayed());
        Assert.assertTrue(attachmentPage.deleteImageButton.isDisplayed());

    }


 /* @Then("the user verifies that {string} are displayed")
  public void theUserVerifiesThatAreDisplayed(String text) {
      WebElement element = driver.findElement(By.xpath("//*[text()= '"+text+"']"));
      Assert.assertTrue(element.isDisplayed());

  }
*/
    @Then("the user verifies that Copy, Extract text, Send to client, Delete Image buttons are enabled")
    public void the_user_verifies_that_copy_extract_text_send_to_client_delete_image_buttons_are_enabled() {
        ReusableMethods.clickWithJS(attachmentPage.coppyButtn);
        Assert.assertTrue("Copy button is not enabled", attachmentPage.coppyButtn.isEnabled());
        Assert.assertTrue("Extract text button is not", attachmentPage.extractTextButton.isEnabled());
        Assert.assertTrue("Send to client button is not", attachmentPage.sendToClientBttn.isEnabled());
        Assert.assertTrue(" Delete Image button is not", attachmentPage.deleteImageButton.isEnabled());
    }


    @And("the user clicks on Extract text button")
    public void theUserClicksOnExtractTextButton() {
        ReusableMethods.waitFor(3);
        ReusableMethods.clickWithJS(attachmentPage.extractTextButton);
    }

    @Then("the user verify if  textbox is empty")
    public void theUserVerifyIfTextboxIsEmpty() {
        // to get of the functionality of the button
        ReusableMethods.waitFor(5);

        String extractImageToText = attachmentPage.textBoxOnPopup.getAttribute("value");
        ReusableMethods.waitForVisibility(attachmentPage.textBoxOnPopup, 6);
        Assert.assertTrue(extractImageToText.length() != 0);
        // Extract to text button and textbox is functional

    }


    @Then("the user clicks the {string} button")
    public void the_user_clicks_the_button(String text) {
        attachmentPage.newTabB.click();
    }

    @Then("the user verifies that the new file is displayed in the new tab")
    public void the_user_verifies_that_the_new_file_is_displayed_in_the_new_tab() {
        Set<String> windows = driver.getWindowHandles();
        //birden buyukse diger window acilmistir
        Assert.assertTrue(windows.size() > 1);
        Iterator<String> it = windows.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        driver.close();
        driver.switchTo().window(parent);
    }


    @When("the user clicks on Delete button")
    public void theUserClicksOnDeleteButton() {
        ReusableMethods.clickWithJS(attachmentPage.deleteImageButton);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickWithJS(attachmentPage.deleteYesButton);

    }

    @Then("the user verifies if attached file is exist")
    public void theUserVerifiesIfAttachedFileIsExist() {
        ReusableMethods.waitFor(2);
        try {
            WebElement element = attachmentPage.addedImage;
            Assert.assertFalse(element.isDisplayed());

        } catch (Exception ex) {
            System.out.println( "element deleted");
        }
    }


}
