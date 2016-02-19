package br.com.strategy;

import br.com.business.Desconto;
import br.com.business.DiaDaSemana;

public class DescontoUsuarioIdoso extends DescontoUsuario{
	@Override
	public double calcular(String diaDaSemana, String tipoDeUsuario, double valor) {
		if (diaDaSemana.equals(DiaDaSemana.SEGUNDA_FEIRA) && tipoDeUsuario.equals("idoso"))
			return calcularValorTotalComDesconto(valor, Desconto.DEZ_POR_CENTO);

		if (diaDaSemana.equals(DiaDaSemana.QUARTA_FEIRA) && tipoDeUsuario.equals("idoso"))
			return calcularValorTotalComDesconto(valor, Desconto.QUARENTA_POR_CENTO);
		
		if (diaDaSemana.equals(DiaDaSemana.QUINTA_FEIRA) && tipoDeUsuario.equals("idoso"))
			return calcularValorTotalComDesconto(valor, Desconto.TRINTA_POR_CENTO);
		
		if (diaDaSemana.equals(DiaDaSemana.TERCA_FEIRA) && tipoDeUsuario.equals("idoso")) {			
			return calcularValorTotalComDesconto(valor, Desconto.QUINZE_POR_CENTO);
		}	
		
		return calcularValorTotalComDesconto(valor, Desconto.CINCO_POR_CENTO);
	}
	
}
