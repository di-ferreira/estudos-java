package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "verde";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Banssai-Dai");
		case "marron":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
		default:
			System.out.println("N�o sei nada");
		}
		
	}
}
