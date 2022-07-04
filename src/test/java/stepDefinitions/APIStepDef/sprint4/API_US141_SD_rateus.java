package stepDefinitions.APIStepDef.sprint4;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import utilities.APIUtilities;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class API_US141_SD_rateus {
    @Given("user connects to the {string} api with body, POST")
    public void userConnectsToTheApiWithBodyPOST(String endPoint, DataTable dataTable) {

        Map<String, String> mandatoryFields = dataTable.asMaps().get(0);
        System.out.println(mandatoryFields);

        APIUtilities.response = given().
                contentType(ContentType.URLENC.withCharset("UTF-8")). // UTF-8 yardımıyla türkçe karakter tanımı ekledik
                        contentType(ContentType.MULTIPART).
                spec(APIUtilities.specification).
                formParams(mandatoryFields).
                post(endPoint);

    }
}
