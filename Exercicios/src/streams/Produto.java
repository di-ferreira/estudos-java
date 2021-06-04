package streams;

public class Produto {
    final String nome;
    final Double preco;
    final Double desconto;
    final Double frete;

    public String getNome() {
        return this.nome.toString();
    }

    public Double getPreco() {
        return this.preco;
    }

    public Double getDesconto() {
        return this.desconto;
    }

    public Double getFrete() {
        return this.frete;
    }

    public Produto(String nome, Double preco, Double desconto, Double frete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.frete = frete;
    }

}
