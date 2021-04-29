package controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		/*
		 * Domingo -> 1 Segunda -> 2 Terça -> 3 Quarta -> 4 Quinta -> 5 Sexta -> 6
		 * Sábado -> 7
		 */

		String dia = JOptionPane.showInputDialog(null, "Digite o dia da semana", "Dias da Semana",
				JOptionPane.QUESTION_MESSAGE);

		if (dia.equalsIgnoreCase("Domingo")) {
			JOptionPane.showMessageDialog(null, "1º dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else if (dia.equalsIgnoreCase("Segunda")) {
			JOptionPane.showMessageDialog(null, "2º dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else if (dia.equalsIgnoreCase("Terça") || dia.equalsIgnoreCase("Terca")) {
			JOptionPane.showMessageDialog(null, "3º dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else if (dia.equalsIgnoreCase("Quarta")) {
			JOptionPane.showMessageDialog(null, "4º dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else if (dia.equalsIgnoreCase("Quinta")) {
			JOptionPane.showMessageDialog(null, "5º dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else if (dia.equalsIgnoreCase("Sexta")) {
			JOptionPane.showMessageDialog(null, "6º dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else if (dia.equalsIgnoreCase("Sábado") || dia.equalsIgnoreCase("Sabado")) {
			JOptionPane.showMessageDialog(null, "7º dia da semana", "Dias da Semana", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Por favor digite a palavra com acento", "Dia inválido",
					JOptionPane.WARNING_MESSAGE);
		}

	}
}
