package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AboutUS {


    public AboutUS(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h2[contains(text(), 'Who is Hypnotes?')]")
    public WebElement whoIsHypnotesTxt;
}
