package stepDefinitions.APIStepDef.sprint3;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.APIUtilities.specification;
import static utilities.APIUtilities.response;

public class API_US120_SD_AddCreateNewCoupon {
    @Given("user connects to the {string} api. POST")
    public void userConnectsToTheApiPOST(String endPoint, DataTable dataTable) {

        Map<String, String> zorunluAlanlar = dataTable.asMaps().get(0); // username = hamza & password = 1234 & bilgi = asdf & key = value
        System.out.println(zorunluAlanlar);

        response = given().
                contentType(ContentType.URLENC.withCharset("UTF-8")). // UTF-8 yardımıyla türkçe karakter tanımı ekledik
                        spec(specification).
                formParams(zorunluAlanlar).
                post(endPoint);

        response.prettyPrint();
    }


    @Then("user verifies the api response has mandatory fields, only one json")
    public void userVerifiesTheApiResponseHasMandatoryFieldsOnlyOneJson(DataTable dataTable) {
        List<String> zorunluAlanlar = dataTable.asList(); // success

        for (String field : zorunluAlanlar) {
            Assert.assertTrue(response.jsonPath().get(field) != null);
        }
    }

    @Then("user verifies the status code of the response is {string}")
    public void userVerifiesTheStatusCodeOfTheResponseIs(String statusCode) {
        int currentStatusCode = response.statusCode();

        Assert.assertEquals(Integer.parseInt(statusCode), currentStatusCode);
    }
}
