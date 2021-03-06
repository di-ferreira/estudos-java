package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Variaveis
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		String num1 = entrada.nextLine();

		System.out.print("Digite o operador: ");
		String operador = entrada.nextLine();

		System.out.print("Digite o segundo valor: ");
		String num2 = entrada.nextLine();

		// operacoes
		Double soma = Double.parseDouble(num1) + Double.parseDouble(num2);
		Double subtracao = Double.parseDouble(num1) - Double.parseDouble(num2);
		Double multiplicacao = Double.parseDouble(num1) * Double.parseDouble(num2);
		Double divicao = Double.parseDouble(num1) / Double.parseDouble(num2);

		String resultado = operador.equals("+") ? soma.toString()
				: operador.equals("-") ? subtracao.toString()
						: operador.equals("*") ? multiplicacao.toString()
								: operador.equals("/") ? divicao.toString() : "Digite uma opera??o v?lida";

		System.out.println(resultado);
		entrada.close();
	}
}
