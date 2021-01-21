package de.gwdg.quarkus.issue;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class JacksonResourceTest {

	@Test
	void test() {
		given().when()
				.formParam("foo", "bar")
				.post("/test")
				.then().statusCode(200)
				.body(is("foo=bar form={foo=[bar]}"));
	}

}
