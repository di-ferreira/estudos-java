package fundamentos.desafios;

import javax.swing.JOptionPane;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		// formula converter °F para °C
		// (°F - AJUSTE = 32) * FATOR = 5.0/9.0 = °C;

		// CONSTANTES
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;

		// variaveis
		String f = JOptionPane.showInputDialog(null, "Digite o valor em Fahrenheit", "Fahrenheit",
				JOptionPane.QUESTION_MESSAGE);

		double c = (Double.parseDouble(f) - AJUSTE) * FATOR;

		JOptionPane.showMessageDialog(null, "Temperatura hoje " + c + "°C", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);

		// c = (f - AJUSTE) * FATOR;
		System.out.println("Temperatura hoje " + c + "°C");
	}
}
