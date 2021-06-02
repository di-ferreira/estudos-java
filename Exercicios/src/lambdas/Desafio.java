package lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        // 1. A partir do produto calcular o preço real (com desconto) feito
        // 2.Imposto Municipal: >= 2500(8,5%)/< 2500(isento)
        // 3.Frete:>=3000(100)/<3000(50)
        // 4.Arredondar:Deixar duas casas decimais
        // 5.Formatar: R$1234,56

        Produto p = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> calcPrecoReal = prod -> prod.preco * (1 - prod.desconto);
        UnaryOperator<Double> calcImposto = preco -> preco >= 2500 ? preco + (preco * (1 - 0.85)) : preco;
        UnaryOperator<Double> calcFrete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        Function<Double, String> formatValue = value -> new DecimalFormat("R$#,##0.00").format(value);

        // String result = calcPrecoReal.apply(p).toString();
        String result = calcPrecoReal.andThen(calcImposto).andThen(calcFrete).andThen(formatValue).apply(p);

        System.out.println(result);

    }
}
