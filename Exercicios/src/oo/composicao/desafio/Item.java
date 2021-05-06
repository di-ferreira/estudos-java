package oo.composicao.desafio;

public class Item {
    int quantidade;
    Produto produto = new Produto();

    public Item(int quantidade, String nome, double preco) {
        this.quantidade = quantidade;
        this.produto.nome = nome;
        this.produto.preco = preco;
    }

}
