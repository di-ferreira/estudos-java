package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro sal�rio: ");
		String salario1 = entrada.nextLine().replace(',', '.');

		System.out.print("Digite o primeiro sal�rio: ");
		String salario2 = entrada.nextLine().replace(',', '.');

		System.out.print("Digite o primeiro sal�rio: ");
		String salario3 = entrada.nextLine().replace(',', '.');

		double salNum1 = Double.parseDouble(salario1);
		double salNum2 = Double.parseDouble(salario2);
		double salNum3 = Double.parseDouble(salario3);

		Double media = (salNum1 + salNum2 + salNum3) / 3;

		System.out.println("Sua m�dia salarial: " + media.toString());

		entrada.close();
	}
}
