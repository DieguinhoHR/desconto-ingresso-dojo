package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.business.DiaDaSemana;
import br.com.business.Ingresso;
import br.com.business.PrecoDoIngresso;

public class IngressoTest {
	private Ingresso ingresso;
	
	@Before
	public void setUp() throws Exception {
		this.ingresso = new Ingresso();		
	}

	@Test
	public void testDeveExibirODescontoDeDezPorCentoParaCriancas() {	
		assertEquals(4.95, this.ingresso.calcularDesconto("crianca", DiaDaSemana.SEGUNDA_FEIRA, PrecoDoIngresso.CRIANCA), 0.001);
	}
		
	@Test
	public void testDeveExibirODescontoDeDezPorCentoParaIdosos() {				
		assertEquals(5.40, this.ingresso.calcularDesconto("idoso", DiaDaSemana.SEGUNDA_FEIRA, PrecoDoIngresso.IDOSO), 0.001);
	}
	
	@Test
	public void testDeveExibirODescontoDeDezPorCentoParaEstudantes() {				
		assertEquals(7.20, this.ingresso.calcularDesconto("estudante", DiaDaSemana.SEGUNDA_FEIRA, PrecoDoIngresso.ESTUDANTE), 0.001);
	}	

	@Test
	public void testDeveExibirODescontoDeQuinzePorCentoParaIdoso() {	
		assertEquals(5.1, this.ingresso.calcularDesconto("idoso", DiaDaSemana.TERCA_FEIRA, PrecoDoIngresso.IDOSO), 0.001);
	}
	
	@Test
	public void testDeveExibirODescontoDeQuinzePorCentoParaCriancas() {	
		assertEquals(4.675, this.ingresso.calcularDesconto("crianca", DiaDaSemana.TERCA_FEIRA, PrecoDoIngresso.CRIANCA), 0.001);
	}
	
	@Test
	public void testDeveExibirODescontoDeCincoPorCentoParaEstudante() {	
		assertEquals(4.00, this.ingresso.calcularDesconto("estudante", DiaDaSemana.TERCA_FEIRA, PrecoDoIngresso.ESTUDANTE), 0.001);
	}
	
	@Test
	public void testDeveExibirODescontoDeQuarentaPorCentoParaIdoso() {	
		assertEquals(3.60, this.ingresso.calcularDesconto("idoso", DiaDaSemana.QUARTA_FEIRA, PrecoDoIngresso.IDOSO), 0.001);
	}
	
	@Test
	public void testDeveExibirODescontoDeTrintaPorCentoParaCrianca() {	
		assertEquals(3.85, this.ingresso.calcularDesconto("crianca", DiaDaSemana.QUARTA_FEIRA, PrecoDoIngresso.CRIANCA), 0.001);
	}

	@Test
	public void testDeveExibirTrintaPorCentoParaIdoso() {	
		assertEquals(4.20, this.ingresso.calcularDesconto("idoso", DiaDaSemana.QUINTA_FEIRA, PrecoDoIngresso.IDOSO), 0.001);
	}
	
	@Test
	public void testDeveExibirTrintaPorCentoParaEstudante() {	
		assertEquals(5.60, this.ingresso.calcularDesconto("estudante", DiaDaSemana.QUINTA_FEIRA, PrecoDoIngresso.ESTUDANTE), 0.001);
	}
	
	@Test
	public void testDeveExibirOnzePorCentoParaEstudante() {	
		assertEquals(4.895, this.ingresso.calcularDesconto("crianca", DiaDaSemana.SEXTA_FEIRA, PrecoDoIngresso.CRIANCA), 0.001);
	}
	
	@Test
	public void testDeveODescontoExibirCincoPorCentoParaIdoso() {	
		assertEquals(3.00, this.ingresso.calcularDesconto("idoso", DiaDaSemana.SABADO, PrecoDoIngresso.IDOSO), 0.001);
	}
	
	@Test
	public void testDeveODescontoExibirCincoPorCentoParaIdosoNoSabado() {	
		assertEquals(3.00, this.ingresso.calcularDesconto("idoso", DiaDaSemana.DOMINGO, PrecoDoIngresso.IDOSO), 0.001);
	}
	
	@Test
	public void testDeveODescontoExibirCincoPorCentoParaIdosoFeriado() {	
		assertEquals(3.00, this.ingresso.calcularDesconto("idoso", DiaDaSemana.FERIADO, PrecoDoIngresso.IDOSO), 0.001);
	}
}
