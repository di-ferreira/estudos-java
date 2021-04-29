package controle.exercicio;

import javax.swing.JOptionPane;

public class Controle06 {
	public static void main(String[] args) {
		int numero = (int) Math.floor(Math.random() * 100);

		String valorDigitado = JOptionPane.showInputDialog(null, "Digite o número " + numero, "Adivinhe o número",
				JOptionPane.QUESTION_MESSAGE);

		int numeroDigitado = Integer.parseInt(valorDigitado);

		for (int tentativas = 10; tentativas > 0; tentativas--) {

			if (numeroDigitado == numero) {
				JOptionPane.showMessageDialog(null, "Parabéns você acertou", "Adivinhe o número",
						JOptionPane.DEFAULT_OPTION);
				break;
			} else if (numeroDigitado > numero) {
				JOptionPane.showMessageDialog(null, "O número é menor que " + numeroDigitado, "Adivinhe o número",
						JOptionPane.DEFAULT_OPTION);
			} else {
				JOptionPane.showMessageDialog(null, "O número é maior que " + numeroDigitado, "Adivinhe o número",
						JOptionPane.DEFAULT_OPTION);
			}
			
			int countTentativas = tentativas - 1;
			
			JOptionPane.showMessageDialog(null, "Você possui " + countTentativas + " tentativas.", "Adivinhe o número",
					JOptionPane.DEFAULT_OPTION);
			
			valorDigitado = JOptionPane.showInputDialog(null, "Digite o número " + numero, "Adivinhe o número",
					JOptionPane.QUESTION_MESSAGE);
			
			numeroDigitado = Integer.parseInt(valorDigitado);

		}

	}
}
