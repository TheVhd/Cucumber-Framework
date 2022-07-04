package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Client {
    public Client(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a/p[text()='Sessions']")
    public WebElement sessionTab;

    @FindBy(xpath = "//a/p[text()='Invoice']")
    public WebElement invoiceTab;
}
