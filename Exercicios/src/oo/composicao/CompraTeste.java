package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "João Carlos";
        compra1.itens.add(new Item("Caneta Azul", 10, 1.50));
        compra1.itens.add(new Item("Caderno", 5, 15.50));
        compra1.itens.add(new Item("Lápis", 5, 0.80));
        compra1.itens.add(new Item("Borracha", 4, 2.50));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());

    }
}
