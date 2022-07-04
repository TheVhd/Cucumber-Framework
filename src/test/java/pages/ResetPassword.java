package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPassword {
    public ResetPassword(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//input[@type='email'])")
    public WebElement ResetEmail;

}
