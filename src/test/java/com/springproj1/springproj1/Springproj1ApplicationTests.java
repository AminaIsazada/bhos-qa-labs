package com.springproj1.springproj1;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
class Springproj1ApplicationTests {

	TestRestTemplate temp = new TestRestTemplate();
	HttpHeaders headers = new HttpHeaders();
	HttpEntity<String> entity = new HttpEntity<String>(null, headers);
	@Test
	void FirstIntegrationTest() {

		ResponseEntity<String> response = temp.exchange("https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos", HttpMethod.GET, entity, String.class);

		assertTrue(response.getStatusCode() == HttpStatus.OK);
		assertEquals( MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
	}

	@Test
	void SecondIntegrationTest() {

		ResponseEntity<String> response = temp.exchange("https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos/1/branches", HttpMethod.GET, entity, String.class);

		assertTrue(response.getStatusCode() == HttpStatus.OK);
		assertEquals( MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
	}

	@Test
	void ThirdIntegrationTest() {

		ResponseEntity<String> response = temp.exchange("https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos/1/branches/1/commits", HttpMethod.GET, entity, String.class);

		assertTrue(response.getStatusCode() == HttpStatus.OK);
		assertEquals( MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
	}

}




