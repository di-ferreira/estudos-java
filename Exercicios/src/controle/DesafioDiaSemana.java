package controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		/*
		 * Domingo -> 1 Segunda -> 2 Ter�a -> 3 Quarta -> 4 Quinta -> 5 Sexta -> 6
		 * S�bado -> 7
		 */

		String dia = JOptionPane.showInputDialog(null, "Digite o dia da semana", "Dias da Semana",
				JOptionPane.QUESTION_MESSAGE);

		if (dia.equalsIgnoreCase("Domingo")) {
			JOptionPane.showMessageDialog(null, "1� dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else if (dia.equalsIgnoreCase("Segunda")) {
			JOptionPane.showMessageDialog(null, "2� dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else if (dia.equalsIgnoreCase("Ter�a") || dia.equalsIgnoreCase("Terca")) {
			JOptionPane.showMessageDialog(null, "3� dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else if (dia.equalsIgnoreCase("Quarta")) {
			JOptionPane.showMessageDialog(null, "4� dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else if (dia.equalsIgnoreCase("Quinta")) {
			JOptionPane.showMessageDialog(null, "5� dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else if (dia.equalsIgnoreCase("Sexta")) {
			JOptionPane.showMessageDialog(null, "6� dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else if (dia.equalsIgnoreCase("S�bado") || dia.equalsIgnoreCase("Sabado")) {
			JOptionPane.showMessageDialog(null, "7� dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Por favor digite a palavra com acento", "Dia inv�lido",
					JOptionPane.WARNING_MESSAGE);
		}

	}
}
