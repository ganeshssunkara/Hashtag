package Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PatchRequest {
	public static void main(String[] args) {
		RestAssured.given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com")
		.basePath("/booking/10")
		.headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.headers("Content-Type","application/json")
		.body("'{\r\n"
				+ "    \"firstname\" : \"James\",\r\n"
				+ "    \"lastname\" : \"Brown\"\r\n"
				+ "}'")
		.contentType(ContentType.JSON)
		.when()
		.patch()
		.then()
		.log()
		.all()
		.statusCode(200);
	}

}
