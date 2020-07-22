package rest.assured.com.demo;

import org.testng.annotations.Test;

import files.payload;
import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class DynamicJSON {
	
	@Test
	
	public void addBook()
	{
		RestAssured.baseURI="http://216.10.245.166";
		RestAssured.basePath="Library/Addbook.php";
		
		given().body(payload.AddBook()).when().post().then().assertThat().statusCode(200);
	}

}
