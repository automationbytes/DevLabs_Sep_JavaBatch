package TestNG_Eg;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class putReq_eg {
	@Test
	public void putReq() {

		JSONObject jsobject = new JSONObject();
		jsobject.put("Description", "Modified Delight Coffee from restassured");
		jsobject.put("Name", "Modified Delight cafe");
		jsobject.put("Id", 115);
		
		
		
		RestAssured.baseURI = "http://webservice.toscacloud.com/rest/api";
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.header("Authorization","Bearer f658514a-a257-43aa-9741-fe3964731fea")
				.and()
				.body(jsobject.toString())
				.when()
				.put("/Coffees_V2")
				.then().extract().response();
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);



	}

}
