package stepDefinitions.UIStepDef.sprint2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;

import static stepDefinitions.Hooks.driver;

public class US069_FilesAddAsVoice {

    HomePage hm=new HomePage(driver);


    @And("User click SignInWithGoogle Button")
    public void userClickSignInWithGoogleButton() {
        hm.continueWithGoogle.click();
    }

    @And("User verifies {string}.")
    public void userVerifies(String URL) {
        Assert.assertTrue("hatalı url", driver.getCurrentUrl().contains(URL));
        
    }

    @And("User Clicks Clients")
    public void userClicksClients() {
    }

}
