package Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetTest {

			public static void main(String[] args) {
				
			
		{
			Response response = RestAssured.get("https://reqres.in/api/users?page=2");
			System.out.println(response.getStatusCode());
			System.out.println(response.getTime());
		}
			}
}

