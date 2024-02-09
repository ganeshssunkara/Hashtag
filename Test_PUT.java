package Request;

	import org.testng.annotations.Test;
	import org.json.simple.JSONObject;
	import static io.restassured.RestAssured.*;
	import io.restassured.http.ContentType;
	import io.restassured.response.Response;
	import org.codehaus.groovy.reflection.ReflectionCache;
	public class Test_PUT {
	    @Test
	    void TEST_put() {
	           
	            JSONObject request = new JSONObject();
	            request.put("name", "Aarya");
	            request.put("job", "Developer");
	            System.out.println(request);
	            System.out.println(request.toJSONString());
	         
	            given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).
	            when().
	            put("https://reqres.in/api/users/2").
	            then().
	            statusCode(200);
	    }
}
