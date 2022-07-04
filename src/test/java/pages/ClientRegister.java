package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ClientRegister {

    public ClientRegister
            (WebDriver driver){
        PageFactory.initElements( driver,this);
    }

    @FindBy(id = "name-input")
    public WebElement name;

    @FindBy(id = "surname-input")
    public WebElement surName;

    @FindBy(id = "client_registration_form_email")
    public WebElement client_registration_form_email;

    @FindBy(id = "pass-input")
    public WebElement passwordInput;

    @FindBy(id = "p.invalid")
    public WebElement yesilAlert;

    @FindBy(id = "p.valid")
    public WebElement kirmiziAlert;


    @FindBy(css = "button#register-submit")
    public WebElement signUpButton;

    @FindBy(id = "nav.hide a[href*='login']")
    public WebElement loginLink;

    //kemal Durgun US-01
    @FindBy(xpath = "//button[@onclick='openDropDown()']")
    public WebElement singUpButtonS;
    @FindBy(xpath = "//a[text()='Client']")
    public WebElement clientButton;
    @FindBy(xpath = "//input[@name='client_registration_form[email]']")
    public WebElement email;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signUpButtonK;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
    public WebElement sendAgainEmail;
    @FindBy(xpath = "//h1[@class='text-white']")
    public WebElement verifyEmail;
    @FindBy(xpath = "//button[@onclick='acceptCookie()']")
    public WebElement cookies;
    @FindBy(xpath = "//button[@title='Close Toolbar']")
    public WebElement clossX;

    @FindBy(xpath = "//a[@id='register-click'][1]")
    public WebElement loginLinkAlready;

    @FindBy(xpath = "//*[text()='Verify your email']")
    public WebElement verifyYourEmail;

    //Burasi Deneme olarak eklendi*******************************************
    @FindBy (xpath = " //p[@class = 'valid']")
    public List<WebElement> validList;     //validList FRAMEWORK E EKLENECEK


    @FindBy(xpath = "//*[text()='Please fill out this field.']")
    public WebElement fillOutThisFieldAlert;

    @FindBy(xpath = "//p[@class='valid']")
    public WebElement validPassword;


    @FindBy(css="p.google-text")
    public WebElement googleSignIn;

    @FindBy(xpath = "//input[@name='identifier']")
    public WebElement googleEmailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement googlePasswordBox;

    @FindBy(xpath = "//a[@href='/api/public/connect/facebook-client']")
    public WebElement facebookLoginButton;

    @FindBy(id = "email")
    public WebElement facebookEmailBox;

    @FindBy(id = "pass")
    public WebElement facebookPasswordBox;

    @FindBy(xpath = "//a[@href='/api/public/connect/linkedin-client']")
    public WebElement linkedinLoginButton;

    @FindBy(id = "username")
    public WebElement linkedinEmailBox;

    @FindBy(id = "password")
    public WebElement linkedinPasswordBox;



}
