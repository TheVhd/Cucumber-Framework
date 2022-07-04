package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GroupSessions {
    public GroupSessions(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
