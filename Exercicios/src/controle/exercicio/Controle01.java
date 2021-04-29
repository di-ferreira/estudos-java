package controle.exercicio;

import javax.swing.JOptionPane;

public class Controle01 {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog(null, "Informe o número", "Par ou Ímpar",
				JOptionPane.QUESTION_MESSAGE);

		String msg = "";

		int valorNumero = Integer.parseInt(valor);

		if (valorNumero >= 0 && valorNumero <= 10) {

			msg = "Número está entre 0 e 10";

		} else {

			msg = "Número não está entre 0 e 10";

		}

		if (valorNumero % 2 == 0) {

			msg += " e número é par.";

		} else {

			msg += " e número é ímpar.";

		}

		JOptionPane.showMessageDialog(null, msg, "Par ou Ímpar", JOptionPane.INFORMATION_MESSAGE);
	}
}
