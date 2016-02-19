package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IngressoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDeveExibirODescontoDeDezPorCentoParaCriancas() {
		Ingresso ingresso = new Ingresso();		
		assertEquals(4.95, ingresso.calcularDesconto("segunda-feira", "crianca", 5.50), 0.001);
	}

}
