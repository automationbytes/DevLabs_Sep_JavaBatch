package TestNG_Eg;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class get_withAuth {
	@Test
	public void getReq() {

		RestAssured.baseURI = "http://webservice.toscacloud.com/rest/api";
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.header("Authorization","Bearer f658514a-a257-43aa-9741-fe3964731fea")
				.when()
				.get("/Coffees_V2")
				.then().extract().response();
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);



	}

}
