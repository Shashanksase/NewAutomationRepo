package appTestCases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestCase2 {
	
@Test
	public void test2() {
	RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";
	RequestSpecification request = RestAssured.given();
	
	Object str ="{\"name\":\"Anand Joshi\",\"salary\":\"4300\",\"age\":\"32\"}";
	//add the json to thr body
	request.body(str);
	
	request.header("Content-Type","application/json");
	Response response = request.request(Method.POST);// send key on postman
	int statuscode =response.getStatusCode();
	System.out.println(statuscode);
	System.out.println(response.asString());
}
}
