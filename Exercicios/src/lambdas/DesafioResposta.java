package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioResposta {
    public static void main(String[] args) {

        // Resolve erro de vírgula
        Locale.setDefault(Locale.US);

        Produto p = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> precoFinal = prod -> prod.preco * (1 - prod.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar = value -> ("R$" + value).replace(".", ",");

        String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar)
                .apply(p);

        System.out.println("O preço final é " + preco);
    }
}
