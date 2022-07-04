package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileExperience {
    public ProfileExperience(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#company")
    public WebElement company;

    @FindBy(css = "#jobTitle")
    public WebElement jobTitle;

    @FindBy(css = "#startedAt")
    public WebElement startedAt;

    @FindBy(css = "#enddedAt")
    public WebElement endedAt;

    @FindBy(css = "#description")
    public WebElement description;

    @FindBy(xpath = "//div[@class='ant-card ant-card-bordered ant-card-hoverable']")
    public WebElement createdExperience;

    @FindBy(xpath = "(//span[@class='anticon anticon-delete' and @aria-label='delete'])[2]")
    public WebElement trashButton;

    @FindBy(css = ".ant-btn.ant-btn-primary.ant-btn-sm")
    public WebElement trashOK;


}
