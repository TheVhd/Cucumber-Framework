package stepDefinitions.APIStepDef.sprint3;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static utilities.APIUtilities.response;
import static utilities.APIUtilities.specification;


public class US_134_Api_StepDef {

    @Given("User connects to {string} By Post method")
    public void user_connects_to_api(String arg0, DataTable dataTable) {
        Map<String, String> calendarColors = dataTable.asMaps().get(0);
        response = given().spec(specification).formParams(calendarColors).post(arg0);
    }

    @Then("User verifies the response is {int}")
    public void user_verifies_the_response_is(int resCode) {
        Assert.assertTrue(response.statusCode() == resCode);

    }

    @Then("User verifies the response has mandatory fields")
    public void user_verifies_the_response_has_mandatory_fields(DataTable dataTable) {
        response.equals("success");

    }

}
