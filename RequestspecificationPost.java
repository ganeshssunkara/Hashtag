package Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RequestspecificationPost {

	public static void main(String[] args) {
		
		 RequestSpecification requestSpecification= RestAssured.given();
		  requestSpecification= requestSpecification.log().all();
		  requestSpecification.baseUri("https://rahulshettyacademy.com");
		  requestSpecification.basePath("maps/api/place/add/json?key= qaclick123");
		  requestSpecification.body("{\r\n"
		  		+ "  \"location\": {\r\n"
		  		+ "    \"lat\": -38.383494,\r\n"
		  		+ "    \"lng\": 33.427362\r\n"
		  		+ "  },\r\n"
		  		+ "  \"accuracy\": 50,\r\n"
		  		+ "  \"name\": \"Ajit house\",\r\n"
		  		+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
		  		+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
		  		+ "  \"types\": [\r\n"
		  		+ "    \"shoe park\",\r\n"
		  		+ "    \"shop\"\r\n"
		  		+ "  ],\r\n"
		  		+ "  \"website\": \"http://google.com\",\r\n"
		  		+ "  \"language\": \"French-IN\"\r\n"
		  		+ "}");
		  requestSpecification.contentType(ContentType.JSON);
		  
		  Response response = requestSpecification.post();
		  
		ValidatableResponse validatableResponse = response.then().log().all();
		validatableResponse.statusCode(200);
		
		  
	} 
}
