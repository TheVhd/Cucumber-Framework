package stepDefinitions.APIStepDef.sprint3;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.APIUtilities;


import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_152_ApiStepDef extends APIUtilities {
    @When("User sends a POST Request to {string} api")
    public void user_sends_a_post_request_to_api(String arg0, DataTable DTable) {
        Map<String, String> addSpec = DTable.asMaps().get(0);
        System.out.println(addSpec);
        response = given().spec(specification).formParams(addSpec).post(arg0);
    }
    @Then("user verifies Response is {int}")
    public void user_verifies_response_is(int rCode) {
        System.out.println(response.statusCode());
        Assert.assertTrue(response.statusCode() == rCode);
    }
    @And("User verifies the api response has mandatory fields")
    public void user_verifies_the_api_response_has_mandatory_fields(DataTable daTable) {
        List<String> responseField = daTable.asList();

        for (String field : responseField) {
            Assert.assertTrue(response.jsonPath().get(field) != null);
            System.out.println(field);
        }
    }
}
