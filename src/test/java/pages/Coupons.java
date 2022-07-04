package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Coupons {
    public Coupons(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
