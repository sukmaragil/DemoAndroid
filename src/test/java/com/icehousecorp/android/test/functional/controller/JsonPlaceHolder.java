package com.icehousecorp.android.test.functional.controller;

import com.icehousecorp.android.test.functional.Utils.Config;
import com.icehousecorp.android.test.functional.models.RequestBody;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import static io.restassured.config.EncoderConfig.encoderConfig;
import static net.serenitybdd.rest.SerenityRest.*;

public class JsonPlaceHolder {

    @Step
    public void getData() {

        String baseURL = "https://jsonplaceholder.typicode.com";

        Response responseGetData = (Response) RestAssured
                .given()
                    .log().all()
                    .contentType(ContentType.JSON)
                .when()
                    .get(baseURL + "/posts")
                .then()
                    .log().all()
                    .statusCode(200).extract().response();

        System.out.println(responseGetData.body());
    }

    @Step
    public void postData() {

        String baseURL = "https://jsonplaceholder.typicode.com";

//        String body = "{\n" +
//                "      \"title\": \"foo\",\n" +
//                "      \"body\": \"bar\",\n" +
//                "      \"userId\": 1\n" +
//                "    }";

        RequestBody body = new RequestBody();
        body.setTitle("foo");
        body.setBody("bar");
        body.setUserId(1);

        Response result =
                given()
                        .log().all()
                        .contentType("application/json")
                        .body(body)
                .when()
                        .post(baseURL + "/posts")
                .then()
                        .statusCode(200).log().all().extract().response();

        String title = result.path("title");

        /*
        {
            "title" : "foo",
            "body" : "bar",
            "userId" : 1
        }
         */

        System.out.println(result.body());

        /*
        {
            "data" : {
                "title" : "foo",
                "body" : "bar",
                "userId" : 1
            }
        }
         */

        title = result.path("data.title");

        String header = result.header("Content-Type");
        String cookies = result.getCookie("content");
    }

    @Step
    public void post_signin_session(String username, String password) {
        String request = "https://qa-mybb-gw.bluebirdgroup.com:7443/";

        String endpoint = "api/v4/sessions";

        String body = "{\n" +
                "  \"email\": \"" + username + "\",\n" +
                "  \"password\": \"" + password + "\",\n" +
                "  \"uuid\": \"145c59c2-1d0d-4e39-a2ae-7f72dfc08066\",\n" +
                "  \"operating_system\": \"android\",\n" +
                "  \"manufacturer\": \"motorola\",\n" +
                "  \"os_version\": \"5.1\",\n" +
                "  \"device_token\": \"vvvvvv\"\n" +
                "}";

        Response response =
                given()
                        .config(config().encoderConfig(encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                        .contentType(ContentType.JSON)
                        .body(body)
                .when()
                        .post(request + endpoint)
                .then()
                        .statusCode(200).extract().response();

        System.out.println("------");
        System.out.println("Response body : " +response.body().asString());
        System.out.println("Header" + response.getHeader("Content-Type"));
        System.out.println("\nData Token :" + response.path("data.token").toString());

        Config.saveTempJson(response.body().asString(), "Login.json");
    }
}
