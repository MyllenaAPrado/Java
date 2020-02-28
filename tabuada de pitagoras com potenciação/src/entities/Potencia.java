package entities;

public class Potencia {
	private int resultado ;

	public Potencia() {
	}
	
	public int getResultado() {
		return resultado;
	}
	
	//function of power
	public int potencia(int numero, int potenciacao) {
		resultado = 1;
		for (int i = 1; i<= potenciacao; i++) {
			resultado = resultado * numero;
		}
		return resultado;
	}
	
}
