package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;
import pages.Clients_056;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_77_StepDefs {
    Clients_056 invoice = new Clients_056(driver);
    Actions actions = new Actions(driver);

    @And("User clicks invoice")
    public void userClicksInvoice() {
        invoice.invoice.click();
    }

    @And("User clears the invoice box and sends the title")
    public void userClearsTheInvoiceBoxAndSendsTheTitle() {
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(invoice.invoiceBox);
       ReusableMethods.waitFor(2);
       invoice.invoiceBox.clear();
       invoice.invoiceBox.sendKeys("Montreal");

    }

    @And("User clicks the invoice date box, clears and sends a date")
    public void userClicksTheInvoiceDateBoxClearsAndSendsADate() {
      ReusableMethods.clickWithJS(invoice.invoiceDateBox);
        ReusableMethods.waitFor(2);
        invoice.invoiceDateBox.sendKeys(Keys.COMMAND,"a",Keys.DELETE);
        invoice.invoiceDateBox.sendKeys("06-25-2022"+Keys.TAB+Keys.TAB+Keys.TAB);
        ReusableMethods.waitFor(5);

    }
    @And("User clicks the due date box, clears and sends a date")
    public void userClicksTheDueDateBoxClearsAndSendsADate() {
        invoice.dueDateBox.sendKeys(Keys.COMMAND,"a",Keys.DELETE);
        ReusableMethods.waitFor(2);
       ReusableMethods.clickWithJS(invoice.july12Selected);
       ReusableMethods.waitFor(2);
    }


}
