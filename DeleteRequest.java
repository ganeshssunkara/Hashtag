package Request;

import io.restassured.RestAssured;

public class DeleteRequest {
public static void main(String[] args) {
	RestAssured.given()
	.log()
	.all()
	.baseUri("https://restful-booker.herokuapp.com")
	.basePath("/booking/1")
	.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	.when()
	.delete()
	.then()
	.log()
	.all()
	.statusCode(200);
}
}
