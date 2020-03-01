package entities;

public class Tabuada {
	protected int[][] matriz = new int[9][9];
	private Potencia potencia = new Potencia();
	
	public Tabuada() {
	}
	
	// caculates for each element of matrix
	public void tabuadaPotencia() {
		for (int i=0; i < matriz.length; i++) {
			for (int j = 0; j< matriz[i].length; j++) {
				matriz[i][j] = potencia.potencia(i+1, j+1);
			}
		}
	}

}
