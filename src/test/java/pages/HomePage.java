package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "(//input[@name='email'])")
    public WebElement loginEmail;

    @FindBy(xpath = "(//input[@name='password'])")
    public WebElement loginPassword;


    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement cookies;

    @FindBy(xpath = "//button[text()='Services']")
    public WebElement services;

    @FindBy(xpath = "//button[text()='Features']")
    public WebElement features;

    @FindBy(xpath = "//a[text()='Pricing']")
    public WebElement pricing;

    @FindBy(xpath = "//a[text()='Contact us']")
    public WebElement contactUs;

    @FindBy(xpath = "//a[text()='About us']")
    public WebElement aboutUs;

    @FindBy(xpath = "//a[@gloss='how it works?']")
    public WebElement howitworks;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement login;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginEnterButton;

    @FindBy(xpath = "//button[text()='Sign Up']")
    public WebElement signUp;

    @FindBy(xpath = "//a[@href='https://www.facebook.com/hypnotesinc']")
    public WebElement facebookIcon;

    @FindBy(xpath = "//a[@href='https://twitter.com/HypnotesInc']")
    public WebElement twitterIcon;

    @FindBy(xpath = "//a[@href='https://www.instagram.com/hypnotesinc/?utm_medium=copy_link']")
    public WebElement instagramIcon;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/hypnotes/']")
    public WebElement linkedinIcon;

    @FindBy(xpath = "//div/h2[.='Why Therapists Love Hypnotes?']")
    public WebElement whyTherapistsLoveHypnotesTxt;

    @FindBy(xpath = "//div/h1[.='All in One Place for Practice Management']")
    public WebElement allInOnePlaceTxt;

    @FindBy(xpath = "//h2/a[.='About Hypnotes']")
    public WebElement aboutHypnotesTxt;

    @FindBy(xpath = "//a[text()='Client']")
    public WebElement clientButton;

    @FindBy(xpath = "//a[text()='Therapist']")
    public WebElement therapistButton;

    @FindBy(xpath = "//span[text()='Try it for Free']")
    public WebElement tryItFreeBanner;

    @FindBy(xpath = "//a[text()='Sign In']")
    public WebElement signInLinkBanner;

    @FindBy(xpath = "//a[text()='What is Hypnotes?']")
    public WebElement whatIsHypnotesLink;

    @FindBy(xpath = "//iframe[@title='Hypnotes']")
    public WebElement youtubeIframe;

    //Footer Locators by Ahmet Döner
    //Home page footer locaters

    @FindBy(xpath = "//h4[text()='Explore']")
    public WebElement exploreSection;

    @FindBy(xpath = "//h4[text()='Features']")
    public WebElement featuresSection;

    @FindBy(xpath = "//h4[text()='company']")
    public WebElement companySection;

    @FindBy(xpath = "//a[text()='blog']")
    public WebElement blogLink;

    @FindBy(xpath = "//a[text()='pricing']")
    public WebElement pricingLink;

    @FindBy(xpath = "//a[text()='how it works ?']")
    public WebElement howitworksLink;

    @FindBy(xpath = "//li/a[text()='Appointment Scheduling']")
    public WebElement appoScheduling;

    @FindBy(xpath = "//li/a[text()='Secure Video Conferencing']")
    public WebElement secVideoConf;

    @FindBy(xpath = "//li/a[text()='eSign Documents Online']")
    public WebElement esignDocOnline;

    @FindBy(xpath = "//li/a[text()='Billing & Invoicing']")
    public WebElement billingInvocing;

    @FindBy(xpath = "//li/a[text()='Bio-feedback']")
    public WebElement bioFeedback;

    @FindBy(xpath = "//li/a[text()='Speech to Text - Voice Note']")
    public WebElement speechToText;

    @FindBy(xpath = "//li/a[text()='Handwriting to text - OCR']")
    public WebElement handwritingToText;

    @FindBy(xpath = "//li/a[text()='Customize service']")
    public WebElement customizeService;

    @FindBy(xpath = "//li/a[text()='Get organized']")
    public WebElement getOrganized;

    @FindBy(xpath = "//li/a[text()='Security-HIPAA Compliance']")
    public WebElement securityComp;



    @FindBy(xpath = "//li/a[text()='Privacy policy']")
    public WebElement privacyPolicy;

    @FindBy(xpath = "//li/a[text()='Terms of service']")
    public WebElement termsOfServices;

    @FindBy(xpath = "//li/p[contains(text(),'Address')]")
    public WebElement addressHeader;

    @FindBy(xpath = "//li/p[contains(text(),'Hypnotes Inc.')]")
    public WebElement addressBody;

    @FindBy(xpath = "//li/p[contains(text(),'Phone')]")
    public WebElement phoneHeader;

    @FindBy(xpath = "//li/p/a[@class='phone-number-link']")
    public WebElement phoneBody;


    @FindBy(css = "div[class='social-links'] a[href*='twitter']")
    public WebElement twitterkIcon;

    @FindBy(css = "div[class='social-links'] a[href*='instagram']")
    public WebElement instaIcon;

    @FindBy(xpath = "//h2[text()='Go ahead, give it a try!']")
    public WebElement storyAreaText;

    @FindBy(xpath = "//a[*='Try it for free']")
    public WebElement tryItForFreeButton;

    @FindBy(xpath = "//li/a[text()='about us']")
    public WebElement aboutUsFooter;

    @FindBy(xpath = "//li/a[text()='contact us']")
    public WebElement contactUsFooter;

    @FindBy(css = "div[class='social-links'] a[href*='facebook']")
    public WebElement facebookIconFooter;

    @FindBy(css = "div[class='social-links'] a[href*='twitter']")
    public WebElement twitterIconFooter;
    @FindBy(css = "div[class='social-links'] a[href*='instagram']")
    public WebElement instaIconFooter;

    @FindBy(css = "div[class='social-links'] a[href*='linkedin']")
    public WebElement linkedinIconFooter;

    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement acceptButton;

    @FindBy(className = "hide-button")
    public WebElement hideServer;

    @FindBy(xpath = "//p[@class='google-text']")
    public WebElement continueWithGoogle;

    @FindBy(xpath = "//button/span[text()='View']")
    public WebElement viewButton;

    @FindBy(css = "input[name='doc1']")
    public WebElement check1Input;

    @FindBy(css = "input[name='doc2']")
    public WebElement check2Input;

    @FindBy(css = "button.ant-btn.ant-btn-ghost")
    public WebElement nextButton;

    @FindBy (xpath = "//button/span[text()='Submit']")
    public WebElement submitButton;

   @FindBy(id = "sfToolbarHideButton-48a4cb")
   public WebElement toolBar;
    @FindBy(css = "video.video-stream.html5-main-video")
    public WebElement youtubeVideo;


    @FindBy(xpath = "//h2[text()='Testimonials']")
    public WebElement testimonialTitle;

    @FindBy(css = "div.flickity-slider")
    public WebElement testimonialSlider;

    @FindBy(css="div.details a.color-black") //scoial links in testimonial
    public List<WebElement> socialLinksInTestimonial;

    @FindBy(css ="button.next")
    public WebElement rightArrow;

    @FindBy(css="button.previous")
    public WebElement leftArrow;

    @FindBy(css = "div.is-selected")
    public List<WebElement> controlofPeople; //right left arrow control

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginBtn;

}
