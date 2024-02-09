package Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutRequestResponse {
	public static void main(String[] args) {
		RequestSpecification requestSpecification=RestAssured.given();
		requestSpecification = requestSpecification .log() .all();
		requestSpecification.baseUri("https://restful-booker.herokuapp.com");
		requestSpecification.basePath("/booking/1");
		requestSpecification.headers("Content-Type","application/json");
		requestSpecification.headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=");
		requestSpecification.body("'{\r\n"
				+ "    \"firstname\" : \"James\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}'");
		Response response= requestSpecification.put();
		ValidatableResponse validatableResponse=response.then().log().all();
		validatableResponse.statusCode(200);	
	
	}

}
