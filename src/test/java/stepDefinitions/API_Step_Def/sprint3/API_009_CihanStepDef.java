package stepDefinitions.API_Step_Def.sprint3;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.APIUtilities;


import java.util.List;

import static io.restassured.RestAssured.given;

public class API_009_CihanStepDef extends APIUtilities {

    @Then("user verifies response has mandatory fields.api009")
    public void user_verifies_response_has_mandatory_fields(DataTable dataTable) {
        List<String> mandFields = dataTable.asList();
        System.out.println(mandFields);
        for(String field: mandFields){
            Assert.assertTrue(response.jsonPath().get(field)!=null);
            System.out.println(field);
        }


    }

    @Given("user connect to the {string} API")
    public void userConnectToTheAPI(String arg0) {

        APIUtilities.response = given().spec(specification).post(arg0);
        APIUtilities.response.prettyPrint();
    }
}