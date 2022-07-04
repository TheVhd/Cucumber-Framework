package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchClient {
    public SearchClient(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span/input[@type='text']")
    public WebElement searchInput;

    @FindBy(xpath = "//button[text()='Sessions']")
    public WebElement sessionButton;

    @FindBy(xpath = "//p[text()='Sessions']")
    public WebElement sessionButtonTop;

    @FindBy(css = "div.note-add-image-btn")
    public WebElement attachmentIkonu;

    @FindBy(xpath = "(//img[@class='note-image-thumbnail'])[1]")
    public WebElement attachmentFile;

    @FindBy(xpath = "//span[text()='Click to see on a new tab']")
    public WebElement newTabB;

    @FindBy(xpath = "//button[text()='Extract text']")
    public WebElement extractTextButton;

    @FindBy(xpath = "(//button[text()='Copy'])[1]")
    public WebElement coppyButtn;

    @FindBy(css = "button[id*=imageModalSendImageButton]")
    public WebElement sendToClientBttn;

    @FindBy(css = "button[id*=imageModalDeleteButton]")
    public WebElement deleteImageButton;

    @FindBy(xpath = "(//span[text()='Yes']/..)[2]")
    public WebElement deleteYesButton;

    //@FindBy(xpath = "//div[text()='1 images added.']")
    @FindBy(css = "div.toast-message")
    public WebElement imagesAddedText;

    @FindBy(css = "button.ant-input-search-button")
    public WebElement searchButton;

    @FindBy(xpath = "//h5[text()='Reyhan Guler']")
    public WebElement clientName;

    @FindBy(xpath = "//a[text()='Add new session']")
    public WebElement addNewSessionButton;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement fileUploadInput;

    @FindBy(xpath = "(//img[@class='note-image-thumbnail'])[1]")
    public WebElement addedImage;

    @FindBy(xpath = "//textarea[contains(@id,'imageModalText')]")
    public WebElement textBoxOnPopup;

    @FindBy(xpath = "//img[contains(@id,'imageModalImg')]")
    public WebElement ImgOnPopUp;

    @FindBy(xpath = "//a[contains(@href,'dashboard/client/')]/span[@aria-label='user']")
    public WebElement viewDetailButton;

}
