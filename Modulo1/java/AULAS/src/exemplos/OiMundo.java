package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class OiMundo {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = scanner.next();
		System.out.print("Primeiro n�mero: ");
		int numero1 = scanner.nextInt();
		System.out.print("Segundo n�mero: ");
		int numero2 = scanner.nextInt();
		System.out.print("Sal�rio: ");
		double salario = scanner.nextDouble();
		System.out.printf("%d + %d = %d\n", numero1, numero2, numero1 + numero2);
		System.out.printf("Ol� %s, seu sal�rio � %.2f", nome, salario);
		scanner.close();

	}

}
