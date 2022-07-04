package stepDefinitions.APIStepDef.sprint3;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities.response;
import static utilities.APIUtilities.specification;

public class API_US_130_SD {
    @Given("user connects to the {string} API.na")
    public void userConnectsToTheAPINa(String endPoint, DataTable dataTable) {
        Map<String, String> map = dataTable.asMaps().get(0);
        response = given().spec(specification).formParams(map).post(endPoint);
        response.prettyPrint();
    }

    @Then("user verifies status code is {string}.na")
    public void userVerifiesStatusCodeIsNa(String statusCode) {
        int currentStatusCode = response.statusCode();
        System.out.println(statusCode);
        Assert.assertTrue(currentStatusCode == (Integer.parseInt(statusCode)));
    }

    @Then("user verifies the api response has mandatory fields.na")
    public void userVerifiesTheApiResponseHasMandatoryFieldsNa(DataTable dataTable) {
        List<String> zorunluAlanlar = dataTable.asList();

        for (String field : zorunluAlanlar) {
            Assert.assertTrue(response.jsonPath().get(field) != null);
        }
    }
}
