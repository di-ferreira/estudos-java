package arrays;

import java.util.Scanner;

public class DesafioResultado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas: ");
        int qtdNotas = entrada.nextInt();

        double[] notas = new double[qtdNotas];
        double mediaTotal = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Informe a " + (i + 1) + "º nota: ");
            notas[i] = entrada.nextDouble();
        }

        for (double nota : notas) {
            mediaTotal += nota;
        }
        mediaTotal = mediaTotal / qtdNotas;

        System.out.printf("Média do aluno: %.2f", mediaTotal);

        entrada.close();
    }
}
