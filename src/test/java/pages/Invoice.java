package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invoice {
    public Invoice(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "rc_select_3")
    public WebDriver itemDescField;

    @FindBy(xpath = "//div[@class='view w-17 p-4-8 pb-10']/input[@value='1']")
    public WebDriver qtyField;

    @FindBy(xpath = "//div[@class='view w-17 p-4-8 pb-10']/input[@value='0.00']")
    public WebDriver rateField;

    @FindBy(xpath = "//div[@class='view w-18 p-4-8 pb-10']/span")
    public WebDriver amountField;

    @FindBy(xpath = "//button[@class='link']")
    public WebDriver addLineItem;

    @FindBy(xpath = "//button[@class='link']")
    public WebDriver subTotal;

    @FindBy(xpath = "//button[@class='link']")
    public WebDriver salesTax;

    @FindBy(xpath = "//div[@class='view w-50 flex']/span")
    public WebDriver total;
}
