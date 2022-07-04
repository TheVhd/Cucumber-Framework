package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Documents {
    public Documents(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "button.justify-content-center")
    public WebElement btnLogout;

    @FindBy(xpath = "//span[@aria-label='arrow-left']")
    public WebElement btnCancelArrow;

    @FindBy(xpath = "//button/span[text()='Select File']")
    public WebElement btnSelectFileUpSec;

    @FindBy(xpath = "//input[@type='file']")//upload section
    public WebElement fileUploadInput;

    @FindBy(css = "div.ant-upload-text-icon")
    public WebElement iconAttactFile;

    @FindBy(xpath = "//input[@class='ant-input']")
    public WebElement fileNameInputUpSec;

    @FindBy(xpath = "//div[contains(@class,'active')]/div/div[3]/div")
    public WebElement activeNavigateTitleBar;

    @FindBy(css = "div.ant-select-selector")
    public WebElement cbbSelectAnnotation;

    @FindBy(css = "span.ant-select-selection-item") //Add Annotations
    public WebElement cbbSelectedItemAnnotation;

}
