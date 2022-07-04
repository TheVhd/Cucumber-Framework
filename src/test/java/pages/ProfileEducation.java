package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileEducation {
    public ProfileEducation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@href, '/dashboard/profile')]")
    public WebElement profile;

    @FindBy(xpath = "//div[@class='ant-card ant-card-bordered ant-card-hoverable']")
    public WebElement createdEducation;

    @FindBy(css = "#schoolName")
    public WebElement schoolName;

    @FindBy(css = "#department")
    public WebElement department;

    @FindBy(css = "#startedAt")
    public WebElement startedAt;

    @FindBy(css = "#enddedAt")
    public WebElement enddedAt;

    @FindBy(css = "#description")
    public WebElement description;

    @FindBy(xpath = "//span[@class='anticon anticon-delete']")
    public WebElement trashButton;

    @FindBy(css = ".ant-btn.ant-btn-primary.ant-btn-sm")
    public WebElement trashOK;

}
