package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Calendar {
    public Calendar(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //NAGIHAN US_094//
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginLink;
    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement acceptCookies;
    @FindBy(xpath = "(//input[@name='email'])")
    public WebElement loginEmail;
    @FindBy(xpath = "(//input[@name='password'])")
    public WebElement loginPassword;
    @FindBy(xpath ="//button[@title='month view']" )
    public WebElement monthView;
    @FindBy(xpath= "//a[@id='fc-dom-10']")
    public WebElement june2;
    @FindBy(xpath = "//div[text()='Book an appointment']")
    public WebElement bookAnAppointment;
    @FindBy(xpath = " //label[text()='Select Service Type']")
    public WebElement selectServiceType;
    @FindBy(xpath = "//span[text()='Custom Service']")
    public WebElement customService;
    @FindBy(xpath="//input[@id='basic_title']")
    public WebElement serviceName;
    @FindBy(id="basic_price")
    public WebElement price;
    @FindBy(xpath  ="//span[@aria-label='up']")
    public WebElement priceUp;
    @FindBy(xpath  ="(//span[@aria-label='down'])[3]")
    public WebElement priceDown;
    @FindBy(id="basic_duration")
    public WebElement duration;
    @FindBy(xpath  ="//div[@class='ant-select-item-option-content'][normalize-space()='90']")
    public WebElement durationSelect90Minute;
    @FindBy(xpath="//input[@id='basic_date']")
    public WebElement date;
    @FindBy(xpath="//div[@class='ant-picker-input']")
    public WebElement dateClearSign;
    @FindBy(xpath = "//td[@title='2022-06-02']//div[@class='ant-picker-cell-inner'][text()='2']")
    public WebElement june2Select;
    @FindBy(xpath="//input[@id='basic_timeStart']")
    public WebElement timeStart;
    @FindBy(xpath ="//i[@class='rc-time-picker-clear-icon']" )
    public WebElement clearIcon;
    @FindBy(xpath ="(//li[text()='04'])[1]" )
    public WebElement hour04Select;
    @FindBy(xpath = "(//li[text()='05'])[2]")
    public WebElement minute05Select;
    @FindBy(xpath = "//li[text()='PM']")
    public WebElement pmSelect;
    @FindBy(id="basic_timeEnd")
    public WebElement timeEnd;
    @FindBy(xpath = "(//input[@type='radio'])[4]")
    public WebElement newClientEnterManuallyRadioButton;
    @FindBy(xpath = "//span[text()='Registered Clients']")
    public WebElement registeredClients;
    @FindBy(xpath = "//h5[text()='Enter Client Manually']")
    public WebElement enterClientManually;
    @FindBy(id="basic_firstName")
    public WebElement firstName;
    @FindBy(id="basic_lastName")
    public WebElement lastName;
    @FindBy(id="basic_phone")
    public WebElement phone;
    @FindBy(id="basic_email")
    public WebElement email;
    @FindBy(xpath="//span[text()='Submit']")
    public WebElement submit;
    @FindBy(xpath="//div[text()='New Meeting Created']")
    public WebElement newMeetingCreated;
    @FindBy(xpath="//div[text()='NagihanTest A.']")
    public WebElement myNewMeetingName;
    @FindBy(xpath="//span[text()='Cancel Appointment']")
    public WebElement cancelAppointment;
    @FindBy(xpath="(//span[text()='Yes'])[2]")
    public WebElement yesButton;
    @FindBy(xpath="//div[text()='First name is required']")
    public WebElement firstNameRequiredText;
    @FindBy(xpath="//div[text()='Price is required']")
    public WebElement priceRequiredText;
    @FindBy(xpath="//div[text()='Title is required']")
    public WebElement titleRequiredText;
  //Nagihan US094 Finished//




    @FindBy(xpath = "//span[normalize-space()='Reschedule Appointment']")
    public WebElement Btn_Reschedule_Appointment;

    @FindBy(xpath = "//div[contains(text(),'Book an appointment')]")
    public WebElement Txt_Title_Book_an_appointment;

    @FindBy(xpath = "(//div[@class='ant-steps ant-steps-horizontal ant-steps-label-horizontal'])")
    public WebElement Txt_scheduler_pipeline;

    @FindBy(xpath = "//h3[normalize-space()='Service']")
    public WebElement Txt_Service;

    @FindBy(xpath = "//h3[normalize-space()='Locations']")
    public WebElement Txt_Locations;

    @FindBy(xpath = "//label[normalize-space()='Collect Payment']")
    public WebElement Txt_Collect_payment_select;

    @FindBy(css = "td[role='gridcell']")
    public List<WebElement> calendarList;

    @FindBy(xpath = "//input[@id='basic_date']")
    public WebElement dateDropdown;

    @FindBy(css = "table.ant-picker-content>tbody>tr>td")
    public List<WebElement> dateDropdownList;

    @FindBy(xpath = "//input[@id='basic_timeStart']")
    public WebElement timeStartDropdown;

    @FindBy(xpath = "//li[@role='button']")
    public List<WebElement> timeDropdownList;

    @FindBy(xpath = "(//div[contains(@class,'rc-time-picker-panel-select')])[1]//ul//li")
    public List<WebElement> timeHourList;

    @FindBy(xpath = "(//div[contains(@class,'rc-time-picker-panel-select')])[2]//ul//li")
    public List<WebElement> timeMinuteList;

    @FindBy(xpath = "(//div[contains(@class,'rc-time-picker-panel-select')])[3]//ul//li")
    public List<WebElement> timePeriodList;

    @FindBy(xpath = "//input[@id='basic_firstName']")
    public WebElement nameNewClient;

    @FindBy(xpath = "//input[@id='basic_lastName']")
    public WebElement lastNameNewClient;

    @FindBy(xpath = "//input[@id='basic_phone']")
    public WebElement phoneNewClient;

    @FindBy(xpath = "//input[@id='basic_email']")
    public WebElement emailNewClient;

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='fc-event-main']")
    public List<WebElement> events;
    @FindBy(xpath = "(//select[@class='select form-select'])[1]")
    public WebElement DrpDwn_Service;

    @FindBy(xpath = "(//select[@class='select form-select'])[2]")
    public WebElement DrpDwn_Locations;

    @FindBy(xpath = "(//input[@id='defaultCheck1'])")
    public WebElement CHKBX_collectPayment;

    @FindBy(xpath = "(//div[@class='ant-select ant-select-sm ant-picker-calendar-year-select ant-select-single ant-select-show-arrow'])")
    public WebElement DrpDwn_Year;

    @FindBy(xpath = "(//div[@class='ant-select ant-select-sm ant-picker-calendar-month-select ant-select-single ant-select-show-arrow'])")
    public WebElement DrpDwn_Month;

    @FindBy(xpath = "(//div[@class='ant-radio-group ant-radio-group-outline ant-radio-group-small ant-picker-calendar-mode-switch'])")
    public WebElement DrpDwn_MonthOrYear;

    @FindBy(xpath ="(//input[@class='rc-time-picker-input'])[1]")
    public WebElement DrpDwnStartTime;

    @FindBy(xpath ="(//input[@class='rc-time-picker-input'])[2]")
    public WebElement DrpDwnEndTime;



    //  BUNYAMIN PURKAYA -US102 -TC_001 AND TC_002 LOCATORS   //

    @FindBy(xpath = "//div[text()='For 102_US Necessary BP null- Requested to reschedule']")
    public WebElement specificMeting;
    @FindBy(xpath = "//span[text()='Reschedule Appointment']/..")
    public WebElement reScheduleAppointment;
    @FindBy(xpath = "//td[@title='2022-06-02']")
    public WebElement dateJune2;

    @FindBy(xpath = "//span[text()='12:00 - 01:00 PM']")
    public WebElement time;

    @FindBy(xpath = " //button[@type='button']//span[contains(text(),'Yes')]")
    public WebElement confirmYes;

    @FindBy(xpath = "//p[text()='No Documents']")
    public WebElement noDocuments;

    @FindBy(xpath = "//span[text()='Next']")
    public WebElement nextButton;

    @FindBy(xpath = "//div[contains(text(),'Confirmation')]")
    public WebElement confirmLine;

    @FindBy(xpath = "//span[text()='For 102_US Necessary BP undefined']")
    public WebElement nameOFnewMeeting;

    @FindBy(xpath = "//span[text()='60 min']")
    public WebElement nameofNewMunites;

    @FindBy(xpath = "(//span[@class='ant-typography'])[3]")
    public WebElement namesOfNewMeetingDateAndTme;
    @FindBy(xpath = "//span[text()='John Smith']")
    public WebElement nameOfTherapist;
    @FindBy(xpath = "//div[@class='ant-space-item']//span[contains(text(),'Do not notify client')]")
    public WebElement doNotNotifyClient;
    @FindBy(xpath = "//span[text()='Submit']")
    public WebElement submitButtonn;
    @FindBy(xpath = " //div[text()='Meeting Details']")
    public WebElement meetingDetailsText;
    @FindBy(xpath = "//a[text()='Meeting Link']")
    public WebElement meetingLink;
    @FindBy(xpath = "//div[text()='Successfully created a meeting with']")
    public WebElement successfullyCreatedAmeetingWithText;

    @FindBy(xpath = "//span[text()='Close']")
    public WebElement closeButton;
    @FindBy(xpath = "//div[contains(text(),'Meet Info')]")
    public WebElement meetInfoText;

    @FindBy(xpath= "//span[text()='Book another appoinment']/..")
    public WebElement bookAnotheAppointment;

    @FindBy(xpath = "//div[text()='For 102_US Necessary BP null- Pending to reschedule']")
    public WebElement updatedMeetingOnCalendar;

    @FindBy(xpath = "//span[text()='Schedule An Appointment']")
    public WebElement scheduleAnAppointmentr;
    @FindBy(xpath = "//span[text()='10:00 - 11:00 AM']")
    public WebElement time2;

    @FindBy(xpath = "//span[text()='Cancel']/..")
    public WebElement cancel2;

    @FindBy(xpath = "//div[text()='For 102_US Necessary BP null- Pending to reschedule']")
    public WebElement UpdatedMeeting2;


}
