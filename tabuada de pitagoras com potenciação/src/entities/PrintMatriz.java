package entities;

public class PrintMatriz extends Tabuada {
	
	//treats the number for equal the size of numbers
	private String trataNumero(int numero) {
		StringBuilder sb = new StringBuilder();
		if (numero < 10) {
			sb.append("00000000" + numero);
			return sb.toString();
		}
		if (numero < 100) {
			sb.append("0000000" + numero);
			return sb.toString();
		}
		if (numero < 1000) {
			sb.append("000000" + numero);
			return sb.toString();
		}
		if (numero < 10000) {
			sb.append("00000" + numero);
			return sb.toString();
		}
		if (numero < 100000) {
			sb.append("0000" + numero);
			return sb.toString();
		}
		if (numero < 1000000) {
			sb.append("000" + numero);
			return sb.toString();
		}
		if (numero < 10000000) {
			sb.append("00" + numero);
			return sb.toString();
		}
		if (numero < 100000000) {
			sb.append("0" + numero);
			return sb.toString();
		}else{
			sb.append(numero);
			return sb.toString();
		}

	}
	
	
	//print the matrix
	public void print() {
		System.out.println("      01         02       03        04"
				+ "         05        06        07       08        09 ");
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.print((i+1) + " ");
			for (int j = 0; j < matriz[i].length; j++) {
				int number = matriz[i][j];
				System.out.print(" " + trataNumero(number));
			}
			System.out.println();
		}
	}

}
