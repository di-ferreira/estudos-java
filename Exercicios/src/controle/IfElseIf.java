package controle;

import javax.swing.JOptionPane;

public class IfElseIf {
	public static void main(String[] args) {

		String notaS = JOptionPane.showInputDialog(null, "Digite a nota:", "Nota do aluno",
				JOptionPane.QUESTION_MESSAGE);

		double notaI = Double.parseDouble(notaS);

		if (notaI > 10 || notaI < 0) {
			JOptionPane.showMessageDialog(null, "Nota inv�lida!", "Nota do aluno", JOptionPane.WARNING_MESSAGE);
		}else if (notaI >= 8.1) {
			JOptionPane.showMessageDialog(null, "Conceito A, Parab�ns", "Nota do aluno", JOptionPane.INFORMATION_MESSAGE);
		}else if (notaI >= 6.1) {
			JOptionPane.showMessageDialog(null, "Conceito B", "Nota do aluno", JOptionPane.INFORMATION_MESSAGE);
		}else if (notaI >= 4.1) {
			JOptionPane.showMessageDialog(null, "Conceito C", "Nota do aluno", JOptionPane.INFORMATION_MESSAGE);
		}else if (notaI >= 2.1) {
			JOptionPane.showMessageDialog(null, "Conceito D", "Nota do aluno", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Conceito E", "Nota do aluno", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
