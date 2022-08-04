import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import giveninputfiles.inputpayload;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.baseURI = "https://rahulshettyacademy.com";

//given = all input details should be given here
given().log().all().queryParam("key","qaclick123")
.body(inputpayload.Addplace()).when().post("maps/api/place/add/json")
.then().log().all().statusCode(200).body("scope", equalTo("APP"))
.header("Server","Apache/2.4.41 (Ubuntu)");

//Add place - > Update place - > Get place to validate  if new Place is updated successfully in response 

	} 

}
