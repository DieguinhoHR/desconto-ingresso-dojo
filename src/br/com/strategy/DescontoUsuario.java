package br.com.strategy;

public abstract class DescontoUsuario {
	public abstract double calcular(String diaDaSemana, String tipoDeUsuario, double valor);
	
	public double calcularValorTotalComDesconto(double valor, double porcentagemDeDesconto) {
		return valor - (valor * porcentagemDeDesconto);
	}
}
