package lambdas;

import java.text.DecimalFormat;

public class Produto {
    final String nome;
    final Double preco;
    final Double desconto;

    public String getNome() {
        return this.nome.toString();
    }

    public Double getPreco() {
        return this.preco;
    }

    public Double getDesconto() {
        return this.desconto;
    }

    public Produto(String nome, Double preco, Double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {

        double precoFinal = preco * (1 - desconto);

        String descontoFormatado = new DecimalFormat("#,##%0.00").format(desconto);

        String precoFormatado = new DecimalFormat("R$#,##0.00").format(precoFinal);

        return nome + " com desconto " + descontoFormatado + " aplicado tem o preço final de " + precoFormatado;
    }
}
