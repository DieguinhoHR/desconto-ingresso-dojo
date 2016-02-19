package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IngressoTest {
	private Ingresso ingresso;
	private static final double PRECO_DO_INGRESSO_CRIANCA = 5.50;
	private static final double PRECO_DO_INGRESSO_IDOSO = 6.00;
	private static final double PRECO_DO_INGRESSO_ESTUDANTE = 8.00;	

	@Before
	public void setUp() throws Exception {
		this.ingresso = new Ingresso();		
	}

	@Test
	public void testDeveExibirODescontoDeDezPorCentoParaCriancas() {	
		assertEquals(4.95, this.ingresso.calcularDesconto("segunda-feira", "crianca", PRECO_DO_INGRESSO_CRIANCA), 0.001);
	}
		
	@Test
	public void testDeveExibirODescontoDeDezPorCentoParaIdosos() {				
		assertEquals(5.40, this.ingresso.calcularDesconto("segunda-feira", "idoso", PRECO_DO_INGRESSO_IDOSO), 0.001);
	}
	
	@Test
	public void testDeveExibirODescontoDeDezPorCentoParaEstudantes() {				
		assertEquals(7.20, this.ingresso.calcularDesconto("segunda-feira", "estudante", PRECO_DO_INGRESSO_ESTUDANTE), 0.001);
	}	

	@Test
	public void testDeveExibirODescontoDeQuinzePorCentoParaIdoso() {	
		assertEquals(5.1, this.ingresso.calcularDesconto("terca-feira", "idoso", PRECO_DO_INGRESSO_IDOSO), 0.001);
	}
	
	@Test
	public void testDeveExibirODescontoDeQuinzePorCentoParaCriancas() {	
		assertEquals(4.675, this.ingresso.calcularDesconto("terca-feira", "crianca", PRECO_DO_INGRESSO_CRIANCA), 0.001);
	}
	
	@Test
	public void testDeveExibirODescontoDeQuinzePorCentoParaEstudante() {	
		assertEquals(6.8, this.ingresso.calcularDesconto("terca-feira", "estudante", PRECO_DO_INGRESSO_ESTUDANTE), 0.001);
	}

}
