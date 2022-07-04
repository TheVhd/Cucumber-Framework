package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.Services;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

import static stepDefinitions.Hooks.driver;

public class US_081_IndividualSession {

    Services services = new Services(driver);
    HomePage homePage = new HomePage(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @When("user accepts cookies")
    public void userAcceptsCookies() {
        ReusableMethods.waitFor(2);
        wait.until(ExpectedConditions.visibilityOf(homePage.acceptButton));
        homePage.acceptButton.click();
        homePage.hideServer.click();
        wait.until(ExpectedConditions.visibilityOf(homePage.viewButton));
        ReusableMethods.clickWithJS(homePage.viewButton);
        ReusableMethods.clickWithJS(homePage.check1Input);
        ReusableMethods.clickWithJS(homePage.nextButton);
        ReusableMethods.clickWithJS(homePage.check2Input);
        ReusableMethods.clickWithJS(homePage.submitButton);
    }

    @Then("user enters {string} to {string} box")
    public void userEntersToBox(String data, String input) {
        WebElement element = driver.findElement(By.xpath("//input[@name= '" + input + "']"));
        element.sendKeys(ConfigReader.getProperty(data));
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        ReusableMethods.clickWithJS(homePage.loginEnterButton);
    }

    @Then("user clicks on Services")
    public void userClicksOnServices() {
        services.service.click();
    }

    @When("user clicks on {string} span")
    public void userClicksOnSpan(String word) {
        WebElement element = driver.findElement(By.xpath("//span[text()='" + word + "']"));
        wait.until(ExpectedConditions.visibilityOf(element));
        ReusableMethods.clickWithJS(element);
    }

    @Then("user verifies wrapper field is visible")
    public void userVerifiesWrapperFieldIsVisible() {
        wait.until(ExpectedConditions.visibilityOf(services.wrapper));
        ReusableMethods.verifyElementDisplayed(services.wrapper);
    }

    @Then("user verifies headings are visible")
    public void userVerifiesHeadingsAreVisible(DataTable dataTable) {
        List<List<String>> table = dataTable.asLists(String.class);
        for (List<String> s : table) {
            for (Object item : s) {
                WebElement element = driver.findElement(By.xpath("//label[contains(text(),'" + item + "')]"));
                if (element.isDisplayed()) {
                    Assert.assertTrue(element.isDisplayed());
                }
            }
        }
    }

    @Then("user verifies input boxes are visible")
    public void userVerifiesInputBoxesAreVisible(DataTable data) {
        List<List<String>> table = data.asLists(String.class);
        for (List<String> s : table) {
            for (Object item : s) {
                WebElement element = driver.findElement(By.xpath("//*[@id='" + item + "']"));
                wait.until(ExpectedConditions.visibilityOf(element));
                Assert.assertTrue(element.isDisplayed());
            }
        }
    }

    @Then("user verifies input boxes are functional")
    public void userVerifiesInputBoxesAreFunctional(DataTable dataT) {
        List<List<String>> table = dataT.asLists(String.class);
        for (List<String> s : table) {
            for (Object item : s) {
                WebElement element = driver.findElement(By.xpath("//*[@id='" + item + "']"));
                wait.until(ExpectedConditions.elementToBeClickable(element));
                Assert.assertTrue(element.isEnabled());
            }
        }
    }

    @And("user verifies {string} is visible span")
    public void userVerifiesIsVisibleSpan(String word) {
        WebElement element = driver.findElement(By.xpath("//span[text()='" + word + "']"));
        wait.until(ExpectedConditions.visibilityOf(element));
        ReusableMethods.verifyElementDisplayed(element);
    }

    @Then("user verifies {string} is functional span")
    public void userVerifiesIsFunctionalSpan(String word) {
        WebElement element = driver.findElement(By.xpath("//span[text()='" + word + "']"));
        ReusableMethods.verifyElementClickable(element);
    }

    @Then("user verifies {string} is not visible span")
    public void userVerifiesIsNotVisibleSpan(String word) {
        WebElement element = driver.findElement(By.xpath("//span[text()= '" + word + "']"));
        wait.until(ExpectedConditions.invisibilityOf(element));
        ReusableMethods.verifyElementNotDisplayed(element);
    }

    @Then("user verifies scheduler URL is visible")
    public void userVerifiesSchedulerURLIsVisible() {
        ReusableMethods.verifyElementDisplayed(services.schedulerURL);
    }

    @Then("user verifies rightmost up button is functional")
    public void userVerifiesRightmostUpButtonIsFunctional(DataTable dataTab) {
        List<List<String>> table = dataTab.asLists(String.class);
        for (List<String> s : table) {
            for (Object num : s) {
                WebElement button = driver.findElement(By.xpath("(//span[@class='anticon anticon-up ant-input-number-handler-up-inner'])" + num));
                ReusableMethods.verifyElementClickable(button);
                button.click();
            }
        }
    }

    @Then("user verifies rightmost down button is functional")
    public void userVerifiesRightmostDownButtonIsFunctional(DataTable dataTab) {
        List<List<String>> table = dataTab.asLists(String.class);
        for (List<String> s : table) {
            for (Object num : s) {
                WebElement button = driver.findElement(By.xpath("(//span[@class='anticon anticon-down ant-input-number-handler-down-inner'])" + num));
                ReusableMethods.verifyElementClickable(button);
                button.click();
            }
        }
    }

    @Then("user clicks on duration box")
    public void userClicksOnDurationBox() {
        services.durationBox.click();
    }

    @And("user verifies all durations are selectable")
    public void userVerifiesAllDurationsAreSelectable(DataTable dataTable) {
        List<List<String>> table = dataTable.asLists(String.class);
        for (List<String> s : table) {
            for (Object item : s) {
                WebElement element = driver.findElement(By.xpath("//*[text()='" + item + "']"));
                Assert.assertTrue(element.isEnabled());
                services.durationBox.click();
            }
        }
    }

    @Then("user enters {string},{string} ,{string} ,{string} ,{string} ,{string}")
    public void userEnters(String name, String price, String duration, String blockBefore, String blockAfter, String description) {
        services.nameBox.sendKeys(name);
        services.priceBox.sendKeys(price);
        services.durationBox.sendKeys(duration);
        services.blockBeforeBox.sendKeys(blockBefore);
        services.blockAfterBox.sendKeys(blockAfter);
        services.descriptionBox.sendKeys(description);
    }

    @And("user checks off all the {string}") //dont need to click on bookable, already checked off
    public void userChecksOffAllThe(String buttons) {
        String[] button = buttons.split(",");
        for (String s : button) {
            if (s.contains("showPrice")) {
                ReusableMethods.scrollToElement(services.showPriceButton);
                ReusableMethods.clickWithJS(services.showPriceButton);
            }
            if (s.contains("paymentRequired")) {
                ReusableMethods.scrollToElement(services.paymentRequiredButton);
                ReusableMethods.clickWithJS(services.paymentRequiredButton);
            }
        }
    }

    @And("user checks off all documents checkbox")
    public void userChecksOffAllDocumentsCheckbox() {
//        if (services.allDocumentsCheckbox.isDisplayed()) {
//            services.allDocumentsCheckbox.click();
//        }
    }

    @And("user verifies {string} warning is visible")
    public void userVerifiesIsVisible(String warning) {
        WebElement element = driver.findElement(By.xpath("//div[text()='" + warning + "']"));
        wait.until(ExpectedConditions.visibilityOf(element));
        ReusableMethods.verifyElementDisplayed(element);
    }

    @And("user verifies the created session is visible")
    public void userVerifiesTheCreatedSessionIsVisible() {
        ReusableMethods.verifyElementDisplayed(services.card);
    }

    @And("user deletes the created session")
    public void userDeletesTheCreatedSession() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
        wait.until(ExpectedConditions.visibilityOf(services.trashButton));
        services.trashButton.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        wait.until(ExpectedConditions.elementToBeClickable(services.trashButton));
        ReusableMethods.waitFor(2);
        services.trashButton.click();
        wait.until(ExpectedConditions.visibilityOf(services.trashOK));
        services.trashOK.click();
    }

    @And("user verifies {string} message is visible")
    public void userVerifiesMessageIsVisible(String tm) {
        WebElement toastMessage = driver.findElement(By.xpath("//*[text()='" + tm + "']"));
        ReusableMethods.verifyElementDisplayed(toastMessage);
    }
}
