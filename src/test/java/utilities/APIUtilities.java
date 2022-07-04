package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Cookie;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class APIUtilities {

    public static Response response;
    public static RequestSpecification specification = new RequestSpecBuilder().
            addCookie(new Cookie.Builder("PHPSESSID","eaispsf2erq29pan3qfontcm6v").build()).
            setBaseUri("https://test.hypnotes.net/api/").setRelaxedHTTPSValidation().build();
}
