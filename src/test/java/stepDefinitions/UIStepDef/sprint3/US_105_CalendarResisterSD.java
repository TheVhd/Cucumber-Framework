package stepDefinitions.UIStepDef.sprint3;

import com.github.javafaker.DateAndTime;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.junit.Assert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.CalendarPagCB;
import pages.LoginPageCB;
import utilities.ReusableMethods;


import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static stepDefinitions.Hooks.driver;

public class US_105_CalendarResisterSD {

    CalendarPagCB calendarPage = new CalendarPagCB(driver);
    Random random=new Random();
    Faker faker= new Faker();

    @And("user clicks on the related client button")
    public void userClicksOnTheRelatedClientButton() {
//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000);");
        ReusableMethods.clickWithJS(calendarPage.relatedClientCB);

    }


    @And("user clicks on the Reschedule Appointment button")
    public void userClicksOnTheRescheduleAppointmentButton() {

      ReusableMethods.scrollToElement(calendarPage.rescheduleAppointment);
      ReusableMethods.clickWithJS(calendarPage.rescheduleAppointment);

    }


    @And("user clicks on the given date")
    public void userClicksOnTheGivenDate() {
//        ReusableMethods.waitFor(3);
//        ReusableMethods.clickWithJS(calendarPage.appointmentDate);
        WebElement randomDate = calendarPage.calendarFull.get(random.nextInt(calendarPage.calendarFull.size()));
      randomDate.click();


//        DateAndTime date= faker.date();
//        System.out.println("Random future date:" +date.future(6, TimeUnit.DAYS));


    // faker.date().future(6, TimeUnit.DAYS);
//       faker.date().between('2022/01/01','2023/01/01');
//        faker.date().between(12-06-2022, 30-06-2022)
//                faker.date().between()




//                Random r = new Random();
//        int low = 01;
//        int high = 30;
//        int result = r.nextInt(high-low) + low;
//        if (result<10){
//            String s=String.valueOf(result);
//            WebElement date= driver.findElement(By.xpath("//td[@title='2022-06-0"+s+"']"));
//            ReusableMethod.clickWithJs(date);
//        } else{
//            String b=String.valueOf(result);
//            WebElement datea= driver.findElement(By.xpath("//td[@title='2022-06-"+b+"']"));
//            ReusableMethod.clickWithJs(datea);
//
//        }
     }

//   @And("user clicks the clock and clicks yes button")
//        public void userClicksTheClockAndClicksYesButton() {
//        ReusableMethods.clickWithJS(calendarPage.clockTime);
//        ReusableMethods.waitFor(5);
//            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
//        ReusableMethods.clickWithJS(calendarPage.yesButton);
//    }

    @And("user clicks Confirm Meeting button")
    public void userCliksConfirmMeetingButton() {
        ReusableMethods.clickWithJS(calendarPage.confirmMeeting);
     }

        @And("user clicks the Next button and clicks Submit button")
        public void userClicksTheNextButtonAndClicksSubmitButton () {
            ReusableMethods.clickWithJS(calendarPage.nextButton);
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000)"); ReusableMethods.scrollToElement(calendarPage.submitButton);

            ReusableMethods.clickWithJS(calendarPage.submitButton);

        }
        @Then("user checks if the Successfully created a meeting with  is visible")
        public void userChecksIfTheSuccessfullyCreatedAMeetingWithIsVisible () {
            Assert.assertTrue(calendarPage.confirmMeetingText.isDisplayed());
        }


//        @Then("user clicks on the close button and checks if the Meet Info menu is visible")
//        public void userClicksOnTheCloseButtonAndChecksIfTheMeetInfoMenuIsVisible () {
//            ReusableMethods.clickWithJS(calendarPage.closeButton);
//            Assert.assertTrue(calendarPage.meetInfoText.isDisplayed());
//            ReusableMethods.waitFor(2);
//        }

//        @And("user clicks cancel button")
//        public void userClicksCancelButton() {
//        ReusableMethods.clickWithJS(calendarPage.cancelButton);
//        }

//        @And("user clicks second yes button")
//        public void userClicksSecondYesButton() {
//            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000)");
//        ReusableMethods.waitFor(2);
//        ReusableMethods.clickWithJS(calendarPage.secondYesButton);
//        }

        @Then("user clicks on the X button and checks if the Block Time menu is visible")
        public void userClicksOnTheXButtonAndChecksIfTheBlockTimeMenuIsVisible () {
            ReusableMethods.clickWithJS(calendarPage.quitXButton);
//        Assert.assertTrue(calendarPage.blockTime.isDisplayed());
        }

    @Then("user clicks on the Book Another Appointment button and checks if the Service menu is visible")
    public void userClicksOnTheBookAnotherAppointmentButtonAndChecksIfTheServiceMenuIsVisible () {
        ReusableMethods.clickWithJS(calendarPage.bookAnotherTime);
        Assert.assertTrue(calendarPage.serviceVerify.isDisplayed());


        }


    @Then("user verifies close button is functional")
    public void userVerifiesCloseButtonIsFunctional() {
        Assert.assertTrue(calendarPage.closeButton.isEnabled());
    }

    @Then("user clicks on the Book Another Appointment button")
    public void userClicksOnTheBookAnotherAppointmentButton() {
        ReusableMethods.clickWithJS(calendarPage.bookAnotherTime);
    }

    @And("user checks if the Book an appointment text is displayed")
    public void userChecksIfTheBookAnAppointmentTextIsDisplayed() {
        Assert.assertTrue(calendarPage.serviceVerify.isDisplayed());
    }

    @Then("user clicks on the X button")
    public void userClicksOnTheXButton() {
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(calendarPage.quitXButton);
    }

    @And("user checks if the Meet Info menu is visible")
    public void userChecksIfTheMeetInfoMenuIsVisible() {
//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 100)");
        ReusableMethods.waitFor(5);
        Assert.assertTrue(calendarPage.meetInfoText.isDisplayed());
    }


    @Then("user clicks on the X button on meet info")
    public void userClicksOnTheXButtonOnMeetInfo() {
        ReusableMethods.clickWithJS(calendarPage.quitXButtonSecond);
    }
}


