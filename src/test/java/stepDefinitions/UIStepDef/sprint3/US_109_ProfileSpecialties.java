package stepDefinitions.UIStepDef.sprint3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ProfileSpecialities;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.Random;

import static stepDefinitions.Hooks.driver;

public class US_109_ProfileSpecialties {
    ProfileSpecialities ps=new ProfileSpecialities(driver);
    Random rand = new Random();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @When("user clicks on specialty dropdown")
    public void userClicksOnSpecialtyDropdown() {
        ps.specialtyDropdown.click();
        ps.specialtyDropdown.click();
    }

    @Then("user verifies all specialties are visible and selectable")
    public void userVerifiesAllSpecialtiesAreVisibleAndSelectable() {
        for (int i = 0; i == ps.specialtyList.size(); i++) {
            ReusableMethods.verifyElementDisplayed(ps.specialtyList.get(i));
            ReusableMethods.verifyElementClickable(ps.specialtyList.get(i));
        }
    }

    @And("user selects any specialty")
    public void userSelectsAnySpecialty() {
        WebElement randomSpe = ps.specialtyList.get(rand.nextInt(ps.specialtyList.size()));
        System.out.println(randomSpe.getText());
        if (!randomSpe.isDisplayed()) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
        }
        wait.until(ExpectedConditions.elementToBeClickable(randomSpe));
        randomSpe.click();
    }

    @Then("user clicks on the close button")
    public void userClicksOnTheCloseButton() {
        ps.closeButton.click();
    }

    @And("user verifies the created specialty is visible")
    public void userVerifiesTheCreatedSpecialtyIsVisible() {
        ReusableMethods.verifyElementDisplayed(ps.createdSpe);
    }

    @And("user deletes the created specialty")
    public void userDeletesTheCreatedSpecialty() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ps.trashButton);
        wait.until(ExpectedConditions.visibilityOf(ps.trashButton));
        wait.until(ExpectedConditions.elementToBeClickable(ps.trashButton));
        ReusableMethods.waitFor(2);
        ps.trashButton.click();
        wait.until(ExpectedConditions.visibilityOf(ps.trashOK));
        ps.trashOK.click();
    }


}
