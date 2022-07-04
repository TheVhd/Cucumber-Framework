package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

import static stepDefinitions.Hooks.driver;

public class RegisterCB {

    public RegisterCB (WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Does not repeat']")
    public WebElement repeatOption;
}
