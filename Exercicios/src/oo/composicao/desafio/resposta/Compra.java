package oo.composicao.desafio.resposta;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> itens = new ArrayList<>();

    void addItem(Produto p, int qtde) {
        this.itens.add(new Item(qtde, p));
    }

    void addItem(String nome, double preco, int qtde) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(qtde, produto));
    }

    double totalDaCompra() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }

}
