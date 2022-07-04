package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageCB {

    public LoginPageCB(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy( name = "email" )
    public WebElement emailInput;

    @FindBy ( name = "password" )
    public WebElement passwordInput;

    @FindBy ( xpath = "//button[@type='submit']" )
    public WebElement loginButton;

    @FindBy(css = "a[href='/dashboard/clients']")
    public WebElement clientLink;

    @FindBy(xpath = "(//span[@class=\"ant-typography ant-typography-success\"])[1]")
    public WebElement viewDetailButton;

    @FindBy(xpath ="//p[contains(text(),'Presenting')]")
    public WebElement presentingIssueButton;

    @FindBy (xpath = "//span[text() = 'Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//a[normalize-space()='title2']")
    public WebElement title2;

    @FindBy(xpath = "//a[normalize-space()='Social Phobia']")
    public WebElement socialPhobia;

    @FindBy(xpath = "//a[normalize-space()='Paranoid Personality Disorder']")
    public WebElement paranoidPersDisorder;

    @FindBy(xpath = "//label[normalize-space()='Title:']")
    public WebElement Title;

    // esma yilmaz ----
    @FindBy(css = "[name='email']")
    public WebElement txtEmail;

    @FindBy(css = "[name='password']")
    public WebElement txtPassword;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement btnLogin;


}
