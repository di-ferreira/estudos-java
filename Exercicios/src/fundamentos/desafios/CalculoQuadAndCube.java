package fundamentos.desafios;

import javax.swing.JOptionPane;

public class CalculoQuadAndCube {
	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog(null, "Digite um valor", "Convers�o para ao quadrado e ao cubo",
				JOptionPane.QUESTION_MESSAGE);

		double ao2 = Math.pow(Double.parseDouble(num), 2);

		double ao3 = Math.pow(Double.parseDouble(num), 3);

		JOptionPane.showMessageDialog(null, num + "� = " + ao2 + " e " + num + "� = " + ao3, "Resultado",
				JOptionPane.INFORMATION_MESSAGE);

	}
}
