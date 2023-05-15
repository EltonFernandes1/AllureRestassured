package com.automation.pet.login;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class LoginpetTest {
    @Test
    public void testValidarLogin(){
        // Configurar o caminho comum de acesso a minha API Rest
        baseURI = "https://petstore.swagger.io/v/";
        // port = 8080;
        // basePart = "/api";

        // Login na API rest
       /*  String token = given()
                .body("token")
                 .contentType(ContentType.JSON)
                 .when()
                 .get("/user/login")
                 .then()
                 .log().all()
                 .extract()
                 .path("data.token");
        // realizar login
*/

        // realizar login
        given()
                .body("{\n" +
                        "    \"id\": 1,\n" +
                        "    \"username\": \"Nome\",\n" +
                        "    \"firstName\": \"Sobrenome\",\n" +
                        "    \"lastName\": \"Ultimo nome\",\n" +
                        "    \"email\": \"teste@teste.com\",\n" +
                        "    \"password\": \"123\",\n" +
                        "    \"phone\": \"1195555555\",\n" +
                        "    \"userStatus\": 5\n" +
                        "  }")
                .contentType(ContentType.JSON)
                .when()
                .post("/user/createWithArray")
                .then()
                .assertThat()
                .statusCode(500);

    }
}
