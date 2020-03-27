package appTestCases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestCase1 {

	// Automate restassure currently we are doing, there are different ways also
	@Test
	public void test() {
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees";
		RequestSpecification request = RestAssured.given();
		Response response = request.request(Method.GET);// send key on postman
		
		int statuscode =response.getStatusCode();
		System.out.println(statuscode);
		System.out.println(response.asString());
	}

}
