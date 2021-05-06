package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // offer e Add -> adicionam elementos na fila
        // a diferença é o comportamento quando a fila está cheia!
        fila.add("Ana");// retorna false
        fila.offer("Diego");// retorna uma exceção
        fila.add("Aquiles");
        fila.offer("Priscila");

        // peek e element -> Obtem o proximo elemento da fila (sem remover)
        // a diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.peek());// retorna null
        System.out.println(fila.element());// retorna uma exceção

        // Poll e Remove -> Obtem o proximo elemento da fila e remover
        // a diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.poll());// retorna null
        System.out.println(fila.remove());// retorna uma exceção

        // fila.size();
        // fila.clear();
        // fila.isEmpty();

    }
}
