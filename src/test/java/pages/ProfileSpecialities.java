package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfileSpecialities {
    public ProfileSpecialities(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#form_in_modal_speciality")
    public WebElement specialtyDropdown;

    @FindBy(css = ".rc-virtual-list-holder-inner>div")
    public List<WebElement> specialtyList;

    @FindBy(xpath = "//span[@class='anticon anticon-close ant-modal-close-icon']")
    public WebElement closeButton;

    @FindBy(css = ".ant-list-item")
    public WebElement createdSpe;

    @FindBy(xpath = "(//span[@class='anticon anticon-delete'])[1]")
    public WebElement trashButton;

    @FindBy(css = ".ant-btn.ant-btn-primary.ant-btn-sm")
    public WebElement trashOK;

    @FindBy(css = "#title")
    public WebElement title;

    @FindBy(css = "#organization")
    public WebElement organization;

    @FindBy(css = "#date")
    public WebElement date;

    @FindBy(css = "#publicUrl")
    public WebElement publicUrl;

    @FindBy(xpath = "//div[@class='ant-card ant-card-bordered ant-card-hoverable']")
    public WebElement createdCer;

    @FindBy(xpath = "(//span[@class='anticon anticon-delete'])[2]")
    public WebElement trashButtonSp;

}
