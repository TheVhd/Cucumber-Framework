package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_002Pages {

    public US_002Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Services']")
    public WebElement services;

    @FindBy(xpath = "//button[text()='Features']")
    public WebElement features;

    @FindBy(xpath = "//a[text()='Pricing']")
    public WebElement pricing;

    @FindBy(xpath = "//a[text()='Contact us']")
    public WebElement contactUs;

    @FindBy(xpath = "//a[text()='About us']")
    public WebElement aboutUs;

    @FindBy(xpath = "//a[@gloss='how it works?']")
    public WebElement howitworks;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement login;

    @FindBy(xpath = "//button[text()='Sign Up']")
    public WebElement signUp;

    @FindBy(xpath="//span[contains(text(),'Try it for Free')]")
    public WebElement tryItFree;

    @FindBy(xpath=" //a[contains(text(),'Sign In')]")
    public WebElement SignIn;




}




