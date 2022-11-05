package TestNG_Eg;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetReq_Eg {
	@Test
	public void getReq() {
		
		RestAssured.baseURI = "https://reqres.in/api/";
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.param("page", "1")
				.when()
				.get("/users")
				.then().extract().response();
		System.out.println(response.asPrettyString());
		Assert.assertEquals(200, response.getStatusCode());
				
		
		
	}

	
}
