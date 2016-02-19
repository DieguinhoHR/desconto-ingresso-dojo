package br.com.business;

import br.com.factory.UsuarioFactory;
import br.com.strategy.DescontoUsuario;
import br.com.strategy.DescontoUsuarioCrianca;
import br.com.strategy.DescontoUsuarioEstudante;
import br.com.strategy.DescontoUsuarioIdoso;

public class Ingresso {	
	public double calcularDesconto(String tipoUsuario, String diaDaSemana, double valor) {	
		if (tipoUsuario.equals("crianca")) {
			double valorTotalCrianca = UsuarioFactory.createMethod("crianca").calcular(diaDaSemana, "crianca", valor);
			
			return valorTotalCrianca;
		}
				
		if (tipoUsuario.equals("idoso")) {
			double valorTotalIdoso = UsuarioFactory.createMethod("idoso").calcular(diaDaSemana, "idoso", valor);
			
			return valorTotalIdoso;
		}		
		double valorEstudante = UsuarioFactory.createMethod("estudante").calcular(diaDaSemana, "estudante", valor);		
		return valorEstudante;
	}
}
