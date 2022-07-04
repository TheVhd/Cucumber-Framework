//package stepDefinitions.UIStepDef.sprint3;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.junit.Assert;
//import org.openqa.selenium.WebElement;
//import utilities.ReusableMethods;
//
//import static stepDefinitions.Hooks.driver;
//
//public class US_116_SettingsSchedular_SD {
//
//    Settings settngs = new Settings(driver);
//
//    @Given("the user selects on Settings button")
//    public void theUserSelectsOnSettingsButton() {
//       ReusableMethods.clickWithJS(settngs.settingsMenu);
//       // ReusableMethods.scrollToElement(settngs.settingsMenu);
//
//    }
//
//    @Then("the user verifies if Scheduler Client Settings is functional")
//    public void theUserVerifiesIfSchedulerClientSettingsIsFunctional() {
//        ReusableMethods.clickWithJS(settngs.shecdulerClntSett);
//        Assert.assertTrue("Scheduler Client Settingsis not enabled", settngs.shecdulerClntSett.isEnabled());
//
//    }
//
//    //@And("the user clicks on Scheduler Client Settings")
//    //    public void theUserClicksOnSchedulerClientSettings() {
//    //        settngs.shecdulerClntSett.click();
//    //    }
//
//    @Then("the user verifies if Select Client Input is functional")
//    public void theUserVerifiesIfSelectClientInputIsFunctional() {
//        Assert.assertTrue(settngs.sClientInput.isEnabled());
//
//
//    }
//
//    @And("the user clicks on select client input")
//    public void theUserClicksOnSelectClientInput() {
//       ReusableMethods.clickWithJS(settngs.sClientInput);
//    }
//
//    @Then("the user verifies any input is selectable")
//    public void theUserVerifiesAnyInputIsSelectable() {
//        for (WebElement w: settngs.clientList) {
//           if (!w.isDisplayed()){
//               ReusableMethods.scrollToElement(w);
//
//           }
//            Assert.assertTrue(w.isEnabled());
//           ReusableMethods.clickWithJS(w);
//
//        }
//
//        }
//
//
//
//// Assert.assertTrue(inputs.size() != 0);
////        for (WebElement client : inputs) {
////            Assert.assertTrue(inputs != null);
//
//
//
//
//    @Then("the user verifies selected inputs are visible on the menu")
//    public void theUserVerifiesSelectedInputsAreVisibleOnTheMenu() {
//        for (WebElement lst:settngs.selectedList) {
//            Assert.assertTrue(lst.isDisplayed());
//        }
//          //ReusableMethods.clickWithJS(settngs.clearBttn);
//
//    }
//
//    @And("the user clicks on save changes")
//    public void theUserClicksOnSaveChanges() throws InterruptedException {
//        //settngs.phonInput.click();
//        ReusableMethods.waitForClickablility(settngs.saveChanges,10);
//        settngs.saveChanges.click();
//    }
//}
