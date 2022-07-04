package stepDefinitions.APIStepDef.sprint3;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.APIUtilities;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities.response;

public class API_011 {


    @Given("User connects to the{string}.BP")
    public void userConnectsToTheBP(String endPoint,DataTable dataTable) {

        Map<String,  String> mandatoryFields = dataTable.asMaps().get(0);

        response = given().
                spec(APIUtilities.specification).
                formParams(mandatoryFields).
                post(endPoint);

        response.prettyPrint();

    }

    @And("User verifies status code is {string}.BP")
    public void userVerifiesStatusCodeIsBP(String statusCode) {



        int currentStatusCode = APIUtilities.response.statusCode();
        Assert.assertEquals(Integer.parseInt(statusCode) ,currentStatusCode);

    }
    @Then("User verifies the api response has mandatory fields.BP")
    public void userVerifiesTheApiResponseHasMandatoryFieldsBP(DataTable dataTable) {


        List<String> zorunluAlanlar = dataTable.asList();

        for (String field : zorunluAlanlar) {
            Assert.assertTrue(APIUtilities.response.jsonPath().get(field) != null);
        }


    }






}
