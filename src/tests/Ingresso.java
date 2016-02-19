package tests;

public class Ingresso {
	public double calcularDesconto(String diaDaSemana, String tipoDeUsuario, double valor) {	
		if (diaDaSemana.equals("segunda-feira") && tipoDeUsuario.equals("crianca"))
			return valor - (valor * 0.10);
		return 0.00;
	}
}
