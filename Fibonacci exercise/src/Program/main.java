package Program;

import java.util.Locale;
import java.util.Scanner;

import enitties.SequenciaFibonacci;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//instance the class SequenciaFibonacci
		SequenciaFibonacci sequenciaFibonacci = new SequenciaFibonacci();
		
		//determine haw many terms will be sum
		System.out.println(" Sequencia Fibonacci ");
		System.out.print("Digite quantos números serão somados na sequencia:");
		int quantity = sc.nextInt();
		
		//execute the sum of fibonacci
		System.out.println("Soma: " + sequenciaFibonacci.somaSequencia(quantity));
		System.out.println(sequenciaFibonacci.toString());
		
		sc.close();
		

	}

}
