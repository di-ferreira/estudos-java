package arrays;

import java.util.Scanner;

public class DesafioArrayForeach {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas: ");
        int qtdNotas = entrada.nextInt();

        double[] notas = new double[qtdNotas];
        double mediaTotal = 0;

        for (int i = 0; i < notas.length; i++) {
            int countNotas = i + 1;

            System.out.print("Informe a " + countNotas + "º nota: ");
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
