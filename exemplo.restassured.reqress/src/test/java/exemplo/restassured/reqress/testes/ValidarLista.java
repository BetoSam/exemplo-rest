package exemplo.restassured.reqress.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidarLista {
	Response response;
@Test
	public void validarLista() {

		response = RestAssured.get("http://reqres.in");
		assertEquals(200, response.getStatusCode());
	}

}
