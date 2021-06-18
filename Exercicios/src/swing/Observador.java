package swing;

import javax.swing.*;
import java.awt.*;

public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");

        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null);

        JButton botao = new JButton("Click me!");
        janela.add(botao);

        botao.addActionListener(e-> System.out.println("Evento Ocorreu!!!"));

        janela.setVisible(true);
    }
}
