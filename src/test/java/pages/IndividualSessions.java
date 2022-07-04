package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IndividualSessions {
    public IndividualSessions(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
