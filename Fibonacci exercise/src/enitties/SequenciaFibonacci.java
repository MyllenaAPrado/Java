package enitties;

public class SequenciaFibonacci implements SomaFibonacci {
	private StringBuilder sb = new StringBuilder();
	public SequenciaFibonacci() {

	}

	@Override
	public int somaSequencia(int quantity) {
		int soma, anterior, aux;
		// return the sum of the first or two first number of the sequence
		if (quantity == 1) {
			sb.append("Sequencia: 0");
			return 0;
		}
		if (quantity <= 3) {
			sb.append("Sequencia: 0,1");
			return 1;
		} 
		if(quantity ==3){
			sb.append("Sequencia: 0, 1, 1");
			return 1;
		}
		else {// return the others sums
			quantity -= 3;
			soma = 1;
			aux = 1;
			anterior = 1;// keep the sum before
			sb.append("Sequencia: 0, 1, 1");
			while (quantity > 0) {
				aux = anterior;
				anterior = soma;
				soma = anterior + aux;
				sb.append(", " + soma);
				quantity--;
			}
			return soma;
		}
	}
	
	@Override
	public String toString() {
		String string = sb.toString();
		return string;
	}

}
