package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TherapistProfil {

    public TherapistProfil(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//a[@href='/dashboard/profile']")
    public WebElement dashboardProfileButton  ;

    @FindBy (xpath = " //h3[text()='Your Profile']")
    public WebElement yourProfile  ;

    @FindBy (xpath = " //h4[text()='About']")
    public WebElement about;

    @FindBy (xpath = "(//span[@class='ant-typography'])[1]")
    public WebElement profil_name;

    @FindBy (xpath = "(//span[@class='ant-typography'])[3]")
    public WebElement profil_mail;

    @FindBy (xpath = "(//div[@role='tab'])[1]")
    public WebElement Educations;

    @FindBy (xpath = "(//div[@role='tab'])[2]")
    public WebElement Experiences;

    @FindBy (xpath = "(//div[@role='tab'])[3]")
    public WebElement specialties_Certifications;

    @FindBy (xpath = "(//div[@role='tab'])[4]")
    public WebElement your_Company;

    @FindBy (xpath = "//span[text()='Add New Education']")
    public WebElement addNewEducation;

    @FindBy (xpath = "(//span[@class='ant-divider-inner-text'])[1]")
    public WebElement educations_1;

    @FindBy (xpath = "//div[@class='ant-card-meta-detail']")
    public WebElement addedEducations;
}
