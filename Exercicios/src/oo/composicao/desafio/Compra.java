package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    double totalDaCompra() {
        double total = 0;
        for (Item item : itens) {
            total += item.produto.preco;
        }
        return total;
    }

}
