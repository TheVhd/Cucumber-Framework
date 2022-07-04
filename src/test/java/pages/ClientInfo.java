package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ClientInfo {
    public ClientInfo(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
