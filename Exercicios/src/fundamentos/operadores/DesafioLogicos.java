package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		/*
		 * Trabalho na Terca (V ou F) Trabalho na Quinta (V ou F)
		 * 
		 * Se trabalhar em qualquer dia familia vai ao shopping tomar sorvete
		 * 
		 * Se um dia de trabalho TV 32" Se dois dias de trabalho TV 50"
		 * 
		 * Nao conseguiu o trabalho de nenhum dia fica em casa mais saudavel
		 */

		boolean trabalho1 = true;
		boolean trabalho2 = true;

		boolean familia = trabalho1 || trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean tv50 = trabalho1 && trabalho2;
		//Operador Unario
		boolean maisSaudavel = !familia;
		
		System.out.println("Consegui comprar a TV de 32\": " + tv32);
		System.out.println("Consegui comprar a TV de 50\": " + tv50);
		System.out.println("A familia vai ao Shopping tomar sorvete: " + familia);
		System.out.println("A familia mais saudavel: " + maisSaudavel);

	}
}
