package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PresentIssues {
    public PresentIssues(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
