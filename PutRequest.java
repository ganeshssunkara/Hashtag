package Request;

import java.net.ContentHandler;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutRequest {
	public static void main(String[] args) {
		RestAssured.given()
		           .log()
		           .all()
		           .baseUri("https://restful-booker.herokuapp.com")
	               .basePath("/booking/:id")
	               .body("'{\r\n"
	               		+ "    \"firstname\" : \"James\",\r\n"
	               		+ "    \"lastname\" : \"Brown\",\r\n"
	               		+ "    \"totalprice\" : 111,\r\n"
	               		+ "    \"depositpaid\" : true,\r\n"
	               		+ "    \"bookingdates\" : {\r\n"
	               		+ "        \"checkin\" : \"2018-01-01\",\r\n"
	               		+ "        \"checkout\" : \"2019-01-01\"\r\n"
	               		+ "    },\r\n"
	               		+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
	               		+ "}'")
	              .contentType(ContentType.JSON)
	              .when()
	              .put()
	              .then()
	              .log()
	              .all()
	              .statusCode(200);
	              
	               
		
	
		
		           
	}

}
