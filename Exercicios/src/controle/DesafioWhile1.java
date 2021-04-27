package controle;

import java.util.Scanner;

public class DesafioWhile1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sair para finalizar o programa!");
		String msg = "";

		while (!msg.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			msg = entrada.nextLine();
		}
		entrada.close();
	}
}
