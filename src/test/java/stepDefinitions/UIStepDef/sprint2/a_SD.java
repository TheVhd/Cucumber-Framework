package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Cookie;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class a_SD {
    @Given("the user navigates to my website {string}")
    public void theUserNavigatesToMyWebsite(String url) {

        driver.get(ConfigReader.getProperty("HypnotesTestUrl") + url);
        driver.manage().addCookie(new Cookie("PHPSESSID", "9ia1hu7i6bo96hghh6ckocthpd"));
        driver.get(ConfigReader.getProperty("HypnotesTestUrl") + url);
        System.out.println(ConfigReader.getProperty("HypnotesTestUrl") + url);
        System.out.println(
                "oldu mu"
        );

    }
}
