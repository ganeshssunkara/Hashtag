package Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MultiplewaycallingHTTPmethd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   RequestSpecification request=  RestAssured.given();
   request.baseUri("https://restful-booker.herokuapp.com");
   request.basePath("booking");
   
   Response res1=request.get();
   System.out.println(res1.asString());
   
   Response res2=RestAssured.given(request).get();
   System.out.println(res2.asString());
   
   Response res3=RestAssured.given().spec(request).get();
   System.out.println(res3.asString());   
   
	}
}
