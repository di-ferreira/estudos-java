package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {
    }

    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        double resultado;

        resultado = preco * (1 - desconto);

        return resultado;

    }

    double precoComDesconto(double descontoGerente) {
        double resultado;

        resultado = preco * (1 - desconto + descontoGerente);

        return resultado;

    }

}