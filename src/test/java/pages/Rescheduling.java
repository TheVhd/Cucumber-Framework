package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Rescheduling {
public Rescheduling(WebDriver driver){
    PageFactory.initElements(driver,this);
}
    @FindBy(xpath = "//div[text()='Book an appointment']")
    public WebElement pageTitle;

    @FindBy(xpath = "//span[text()='Hypnotes Scheduler']")
    public WebElement hypnotesSchedulerHeader;

    @FindBy(xpath = "//div[text()='Appointment']")
    public WebElement appointmentHeader;

    @FindBy(xpath = "//div[text()='Docs']")
    public WebElement docsHeader;

    @FindBy(xpath = "//div[text()='Docs']/parent::div/parent::div/parent::div")
    public WebElement docsActive;

    @FindBy(xpath = "//div[text()='Confirmation']")
    public WebElement confirmationHeader;

    @FindBy(xpath = "//div[text()='Details']")
    public WebElement detailsHeader;

    @FindBy(xpath = "//h3[text()='Service']/following-sibling::select")
    public WebElement serviceSelect;

    @FindBy(xpath = "//h3[text()='Locations']/following-sibling::select")
    public WebElement locationsSelect;

    @FindBy(id = "defaultCheck1")
    public WebElement collectPayment;

    @FindBy(xpath = "//div[contains(@class,'calendar-year-select')]//input/parent::span/parent::div")
    public WebElement yearSelect;

    @FindBy(xpath = "//div[contains(@class,'calendar-month-select')]//input/parent::span/parent::div")
    public WebElement monthSelect;

    @FindBy(xpath = "//div[@id='rc_select_0_list']//following-sibling::div[@class='rc-virtual-list']/div/div/div/div[@class='ant-select-item ant-select-item-option']")
    public List<WebElement> yearSelectOptions;

    @FindBy(xpath = "//div[@id='rc_select_1_list']//following-sibling::div[@class='rc-virtual-list']/div/div/div/div[@class='ant-select-item ant-select-item-option']")
    public List<WebElement> monthSelectOptions;

    @FindBy(xpath = "//span[text()='Start: ']/parent::div/following-sibling::div/span/input/parent::span/parent::div")
    public WebElement timeSelect;

    @FindBy(xpath = "//div[@class='rc-time-picker-panel-inner']")
    public WebElement timeOptions;

    @FindBy(xpath = "//ul[@class='ant-list-items']")
    public WebElement timePeriods;

    @FindBy(css = "div[class='ant-popover-message-title']")
    public WebElement modalBody;

    @FindBy(xpath = "//button/span[text()='No']")
    public WebElement noButton;

    @FindBy(xpath = "//button/span[text()='Yes']/parent::button")
    public WebElement yesButton;
}
