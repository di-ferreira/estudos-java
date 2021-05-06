package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome;
    List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    double obterValorTotal() {
        double total = 0;

        for (Compra compra : compras) {
            total += compra.totalDaCompra();
        }

        return total;
    }

}
