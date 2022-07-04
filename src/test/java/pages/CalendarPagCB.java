package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPagCB {

    public CalendarPagCB(WebDriver driver){
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "(//div[@class='fc-event-title fc-sticky'][normalize-space()='Cihan Bulut'])")
   // @FindBy(xpath = "(//div[@class='fc-daygrid fc-dayGridMonth-view fc-view'])[1]")
    public WebElement relatedClientCB;

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-warn ant-btn-round']")
    public WebElement rescheduleAppointment;
    @FindBy(xpath ="//a[@href = '/dashboard/calendar']")
    public WebElement linkCalendar;

    @FindBy(xpath = "//td[@title='2022-06-19']")
    public WebElement appointmentDate;
    //------US-091---//
    @FindBy(xpath = "//td[@aria-labelledby='fc-dom-38']")
    public WebElement date16;

    @FindBy(xpath = "(//td[contains(@class,'fc-day-future')])[14]")
    public WebElement anyDate;

    @FindBy(xpath = "//label[@for='basic_serviceType'")
    public WebElement slctServcType;

    @FindBy(xpath = "//span[contains(text(),'Custom Service')]")
    public WebElement customServc;

    @FindBy(xpath = "//input[@id='basic_title']")
    public WebElement serviceName;

    @FindBy(xpath = "//input[@id='basic_price']")
    public WebElement priceB;

    @FindBy(xpath = "//input[@id='basic_duration']")
    public WebElement durationB;

    @FindBy(xpath = "//input[@id='basic_date']")
    public WebElement dateB;

    @FindBy(xpath = "//input[@id='basic_timeStart']")
    public WebElement timeStart;

    @FindBy(xpath = "//input[@id='basic_timeEnd']")
    public WebElement timeEnd ;

    @FindBy(xpath = "//input[@value='registeredClients']")
    public WebElement registeredClientsTxt;

    @FindBy(xpath = "//input[@id='rc_select_3']/../..")
    public WebElement clientsDropdown;

    @FindBy(xpath = "(//div[@class='rc-virtual-list-holder-inner'])[2]/div")
    public List<WebElement> registeredClients;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkbox ;

    @FindBy(xpath = " //span[contains(text(),'Submit')]")
    public WebElement submitBttn;

    @FindBy(xpath = "//*[@onClick='acceptCookie()']")
    public WebElement acceptCookieButton;

    @FindBy(css = ".hide-button")
    public WebElement belowSpeedToolbar;

    @FindBy(css = "div.ant-drawer-body")
    public WebElement body;

    @FindBy(xpath = "//a[@title='clear']")
    public WebElement clearTime;

    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement toastMessage;



    @FindBy(xpath = "//span[text()='Confirm Meeting']")
    public WebElement confirmMeeting;

    @FindBy(xpath = "//span[normalize-space()='Next']")
    public WebElement nextButton;

    @FindBy(xpath = "//div[@class='ant-card-body']//div//div//button[@type='button']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[contains(text(),'Successfully created a meeting with')]")
    public WebElement confirmMeetingText;

    @FindBy(xpath = "  (//span[contains(text(),'Close')])[1]")
    public WebElement closeButton;

    @FindBy(xpath = "(//div[@class='ant-drawer-header'])[1]")
    public WebElement meetInfoText;

    @FindBy(xpath = "(//button[@class='ant-drawer-close'])[2]")
    public WebElement quitXButton;

    @FindBy(xpath = "(//button[@class='ant-drawer-close'])[1]")
    public WebElement quitXButtonSecond;

//    @FindBy(xpath = "//span[contains(text(),'Block Time')]")
//    public WebElement blockTime;

    @FindBy(xpath = "//span[contains(text(),'Book another appoinment')]")
    public WebElement bookAnotherTime;

    @FindBy(xpath = "//div[@class='ant-drawer-title']")
    public WebElement serviceVerify;

    @FindBy(xpath = "//td[contains(@class,'ant-picker-cell')]")
    public List<WebElement> calendarFull;



    // esma yilmaz ------
    @FindBy(xpath = "//*[text()='Block Time']/..")
    public WebElement blockTimeBtn;

    @FindBy(xpath = "//td[contains(@class,'fc-day-today')]")
    public WebElement todayDateCell;

    @FindBy(xpath = "//*[text()='Submit']/..")
    public WebElement submmitBtn;

    @FindBy(css = "div.ant-drawer-wrapper-body")
    public WebElement appointmentPopup;

    @FindBy(xpath = "//input[@value='registered']")
    public WebElement radioRegisService;

    @FindBy(xpath = "//input[@id='rc_select_0']/../../..")
    public WebElement serviceDropdown;

    @FindBy(xpath = "//input[@id='rc_select_1']/../../..")
    public WebElement locationDropdown;

    @FindBy(xpath = "//div[@class='rc-virtual-list-holder-inner']/div/div")
    public List<WebElement> comboboxElements;
    //rc-virtual-list-holder-inner

    // US_98 locators
    @FindBy(css = "div.fc-daygrid-event-harness")
    public WebElement anyAppoinCell;

    public By anyAppoinCellNameInfo = By.cssSelector("div.fc-sticky");
    //div[@class='fc-daygrid-event-harness']/../../..
    public By anyAppoinCellMain =  By.xpath("../../..");

    @FindBy(xpath = "(//div[@class='ant-col ant-col-12'])[3]/button[1]")
    public WebElement googleBtn;

    @FindBy(xpath = "(//div[@class='ant-col ant-col-12'])[3]/button[2]")
    public WebElement outlookBtn;

    @FindBy(xpath = "//div[@class='ant-drawer-title']/../..")
    public WebElement meetInfoForm;

    @FindBy(css = "div.ant-radio-group label input")
    public List<WebElement> radioBtnsInMeetInfo;

    @FindBy(xpath = "//div[@class='ant-drawer-body']/div[5]/div[3]/div")
    public WebElement dateMeetInfo;

    @FindBy(xpath = "(//*[@class='ant-row'])[5]/div/div/button")
    public List<WebElement> goToMeetingBtns;



}
