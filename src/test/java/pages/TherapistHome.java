package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TherapistHome {
    public TherapistHome(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Scheduling']")
    public WebElement scheduleButton;

    @FindBy(xpath = "//a[normalize-space()='Calendar']")
    public WebElement calendarsButton;

    @FindBy(xpath = "//a[text()='Clients']")
    public WebElement clientsButton;

    @FindBy(xpath = "//span[text()='Scheduling']")
    public WebElement schedulingButton;

    @FindBy(xpath = "//a[text()='Calendar']")
    public WebElement calendarButton;
}
