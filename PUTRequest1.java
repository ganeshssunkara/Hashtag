package Request;

import io.restassured.RestAssured;

public class PUTRequest1 {
	public static void main(String[] args) {

		RestAssured.given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com")
		.basePath("/booking/120")
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.header("Content-Type","application/json")
			.body("'{\r\n"
					+ "    \"firstname\" : \"Venus\",\r\n"
					+ "    \"lastname\" : \"Jenny\",\r\n"
					+ "    \"totalprice\" : 111,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2023-12-15\",\r\n"
					+ "        \"checkout\" : \"2023-12-17\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}'")
			.when()
			.put()
			.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);
	}

}
