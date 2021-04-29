package controle.exercicio;

import java.util.Scanner;

public class Controle07 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double numeroDigitado = 0;
		double numero = 0;

		while (numeroDigitado >= 0) {

			System.out.print("Digite um valor positivo para \nsomar ou  negativo para sair: ");
			numeroDigitado = entrada.nextDouble();

			if(numeroDigitado >=0) {
			
				numero += numeroDigitado;
				
			}
			
			System.out.println("Total: " + numero);
		}

		entrada.close();

	}
}
