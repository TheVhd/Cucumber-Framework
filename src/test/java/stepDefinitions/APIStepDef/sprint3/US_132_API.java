package stepDefinitions.APIStepDef.sprint3;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

import static utilities.APIUtilities.response;

public class US_132_API {
    @And("user verifies the api response has mandatory fields")
    public void userVerifiesTheApiResponseHasMandatoryFields(DataTable dataTable) {
        List<String> mandFields = dataTable.asList();

        for (String field : mandFields) {
            Assert.assertTrue(response.jsonPath().get(field) != null);
            System.out.println(field);
        }
    }

    @Then("user verifies status code is {int}")
    public void userVerifiesStatusCodeIs(int sCode) {
        Assert.assertTrue(response.statusCode() == sCode);
    }
}
