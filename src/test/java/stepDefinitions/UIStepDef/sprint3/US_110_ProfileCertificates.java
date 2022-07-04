package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ProfileSpecialities;
import utilities.ReusableMethods;

import java.time.Duration;

import static stepDefinitions.Hooks.driver;

public class US_110_ProfileCertificates {
    ProfileSpecialities ps = new ProfileSpecialities(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Then("user enters {string}, {string}, {string}, {string} in certificates section")
    public void userEntersInCertificatesSection(String title, String organization, String date, String publicUrl) {
        ps.title.sendKeys(title);
        ps.organization.sendKeys(organization);
        ps.date.sendKeys(date);
        ps.publicUrl.sendKeys(publicUrl);
    }

    @And("user verifies the created certificate is visible")
    public void userVerifiesTheCreatedCertificateIsVisible() {
        ReusableMethods.verifyElementDisplayed(ps.createdCer);
    }

    @And("user deletes the created certificate")
    public void userDeletesTheCreatedCertificate() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ps.trashButtonSp);
        wait.until(ExpectedConditions.visibilityOf(ps.trashButtonSp));
        wait.until(ExpectedConditions.elementToBeClickable(ps.trashButtonSp));
        ReusableMethods.waitFor(2);
        ps.trashButtonSp.click();
        wait.until(ExpectedConditions.visibilityOf(ps.trashOK));
        ps.trashOK.click();
    }
}
