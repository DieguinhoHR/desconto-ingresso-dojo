package br.com.factory;

import br.com.strategy.DescontoUsuario;
import br.com.strategy.DescontoUsuarioCrianca;
import br.com.strategy.DescontoUsuarioEstudante;
import br.com.strategy.DescontoUsuarioIdoso;

public class UsuarioFactory {
	public static DescontoUsuario createMethod(String tipoDeUsuario) {
		if (tipoDeUsuario.equals("crianca")) {
			return new DescontoUsuarioCrianca();		
		}
		
		if (tipoDeUsuario.equals("idoso")) {
			return new DescontoUsuarioIdoso();		
		}
		
		if (tipoDeUsuario.equals("estudante")) {
			return new DescontoUsuarioEstudante();		
		}		
		return null;
	}
}
