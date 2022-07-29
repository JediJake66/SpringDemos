package com.genspark.RestfulPokemon;

import com.genspark.RestfulPokemon.Controllers.PokeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RestfulPokemonApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private PokeController controller;

	@Autowired
	private TestRestTemplate restTemplate;


	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
				String.class).contains("<HTML><H1>My Pokemon Collection</H1></HTML>"));
	}

}
