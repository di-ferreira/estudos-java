package controle.exercicio;

import java.util.Scanner;

public class Controle02 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		double media = (nota1 + nota2) / 2;

		System.out.println("Sua m�dia � " + media);

		if (media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parab�ns!!");
		} else if (media >= 4) {
			System.out.println("Recupera��o!");
		} else {
			System.out.println("Reprovado!");
		}

		entrada.close();
	}
}
