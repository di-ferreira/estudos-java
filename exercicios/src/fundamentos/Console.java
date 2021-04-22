package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		// saida sem quebra de linha
		System.out.print("Bom");
		System.out.print(" dia!\n\n");

		// saida com quebra de linha
		System.out.println("Bom");
		System.out.println("dia!");

		// saida formatada
		System.out.printf("Megasena: %d - %d - %d - %d - %d - %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Funcionário: %s%n", "Diego");
		System.out.printf("Salário: %.2f%n", 2500.589);

		// Entrada de dados via console
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu Nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();

		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

		entrada.close();

	}
}
