package controle.exercicio;

import javax.swing.JOptionPane;

public class Controle01 {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog(null, "Informe o n�mero", "Par ou �mpar",
				JOptionPane.QUESTION_MESSAGE);

		String msg = "";

		int valorNumero = Integer.parseInt(valor);

		if (valorNumero >= 0 && valorNumero <= 10) {

			msg = "N�mero est� entre 0 e 10";

		} else {

			msg = "N�mero n�o est� entre 0 e 10";

		}

		if (valorNumero % 2 == 0) {

			msg += " e n�mero � par.";

		} else {

			msg += " e n�mero � �mpar.";

		}

		JOptionPane.showMessageDialog(null, msg, "Par ou �mpar", JOptionPane.INFORMATION_MESSAGE);
	}
}
