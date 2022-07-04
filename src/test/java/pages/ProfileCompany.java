package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileCompany {



    public ProfileCompany(WebDriver driver){
        PageFactory.initElements(driver,this);
    }



    //NAGIHAN_112_US//
    @FindBy(xpath = "//a[@href='/dashboard/profile']")
    public WebElement profileLink;

    @FindBy(xpath = "//div[text()='Your Company']")
    public WebElement yourCompanyTitle;

    @FindBy(xpath = "//a[@href='/dashboard/profile']")
    public WebElement mycompany2Name;

    @FindBy(xpath = "//strong[text()='John']")
    public WebElement john;

    @FindBy(xpath = "//img[@alt='user_logo']")
    public WebElement logoImage;

    @FindBy(xpath = "//span[text()='ABC STREET2']")
    public  WebElement address;

    @FindBy(xpath = "//span[text()='Abc city Abc state 10000 zipCode']")
    public WebElement cityStateZipcode;

    @FindBy(xpath = "//span[text()='United States']")
    public WebElement country;

    @FindBy(xpath = "//a[text()='1234567890']")
    public WebElement CompanysURL;

    @FindBy(xpath = "//span[text()='-']")
    public WebElement companysPhoneNumber;

    @FindBy(xpath = "(//span[@aria-label='edit']//*[name()='svg'])[2]")
    public  WebElement edit;


    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//div[text()='Edit your company information']")
    public WebElement editYourCompanyInformation;

    @FindBy(xpath = "//input[@placeholder='Your Company']")
    public WebElement yourCompanyNameInput;

    @FindBy(xpath = "//input[@placeholder=\"Company's Address\"]")
    public WebElement companysAddressInput;

    @FindBy(xpath = "//input[@placeholder='City, State, Zip']")
    public WebElement cityStateZipcodeInput;

    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div/div[2]/div/div[5]/input")
    public WebElement countryInput;


    @FindBy(xpath = "//input[@value='United Kingdom']")
    public WebElement UnitedKingdom;

    @FindBy(xpath = "//input[@placeholder=\"Company's URL\"]")
    public WebElement companyURLinput;

    @FindBy(xpath = "//input[@placeholder=\"Company's Phone Number\"]")
    public WebElement companysPhoneNumberInput;

    @FindBy(xpath = "//button[text()='Change Image']")
    public WebElement currentImageChange;

    @FindBy(xpath = "//*[@type='file']")
    public WebElement fileUpload;


    @FindBy(xpath = " //span[text()='Update']/..")
    public WebElement update;

    // Vahit US_111 Locators
    @FindBy(xpath = "//*[@id=\"rc-tabs-2-tab-4\"]")
    public WebElement comLink;
    @FindBy(css = "div.ant-card-head-wrapper")
    public WebElement companyCard;
    @FindBy(xpath = "//strong[.='My company']")
    public WebElement comTitle;
    /*
    @FindBy
    public WebElement addComButton; //to be defined
    @FindBy
    public WebElement logo;
    @FindBy
    public WebElement comName;
    @FindBy
    public WebElement comAddress;
    @FindBy
    public WebElement comCity;
    @FindBy
    public WebElement comState;
    @FindBy
    public WebElement comZip;
    @FindBy
    public WebElement comCountry;
    @FindBy
    public WebElement comURL;
    @FindBy
    public WebElement comPhone;
    @FindBy
    public WebElement comLogoUpload;
    @FindBy
    public WebElement comValidName;
    @FindBy
    public WebElement comValidAddress;

     */


}
