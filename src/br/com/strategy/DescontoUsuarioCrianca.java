package br.com.strategy;

import br.com.business.Desconto;
import br.com.business.DiaDaSemana;

public class DescontoUsuarioCrianca extends DescontoUsuario {
	@Override
	public double calcular(String diaDaSemana, String tipoDeUsuario, double valor) {
		if (diaDaSemana.equals(DiaDaSemana.SEGUNDA_FEIRA))
			return calcularValorTotalComDesconto(valor, Desconto.DEZ_POR_CENTO);
		
		if (diaDaSemana.equals(DiaDaSemana.SEXTA_FEIRA))
			return calcularValorTotalComDesconto(valor, Desconto.ONZE_POR_CENTO);
		
		if (diaDaSemana.equals(DiaDaSemana.QUARTA_FEIRA))
			return calcularValorTotalComDesconto(valor, Desconto.TRINTA_POR_CENTO);
		
		return calcularValorTotalComDesconto(valor, Desconto.QUINZE_POR_CENTO);
	}
}
