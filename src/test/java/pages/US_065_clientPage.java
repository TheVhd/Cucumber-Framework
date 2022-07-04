package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_065_clientPage {


    public US_065_clientPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Clients']")
    public WebElement client_p;

    @FindBy(xpath = "//h5[.='Can Bartu']")
    public WebElement client_name;

    @FindBy(xpath="(//span[@class='ant-typography ant-typography-secondary'])[1]")
    public WebElement client_phone;

    @FindBy(xpath = "(//span[@class='ant-typography ant-typography-secondary'])[3]")
    public WebElement timeZone;

    @FindBy(xpath = "(//a[@href='/dashboard/client/5'])[2]") // (//a[@href='/dashboard/client/5'])[2]
    public WebElement client_chart;

    @FindBy(xpath = "//p[.='Presenting Issue']")
    public WebElement presenting_issue;

    @FindBy(xpath = "//div[@class='col-12 text-white p-0 mt-3 mb-2 d-flex']")
    public WebElement additional_notes;

    @FindBy(xpath = "//div[.='Attachments:']")
    public WebElement attachments;

    @FindBy(xpath="//div[.='Voice Notes:']")
    public WebElement voice_note;

    @FindBy(name="additionalNotes")
    public WebElement addNote;

    @FindBy(xpath="//*[@class='fas fa-plus-circle']")
    public WebElement addFile;

    @FindBy(xpath ="//input[@type='file']")
    public WebElement file_input;

    @FindBy(xpath="//span[@class='record-status']")
    public WebElement addVoice;

    @FindBy(xpath="//button[@class='btn btn-primary']")
    public WebElement cookie;

    @FindBy(xpath = "//a[.='To be deleted']")
    public WebElement select_issue;

    @FindBy(xpath ="//span[.='Delete Issue']")
    public WebElement deleteIssue;

    @FindBy(xpath ="//button[.='Yes']")
    public WebElement yesDeleteButton;

    @FindBy(xpath ="//button[.='No']" )
    public WebElement noDeleteButton;

    @FindBy(xpath ="//*[.='Issue is successfully deleted.']")
    public WebElement issueDeleted;



}




