package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Services {
    public Services(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//a[text()='Services']")
    public WebElement service;

    @FindBy(xpath = "//div[@class='ant-drawer-content-wrapper']")
    public WebElement wrapper;

    @FindBy(xpath = "//a[@class='ant-typography']")
    public WebElement schedulerURL;

    @FindBy(id = "title")
    public WebElement nameBox;

    @FindBy(id = "price")
    public WebElement priceBox;

    @FindBy(id = "duration")
    public WebElement durationBox;

    @FindBy(id = "blockBefore")
    public WebElement blockBeforeBox;

    @FindBy(id = "blockAfter")
    public WebElement blockAfterBox;

    @FindBy(id = "description")
    public WebElement descriptionBox;

    @FindBy(id = "showPrice")
    public WebElement showPriceButton;

    @FindBy(xpath = "//button[@id='paymentRequired']")
    public WebElement paymentRequiredButton;

    @FindBy(id = "bookable")
    public WebElement bookableButton;

    @FindBy(xpath = "(//input[@class='ant-checkbox-input'])[1]")
    public WebElement allDocumentsCheckbox;

    @FindBy(xpath = "//div[@class='ant-card ant-card-bordered']")
    public WebElement card;

    @FindBy(css = "anticon.anticon-delete")
    public WebElement deleteSession;

    @FindBy(xpath = "//span[@aria-label='delete']")
    public WebElement trashButton;

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
    public WebElement trashOK;


    //Nagihan US082 WebElements//
    //  TC001  ADDNEWPACKAGE AND  //  TC002  CANCEL-GENERATEURL  //
    @FindBy(xpath = "(//input[@name='email'])")
    public WebElement loginEmail;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement loginPassword;
    @FindBy(xpath = "//*[@id='root']/section/aside/div/ul/li[5]/span[2]/a")
    public WebElement servicesLink;
    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement acceptCookies;
    @FindBy(xpath = "//span[text()='Packages']")
    public WebElement packages;
    @FindBy(xpath = "//span[text()='Add New Package']")
    public WebElement addNewPackageButton;
    @FindBy(xpath = "//label[@title='Package Name']")
    public WebElement packageName;
    @FindBy ( xpath = "(//*[@id='title'])[2]")
    public WebElement packageNameInput;
    @FindBy ( xpath = "//div//span[text() = 'Packages']")
    public WebElement packagesSectionLink;
    @FindBy ( xpath = "(//label[@title='Price'])[2]")
    public WebElement priceName;
    @FindBy ( xpath = "(//*[@id='price'])[2]")
    public WebElement priceInput;
    @FindBy ( xpath = "(//label[@for='showPrice'])[2]")
    public WebElement showPriceButtonName;
    @FindBy ( xpath = "(//*[@id='showPrice'])[2]/div")
    public WebElement showPriceButtonn;
    @FindBy ( xpath = "(//*[@id='duration'])[2]")
    public WebElement durationInput;
    @FindBy ( xpath = "//div[@title='75']")
    public WebElement durationSelect75;
    @FindBy ( xpath = "(//input[@id='duration'])[2]/../../span[2]")
    public WebElement durationTextDefault;
    @FindBy ( xpath = "(//input[@id='duration'])[2]")
    public WebElement durationText;
    @FindBy ( xpath = "(//label[@title='Block Extra Time'])")
    public WebElement blockExtraTimeButtonName;
    @FindBy ( xpath = "//*[text() = 'Block Extra Time']/../../div[2]//button")
    public WebElement blockExtraTimeButton;
    @FindBy ( xpath = "(//*[@id='blockBefore'])[2]")
    public WebElement blockBeforeInput;
    @FindBy ( xpath = "(//span[@aria-label='down'])[5]")
    public WebElement blockBeforeRightmostDownButton;
    @FindBy ( xpath = "(//span[@aria-label='up'])[5]")
    public WebElement blockBeforeRightmostUpButton;
    @FindBy ( xpath = "(//*[@id='blockAfter'])[2]")
    public WebElement blockAfterInput;
    @FindBy ( xpath = "(//span[@aria-label='up']//*[name()='svg'])[6]")
    public WebElement blockAfterRightmostUpButton;
    @FindBy ( xpath = "(//span[@aria-label='down'])[6]")
    public WebElement blockAfterRightmostDownButton;
    @FindBy ( xpath = "(//label[@title='Payment Required'])[2]")
    public WebElement paymentRequiredName;
    @FindBy ( xpath = "(//button[@id='paymentRequired'])[2]")
    public WebElement paymentRequiredButtonn;
    @FindBy ( xpath = "(//*[@id='bookable'])[2]")
    public WebElement bookableButtonn;
    @FindBy ( xpath = "(//label[@title='Document Needs To Signed'])")
    public WebElement documentNeedsToSignedName;
    @FindBy ( xpath = "(//*[text() = 'All Documents']/../span/input)[2]")
    public WebElement allDocumentsCheckBox;
    @FindBy ( id = "totalSessions")
    public WebElement totalSessionsInput;
    @FindBy ( id = "sessionInterval")
    public WebElement sessionIntervalInput;
    @FindBy ( xpath = "(//*[@id='description'])[2]")
    public WebElement descriptionInput;
    @FindBy ( css = "span[aria-label='delete']" )
    public WebElement deleteButton;
    @FindBy ( xpath = "//span[text()='OK']" )
    public WebElement deleteOkButton;
    @FindBy ( xpath = "(//button/*[text() = 'Save'])[2]" )
    public WebElement saveButton;
    @FindBy ( xpath = "(//button/*[text() = 'Cancel'])[2]" )
    public WebElement cancelButton;
    @FindBy ( xpath = "//div[text()='Add Package']" )
    public WebElement addPackageTitle;
    @FindBy ( xpath = "//div[text()='Trail Package (For 1 Month $500)']" )
    public WebElement newPackageName;
    @FindBy ( xpath = "//button/*[contains(text(), 'Generate Scheduler URL')]")
    public WebElement generateUrlButton;
    //    TC003-WARNING CASES-Negatif Test //
    @FindBy ( xpath = "//div[text()='Please enter category name']")
    public WebElement packageNameInputWarning;
    @FindBy ( xpath = " //div[text()='Please enter price']")
    public WebElement priceInputWarning;
    @FindBy ( xpath = " //div[text()='Please select or enter a duration']")
    public WebElement durationWarning;
    @FindBy (xpath = " //div[text()='Please enter total session']")
    public WebElement totalSessionsInputWarning;
    @FindBy ( xpath= "//div[text()='Please enter session interval']")
    public WebElement intervalInputWarning;
    @FindBy ( xpath = "//div[text()='Please enter package description']")
    public WebElement descriptionInputWarning;

}
