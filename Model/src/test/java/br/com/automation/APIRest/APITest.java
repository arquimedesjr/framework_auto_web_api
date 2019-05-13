package br.com.automation.APIRest;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.http.ContentType;

public class APITest {

	@Test
	public void Teste() {
		String uriBase = "https://jsonplaceholder.typicode.com/todos/1";

		given()
		.relaxedHTTPSValidation()
		.param("userId", 1)
		.param("id", 1)
		.param("title", "delectus aut autem")
		.param("title", false)
		.when()
		.get(uriBase)
		.then()
		.statusCode(200) 
		.contentType(ContentType.JSON); 
		
	}



}
