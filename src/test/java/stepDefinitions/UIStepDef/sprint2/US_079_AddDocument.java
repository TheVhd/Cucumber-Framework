package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Documents;
import pages.HomePage;
import pages.LoginPageCB;
import pages.ScheduleSettings;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.List;

import static stepDefinitions.Hooks.driver;

public class US_079_AddDocument {


    LoginPageCB lp = new LoginPageCB(driver);


    HomePage hp = new HomePage(driver);
    Documents dp = new Documents(driver);

    ScheduleSettings  ss = new ScheduleSettings(driver);

    @Given("the user navigates to {string}")
    public void theUserNavigatesTo(String url) {
        String path = ConfigReader.getProperty("environment") + url;
        driver.get(path);
    }

    @When("the user click on login button on the homepage")
    public void theUserClickOnLoginButtonOnTheHomepage() {
        hp.loginBtn.click();
    }

    @And("the user types {string} to Email Input on login page")
    public void theUserTypesToEmailInputOnLoginPage(String key) {
        lp.txtEmail.sendKeys(ConfigReader.getProperty(key));
    }

    @And("the user types {string} to Password Input on login page")
    public void theUserTypesToPasswordInputOnLoginPage(String key) {
        lp.txtPassword.sendKeys(ConfigReader.getProperty(key));
    }

    @And("the user clicks on Login button on login page")
    public void theUserClicksOnLoginButtonOnLoginPage() {
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(lp.btnLogin);
        ReusableMethods.waitFor(3);
    }

    @Then("the user verifies if the relevant page opens {string}")
    public void theUserVerifiesIfTheRelevantPageOpens(String url) {
        ReusableMethods.waitForClickablility(ss.dashboardMenu,20);
        String path = ConfigReader.getProperty("environment") + url;
        Assert.assertEquals(path, driver.getCurrentUrl());
    }


    @Given("the user is on {string}")
    public void theUserIsOn(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }


    @Then("the user verifies if the {string} link is visible on the left menu")
    public void theUserVerifiesIfTheLinkIsVisibleOnTheLeftMenu(String linkText) {
        WebElement menuLink = driver.findElement(By.xpath("//*[text()='" + linkText + "']"));
        Assert.assertTrue(menuLink.isDisplayed());
    }

    @When("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String linkText) {
        ReusableMethods.waitForPageToLoad(15);
        WebElement menuLink = driver.findElement(By.xpath("//*[text()='" + linkText + "']"));

        ReusableMethods.clickWithJS(menuLink);

    }


    @Then("the user verifies if {string} page is visible {string}")
    public void theUserVerifiesIfPageIsVisible(String pageName, String pageLink) {
        Assert.assertEquals(pageLink, driver.getCurrentUrl());
    }

    @When("the user clicks on Logout button")
    public void theUserClicksOnLogoutButton() {
        WebElement btnLogOut = dp.btnLogout;
        btnLogOut.click();
    }

    @Then("the user verifies if Cancel button is visible and clickable")
    public void theUserVerifiesIfCancelButtonIsVisibleAndClickable() {
        WebElement btnCancel = dp.btnCancelArrow;
        Assert.assertTrue(btnCancel.isDisplayed());
        Assert.assertTrue(btnCancel.isEnabled());
    }

    // General Method for Cucumber Data Table
    @Then("the user verifies if relevant titles are visible")
    public void theUserVerifiesIfRelevantTitlesAreVisible(DataTable dataTable) {

        // 3 row varsa 3 List<String> var demektir, table.size() = 3
        List<List<String>> table = dataTable.asLists(String.class);
        for (List<String> s : table) {// row sayisi kadar doner
            for (Object item : s) {// column sayisi kadar doner
                //System.out.println(item.getClass()); //String geliyor
                WebElement element = driver.findElement(By.xpath("//div[contains(text(),'" + item + "')]"));
                Assert.assertTrue(element.isDisplayed());
            }
        }
        //System.out.println(dataTable.cell(0, 1));
        //table.get(0).get(1); // row and column
        System.out.println("---------------------------");
    }

    @When("the user clicks on the Cancel button on Add Documents page")
    public void theUserClicksOnTheCancelButtonOnAddDocumentsPage() {
        WebElement btnCancel = dp.btnCancelArrow;
        btnCancel.click();
    }

    @Then("the user verifies Select File is clickable and selectable")
    public void theUserVerifiesSelectFileIsClickableAndSelectable() {
        WebElement btnSelectFile = dp.btnSelectFileUpSec;
        Assert.assertTrue(btnSelectFile.isEnabled());

    }


    @When("the user attaches the file.")
    public void theUserAttachesTheFile() {
        String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\files\\siniflar.pdf";

        // harika calisti. Sayfada gozukmeyen input a sendKeys yaptim, dosya secmis gibi yapti
        WebElement fileUploadInput = dp.fileUploadInput; //Upload section
        fileUploadInput.sendKeys(filePath);

    }

    @Then("the user verifies if attached file is appear on the screen")
    public void theUserVerifiesIfAttachedFileIsAppearOnTheScreen() {
        WebElement attachFileIcon = dp.iconAttactFile;
        Assert.assertTrue(attachFileIcon.isDisplayed());
    }

    @Then("the user verifies if file name input is active")
    public void theUserVerifiesIfFileNameInputIsActive() {

        WebElement fileNameInput = dp.fileNameInputUpSec;
        Assert.assertTrue(fileNameInput.isEnabled());
        Assert.assertNotEquals(" ", fileNameInput.getText());
    }

    @When("the user clicks on the {string} button on upload page")
    public void theUserClicksOnTheButtonOnUploadPage(String btnText) {
        WebElement btn = driver.findElement(By.xpath("//button/span[text()='" + btnText + "']"));
        ReusableMethods.clickWithJS(btn);
    }

    @Then("the user verifies if {string} section is visible")
    public void theUserVerifiesIfSectionIsVisible(String sectionTitle) {
        ReusableMethods.waitFor(4);
        WebElement navigate = dp.activeNavigateTitleBar;
        Assert.assertEquals(sectionTitle, navigate.getText());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

    }

    @Then("the user verifies if {string} option is selected on Select Annotation menu")
    public void theUserVerifiesIfOptionIsSelectedOnSelectAnnotationMenu(String selectOption) {
        WebElement selectedItem = dp.cbbSelectedItemAnnotation;
        Assert.assertEquals(selectOption, selectedItem.getText());

    }

    @Then("the user verifies if Select Annotation Menu is functional")
    public void theUserVerifiesIfSelectAnnotationMenuIsFunctional() {
        if (hp.acceptButton.isDisplayed())
            ReusableMethods.clickWithJS(hp.acceptButton);
        //// Select Annotation menu should be functional and Signature default should appear  --
        ReusableMethods.waitForPageToLoad(8);

        WebElement cbb = dp.cbbSelectAnnotation;
        Assert.assertEquals("Signature", cbb.getText()); // Signature mu?
        Assert.assertTrue(cbb.isEnabled());

        /////  An annotation must be selectable
        cbb.click();
        ReusableMethods.clickWithJS(driver.findElement(By.xpath("//div[text()='Full Name']")));
        // burada amac combobox dan bir elementi secebiliyor muyum gormek

        ////// Optional Field must be functional
        // Optional Field checkbox - //input[@class='ant-checkbox-input']
        WebElement checkbox = driver.findElement(By.xpath("//input[@class='ant-checkbox-input']"));
        Assert.assertTrue(checkbox.isEnabled());
        checkbox.click();


        ///// Then the 'Add Annotation' button should be clickable to add it to the Document
        // Add Annotation button - //button[@class='ant-btn']
        WebElement btnAddAnnotation = driver.findElement(By.xpath("//button[@class='ant-btn']"));
        Assert.assertTrue(btnAddAnnotation.isEnabled());

        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='webviewer-1']"));
        driver.switchTo().frame(iframe);

        ReusableMethods.waitForVisibility(driver.findElement(By.cssSelector("div.DocumentContainer")), 10);
        driver.switchTo().defaultContent();

        // Tıklama cunku daha iframe yuklenmedi

        btnAddAnnotation.click();

        //////    When you click the Next button, the Self Annotation section should be visible. -//button/span[text()='Next']
        WebElement btnNext = driver.findElement(By.xpath("//span[text()='Next']/.."));
        try {
            WebElement btnBelowToolbarClose = driver.findElement(By.cssSelector("button.hide-button"));
            if (btnBelowToolbarClose.isDisplayed()) {
                ReusableMethods.clickWithJS(btnBelowToolbarClose);
            }
        } catch (Exception ex) {
            System.out.println("go on close button is not here");
        }

        ReusableMethods.clickWithJS(btnNext);

        //btnNext.click();


        //// the Self Annotation section should be visible.
        //Then the user verifies if "Self Annotations" section is visible

        //// #  As a user, I should be able to sign the document before saving and be able to
        // complete the upload by pressing the finish button.

        //BrowserUtilities.waitForVisibility(iframe,8); -> calismadi
        ReusableMethods.waitForPageToLoad(10);

        driver.switchTo().frame(iframe);
        //control , iframe is visible
        ReusableMethods.waitForVisibility(driver.findElement(By.cssSelector("div.DocumentContainer")), 10);
        WebElement btnInsert = driver.findElement(By.xpath("//div[@class='ribbons'] //button[text()='Insert']"));
        btnInsert.click();
        ReusableMethods.clickWithJS(btnInsert);
        WebElement btnAddNewSignature = driver.findElement(By.xpath("//button[text()='Add New Signature']"));
        btnAddNewSignature.click();
        ReusableMethods.clickWithJS(btnAddNewSignature);


        WebElement popUpSignature = driver.findElement(By.xpath("//div[@data-element='signatureModal'] //div[@class='container']"));
        ReusableMethods.waitForVisibility(popUpSignature, 4);

        WebElement uploadTab = driver.findElement(By.xpath("//button[text()='Upload']"));
        uploadTab.click();
        ReusableMethods.clickWithJS(uploadTab);

        WebElement uploadFile = driver.findElement(By.xpath("//input[@type='file' and @id='upload']"));
        uploadFile.sendKeys(System.getProperty("user.dir") + "\\src\\test\\resources\\files\\klavye.jpg");


        ReusableMethods.waitFor(2);
        WebElement btnCreate = driver.findElement(By.xpath("(//div[@class='footer'] //button[text()='Create'])[3]"));
        btnCreate.click();
        ReusableMethods.clickWithJS(btnCreate);

        driver.switchTo().activeElement().click();


    }


}
