package fundamentos.desafios;

import javax.swing.JOptionPane;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		// formula converter °C para °F
		// (0 °C × 9/5) + 32 = 32 °F;

		// CONSTANTES
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		// variaveis
		String c = JOptionPane.showInputDialog(null, "Digite o valor em Celsius", "Celsius",
				JOptionPane.QUESTION_MESSAGE);

		double f = (Double.parseDouble(c) * FATOR) + AJUSTE;

		JOptionPane.showMessageDialog(null, "Temperatura hoje " + f + "°F", "Resultado",
				JOptionPane.INFORMATION_MESSAGE);

		System.out.println("Temperatura hoje " + f + "°F");

	}
}
