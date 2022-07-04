package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ProfileExperience;
import utilities.ReusableMethods;

import java.time.Duration;

import static stepDefinitions.Hooks.driver;

public class US_108_ProfileExperience {
    ProfileExperience pe = new ProfileExperience(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    @When("user clicks on {string} text")
    public void userClicksOnText(String arg0) {
        WebElement withText = driver.findElement(By.xpath("//*[contains(text(),'" + arg0 + "')]"));
        withText.click();
    }

    @Then("user enters {string},{string},{string}, {string}, {string} in experience section")
    public void userEntersInExperienceSection(String company, String jobTitle, String startedAt, String enddedAt, String description) {
        pe.company.sendKeys(company);
        pe.jobTitle.sendKeys(jobTitle);
        pe.startedAt.sendKeys(startedAt);
        pe.endedAt.sendKeys(enddedAt);
        pe.description.sendKeys(description);
    }

    @And("user verifies the created experience is visible")
    public void userVerifiesTheCreatedExperienceIsVisible() {
        ReusableMethods.verifyElementDisplayed(pe.createdExperience);
    }

    @And("user deletes the created experience")
    public void userDeletesTheCreatedExperience() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pe.trashButton);
        wait.until(ExpectedConditions.visibilityOf(pe.trashButton));
        pe.trashButton.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN);
        wait.until(ExpectedConditions.elementToBeClickable(pe.trashButton));
        ReusableMethods.waitFor(2);
        pe.trashButton.click();
        wait.until(ExpectedConditions.visibilityOf(pe.trashOK));
        pe.trashOK.click();
    }
}
