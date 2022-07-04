package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Packages {
    public  Packages(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
