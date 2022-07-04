package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Therapist {

    public Therapist(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //hulya can locator

    @FindBy(xpath = "//a[@href='/dashboard']")
    public WebElement dashboardLink;

    @FindBy(xpath = "//a[@href='/dashboard/clients']")
    public WebElement clientsLink;

    @FindBy(xpath = "//a[@href='/dashboard/add-client']")
    public WebElement addClientLink;

    @FindBy(xpath = "//a[@href='/dashboard/documents']")
    public WebElement documentsLink;

}