package fundamentos.desafios;

import javax.swing.JOptionPane;

public class AreaTriangulo {
	public static void main(String[] args) {
		// formula
		// área = (base*altura)/2;

		String base = JOptionPane.showInputDialog(null, "Informe o valor da base", "Calculo da área do triangulo",
				JOptionPane.QUESTION_MESSAGE);
		
		String altura = JOptionPane.showInputDialog(null, "Informe o valor da altura", "Calculo da área do triangulo",
				JOptionPane.QUESTION_MESSAGE);

		double area = (Double.parseDouble(base) * Double.parseDouble(altura)) / 2;
		JOptionPane.showMessageDialog(null, "O Resultado da área é " + area, "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
