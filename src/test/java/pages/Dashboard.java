package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    public Dashboard(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    // KemalD  US_058
    @FindBy(xpath = "//a[@href='/dashboard/clients']")
    public WebElement dashboardClients;

    @FindBy(xpath = "(//span[text()='View Detail'])[1]")
    public WebElement viewDetail;

    @FindBy(xpath = "//button[@name='sessionsBtn']")
    public WebElement sessionsBtn;

    @FindBy(xpath = "//span[text()='Details']")
    public WebElement details;

    @FindBy(xpath = "//label[text()='Date:']")
    public WebElement details_Date;

    @FindBy(xpath = "//button[@name='docBtn']")
    public WebElement documents;

 @FindBy(xpath = "(//div[@role='tab'])[1]")
    public WebElement uploadedDocuments;

 @FindBy(xpath = "(//div[@role='tab'])[2]")
    public WebElement signedDocuments;

@FindBy(xpath = "(//div[@role='tab'])[3]")
    public WebElement invoices;





}
