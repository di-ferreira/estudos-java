package streams;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import lambdas.Produto;

public class DesafioFilter01 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 0.3);
        Produto p2 = new Produto("Impressora", 600.00, 0.2);
        Produto p3 = new Produto("Tablet", 1600.00, 0.4);
        Produto p4 = new Produto("Fone", 800.00, 0.7);
        Produto p5 = new Produto("Monitor Wide", 1200.00, 0.5);
        Produto p6 = new Produto("Teclado", 250.00, 0.5);
        Produto p7 = new Produto("Mouse", 100.00, 0.1);

        List<Produto> prod = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> filtraValor = p -> p.getPreco() <= 1500;
        Predicate<Produto> filtraDesconto = p -> p.getDesconto() >= 0.5;
        Function<Produto, String> promocao = p -> p.getNome() + " com desconto "
                + new DecimalFormat("#,##%0.00").format(p.getDesconto()) + " aplicado tem o preço final de "
                + new DecimalFormat("R$#,##0.00").format(p.getPreco() * (1 - p.getDesconto()));

        prod.stream().filter(filtraValor).filter(filtraDesconto).map(promocao).forEach(System.out::println);

    }
}
