package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TherapistRegister {
    public TherapistRegister(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Hypnotherapist Register']")
    public WebElement signUpHypnotherapist;

    @FindBy(id = "fullname-input")
    public WebElement fullName;

    @FindBy(id = "registration_form_email")
    public WebElement registration_form_email;

    @FindBy(id = "pass-input")
    public WebElement passwordInput;

    @FindBy(css = "button#register-submit")
    public WebElement SignUpButton;

    @FindBy(xpath = "//form[@name='registration_form']/a[text()='Login']")
    public WebElement login_Link;

    @FindBy(xpath = "//form[@name='registration_form'] //a[.='Client Register']")
    public WebElement ClientRegister;

    @FindBy(xpath = "//p[.='Sign in with Google'] ")
    public WebElement SignInWithGoogle;

    @FindBy(xpath = "//a[@class='mr-20']")
    public WebElement SignInWithFacebook;

    @FindBy(xpath = "//a[@href='/api/public/connect/linkedin']")
    public WebElement SignInWithLinkedIN;

    @FindBy(xpath = "//div[@class='main-wrapper-first relative']//span[1]//a[1]")
    public WebElement reset;

    @FindBy(xpath = "//h1[text()='Therapist Register']")
    public WebElement therapistRegisterText;

    @FindBy(xpath = "//button[@onclick='openDropDown()']")
    public WebElement signUpDropdown;

    @FindBy (xpath = "//a[@href='/register']")
    public WebElement dropdownTherapist;

    @FindBy (id = "register-submit")
    public WebElement registerSubmit;

    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//*[contains(text(),\"valid email\")]")
    public WebElement messageOfValidMail;

    @FindBy(xpath = "//h1[text()='Verify your email']")
    public WebElement verifyEmailText;

    @FindBy(xpath = "//p[@class='valid']")
    public List<WebElement> validList;

    @FindBy(xpath = "//p[@class='invalid']")
    public List<WebElement> invalidList;

    @FindBy ( id = "length")
    public WebElement ruleLength;

    @FindBy ( id = "letter")
    public WebElement ruleLetter;

    @FindBy ( id = "capital" )
    public WebElement ruleCapital;

    @FindBy ( id = "number")
    public WebElement ruleNumber;

    @FindBy ( id = "special")
    public WebElement ruleSpecial;




    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement cookies;

    @FindBy(xpath = "(//a[@href='/register'])[2]")
    public WebElement textSignup;

    @FindBy(xpath = "//button[text()='Send again!']")
    public WebElement sendAgain;

    @FindBy(xpath = "//p[@class='mb-3']")
    public List<WebElement> verifyTexts;


//kemalD US_058

    @FindBy(xpath = "//a[text()='Therapist']")
    public WebElement TherapistSelect;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement TherapistLoginEmail;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement TherapistLoginPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement TherapistLoginButton;



}
