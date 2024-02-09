package Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Post1 {
public static void main(String[] args) {
	RestAssured.given()
	.log()
	.all()
	.baseUri("https://restful-booker.herokuapp.com")
	.basePath("/auth")
	.body("curl -X POST \\\r\n"
			+ "  https://restful-booker.herokuapp.com/auth \\\r\n"
			+ "  -H 'Content-Type: application/json' \\\r\n"
			+ "  -d '{\r\n"
			+ "    \"username\" : \"admin\",\r\n"
			+ "    \"password\" : \"password123\"\r\n"
			+ "}'")
	.contentType(ContentType.JSON)
	.when()
	.post()
	.then()
	.log()
	.all()
	.statusCode(200);

}
}
