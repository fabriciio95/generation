package exercicios.lista1;

import java.util.Scanner;

public class Tarefa8 {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Custo de F�brica: ");
		double custoFabrica = sc.nextDouble();
		
		double percentagemDistruibuidor = custoFabrica * 0.28;
		double impostos = custoFabrica * 0.45;
		double precoFinal = custoFabrica + percentagemDistruibuidor + impostos;
		
		System.out.printf("Pre�o Final: %.2f", precoFinal);
		
		
		sc.close();
	}
}
