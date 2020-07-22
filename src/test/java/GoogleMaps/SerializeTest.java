package GoogleMaps;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddPlace p= new AddPlace();
		p.setAccuracy(50);
		p.setName("Frontline house");
		p.setPhone_number("(+91) 983 893 3937");
		p.setLanguage("French-IN");
		p.setWebsite("www.google.com");
		p.setAddress("29, side layout, cohen 09");
		List<String> types= new ArrayList<String>(Arrays.asList("shoe park","shop"));
		p.setTypes(types);
		Location l= new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		RestAssured.baseURI="https://rahulshettyacademy.com";
		RestAssured.basePath="/maps/api/place/add/json";
		
		String response=given().queryParam("key", "qaclick123").body(p)
		.when()
		.post()
		.then()
		.assertThat()
		.statusCode(200)
		.extract().response().asString();
		
		System.out.println(response);

	}

}
