package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Sessions {
    public Sessions(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(@class,'record-btn')]")
    public WebElement recordButton;

    @FindBy(xpath = "//span[@class='record-status']")
    public WebElement recordStatus;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement recordMessage;

    @FindBy(xpath = "//div[contains(@id,'voice')]/i/parent::*")
    public List<WebElement> voiceFile;

    @FindBy(xpath = "//div[@id='voiceModal']//button[text()='Copy']")
    public WebElement voiceModalCopyButton;

    @FindBy(id = "voiceModalDeleteButton")
    public WebElement voiceDeleteButton;

    @FindBy(id = "voiceModalExtractTextButton")
    public WebElement voiceModalExtractButton;

    @FindBy(id = "voiceModalSendToClientButton")
    public WebElement voiceModalSendButton;

    @FindBy(xpath = "//button/span[text()='Yes']")
    public WebElement modalYesButton;

    @FindBy(xpath = "//div[@id='voiceModal']//button[@class='close']")
    public WebElement modalCloseButton;
}
