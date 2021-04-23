package fundamentos.operadores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioCalculadoraPanel {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String num1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor", "Primeiro valor",
				JOptionPane.QUESTION_MESSAGE);

		String op = JOptionPane.showInputDialog(null, "Digite a operação", "Operação", JOptionPane.QUESTION_MESSAGE);

		String num2 = JOptionPane.showInputDialog(null, "Digite o segundo valor", "Segundo valor",
				JOptionPane.QUESTION_MESSAGE);

		// Logica
		double resultado = "+".equals(op) ? Double.parseDouble(num1) + Double.parseDouble(num2) : 0;
		resultado = "-".equals(op) ? Double.parseDouble(num1) - Double.parseDouble(num2) : resultado;
		resultado = "*".equals(op) ? Double.parseDouble(num1) * Double.parseDouble(num2) : resultado;
		resultado = "/".equals(op) ? Double.parseDouble(num1) / Double.parseDouble(num2) : resultado;
		resultado = "%".equals(op) ? Double.parseDouble(num1) % Double.parseDouble(num2) : resultado;

		JOptionPane.showMessageDialog(null, num1 + " " + op + " " + num2 + " = " + resultado, "Resultado",
				JOptionPane.INFORMATION_MESSAGE);

		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

		entrada.close();
	}
}
