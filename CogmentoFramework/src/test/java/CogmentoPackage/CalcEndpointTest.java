package CogmentoPackage;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.RestAssured;
import org.msgpack.jackson.dataformat.MessagePackFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@SuppressWarnings("unused")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
@IntegrationTest({"server.port:0"})
public class CalcEndpointTest {
    @Value("${local.server.port}")
    int port;

    ObjectMapper objectMapper = new ObjectMapper(new MessagePackFactory());

    @BeforeMethod
	public void setUp() throws Exception {
        RestAssured.port = port;
    }


    @Test
    public void testCalc() throws Exception {
        byte[] response = given()
                .param("left", 100)
                .param("right", 200)
                .log().all()
                .get("/calc")
                .then()
                .log().all()
                .extract()
                .asByteArray();

        CalcEndpoint.Result result = objectMapper.readValue(response, CalcEndpoint.Result.class);
		/*
		 * assertThat(result.getAnswer(), is(300L)); assertThat(result.getLeft(),
		 * is(100)); assertThat(result.getRight(), is(200));
		 */
    }
}