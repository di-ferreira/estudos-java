package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {

        Item item1 = new Item(3, "queijo", 4.75);
        Item item2 = new Item(5, "Pão de forma", 5.90);
        Item item3 = new Item(1, "Café", 8);
        Item item4 = new Item(1, "Açucar", 2.85);

        Compra compra01 = new Compra();
        compra01.itens.add(item1);
        compra01.itens.add(item2);

        Compra compra02 = new Compra();
        compra02.itens.add(item3);
        compra02.itens.add(item4);

        Cliente cli01 = new Cliente("José");
        cli01.compras.add(compra01);
        cli01.compras.add(compra02);

        System.out.println(compra01.totalDaCompra());
        System.out.println(compra02.totalDaCompra());

        System.out.println(cli01.obterValorTotal());
    }
}
