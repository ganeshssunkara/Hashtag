package Request;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class BDDStyle {
	public static void main(String[] args) {
		
				
			// Given
			RestAssured.given()
				.baseUri("https://restful-booker.herokuapp.com")
			// When
			.when()
				.get("/booking")
			// Then
			.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
				// To verify booking count
				.body("bookingid", Matchers.hasSize(10))
				// To verify booking id at index 3
				.body("bookingid[3]", Matchers.equalTo(1));			
			
	
		}

	}

