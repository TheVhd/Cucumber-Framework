package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Settings {

    public Settings(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = " //a[@href='/dashboard/settings']")
    public WebElement settingsMenu;
    //a[contains(text(),'Settings')]

    @FindBy(xpath = "//div[text()='Scheduler Client Settings']")
     public WebElement shecdulerClntSett;

    @FindBy(xpath = "//div[@id='rc-tabs-1-panel-7']")
    public WebElement schedulerClientSettingsBody;

    @FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
    public WebElement sClientInput;

    @FindBy(xpath = "//div[contains(@class,'ant-select-item ant-select-item-option')]")
    public List<WebElement> clientList;

    @FindBy(xpath = "//*[text()='Save Changes']/..")
    public WebElement saveChanges;

    //@FindBy(xpath = "//*[@class='toast-message']")
    //    public WebElement toastMessage;
    @FindBy(css = "#basic_phone")
    public WebElement phonInput;

    @FindBy(xpath = "//span[@class='ant-select-selection-item-content']")
    public List<WebElement> selectedList;

    @FindBy(xpath = "//span[@class='ant-select-clear']")
    public WebElement clearBttn;

    // Vahit US_115
    @FindBy(xpath = "(//div[.='Scheduler Page Settings'])[1]")
    public WebElement settingsButton;
    @FindBy(xpath = "(//div[@class='ant-card ant-card-bordered ant-card-hoverable'])[1]")
    public WebElement CategoriesButton;
    @FindBy(xpath = "//div[5]/div/div[2]/div/div[2]")
    public WebElement colorPalette;
    @FindBy(xpath = "//button[.='Cancel']")
    public WebElement cancelButton;
    @FindBy(xpath = "//*[@id=\"showBackgroundImage\"]")
    public WebElement bgImageButton;
	@FindBy(xpath="//*[@id=\"rc-tabs-2-panel-6\"]/div/div[1]/div")
	public WebElement bgImage;



}
