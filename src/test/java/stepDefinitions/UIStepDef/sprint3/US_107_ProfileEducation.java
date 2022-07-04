package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ProfileEducation;
import utilities.ReusableMethods;

import java.time.Duration;

import static stepDefinitions.Hooks.driver;

public class US_107_ProfileEducation {
    ProfileEducation pe = new ProfileEducation(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Then("user clicks on Profile")
    public void userClicksOnProfile() {
        pe.profile.click();
    }

    @Then("user enters {string},{string},{string}, {string}, {string} in education section")
    public void userEntersInEducationSection(String schoolName, String department, String startedAt, String enddedAt, String description) {
        pe.schoolName.sendKeys(schoolName);
        pe.department.sendKeys(department);
        pe.startedAt.sendKeys(startedAt); //icdw add Keys.TAB (twice)
        pe.enddedAt.sendKeys(enddedAt);
        pe.description.sendKeys(description);
    }

    @And("user verifies the created education is visible")
    public void userVerifiesTheCreatedEducationIsVisible() {
        ReusableMethods.verifyElementDisplayed(pe.createdEducation);
    }

    @And("user deletes the created education")
    public void userDeletesTheCreatedEducation() {
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
