package controle;

import java.util.Scanner;

public class DesafioWhile2 {
	public static void main(String[] args) {

		double total = 0;
		double notaValida = 0;
		double notaDigitada = 0;

		double resultado = 0;

		Scanner entrada = new Scanner(System.in);

		while (notaDigitada != -1) {

			System.out.print("Digite a nota do aluno:");

			notaDigitada = entrada.nextDouble();

			if (notaDigitada <= 10 && notaDigitada >= 0) {

				total += notaDigitada;
				notaValida++;
				System.out.println("Total de notas válidas: " + notaValida);

			} else if (notaDigitada == -1) {

				System.out.println("Saindo...");

			} else {

				System.out.println("Nota inválida");

			}

		}
		resultado = total / notaValida;

		System.out.println("A média da turma é: " + resultado);

		entrada.close();

	}
}
