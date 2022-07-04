package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clients_056 {


    public Clients_056(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    //    ###########US_056 ###############
    @FindBy(xpath = "//a[contains(@href,'/dashboard/clients')]")
    public WebElement clientsIcon;

    @FindBy(xpath = "(//span[contains(text(), 'View Detail')])[1]")
    public WebElement viewDetailButton;

    @FindBy(name = "docBtn")
    public WebElement documents;

    //    ###########US_072################

    @FindBy(xpath = "//p[text()='Sessions']")
    public WebElement sessions;

    @FindBy(xpath = "//*[contains(text(), 'Add new session')]")
    public WebElement addNewSessionButton;

    @FindBy(name = "keyPoints")
    public WebElement keyPoints;

    @FindBy(name = "afterThoughts")
    public WebElement afterThoughts;

    @FindBy(xpath = "//*[@class='single-textarea col-12 rounded' and @name='suggestions']")
    public WebElement suggestions;

    @FindBy(css = ".toast-message")
    public WebElement toastMessage;

    //##############  US_077 INVOICE ################

    @FindBy(xpath = "//p[text()='Invoice']")
    public WebElement invoice;

    @FindBy(xpath = "(//input[@class='input '])[9]")
    public WebElement invoiceBox;

    @FindBy(xpath = "//input[@name='InvoiceDatePicker']")
    public WebElement invoiceDateBox;

    @FindBy(xpath = "//table/tbody/tr[3]/td[3]/div")
    public WebElement june28Selected;

    @FindBy(xpath = "//input[@name='DueDateDatePicker']")
    public WebElement dueDateBox;


    @FindBy(xpath = "(//table/tbody/tr[3]/td[3]/div)[2]")
    public WebElement july12Selected;





}
