package oo.composicao.desafio.resposta;

public class Sistema {
    public static void main(String[] args) {

        Compra compra = new Compra();
        compra.addItem(new Produto("Caneta", 9.67), 100);
        compra.addItem("Notebook", 1897.88, 2);

        Compra compra2 = new Compra();
        compra2.addItem(new Produto("Caderno", 10), 10);
        compra2.addItem("Impressora", 998.90, 1);

        Cliente cliente = new Cliente("Maria Julia Moraes");
        cliente.adicionarCompra(compra);
        cliente.adicionarCompra(compra2);

        System.out.println(compra.totalDaCompra());
        System.out.println(compra2.totalDaCompra());

        System.out.println(cliente.obterValorTotal());
    }
}
