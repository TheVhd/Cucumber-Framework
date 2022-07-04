package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TherapistLogin {

    public TherapistLogin(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//input[@name='email'])")
    public WebElement loginEmail;

    @FindBy(xpath = "(//input[@name='password'])")
    public WebElement loginPassword;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement login;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginEnterButton;

    @FindBy(xpath = "//button[text()='Sign Up']")
    public WebElement signUp;

    @FindBy(xpath = "//*[@class=\"custom-control-label\"]") //can only locate the checkbox using this xpath others don't work
    public WebElement therapistCheckbox;

    @FindBy(xpath = "//a[@href=\"/api/public/connect/google\"]")
    public WebElement googleLoginButton;

    @FindBy(xpath = "//input[@name='identifier']")
    public WebElement googleEmailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement googlePasswordBox;

    @FindBy(xpath = "//a[@id='social-media-login-logo-l']")
    public WebElement linkedinLoginButton;

    @FindBy(id = "username")
    public WebElement linkedinEmailBox;

    @FindBy(id = "password")
    public WebElement linkedinPasswordBox;

    @FindBy(xpath = "//a[@id='social-media-login-logo-fb']")
    public WebElement facebookLoginButton;

    @FindBy(id = "email")
    public WebElement facebookEmailBox;

    @FindBy(id = "pass")
    public WebElement facebookPasswordBox;

    @FindBy(xpath = "(//a[@id='login-click'])[2]")
    public WebElement register;




    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement acceptButton;
}
