package stepDefinitions.APIStepDef.sprint3;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import utilities.APIUtilities;

import java.util.List;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities.response;
import static utilities.APIUtilities.specification;

public class US_119_Api {
    @Given("user connects to the {string} API get")
    public void userConnectsToTheAPIGet(String arg0) {
        APIUtilities.response = given().spec(specification).post(arg0);
        APIUtilities.response.prettyPrint();
    }

    @Then("user verifies response has mandatory fields")
    public void userVerifiesResponseHasMandatoryFields(DataTable data) {
        List<String> mandField=data.asList();
        for (String field:mandField) {
            Assert.assertTrue(APIUtilities.response.jsonPath().get(field)!=null);
            System.out.println(APIUtilities.response.jsonPath().get(field).toString());
        }
    }
}

