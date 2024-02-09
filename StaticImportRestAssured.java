package Request;

import io.restassured.RestAssured;

public class StaticImportRestAssured {

    final static String url="https://reqres.in/api/users/2";
    public static void main(String args[]) 
    {   
        getResponseBody();
        getResponseStatus();
     }
   
    public static void getResponseBody()
    {   
        RestAssured.given().when().get(url).then().log().all();
        given().when().get("https://reqres.in/api/users/2").then().log().body();
     }
     
    private static Object given() {
		
		return null;
	}

    public static void getResponseStatus()
    {
        int statusCode= given().when().get("https://reqres.in/api/users/2").getStatusCode();
        System.out.println("The response status is "+statusCode);
        given().when().get(url).then().assertThat().statusCode(200);
     }
}

