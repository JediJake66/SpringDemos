package com.genspark.RESTfulAPIDemo1;

import static org.assertj.core.api.Assertions.assertThat;
import com.genspark.RESTfulAPIDemo1.Controller.Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ResTfulApiDemo1ApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private Controller controller;

	@Autowired
	private TestRestTemplate restTemplate;


	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
				String.class).contains("<HTML><H1>Welcome to Jake's Demo Company!</H1></HTML>"));
	}

}
