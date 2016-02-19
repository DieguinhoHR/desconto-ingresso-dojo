

public class Ingresso {
	/**	
	 *	Terça-Feira: - 15% idosos e crianças; - 5% estudantes;
	*	Quarta-Feira: - 40% idosos - 30% crianças - 50% estudantes
	*	Quinta-Feira - 30% idosos e estudantes
	*	Sexta-Feira - 11% crianças
	*
	*	Domingo/Sábados/Feriados - 5% Idosos
	 * @param diaDaSemana
	 * @param tipoDeUsuario
	 * @param valor
	 * @return
	 */
	public double calcularDesconto(String diaDaSemana, String tipoDeUsuario, double valor) {	
		if (diaDaSemana.equals("segunda-feira") && tipoDeUsuario.equals("crianca"))
			return valor - (valor * 0.10);
						
		if (diaDaSemana.equals("segunda-feira") && tipoDeUsuario.equals("idoso"))
			return valor - (valor * 0.10);
		
		if (diaDaSemana.equals("segunda-feira") && tipoDeUsuario.equals("estudante"))
			return valor - (valor * 0.10);
		
		if (diaDaSemana.equals("terca-feira") && tipoDeUsuario.equals("crianca"))
			return valor - (valor * 0.15);
		
		return 0.00;
	}
}
