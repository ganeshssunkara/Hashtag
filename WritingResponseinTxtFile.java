package Request;


import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class WritingResponseinTxtFile
{
	@Test
	public void txtFile() throws IOException
	{
		String body="{\"name\":\"Ganesh\",\"Password\":\"Password\"}";
		String BaseUri="https://reqres.in/api/users";
		RequestSpecification request=RestAssured.given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.baseUri(BaseUri)
				.body(body);
		
		Response response = request.post();
		System.out.println("The statuscode"+  response.getStatusCode());
		ValidatableResponse validate=response.then();
		
		int statuscode=response.getStatusCode();
		byte[] txtdata=response.asByteArray();
		
		File txtfile=new File("C:\\Users\\Ganesh Sunkara\\eclipse-workspace\\RestAssuredCNProject\\src\\main\\resources\\Data\\txt.txt");
		Files.write(txtdata, txtfile);
	}
	
	}


