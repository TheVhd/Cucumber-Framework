package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddClient {
    public AddClient(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
