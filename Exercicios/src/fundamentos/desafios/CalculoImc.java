package fundamentos.desafios;

import java.util.Scanner;

public class CalculoImc {
	public static void main(String[] args) {
		// calculo IMC = peso/(altura)2

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe seu peso: ");
		double peso = entrada.nextDouble();
		System.out.print("Informe sua altura em metros: ");
		double altura = entrada.nextDouble();
		double imc = peso / Math.pow(altura, 2);
		
		System.out.println(imc);
		
		System.out.printf("Seu peso = %.2f \n Sua altura = %.2f \n Seu IMC= %.2f", peso,altura,imc);

		entrada.close();
	}
}
