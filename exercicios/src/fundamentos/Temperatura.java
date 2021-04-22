package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// formula converter °F para °C
		// (°F - AJUSTE = 32) * FATOR = 5.0/9.0 = °C;
		// CONSTANTES
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		// variaveis
		double f = 104;
		double c = (f - AJUSTE) * FATOR;
		System.out.println("Temperatura hoje "+c+"°C");

		f = 0.5;
		c = (f - AJUSTE) * FATOR;
		System.out.println("Temperatura hoje "+c+"°C");
	}
}

