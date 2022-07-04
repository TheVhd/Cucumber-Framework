package stepDefinitions.APIStepDef.sprint3;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities.response;
import static utilities.APIUtilities.specification;

public class US_004_ApiStepDef {


    @Given("user connects to the {string} API")
    public void userConnectToTheAPI(String arg0, DataTable dataTable) {
        Map<String, String> map = dataTable.asMaps().get(0);
        response = given().spec(specification).formParams(map).post(arg0);
        response.prettyPrint();
    }


    @Then("user verifies status code is {string}")
    public void userVerifiesStatusCodeIs(String statusCode) {
        int currentStatusCode = response.statusCode();
        Assert.assertTrue(currentStatusCode == (Integer.parseInt(statusCode)));
    }

}
