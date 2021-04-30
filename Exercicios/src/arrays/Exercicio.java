package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        double total = 0;

        // Converte array para string
        Arrays.toString(notasAlunoA);

        for (int i = 0; i < notasAlunoA.length; i++) {

            System.out.printf("Nota do %dº bimestre: %.1f\n", i + 1, notasAlunoA[i]);

            total += notasAlunoA[i];
        }

        System.out.println("Média final: " + total / notasAlunoA.length);

    }
}
