package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Appointment {

    public Appointment(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "((//tbody)[2]/tr/td[5])[1]")
    public WebElement selectedDate15;

    @FindBy(xpath ="//span[@title='Does not repeat']")
    public WebElement repeatOptionsBox;

    @FindBy(xpath ="//form[@id='basic']")
    public WebElement BookingPage;

    @FindBy(xpath = "//span[.='Registered Services']")
    public WebElement RegService;

    @FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
    public WebElement Service_DDown;

    @FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
    public WebElement SelectService;
    @FindBy(css ="span[title='Weekly']")
    public WebElement repeatOptionsSearchBox;

    @FindBy(xpath = "//div[@label='Weekly']")
    public WebElement weekly;

    @FindBy(xpath = "//span[@class='ant-select-selection-item' and @title='Daily']")
    public WebElement daily;

    @FindBy(xpath = "//div[@class='ant-select-item-option-content' and text()='BiWeekly']")
    public WebElement biWeekly;

    @FindBy(xpath = "//div[@class='ant-select-item-option-content' and text()='Monthly']")
    public WebElement monthly;

    @FindBy(xpath = "//input[@role='spinbutton']")
    public WebElement repeatTimesButton;

    @FindBy(xpath = "//span[@aria-label='Increase Value']")
    public WebElement repeatOptionsUp;

    @FindBy(xpath = "//span[@class='anticon anticon-down ant-input-number-handler-down-inner']//*[name()='svg']")
    public WebElement repeatOptionsDownArrow;

    @FindBy(xpath = "(//div[contains(@class,'ant-space-horizontal')])[1]/div")
    public List<WebElement> controls;






    @FindBy(xpath = "(//div[.='Hamit Bey'])[1]")
    public WebElement OneService;

    @FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
    public WebElement LocationDDown;

    @FindBy(xpath = "//button/span[text()='Reschedule Appointment']")
    public WebElement rescheduleButton;


}
